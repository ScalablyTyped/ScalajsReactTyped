package typingsJapgolly.uiGrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait COLUMNHEADERCLICK extends StObject {
  
  var COLUMN_HEADER_CLICK: String
  
  var COLUMN_MENU_SHOWN: String
  
  var GRID_SCROLL: String
  
  var ITEM_DRAGGING: String
}
object COLUMNHEADERCLICK {
  
  inline def apply(COLUMN_HEADER_CLICK: String, COLUMN_MENU_SHOWN: String, GRID_SCROLL: String, ITEM_DRAGGING: String): COLUMNHEADERCLICK = {
    val __obj = js.Dynamic.literal(COLUMN_HEADER_CLICK = COLUMN_HEADER_CLICK.asInstanceOf[js.Any], COLUMN_MENU_SHOWN = COLUMN_MENU_SHOWN.asInstanceOf[js.Any], GRID_SCROLL = GRID_SCROLL.asInstanceOf[js.Any], ITEM_DRAGGING = ITEM_DRAGGING.asInstanceOf[js.Any])
    __obj.asInstanceOf[COLUMNHEADERCLICK]
  }
  
  extension [Self <: COLUMNHEADERCLICK](x: Self) {
    
    inline def setCOLUMN_HEADER_CLICK(value: String): Self = StObject.set(x, "COLUMN_HEADER_CLICK", value.asInstanceOf[js.Any])
    
    inline def setCOLUMN_MENU_SHOWN(value: String): Self = StObject.set(x, "COLUMN_MENU_SHOWN", value.asInstanceOf[js.Any])
    
    inline def setGRID_SCROLL(value: String): Self = StObject.set(x, "GRID_SCROLL", value.asInstanceOf[js.Any])
    
    inline def setITEM_DRAGGING(value: String): Self = StObject.set(x, "ITEM_DRAGGING", value.asInstanceOf[js.Any])
  }
}
