package typingsJapgolly.reactNativePaper.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnValueChange extends StObject {
  
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onValueChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  
  var value: String
}
object OnValueChange {
  
  inline def apply(value: String): OnValueChange = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnValueChange]
  }
  
  extension [Self <: OnValueChange](x: Self) {
    
    inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setOnValueChange(value: /* value */ String => Callback): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
