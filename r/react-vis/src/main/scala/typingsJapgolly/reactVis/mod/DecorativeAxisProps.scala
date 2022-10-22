package typingsJapgolly.reactVis.mod

import typingsJapgolly.reactVis.anon.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecorativeAxisProps
  extends StObject
     with AbstractSeriesProps[DecorativeAxisPoint] {
  
  var axisDomain: js.Array[Double]
  
  var axisEnd: Y
  
  var axisStart: Y
  
  var numberOfTicks: js.UndefOr[Double] = js.undefined
  
  var tickSize: js.UndefOr[Double] = js.undefined
  
  // default: 10
  var tickValue: js.UndefOr[js.Function1[/* x */ Any, String | Double]] = js.undefined
}
object DecorativeAxisProps {
  
  inline def apply(axisDomain: js.Array[Double], axisEnd: Y, axisStart: Y): DecorativeAxisProps = {
    val __obj = js.Dynamic.literal(axisDomain = axisDomain.asInstanceOf[js.Any], axisEnd = axisEnd.asInstanceOf[js.Any], axisStart = axisStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorativeAxisProps]
  }
  
  extension [Self <: DecorativeAxisProps](x: Self) {
    
    inline def setAxisDomain(value: js.Array[Double]): Self = StObject.set(x, "axisDomain", value.asInstanceOf[js.Any])
    
    inline def setAxisDomainVarargs(value: Double*): Self = StObject.set(x, "axisDomain", js.Array(value*))
    
    inline def setAxisEnd(value: Y): Self = StObject.set(x, "axisEnd", value.asInstanceOf[js.Any])
    
    inline def setAxisStart(value: Y): Self = StObject.set(x, "axisStart", value.asInstanceOf[js.Any])
    
    inline def setNumberOfTicks(value: Double): Self = StObject.set(x, "numberOfTicks", value.asInstanceOf[js.Any])
    
    inline def setNumberOfTicksUndefined: Self = StObject.set(x, "numberOfTicks", js.undefined)
    
    inline def setTickSize(value: Double): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
    
    inline def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
    
    inline def setTickValue(value: /* x */ Any => String | Double): Self = StObject.set(x, "tickValue", js.Any.fromFunction1(value))
    
    inline def setTickValueUndefined: Self = StObject.set(x, "tickValue", js.undefined)
  }
}
