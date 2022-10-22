package typingsJapgolly.glidejsGlide.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslateComponent
  extends StObject
     with Component {
  
  def remove(): Unit
  
  def set(value: Double): Unit
}
object TranslateComponent {
  
  inline def apply(remove: Callback, set: Double => Callback): TranslateComponent = {
    val __obj = js.Dynamic.literal(remove = remove.toJsFn, set = js.Any.fromFunction1((t0: Double) => set(t0).runNow()))
    __obj.asInstanceOf[TranslateComponent]
  }
  
  extension [Self <: TranslateComponent](x: Self) {
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    
    inline def setSet(value: Double => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
