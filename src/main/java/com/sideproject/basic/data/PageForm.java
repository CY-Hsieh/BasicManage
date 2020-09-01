package com.sideproject.basic.data;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PageForm {

  protected int pageIndex = 1;

  protected int pageSize = 20;
  
  protected int direction = 0;

  protected String sort;

  public int getPageIndex() {
    return pageIndex < 1 ? 0 : pageIndex - 1;
  }
  
}
