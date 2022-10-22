package typingsJapgolly.sharepoint.CUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.microsoftAjax.Sys.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Control
  extends StObject
     with IDisposable
     with IMenuItem {
  
  def createComponentForDisplayMode(displayMode: String): Any
  
  def get_enabled(): Boolean
  
  def get_id(): String
  
  def get_root(): Root
  
  def set_enabled(enabled: Boolean): Boolean
}
object Control {
  
  inline def apply(
    createComponentForDisplayMode: String => Any,
    dispose: Callback,
    get_enabled: CallbackTo[Boolean],
    get_id: CallbackTo[String],
    get_root: CallbackTo[Root],
    set_enabled: Boolean => Boolean
  ): Control = {
    val __obj = js.Dynamic.literal(createComponentForDisplayMode = js.Any.fromFunction1(createComponentForDisplayMode), dispose = dispose.toJsFn, get_enabled = get_enabled.toJsFn, get_id = get_id.toJsFn, get_root = get_root.toJsFn, set_enabled = js.Any.fromFunction1(set_enabled))
    __obj.asInstanceOf[Control]
  }
  
  extension [Self <: Control](x: Self) {
    
    inline def setCreateComponentForDisplayMode(value: String => Any): Self = StObject.set(x, "createComponentForDisplayMode", js.Any.fromFunction1(value))
    
    inline def setGet_enabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_enabled", value.toJsFn)
    
    inline def setGet_id(value: CallbackTo[String]): Self = StObject.set(x, "get_id", value.toJsFn)
    
    inline def setGet_root(value: CallbackTo[Root]): Self = StObject.set(x, "get_root", value.toJsFn)
    
    inline def setSet_enabled(value: Boolean => Boolean): Self = StObject.set(x, "set_enabled", js.Any.fromFunction1(value))
  }
}
