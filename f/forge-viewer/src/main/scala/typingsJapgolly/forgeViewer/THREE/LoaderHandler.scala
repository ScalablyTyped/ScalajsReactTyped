package typingsJapgolly.forgeViewer.THREE

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoaderHandler extends StObject {
  
  def add(regex: js.RegExp, loader: Loader): Unit
  
  def get(file: String): Loader
  
  var handlers: js.Array[js.RegExp | Loader]
}
object LoaderHandler {
  
  inline def apply(
    add: (js.RegExp, Loader) => Callback,
    get: String => Loader,
    handlers: js.Array[js.RegExp | Loader]
  ): LoaderHandler = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2((t0: js.RegExp, t1: Loader) => (add(t0, t1)).runNow()), get = js.Any.fromFunction1(get), handlers = handlers.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderHandler]
  }
  
  extension [Self <: LoaderHandler](x: Self) {
    
    inline def setAdd(value: (js.RegExp, Loader) => Callback): Self = StObject.set(x, "add", js.Any.fromFunction2((t0: js.RegExp, t1: Loader) => (value(t0, t1)).runNow()))
    
    inline def setGet(value: String => Loader): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHandlers(value: js.Array[js.RegExp | Loader]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    
    inline def setHandlersVarargs(value: (js.RegExp | Loader)*): Self = StObject.set(x, "handlers", js.Array(value*))
  }
}
