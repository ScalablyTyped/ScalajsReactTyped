package typingsJapgolly.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicatorSrc extends StObject {
  
  /**
    * Enables or disables the load panel.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the height of the load panel.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the URL pointing to an image that will be used as a load indicator.
    */
  var indicatorSrc: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to shade the UI component when the load panel appears.
    */
  var shading: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the shading color. Applies only if shading is true.
    */
  var shadingColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether or not to show a load indicator.
    */
  var showIndicator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not to show load panel background.
    */
  var showPane: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the text to display inside a load panel.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the width of the load panel.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object IndicatorSrc {
  
  inline def apply(): IndicatorSrc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicatorSrc]
  }
  
  extension [Self <: IndicatorSrc](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIndicatorSrc(value: String): Self = StObject.set(x, "indicatorSrc", value.asInstanceOf[js.Any])
    
    inline def setIndicatorSrcUndefined: Self = StObject.set(x, "indicatorSrc", js.undefined)
    
    inline def setShading(value: Boolean): Self = StObject.set(x, "shading", value.asInstanceOf[js.Any])
    
    inline def setShadingColor(value: String): Self = StObject.set(x, "shadingColor", value.asInstanceOf[js.Any])
    
    inline def setShadingColorUndefined: Self = StObject.set(x, "shadingColor", js.undefined)
    
    inline def setShadingUndefined: Self = StObject.set(x, "shading", js.undefined)
    
    inline def setShowIndicator(value: Boolean): Self = StObject.set(x, "showIndicator", value.asInstanceOf[js.Any])
    
    inline def setShowIndicatorUndefined: Self = StObject.set(x, "showIndicator", js.undefined)
    
    inline def setShowPane(value: Boolean): Self = StObject.set(x, "showPane", value.asInstanceOf[js.Any])
    
    inline def setShowPaneUndefined: Self = StObject.set(x, "showPane", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
