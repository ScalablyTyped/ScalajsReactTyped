package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSplineAnimationOptions extends StObject {
  
  var defer: js.UndefOr[Double] = js.undefined
}
object PlotSplineAnimationOptions {
  
  inline def apply(): PlotSplineAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSplineAnimationOptions]
  }
  
  extension [Self <: PlotSplineAnimationOptions](x: Self) {
    
    inline def setDefer(value: Double): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
  }
}
