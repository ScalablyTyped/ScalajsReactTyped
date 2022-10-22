package typingsJapgolly.forgeViewer.THREE

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingManager extends StObject {
  
  def itemEnd(url: String): Unit
  
  def itemError(url: String): Unit
  
  def itemStart(url: String): Unit
  
  def onError(): Unit
  
  def onLoad(): Unit
  
  def onProgress(item: Any, loaded: Double, total: Double): Unit
  
  def onStart(): Unit
}
object LoadingManager {
  
  inline def apply(
    itemEnd: String => Callback,
    itemError: String => Callback,
    itemStart: String => Callback,
    onError: Callback,
    onLoad: Callback,
    onProgress: (Any, Double, Double) => Callback,
    onStart: Callback
  ): LoadingManager = {
    val __obj = js.Dynamic.literal(itemEnd = js.Any.fromFunction1((t0: String) => itemEnd(t0).runNow()), itemError = js.Any.fromFunction1((t0: String) => itemError(t0).runNow()), itemStart = js.Any.fromFunction1((t0: String) => itemStart(t0).runNow()), onError = onError.toJsFn, onLoad = onLoad.toJsFn, onProgress = js.Any.fromFunction3((t0: Any, t1: Double, t2: Double) => (onProgress(t0, t1, t2)).runNow()), onStart = onStart.toJsFn)
    __obj.asInstanceOf[LoadingManager]
  }
  
  extension [Self <: LoadingManager](x: Self) {
    
    inline def setItemEnd(value: String => Callback): Self = StObject.set(x, "itemEnd", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setItemError(value: String => Callback): Self = StObject.set(x, "itemError", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setItemStart(value: String => Callback): Self = StObject.set(x, "itemStart", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setOnError(value: Callback): Self = StObject.set(x, "onError", value.toJsFn)
    
    inline def setOnLoad(value: Callback): Self = StObject.set(x, "onLoad", value.toJsFn)
    
    inline def setOnProgress(value: (Any, Double, Double) => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction3((t0: Any, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnStart(value: Callback): Self = StObject.set(x, "onStart", value.toJsFn)
  }
}
