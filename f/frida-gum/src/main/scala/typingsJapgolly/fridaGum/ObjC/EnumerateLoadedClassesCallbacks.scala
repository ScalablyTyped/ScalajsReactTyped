package typingsJapgolly.fridaGum.ObjC

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumerateLoadedClassesCallbacks extends StObject {
  
  def onComplete(): Unit
  
  def onMatch(name: String, owner: String): Unit
}
object EnumerateLoadedClassesCallbacks {
  
  inline def apply(onComplete: Callback, onMatch: (String, String) => Callback): EnumerateLoadedClassesCallbacks = {
    val __obj = js.Dynamic.literal(onComplete = onComplete.toJsFn, onMatch = js.Any.fromFunction2((t0: String, t1: String) => (onMatch(t0, t1)).runNow()))
    __obj.asInstanceOf[EnumerateLoadedClassesCallbacks]
  }
  
  extension [Self <: EnumerateLoadedClassesCallbacks](x: Self) {
    
    inline def setOnComplete(value: Callback): Self = StObject.set(x, "onComplete", value.toJsFn)
    
    inline def setOnMatch(value: (String, String) => Callback): Self = StObject.set(x, "onMatch", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
