package com.kit.system.domain.translate.vo;

import lombok.Data;

@Data
public class LangVo {
    String name;
    String code;
    String tag;
    String sort;
    int fromHot;
    int toHot;
}
