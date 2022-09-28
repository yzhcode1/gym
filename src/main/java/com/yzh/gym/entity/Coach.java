package com.yzh.gym.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author testjava
 * @since 2022-09-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Coach对象", description="")
public class Coach implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "性别")
    private Integer sex;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "电话")
    private String mobile;

    @ApiModelProperty(value = "信息")
    private String information;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;

    @TableField(fill = FieldFill.INSERT)
    @ApiModelProperty(value = "更新时间")
    private Date gmtModified;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    @ApiModelProperty(value = "逻辑删除")
    private Boolean isDeleted;


}
