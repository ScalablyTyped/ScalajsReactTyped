package typingsJapgolly.reactNativeReanimated.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetAttribute extends StObject {
  
  def setAttribute(key: String, props: Any): Unit
}
object SetAttribute {
  
  inline def apply(setAttribute: (String, Any) => Callback): SetAttribute = {
    val __obj = js.Dynamic.literal(setAttribute = js.Any.fromFunction2((t0: String, t1: Any) => (setAttribute(t0, t1)).runNow()))
    __obj.asInstanceOf[SetAttribute]
  }
  
  extension [Self <: SetAttribute](x: Self) {
    
    inline def setSetAttribute(value: (String, Any) => Callback): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
  }
}
