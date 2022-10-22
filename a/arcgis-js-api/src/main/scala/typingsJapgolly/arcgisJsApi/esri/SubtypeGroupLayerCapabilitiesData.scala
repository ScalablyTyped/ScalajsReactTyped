package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtypeGroupLayerCapabilitiesData
  extends StObject
     with Object {
  
  /**
    * Indicates if the feature service is versioned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#capabilities)
    */
  var isVersioned: Boolean
  
  /**
    * Indicates if the attachment is enabled on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#capabilities)
    */
  var supportsAttachment: Boolean
  
  /**
    * Indicates if the features in the layer support m-values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#capabilities)
    */
  var supportsM: Boolean
  
  /**
    * Indicates if the features in the layer support z-values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#capabilities)
    */
  var supportsZ: Boolean
}
object SubtypeGroupLayerCapabilitiesData {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    isVersioned: Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsAttachment: Boolean,
    supportsM: Boolean,
    supportsZ: Boolean
  ): SubtypeGroupLayerCapabilitiesData = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), isVersioned = isVersioned.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsAttachment = supportsAttachment.asInstanceOf[js.Any], supportsM = supportsM.asInstanceOf[js.Any], supportsZ = supportsZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtypeGroupLayerCapabilitiesData]
  }
  
  extension [Self <: SubtypeGroupLayerCapabilitiesData](x: Self) {
    
    inline def setIsVersioned(value: Boolean): Self = StObject.set(x, "isVersioned", value.asInstanceOf[js.Any])
    
    inline def setSupportsAttachment(value: Boolean): Self = StObject.set(x, "supportsAttachment", value.asInstanceOf[js.Any])
    
    inline def setSupportsM(value: Boolean): Self = StObject.set(x, "supportsM", value.asInstanceOf[js.Any])
    
    inline def setSupportsZ(value: Boolean): Self = StObject.set(x, "supportsZ", value.asInstanceOf[js.Any])
  }
}
