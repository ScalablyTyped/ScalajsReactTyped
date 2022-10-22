package typingsJapgolly.wixUiCore.anon

import typingsJapgolly.react.mod.FC
import typingsJapgolly.std.Pick
import typingsJapgolly.wixUiCore.distEsSrcComponentsHorizontalMenuHorizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.HorizontalMenuColumnsLayoutProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsHorizontalMenuHorizontalMenuGridLayoutHorizontalMenuGridLayoutMod.HorizontalMenuGridLayoutProps
import typingsJapgolly.wixUiCore.wixUiCoreStrings.className
import typingsJapgolly.wixUiCore.wixUiCoreStrings.columnGap
import typingsJapgolly.wixUiCore.wixUiCoreStrings.columns
import typingsJapgolly.wixUiCore.wixUiCoreStrings.columnsAlignment
import typingsJapgolly.wixUiCore.wixUiCoreStrings.maxOverflowWidth
import typingsJapgolly.wixUiCore.wixUiCoreStrings.menuContext
import typingsJapgolly.wixUiCore.wixUiCoreStrings.style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grid extends StObject {
  
  var Columns: FC[
    Pick[
      Pick[
        HorizontalMenuColumnsLayoutProps, 
        style | className | menuContext | maxOverflowWidth | columnGap | columns | columnsAlignment
      ], 
      style | className | maxOverflowWidth | columnGap | columns | columnsAlignment
    ]
  ]
  
  var Grid: FC[
    Pick[
      Pick[HorizontalMenuGridLayoutProps, style | className | menuContext | maxOverflowWidth], 
      style | className | maxOverflowWidth
    ]
  ]
}
object Grid {
  
  inline def apply(
    Columns: FC[
      Pick[
        Pick[
          HorizontalMenuColumnsLayoutProps, 
          style | className | menuContext | maxOverflowWidth | columnGap | columns | columnsAlignment
        ], 
        style | className | maxOverflowWidth | columnGap | columns | columnsAlignment
      ]
    ],
    Grid: FC[
      Pick[
        Pick[HorizontalMenuGridLayoutProps, style | className | menuContext | maxOverflowWidth], 
        style | className | maxOverflowWidth
      ]
    ]
  ): Grid = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], Grid = Grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grid]
  }
  
  extension [Self <: Grid](x: Self) {
    
    inline def setColumns(
      value: FC[
          Pick[
            Pick[
              HorizontalMenuColumnsLayoutProps, 
              style | className | menuContext | maxOverflowWidth | columnGap | columns | columnsAlignment
            ], 
            style | className | maxOverflowWidth | columnGap | columns | columnsAlignment
          ]
        ]
    ): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setGrid(
      value: FC[
          Pick[
            Pick[HorizontalMenuGridLayoutProps, style | className | menuContext | maxOverflowWidth], 
            style | className | maxOverflowWidth
          ]
        ]
    ): Self = StObject.set(x, "Grid", value.asInstanceOf[js.Any])
  }
}
