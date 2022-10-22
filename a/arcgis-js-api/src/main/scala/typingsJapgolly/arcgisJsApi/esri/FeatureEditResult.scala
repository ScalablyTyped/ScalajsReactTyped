package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureEditResult
  extends StObject
     with Object {
  
  /**
    * If the edit failed, the edit result includes an error.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#FeatureEditResult)
    */
  var error: FeatureEditResultError
  
  /**
    * The globalId of the feature or the attachment that was edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#FeatureEditResult)
    */
  var globalId: String
  
  /**
    * The objectId of the feature or the attachmentId of the attachment that was edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#FeatureEditResult)
    */
  var objectId: Double
}
object FeatureEditResult {
  
  inline def apply(
    constructor: js.Function,
    error: FeatureEditResultError,
    globalId: String,
    hasOwnProperty: PropertyKey => Boolean,
    objectId: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FeatureEditResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], globalId = globalId.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), objectId = objectId.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[FeatureEditResult]
  }
  
  extension [Self <: FeatureEditResult](x: Self) {
    
    inline def setError(value: FeatureEditResultError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setGlobalId(value: String): Self = StObject.set(x, "globalId", value.asInstanceOf[js.Any])
    
    inline def setObjectId(value: Double): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
