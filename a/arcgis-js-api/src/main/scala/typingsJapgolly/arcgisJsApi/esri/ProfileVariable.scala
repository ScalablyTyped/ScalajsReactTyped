package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.boolean
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.date
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.feature
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.featureSet
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.featureSetCollection
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.number
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.text
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.arcgisJsApi.esri.SimpleVariable
  - typingsJapgolly.arcgisJsApi.esri.DictionaryVariable
  - typingsJapgolly.arcgisJsApi.esri.ArrayVariable
*/
trait ProfileVariable extends StObject
object ProfileVariable {
  
  inline def ArrayVariable(
    constructor: js.Function,
    elementType: ProfileVariable,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.ArrayVariable = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], elementType = elementType.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.ArrayVariable]
  }
  
  inline def DictionaryVariable(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    properties: js.Array[ProfileVariable],
    propertyIsEnumerable: PropertyKey => Boolean
  ): typingsJapgolly.arcgisJsApi.esri.DictionaryVariable = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("dictionary")
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.DictionaryVariable]
  }
  
  inline def SimpleVariable(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: feature | featureSet | featureSetCollection | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.geometry | number | text | date | boolean
  ): typingsJapgolly.arcgisJsApi.esri.SimpleVariable = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.SimpleVariable]
  }
}
