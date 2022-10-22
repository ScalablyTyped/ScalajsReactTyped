package typingsJapgolly.sharepoint.SP.UI

import japgolly.scalajs.react.Callback
import typingsJapgolly.microsoftAjax.Sys.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopoutMenu
  extends StObject
     with IDisposable {
  
  def closeMenu(): Unit
  
  def launchMenu(): Unit
}
object PopoutMenu {
  
  inline def apply(closeMenu: Callback, dispose: Callback, launchMenu: Callback): PopoutMenu = {
    val __obj = js.Dynamic.literal(closeMenu = closeMenu.toJsFn, dispose = dispose.toJsFn, launchMenu = launchMenu.toJsFn)
    __obj.asInstanceOf[PopoutMenu]
  }
  
  extension [Self <: PopoutMenu](x: Self) {
    
    inline def setCloseMenu(value: Callback): Self = StObject.set(x, "closeMenu", value.toJsFn)
    
    inline def setLaunchMenu(value: Callback): Self = StObject.set(x, "launchMenu", value.toJsFn)
  }
}
