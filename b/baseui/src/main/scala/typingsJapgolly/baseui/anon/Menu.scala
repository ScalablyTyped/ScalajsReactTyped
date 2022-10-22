package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.menu
import typingsJapgolly.baseui.baseuiStrings.none
import typingsJapgolly.baseui.baseuiStrings.tooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Menu extends StObject {
  
  val menu: typingsJapgolly.baseui.baseuiStrings.menu
  
  val none: typingsJapgolly.baseui.baseuiStrings.none
  
  val tooltip: typingsJapgolly.baseui.baseuiStrings.tooltip
}
object Menu {
  
  inline def apply(): Menu = {
    val __obj = js.Dynamic.literal(menu = "menu", none = "none", tooltip = "tooltip")
    __obj.asInstanceOf[Menu]
  }
  
  extension [Self <: Menu](x: Self) {
    
    inline def setMenu(value: menu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setNone(value: none): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
