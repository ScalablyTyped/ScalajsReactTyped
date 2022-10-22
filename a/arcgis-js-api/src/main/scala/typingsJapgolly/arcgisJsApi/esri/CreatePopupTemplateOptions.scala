package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePopupTemplateOptions
  extends StObject
     with Object {
  
  /**
    * An array of field types to ignore when creating the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#CreatePopupTemplateOptions)
    */
  var ignoreFieldTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An array of field names set to be visible within the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#CreatePopupTemplateOptions)
    */
  var visibleFieldNames: js.UndefOr[Set[String]] = js.undefined
}
object CreatePopupTemplateOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): CreatePopupTemplateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[CreatePopupTemplateOptions]
  }
  
  extension [Self <: CreatePopupTemplateOptions](x: Self) {
    
    inline def setIgnoreFieldTypes(value: js.Array[String]): Self = StObject.set(x, "ignoreFieldTypes", value.asInstanceOf[js.Any])
    
    inline def setIgnoreFieldTypesUndefined: Self = StObject.set(x, "ignoreFieldTypes", js.undefined)
    
    inline def setIgnoreFieldTypesVarargs(value: String*): Self = StObject.set(x, "ignoreFieldTypes", js.Array(value*))
    
    inline def setVisibleFieldNames(value: Set[String]): Self = StObject.set(x, "visibleFieldNames", value.asInstanceOf[js.Any])
    
    inline def setVisibleFieldNamesUndefined: Self = StObject.set(x, "visibleFieldNames", js.undefined)
  }
}
