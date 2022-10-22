package typingsJapgolly.reactNativeReanimated.mod.Animated

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options[P] extends StObject {
  
  def setNativeProps(ref: Any, props: P): Unit
}
object Options {
  
  inline def apply[P](setNativeProps: (Any, P) => Callback): Options[P] = {
    val __obj = js.Dynamic.literal(setNativeProps = js.Any.fromFunction2((t0: Any, t1: P) => (setNativeProps(t0, t1)).runNow()))
    __obj.asInstanceOf[Options[P]]
  }
  
  extension [Self <: Options[?], P](x: Self & Options[P]) {
    
    inline def setSetNativeProps(value: (Any, P) => Callback): Self = StObject.set(x, "setNativeProps", js.Any.fromFunction2((t0: Any, t1: P) => (value(t0, t1)).runNow()))
  }
}
