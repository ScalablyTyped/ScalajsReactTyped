package typingsJapgolly.fridaGum.Java

import japgolly.scalajs.react.Callback
import typingsJapgolly.fridaGum.NativePointer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumerateLoadedClassesCallbacks extends StObject {
  
  /**
    * Called when all loaded classes have been enumerated.
    */
  def onComplete(): Unit
  
  /**
    * Called with the name of each currently loaded class, and a JNI
    * reference for its Java Class object.
    *
    * Pass the `name` to `Java.use()` to get a JavaScript wrapper.
    * You may also `Java.cast()` the `handle` to `java.lang.Class`.
    */
  def onMatch(name: String, handle: NativePointer): Unit
}
object EnumerateLoadedClassesCallbacks {
  
  inline def apply(onComplete: Callback, onMatch: (String, NativePointer) => Callback): EnumerateLoadedClassesCallbacks = {
    val __obj = js.Dynamic.literal(onComplete = onComplete.toJsFn, onMatch = js.Any.fromFunction2((t0: String, t1: NativePointer) => (onMatch(t0, t1)).runNow()))
    __obj.asInstanceOf[EnumerateLoadedClassesCallbacks]
  }
  
  extension [Self <: EnumerateLoadedClassesCallbacks](x: Self) {
    
    inline def setOnComplete(value: Callback): Self = StObject.set(x, "onComplete", value.toJsFn)
    
    inline def setOnMatch(value: (String, NativePointer) => Callback): Self = StObject.set(x, "onMatch", js.Any.fromFunction2((t0: String, t1: NativePointer) => (value(t0, t1)).runNow()))
  }
}
