package com.atguigu.srb.core.controller.admin;


import com.atguigu.srb.core.pojo.entity.IntegralGrade;
import com.atguigu.srb.core.service.IntegralGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 积分等级表 前端控制器
 * </p>
 *
 * @author Helen
 * @since 2021-07-02
 */
@RestController
@RequestMapping("admin/core/integralGrade")
public class AdminIntegralGradeController {

    @Autowired
    private IntegralGradeService integralGradeService;

    @GetMapping("/list")
    public List<IntegralGrade> ListAll() {
        return integralGradeService.list();
    }

    @DeleteMapping("/remove/{id}")
    public boolean RemoveById(@PathVariable Long id) {
        return integralGradeService.removeById(id);
    }



}

