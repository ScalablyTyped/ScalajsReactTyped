package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DateTimeUtil {
  
  trait SimpleDate extends StObject {
    
    def get_day(): Double
    
    def get_era(): Double
    
    def get_month(): Double
    
    def get_year(): Double
    
    def set_day(value: Double): Unit
    
    def set_era(value: Double): Unit
    
    def set_month(value: Double): Unit
    
    def set_year(value: Double): Unit
  }
  object SimpleDate {
    
    inline def apply(
      get_day: CallbackTo[Double],
      get_era: CallbackTo[Double],
      get_month: CallbackTo[Double],
      get_year: CallbackTo[Double],
      set_day: Double => Callback,
      set_era: Double => Callback,
      set_month: Double => Callback,
      set_year: Double => Callback
    ): SimpleDate = {
      val __obj = js.Dynamic.literal(get_day = get_day.toJsFn, get_era = get_era.toJsFn, get_month = get_month.toJsFn, get_year = get_year.toJsFn, set_day = js.Any.fromFunction1((t0: Double) => set_day(t0).runNow()), set_era = js.Any.fromFunction1((t0: Double) => set_era(t0).runNow()), set_month = js.Any.fromFunction1((t0: Double) => set_month(t0).runNow()), set_year = js.Any.fromFunction1((t0: Double) => set_year(t0).runNow()))
      __obj.asInstanceOf[SimpleDate]
    }
    
    extension [Self <: SimpleDate](x: Self) {
      
      inline def setGet_day(value: CallbackTo[Double]): Self = StObject.set(x, "get_day", value.toJsFn)
      
      inline def setGet_era(value: CallbackTo[Double]): Self = StObject.set(x, "get_era", value.toJsFn)
      
      inline def setGet_month(value: CallbackTo[Double]): Self = StObject.set(x, "get_month", value.toJsFn)
      
      inline def setGet_year(value: CallbackTo[Double]): Self = StObject.set(x, "get_year", value.toJsFn)
      
      inline def setSet_day(value: Double => Callback): Self = StObject.set(x, "set_day", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSet_era(value: Double => Callback): Self = StObject.set(x, "set_era", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSet_month(value: Double => Callback): Self = StObject.set(x, "set_month", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSet_year(value: Double => Callback): Self = StObject.set(x, "set_year", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
}
