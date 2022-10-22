package typingsJapgolly.plotlyJs.anon

import typingsJapgolly.plotlyJs.mod.Axis
import typingsJapgolly.plotlyJs.mod.GaugeBar
import typingsJapgolly.plotlyJs.mod.Threshold
import typingsJapgolly.plotlyJs.plotlyJsStrings.angular
import typingsJapgolly.plotlyJs.plotlyJsStrings.bullet
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Gauge> */
trait PartialGaugeBgcolor extends StObject {
  
  var axis: js.UndefOr[Partial[Axis]] = js.undefined
  
  var bar: js.UndefOr[Partial[GaugeBar]] = js.undefined
  
  var bgcolor: js.UndefOr[typingsJapgolly.plotlyJs.mod.Color] = js.undefined
  
  var bordercolor: js.UndefOr[typingsJapgolly.plotlyJs.mod.Color] = js.undefined
  
  var borderwidth: js.UndefOr[Double] = js.undefined
  
  var shape: js.UndefOr[angular | bullet] = js.undefined
  
  var steps: js.UndefOr[js.Array[Color]] = js.undefined
  
  var threshold: js.UndefOr[Partial[Threshold]] = js.undefined
}
object PartialGaugeBgcolor {
  
  inline def apply(): PartialGaugeBgcolor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGaugeBgcolor]
  }
  
  extension [Self <: PartialGaugeBgcolor](x: Self) {
    
    inline def setAxis(value: Partial[Axis]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setBar(value: Partial[GaugeBar]): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
    
    inline def setBgcolor(value: typingsJapgolly.plotlyJs.mod.Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    inline def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value*))
    
    inline def setBordercolor(value: typingsJapgolly.plotlyJs.mod.Color): Self = StObject.set(x, "bordercolor", value.asInstanceOf[js.Any])
    
    inline def setBordercolorUndefined: Self = StObject.set(x, "bordercolor", js.undefined)
    
    inline def setBordercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bordercolor", js.Array(value*))
    
    inline def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    inline def setBorderwidthUndefined: Self = StObject.set(x, "borderwidth", js.undefined)
    
    inline def setShape(value: angular | bullet): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSteps(value: js.Array[Color]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setStepsVarargs(value: Color*): Self = StObject.set(x, "steps", js.Array(value*))
    
    inline def setThreshold(value: Partial[Threshold]): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
