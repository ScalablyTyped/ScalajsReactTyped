package typingsJapgolly.antDesignReactNative.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Max extends StObject {
  
  var max: Double
  
  var min: Double
  
  var onBlur: js.Function0[Unit]
  
  var onChange: js.Function0[Unit]
  
  var onFocus: js.Function0[Unit]
  
  var parser: js.Function1[/* input */ String, String]
  
  var step: Double
}
object Max {
  
  inline def apply(
    max: Double,
    min: Double,
    onBlur: Callback,
    onChange: Callback,
    onFocus: Callback,
    parser: /* input */ String => String,
    step: Double
  ): Max = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onBlur = onBlur.toJsFn, onChange = onChange.toJsFn, onFocus = onFocus.toJsFn, parser = js.Any.fromFunction1(parser), step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
  
  extension [Self <: Max](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: Callback): Self = StObject.set(x, "onBlur", value.toJsFn)
    
    inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
    
    inline def setOnFocus(value: Callback): Self = StObject.set(x, "onFocus", value.toJsFn)
    
    inline def setParser(value: /* input */ String => String): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
