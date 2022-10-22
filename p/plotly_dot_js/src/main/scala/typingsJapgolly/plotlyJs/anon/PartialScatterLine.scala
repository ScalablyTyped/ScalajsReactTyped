package typingsJapgolly.plotlyJs.anon

import typingsJapgolly.plotlyJs.plotlyJsStrings.hv
import typingsJapgolly.plotlyJs.plotlyJsStrings.hvh
import typingsJapgolly.plotlyJs.plotlyJsStrings.linear
import typingsJapgolly.plotlyJs.plotlyJsStrings.spline
import typingsJapgolly.plotlyJs.plotlyJsStrings.vh
import typingsJapgolly.plotlyJs.plotlyJsStrings.vhv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.ScatterLine> */
trait PartialScatterLine extends StObject {
  
  var color: js.UndefOr[typingsJapgolly.plotlyJs.mod.Color] = js.undefined
  
  var dash: js.UndefOr[typingsJapgolly.plotlyJs.mod.Dash] = js.undefined
  
  var shape: js.UndefOr[linear | spline | hv | vh | hvh | vhv] = js.undefined
  
  var simplify: js.UndefOr[Boolean] = js.undefined
  
  var smoothing: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object PartialScatterLine {
  
  inline def apply(): PartialScatterLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScatterLine]
  }
  
  extension [Self <: PartialScatterLine](x: Self) {
    
    inline def setColor(value: typingsJapgolly.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setDash(value: typingsJapgolly.plotlyJs.mod.Dash): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    inline def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
    
    inline def setShape(value: linear | spline | hv | vh | hvh | vhv): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSimplify(value: Boolean): Self = StObject.set(x, "simplify", value.asInstanceOf[js.Any])
    
    inline def setSimplifyUndefined: Self = StObject.set(x, "simplify", js.undefined)
    
    inline def setSmoothing(value: Double): Self = StObject.set(x, "smoothing", value.asInstanceOf[js.Any])
    
    inline def setSmoothingUndefined: Self = StObject.set(x, "smoothing", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
