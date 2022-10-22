package typingsJapgolly.vkOpenapi.vk.OpenAPI.Widgets

import typingsJapgolly.vkOpenapi.vk.OpenAPI.NumericBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentsOptions extends StObject {
  
  var attach: js.UndefOr[String] = js.undefined
  
  var autoPublish: js.UndefOr[NumericBoolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var norealtime: js.UndefOr[NumericBoolean] = js.undefined
  
  var pageUrl: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object CommentsOptions {
  
  inline def apply(): CommentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentsOptions]
  }
  
  extension [Self <: CommentsOptions](x: Self) {
    
    inline def setAttach(value: String): Self = StObject.set(x, "attach", value.asInstanceOf[js.Any])
    
    inline def setAttachUndefined: Self = StObject.set(x, "attach", js.undefined)
    
    inline def setAutoPublish(value: NumericBoolean): Self = StObject.set(x, "autoPublish", value.asInstanceOf[js.Any])
    
    inline def setAutoPublishUndefined: Self = StObject.set(x, "autoPublish", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setNorealtime(value: NumericBoolean): Self = StObject.set(x, "norealtime", value.asInstanceOf[js.Any])
    
    inline def setNorealtimeUndefined: Self = StObject.set(x, "norealtime", js.undefined)
    
    inline def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
    
    inline def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
