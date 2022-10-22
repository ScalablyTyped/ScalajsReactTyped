package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsiveToggle extends StObject {
  
  def toggleMenu(): Unit
}
object ResponsiveToggle {
  
  inline def apply(toggleMenu: Callback): ResponsiveToggle = {
    val __obj = js.Dynamic.literal(toggleMenu = toggleMenu.toJsFn)
    __obj.asInstanceOf[ResponsiveToggle]
  }
  
  extension [Self <: ResponsiveToggle](x: Self) {
    
    inline def setToggleMenu(value: Callback): Self = StObject.set(x, "toggleMenu", value.toJsFn)
  }
}
