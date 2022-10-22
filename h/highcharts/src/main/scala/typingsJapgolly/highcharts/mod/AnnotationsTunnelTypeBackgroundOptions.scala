package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsTunnelTypeBackgroundOptions extends StObject {
  
  var fill: js.UndefOr[String] = js.undefined
  
  var strokeWidth: js.UndefOr[Double] = js.undefined
}
object AnnotationsTunnelTypeBackgroundOptions {
  
  inline def apply(): AnnotationsTunnelTypeBackgroundOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsTunnelTypeBackgroundOptions]
  }
  
  extension [Self <: AnnotationsTunnelTypeBackgroundOptions](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
