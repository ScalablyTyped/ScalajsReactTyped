package typingsJapgolly.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxChartValueAxisStrips
  extends StObject
     with dxChartCommonAxisSettingsStripStyle {
  
  /**
    * Specifies the color of the strip.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Along with the startValue property, limits the strip.
    */
  var endValue: js.UndefOr[Double | js.Date | String] = js.undefined
  
  /**
    * Configures the strip label.
    */
  @JSName("label")
  var label_dxChartValueAxisStrips: js.UndefOr[dxChartValueAxisStripsLabel] = js.undefined
  
  /**
    * Along with the endValue property, limits the strip.
    */
  var startValue: js.UndefOr[Double | js.Date | String] = js.undefined
}
object dxChartValueAxisStrips {
  
  inline def apply(): dxChartValueAxisStrips = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartValueAxisStrips]
  }
  
  extension [Self <: dxChartValueAxisStrips](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEndValue(value: Double | js.Date | String): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
    
    inline def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
    
    inline def setLabel(value: dxChartValueAxisStripsLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setStartValue(value: Double | js.Date | String): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
  }
}
