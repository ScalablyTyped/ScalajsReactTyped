package typingsJapgolly.fridaGum.Java

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumerateClassLoadersCallbacks extends StObject {
  
  /**
    * Called when all class loaders have been enumerated.
    */
  def onComplete(): Unit
  
  /**
    * Called with a `java.lang.ClassLoader` wrapper for each class loader
    * found in the VM.
    */
  def onMatch(loader: typingsJapgolly.fridaGum.anon.Wrapper): Unit
}
object EnumerateClassLoadersCallbacks {
  
  inline def apply(onComplete: Callback, onMatch: typingsJapgolly.fridaGum.anon.Wrapper => Callback): EnumerateClassLoadersCallbacks = {
    val __obj = js.Dynamic.literal(onComplete = onComplete.toJsFn, onMatch = js.Any.fromFunction1((t0: typingsJapgolly.fridaGum.anon.Wrapper) => onMatch(t0).runNow()))
    __obj.asInstanceOf[EnumerateClassLoadersCallbacks]
  }
  
  extension [Self <: EnumerateClassLoadersCallbacks](x: Self) {
    
    inline def setOnComplete(value: Callback): Self = StObject.set(x, "onComplete", value.toJsFn)
    
    inline def setOnMatch(value: typingsJapgolly.fridaGum.anon.Wrapper => Callback): Self = StObject.set(x, "onMatch", js.Any.fromFunction1((t0: typingsJapgolly.fridaGum.anon.Wrapper) => value(t0).runNow()))
  }
}
