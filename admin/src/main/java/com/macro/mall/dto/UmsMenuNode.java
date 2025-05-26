package com.macro.mall.dto;

import com.macro.mall.model.UmsMenu;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UmsMenuNode extends UmsMenu {
    @Schema(title = "子级菜单")
    private List<UmsMenuNode> children;
}
