package typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2UiElementsImage extends StObject {
  
  /**
    * A text description of the image to be used for accessibility, e.g. screen
    * readers.
    * Required.
    */
  var accessibilityText: js.UndefOr[String] = js.undefined
  
  /**
    * The height of the image in pixels.
    * Optional.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The source url of the image. Images can be JPG, PNG and GIF (animated and
    * non-animated). For example,`https://www.agentx.com/logo.png`. Required.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * The width of the image in pixels.
    * Optional.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object GoogleActionsV2UiElementsImage {
  
  inline def apply(): GoogleActionsV2UiElementsImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsImage]
  }
  
  extension [Self <: GoogleActionsV2UiElementsImage](x: Self) {
    
    inline def setAccessibilityText(value: String): Self = StObject.set(x, "accessibilityText", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityTextUndefined: Self = StObject.set(x, "accessibilityText", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
