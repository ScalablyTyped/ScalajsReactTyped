package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsTunnelShapeOptions extends StObject {
  
  /**
    * (Highstock) Name of the dash style to use for the shape's stroke.
    */
  var dashStyle: js.UndefOr[DashStyleValue] = js.undefined
  
  /**
    * (Highstock) The color of the shape's fill.
    */
  var fill: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highstock) The height of the shape.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The radius of the shape.
    */
  var r: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The radius of the shape in y direction. Used for the ellipse.
    */
  var ry: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) Defines additional snapping area around an annotation making
    * this annotation to focus. Defined in pixels.
    */
  var snap: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The URL for an image to use as the annotation shape. Note,
    * type has to be set to `'image'`.
    */
  var src: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) The color of the shape's stroke.
    */
  var stroke: js.UndefOr[ColorString] = js.undefined
  
  /**
    * (Highstock) The pixel stroke width of the shape.
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The type of the shape. Avaliable options are circle, rect and
    * ellipse.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) The width of the shape.
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The xAxis index to which the points should be attached. Used
    * for the ellipse.
    */
  var xAxis: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The yAxis index to which the points should be attached. Used
    * for the ellipse.
    */
  var yAxis: js.UndefOr[Double] = js.undefined
}
object AnnotationsTunnelShapeOptions {
  
  inline def apply(): AnnotationsTunnelShapeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsTunnelShapeOptions]
  }
  
  extension [Self <: AnnotationsTunnelShapeOptions](x: Self) {
    
    inline def setDashStyle(value: DashStyleValue): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setFill(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    
    inline def setSnap(value: Double): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
    
    inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setStroke(value: ColorString): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setXAxis(value: Double): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
    
    inline def setYAxis(value: Double): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
  }
}
