package typingsJapgolly.fortawesomeFontawesomeSvgCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Library_ extends StObject {
  
  def add(definitions: IconDefinitionOrPack*): Unit
  
  def reset(): Unit
}
object Library_ {
  
  inline def apply(add: /* repeated */ IconDefinitionOrPack => Callback, reset: Callback): Library_ = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: /* repeated */ IconDefinitionOrPack) => add(t0).runNow()), reset = reset.toJsFn)
    __obj.asInstanceOf[Library_]
  }
  
  extension [Self <: Library_](x: Self) {
    
    inline def setAdd(value: /* repeated */ IconDefinitionOrPack => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: /* repeated */ IconDefinitionOrPack) => value(t0).runNow()))
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
  }
}
