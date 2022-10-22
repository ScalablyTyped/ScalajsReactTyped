package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.boolean
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.date
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.feature
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.featureSet
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.featureSetCollection
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.number
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.text
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleVariable
  extends StObject
     with Object
     with ProfileVariable {
  
  /**
    * The name of the profile variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#SimpleVariable)
    */
  var name: String
  
  /**
    * The Arcade data type of the variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#SimpleVariable)
    */
  var `type`: feature | featureSet | featureSetCollection | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.geometry | number | text | date | boolean
}
object SimpleVariable {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: feature | featureSet | featureSetCollection | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.geometry | number | text | date | boolean
  ): SimpleVariable = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleVariable]
  }
  
  extension [Self <: SimpleVariable](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: feature | featureSet | featureSetCollection | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.geometry | number | text | date | boolean
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
