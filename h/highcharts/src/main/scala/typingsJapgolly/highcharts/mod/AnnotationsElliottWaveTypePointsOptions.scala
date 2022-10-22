package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsElliottWaveTypePointsOptions extends StObject {
  
  var controlPoint: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) Options for annotation's labels. Each label inherits options
    * from the labelOptions object. An option from the labelOptions can be
    * overwritten by config for a specific label.
    */
  var label: js.UndefOr[AnnotationsElliottWaveTypePointsLabelOptions] = js.undefined
  
  /**
    * (Highstock) The x position of the point.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The y position of the point.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object AnnotationsElliottWaveTypePointsOptions {
  
  inline def apply(): AnnotationsElliottWaveTypePointsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsElliottWaveTypePointsOptions]
  }
  
  extension [Self <: AnnotationsElliottWaveTypePointsOptions](x: Self) {
    
    inline def setControlPoint(value: Double): Self = StObject.set(x, "controlPoint", value.asInstanceOf[js.Any])
    
    inline def setControlPointUndefined: Self = StObject.set(x, "controlPoint", js.undefined)
    
    inline def setLabel(value: AnnotationsElliottWaveTypePointsLabelOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
