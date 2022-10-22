package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Search extends StObject {
  
  def hide(): Unit
  
  def init(): Unit
  
  def search(`val`: String): js.Array[js.Object]
  
  def show(v: String): Unit
}
object Search {
  
  inline def apply(hide: Callback, init: Callback, search: String => js.Array[js.Object], show: String => Callback): Search = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, init = init.toJsFn, search = js.Any.fromFunction1(search), show = js.Any.fromFunction1((t0: String) => show(t0).runNow()))
    __obj.asInstanceOf[Search]
  }
  
  extension [Self <: Search](x: Self) {
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setSearch(value: String => js.Array[js.Object]): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
    
    inline def setShow(value: String => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
