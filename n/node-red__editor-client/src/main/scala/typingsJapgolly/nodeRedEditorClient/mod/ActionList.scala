package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionList extends StObject {
  
  def hide(): Unit
  
  def init(): Unit
  
  def show(v: String): Unit
}
object ActionList {
  
  inline def apply(hide: Callback, init: Callback, show: String => Callback): ActionList = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, init = init.toJsFn, show = js.Any.fromFunction1((t0: String) => show(t0).runNow()))
    __obj.asInstanceOf[ActionList]
  }
  
  extension [Self <: ActionList](x: Self) {
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setShow(value: String => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
