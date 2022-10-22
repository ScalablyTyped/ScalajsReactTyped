package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.plotlyJsStrings.hv
import typingsJapgolly.plotlyJs.plotlyJsStrings.hvh
import typingsJapgolly.plotlyJs.plotlyJsStrings.linear
import typingsJapgolly.plotlyJs.plotlyJsStrings.spline
import typingsJapgolly.plotlyJs.plotlyJsStrings.vh
import typingsJapgolly.plotlyJs.plotlyJsStrings.vhv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScatterLine extends StObject {
  
  var color: Color
  
  var dash: Dash
  
  var shape: linear | spline | hv | vh | hvh | vhv
  
  var simplify: Boolean
  
  var smoothing: Double
  
  var width: Double
}
object ScatterLine {
  
  inline def apply(
    color: Color,
    dash: Dash,
    shape: linear | spline | hv | vh | hvh | vhv,
    simplify: Boolean,
    smoothing: Double,
    width: Double
  ): ScatterLine = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], dash = dash.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], simplify = simplify.asInstanceOf[js.Any], smoothing = smoothing.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterLine]
  }
  
  extension [Self <: ScatterLine](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setDash(value: Dash): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    inline def setShape(value: linear | spline | hv | vh | hvh | vhv): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setSimplify(value: Boolean): Self = StObject.set(x, "simplify", value.asInstanceOf[js.Any])
    
    inline def setSmoothing(value: Double): Self = StObject.set(x, "smoothing", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
