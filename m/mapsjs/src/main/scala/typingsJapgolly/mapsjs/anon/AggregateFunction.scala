package typingsJapgolly.mapsjs.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateFunction extends StObject {
  
  var aggregateFunction: js.UndefOr[js.Function3[/* srcRow */ Any, /* cmpRow */ Any, /* aggRow */ Any, Unit]] = js.undefined
  
  var data: js.Array[js.Object]
  
  var mapUnitsPerPixel: Double
  
  var marginPixels: js.UndefOr[Double] = js.undefined
  
  var pointKey: String
  
  def radiusFunction(row: Any): Double
  
  var valueFunction: js.UndefOr[js.Function1[/* row */ Any, Double]] = js.undefined
}
object AggregateFunction {
  
  inline def apply(
    data: js.Array[js.Object],
    mapUnitsPerPixel: Double,
    pointKey: String,
    radiusFunction: Any => Double
  ): AggregateFunction = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mapUnitsPerPixel = mapUnitsPerPixel.asInstanceOf[js.Any], pointKey = pointKey.asInstanceOf[js.Any], radiusFunction = js.Any.fromFunction1(radiusFunction))
    __obj.asInstanceOf[AggregateFunction]
  }
  
  extension [Self <: AggregateFunction](x: Self) {
    
    inline def setAggregateFunction(value: (/* srcRow */ Any, /* cmpRow */ Any, /* aggRow */ Any) => Callback): Self = StObject.set(x, "aggregateFunction", js.Any.fromFunction3((t0: /* srcRow */ Any, t1: /* cmpRow */ Any, t2: /* aggRow */ Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setAggregateFunctionUndefined: Self = StObject.set(x, "aggregateFunction", js.undefined)
    
    inline def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setMapUnitsPerPixel(value: Double): Self = StObject.set(x, "mapUnitsPerPixel", value.asInstanceOf[js.Any])
    
    inline def setMarginPixels(value: Double): Self = StObject.set(x, "marginPixels", value.asInstanceOf[js.Any])
    
    inline def setMarginPixelsUndefined: Self = StObject.set(x, "marginPixels", js.undefined)
    
    inline def setPointKey(value: String): Self = StObject.set(x, "pointKey", value.asInstanceOf[js.Any])
    
    inline def setRadiusFunction(value: Any => Double): Self = StObject.set(x, "radiusFunction", js.Any.fromFunction1(value))
    
    inline def setValueFunction(value: /* row */ Any => Double): Self = StObject.set(x, "valueFunction", js.Any.fromFunction1(value))
    
    inline def setValueFunctionUndefined: Self = StObject.set(x, "valueFunction", js.undefined)
  }
}
