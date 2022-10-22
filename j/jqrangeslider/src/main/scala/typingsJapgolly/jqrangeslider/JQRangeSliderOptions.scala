package typingsJapgolly.jqrangeslider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQRangeSliderOptions extends StObject {
  
  // speed of the wheel scrolling
  var arrows: js.UndefOr[Boolean] = js.undefined
  
  // fade out length when displaying value labels (only when valueLabels = "change")
  var delayOut: js.UndefOr[Double] = js.undefined
  
  // when to show value labels: "show" (always), "hide" (never) and "change" (only if slider changed)
  var durationIn: js.UndefOr[Double] = js.undefined
  
  // fade in length when displaying value labels (only when valueLabels = "change")
  var durationOut: js.UndefOr[Double] = js.undefined
  
  // show handles and make them clearly select the range. Warning: must be used with 'minimum' and must not be used with 'scale'
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  // duration labels are shown after the user changed its values (only when valueLabels = "change")
  var range: js.UndefOr[Boolean | JQRangeSliderRangeLength] = js.undefined
  
  // configure a read-only slider
  var scales: js.UndefOr[js.Array[jQRangeSliderScale]] = js.undefined
  
  // lets you specify minimum and/or maximum range length
  var symmetricPositionning: js.UndefOr[Boolean] = js.undefined
  
  // hide the arrows or not
  var valueLabels: js.UndefOr[String] = js.undefined
  
  var wheelMode: js.UndefOr[String] = js.undefined
  
  // function of the wheel, "zoom", "scroll" or null
  var wheelSpeed: js.UndefOr[Double] = js.undefined
}
object JQRangeSliderOptions {
  
  inline def apply(): JQRangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQRangeSliderOptions]
  }
  
  extension [Self <: JQRangeSliderOptions](x: Self) {
    
    inline def setArrows(value: Boolean): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
    
    inline def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
    
    inline def setDelayOut(value: Double): Self = StObject.set(x, "delayOut", value.asInstanceOf[js.Any])
    
    inline def setDelayOutUndefined: Self = StObject.set(x, "delayOut", js.undefined)
    
    inline def setDurationIn(value: Double): Self = StObject.set(x, "durationIn", value.asInstanceOf[js.Any])
    
    inline def setDurationInUndefined: Self = StObject.set(x, "durationIn", js.undefined)
    
    inline def setDurationOut(value: Double): Self = StObject.set(x, "durationOut", value.asInstanceOf[js.Any])
    
    inline def setDurationOutUndefined: Self = StObject.set(x, "durationOut", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setRange(value: Boolean | JQRangeSliderRangeLength): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setScales(value: js.Array[jQRangeSliderScale]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
    
    inline def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
    
    inline def setScalesVarargs(value: jQRangeSliderScale*): Self = StObject.set(x, "scales", js.Array(value*))
    
    inline def setSymmetricPositionning(value: Boolean): Self = StObject.set(x, "symmetricPositionning", value.asInstanceOf[js.Any])
    
    inline def setSymmetricPositionningUndefined: Self = StObject.set(x, "symmetricPositionning", js.undefined)
    
    inline def setValueLabels(value: String): Self = StObject.set(x, "valueLabels", value.asInstanceOf[js.Any])
    
    inline def setValueLabelsUndefined: Self = StObject.set(x, "valueLabels", js.undefined)
    
    inline def setWheelMode(value: String): Self = StObject.set(x, "wheelMode", value.asInstanceOf[js.Any])
    
    inline def setWheelModeUndefined: Self = StObject.set(x, "wheelMode", js.undefined)
    
    inline def setWheelSpeed(value: Double): Self = StObject.set(x, "wheelSpeed", value.asInstanceOf[js.Any])
    
    inline def setWheelSpeedUndefined: Self = StObject.set(x, "wheelSpeed", js.undefined)
  }
}
