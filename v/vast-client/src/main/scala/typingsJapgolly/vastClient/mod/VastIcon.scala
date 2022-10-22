package typingsJapgolly.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VastIcon extends StObject {
  
  var apiFramework: String | Null
  
  var duration: Double
  
  var height: Double
  
  var htmlResource: String | Null
  
  var iconClickThroughURLTemplate: String | Null
  
  var iconClickTrackingURLTemplates: js.Array[VastUrlValue]
  
  var iconViewTrackingURLTemplate: String | Null
  
  var iframeResource: String | Null
  
  var offset: String | Null
  
  var program: String | Null
  
  var staticResource: String | Null
  
  var `type`: String | Null
  
  var width: Double
  
  var xPosition: Double
  
  var yPosition: Double
}
object VastIcon {
  
  inline def apply(
    duration: Double,
    height: Double,
    iconClickTrackingURLTemplates: js.Array[VastUrlValue],
    width: Double,
    xPosition: Double,
    yPosition: Double
  ): VastIcon = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], iconClickTrackingURLTemplates = iconClickTrackingURLTemplates.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xPosition = xPosition.asInstanceOf[js.Any], yPosition = yPosition.asInstanceOf[js.Any], apiFramework = null, htmlResource = null, iconClickThroughURLTemplate = null, iconViewTrackingURLTemplate = null, iframeResource = null, offset = null, program = null, staticResource = null)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[VastIcon]
  }
  
  extension [Self <: VastIcon](x: Self) {
    
    inline def setApiFramework(value: String): Self = StObject.set(x, "apiFramework", value.asInstanceOf[js.Any])
    
    inline def setApiFrameworkNull: Self = StObject.set(x, "apiFramework", null)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHtmlResource(value: String): Self = StObject.set(x, "htmlResource", value.asInstanceOf[js.Any])
    
    inline def setHtmlResourceNull: Self = StObject.set(x, "htmlResource", null)
    
    inline def setIconClickThroughURLTemplate(value: String): Self = StObject.set(x, "iconClickThroughURLTemplate", value.asInstanceOf[js.Any])
    
    inline def setIconClickThroughURLTemplateNull: Self = StObject.set(x, "iconClickThroughURLTemplate", null)
    
    inline def setIconClickTrackingURLTemplates(value: js.Array[VastUrlValue]): Self = StObject.set(x, "iconClickTrackingURLTemplates", value.asInstanceOf[js.Any])
    
    inline def setIconClickTrackingURLTemplatesVarargs(value: VastUrlValue*): Self = StObject.set(x, "iconClickTrackingURLTemplates", js.Array(value*))
    
    inline def setIconViewTrackingURLTemplate(value: String): Self = StObject.set(x, "iconViewTrackingURLTemplate", value.asInstanceOf[js.Any])
    
    inline def setIconViewTrackingURLTemplateNull: Self = StObject.set(x, "iconViewTrackingURLTemplate", null)
    
    inline def setIframeResource(value: String): Self = StObject.set(x, "iframeResource", value.asInstanceOf[js.Any])
    
    inline def setIframeResourceNull: Self = StObject.set(x, "iframeResource", null)
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    inline def setProgram(value: String): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setProgramNull: Self = StObject.set(x, "program", null)
    
    inline def setStaticResource(value: String): Self = StObject.set(x, "staticResource", value.asInstanceOf[js.Any])
    
    inline def setStaticResourceNull: Self = StObject.set(x, "staticResource", null)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setXPosition(value: Double): Self = StObject.set(x, "xPosition", value.asInstanceOf[js.Any])
    
    inline def setYPosition(value: Double): Self = StObject.set(x, "yPosition", value.asInstanceOf[js.Any])
  }
}
