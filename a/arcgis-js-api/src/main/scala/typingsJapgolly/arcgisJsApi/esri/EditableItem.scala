package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditableItem
  extends StObject
     with Object {
  
  /**
    * *Read-only* The feature layer associated with the editable item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#EditableItem)
    */
  var layer: FeatureLayer
  
  /**
    * *Read-only* The workflow type that this item supports.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#EditableItem)
    */
  var supports: String
}
object EditableItem {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    supports: String
  ): EditableItem = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supports = supports.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditableItem]
  }
  
  extension [Self <: EditableItem](x: Self) {
    
    inline def setLayer(value: FeatureLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setSupports(value: String): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
  }
}
