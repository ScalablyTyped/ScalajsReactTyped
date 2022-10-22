package typingsJapgolly.reactNavigationDrawer.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseDrawer extends StObject {
  
  def closeDrawer(): Any
  
  def openDrawer(): Any
  
  def toggleDrawer(): Any
}
object CloseDrawer {
  
  inline def apply(closeDrawer: CallbackTo[Any], openDrawer: CallbackTo[Any], toggleDrawer: CallbackTo[Any]): CloseDrawer = {
    val __obj = js.Dynamic.literal(closeDrawer = closeDrawer.toJsFn, openDrawer = openDrawer.toJsFn, toggleDrawer = toggleDrawer.toJsFn)
    __obj.asInstanceOf[CloseDrawer]
  }
  
  extension [Self <: CloseDrawer](x: Self) {
    
    inline def setCloseDrawer(value: CallbackTo[Any]): Self = StObject.set(x, "closeDrawer", value.toJsFn)
    
    inline def setOpenDrawer(value: CallbackTo[Any]): Self = StObject.set(x, "openDrawer", value.toJsFn)
    
    inline def setToggleDrawer(value: CallbackTo[Any]): Self = StObject.set(x, "toggleDrawer", value.toJsFn)
  }
}
