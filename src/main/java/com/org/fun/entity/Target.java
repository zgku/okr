package com.org.fun.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
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
 * @author zgku
 * @since 2020-12-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Target对象", description="")
public class Target implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "target_id", type = IdType.AUTO)
    private Integer targetId;

    @ApiModelProperty(value = "外键")
    private String userTarget;

    @ApiModelProperty(value = "目标名称")
    private String targetName;

    @ApiModelProperty(value = "目标权重")
    private Double targetWeight;

    @ApiModelProperty(value = "目标周期")
    private String targetCircle;

    @ApiModelProperty(value = "目标类型")
    private Integer targetType;

    @ApiModelProperty(value = "目标结果")
    private String targetResult;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;


}
