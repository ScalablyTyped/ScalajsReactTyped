package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtypeGroupLayerCapabilitiesAttachment
  extends StObject
     with Object {
  
  /**
    * Indicates if the attachments can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html) by their content types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#capabilities)
    */
  var supportsContentType: Boolean
  
  /**
    * Indicates if the attachment [queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html) support `exifInfo`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#capabilities)
    */
  var supportsExifInfo: Boolean
  
  /**
    * Indicates if the attachments can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html) by their keywords.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#capabilities)
    */
  var supportsKeywords: Boolean
  
  /**
    * Indicates if the attachments can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html) by their names.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#capabilities)
    */
  var supportsName: Boolean
  
  /**
    * Indicates if the attachments can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AttachmentQuery.html) by their sizes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#capabilities)
    */
  var supportsSize: Boolean
}
object SubtypeGroupLayerCapabilitiesAttachment {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsContentType: Boolean,
    supportsExifInfo: Boolean,
    supportsKeywords: Boolean,
    supportsName: Boolean,
    supportsSize: Boolean
  ): SubtypeGroupLayerCapabilitiesAttachment = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsContentType = supportsContentType.asInstanceOf[js.Any], supportsExifInfo = supportsExifInfo.asInstanceOf[js.Any], supportsKeywords = supportsKeywords.asInstanceOf[js.Any], supportsName = supportsName.asInstanceOf[js.Any], supportsSize = supportsSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtypeGroupLayerCapabilitiesAttachment]
  }
  
  extension [Self <: SubtypeGroupLayerCapabilitiesAttachment](x: Self) {
    
    inline def setSupportsContentType(value: Boolean): Self = StObject.set(x, "supportsContentType", value.asInstanceOf[js.Any])
    
    inline def setSupportsExifInfo(value: Boolean): Self = StObject.set(x, "supportsExifInfo", value.asInstanceOf[js.Any])
    
    inline def setSupportsKeywords(value: Boolean): Self = StObject.set(x, "supportsKeywords", value.asInstanceOf[js.Any])
    
    inline def setSupportsName(value: Boolean): Self = StObject.set(x, "supportsName", value.asInstanceOf[js.Any])
    
    inline def setSupportsSize(value: Boolean): Self = StObject.set(x, "supportsSize", value.asInstanceOf[js.Any])
  }
}
