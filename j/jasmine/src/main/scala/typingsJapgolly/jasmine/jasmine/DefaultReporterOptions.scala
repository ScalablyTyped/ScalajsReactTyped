package typingsJapgolly.jasmine.jasmine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultReporterOptions extends StObject {
  
  var jasmineCorePath: js.UndefOr[String] = js.undefined
  
  var print: js.UndefOr[js.Function1[/* repeated */ scala.Any, Unit]] = js.undefined
  
  var showColors: js.UndefOr[Boolean] = js.undefined
  
  var timer: js.UndefOr[scala.Any] = js.undefined
}
object DefaultReporterOptions {
  
  inline def apply(): DefaultReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultReporterOptions]
  }
  
  extension [Self <: DefaultReporterOptions](x: Self) {
    
    inline def setJasmineCorePath(value: String): Self = StObject.set(x, "jasmineCorePath", value.asInstanceOf[js.Any])
    
    inline def setJasmineCorePathUndefined: Self = StObject.set(x, "jasmineCorePath", js.undefined)
    
    inline def setPrint(value: /* repeated */ scala.Any => Callback): Self = StObject.set(x, "print", js.Any.fromFunction1((t0: /* repeated */ scala.Any) => value(t0).runNow()))
    
    inline def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
    
    inline def setShowColors(value: Boolean): Self = StObject.set(x, "showColors", value.asInstanceOf[js.Any])
    
    inline def setShowColorsUndefined: Self = StObject.set(x, "showColors", js.undefined)
    
    inline def setTimer(value: scala.Any): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
    
    inline def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
  }
}
