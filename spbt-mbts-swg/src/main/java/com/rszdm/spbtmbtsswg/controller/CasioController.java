package com.rszdm.spbtmbtsswg.controller;

import com.rszdm.spbtmbtsswg.entity.Casio;
import com.rszdm.spbtmbtsswg.service.CasioService;
import com.rszdm.spbtmbtsswg.util.DuplicateEntryForPrimaryKeyException;
import com.rszdm.spbtmbtsswg.util.ErrorCode;
import com.rszdm.spbtmbtsswg.util.JsonResult;
import com.rszdm.spbtmbtsswg.util.NotFoundException;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "casio")
public class CasioController {

    @Autowired
    private CasioService casioService;
/***
    @ApiOperation("登录")  //@ApiOperation 注解不是Spring自带的，是swagger里面的，用来构建API文档。
    // @ApiOperation(value = “接口说明”, httpMethod = “接口请求方式”, response =“接口返回参数类型”, notes = “接口发布说明”；其他参数可参考源码；
    @RequestMapping(value = "login", method = RequestMethod.PUT) // @RequestMapping注解:value属性表示映射的路径,method属性用来表示请求的方式
    private JsonResult login(@RequestBody Casio casio) { // @RequestBody表示需要传递的json值
        Casio resultCasio = casioService.login(casio);

        JsonResult jsonResult = new JsonResult();
        if (resultAdmin != null) {
            jsonResult.setResultCode(200);
            jsonResult.setResultName("success");
            jsonResult.setResult(resultAdmin);
        }

        return jsonResult;
    }***/

    @ApiOperation("添加")
    @RequestMapping(value = "", method = RequestMethod.POST)
    private JsonResult add(@RequestBody Casio casio) throws DuplicateEntryForPrimaryKeyException {
        Integer row = casioService.add02(casio);
        System.out.println("add one row in DB, return :::" + row);

        JsonResult jsonResult = new JsonResult();
        if (row > 0) {
            jsonResult.setResultCode(200);
            jsonResult.setResultName("success");
        }else{
            //return new HttpResultCode("insert one row failed!", ErrorCode.DUPLICATE_PRI_INTERNAL_SERVER_ERROR.getCode());
            throw new DuplicateEntryForPrimaryKeyException("insert one row failed!", ErrorCode.DUPLICATE_PRI_INTERNAL_SERVER_ERROR.getCode());
        }

        return jsonResult;
    }

    @ApiOperation("根据id删除信息")
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    private JsonResult delete(@PathVariable Integer id) { // 删除的时候不需要传递json数据,但是需要有参数id，因此用
        // @PathVariable注解参数
        Integer row = casioService.delete(id);

        JsonResult jsonResult = new JsonResult();
        if (row > 0) {
            jsonResult.setResultCode(200);
            jsonResult.setResultName("success");
        }

        return jsonResult;
    }

    @ApiOperation("根据id更新信息")
    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    private JsonResult update(@RequestBody Casio casio, @PathVariable Integer id) {
        Integer row = casioService.update(casio);

        JsonResult jsonResult = new JsonResult();
        if (row > 0) {
            jsonResult.setResultCode(200);
            jsonResult.setResultName("success");
        }

        return jsonResult;
    }

    @ApiOperation("根据id查询信息")
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    private JsonResult queryById(@PathVariable Integer id) throws NotFoundException {
        Casio casio = casioService.queryById(id);

        JsonResult jsonResult = new JsonResult();
        if (casio != null) {
            jsonResult.setResultCode(200);
            jsonResult.setResultName("success");
            jsonResult.setResult(casio);
        } else {
            throw new NotFoundException("aid" + id + " is not exist!", ErrorCode.USER_NOT_FOUND.getCode());
        }

        return jsonResult;
    }
    /***private JsonResult queryById_bk(@PathVariable Integer id) {
     Admins admins = adminsService.queryById(id);

     JsonResult jsonResult = new JsonResult();
     if (admins != null) {
     jsonResult.setResultCode(200);
     jsonResult.setResultName("success");
     jsonResult.setResult(admins);
     }

     return jsonResult;
     }***/



    @ApiOperation("查询所有")
    @RequestMapping(value = "", method = RequestMethod.GET)
    private JsonResult queryAll() {
        List<Casio> casioLists = casioService.queryAll();

        JsonResult jsonResult = new JsonResult();
        if (casioLists != null && casioLists.size() > 0) {
            jsonResult.setResultCode(200);
            jsonResult.setResultName("success");
            jsonResult.setResult(casioLists);
        }

        return jsonResult;
    }



}
