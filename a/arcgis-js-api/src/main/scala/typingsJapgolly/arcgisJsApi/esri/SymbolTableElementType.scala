package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.arcgisJsApi.esri.ImageSymbolTableElementInfo
  - typingsJapgolly.arcgisJsApi.esri.SymbolTableElementInfo
*/
trait SymbolTableElementType extends StObject
object SymbolTableElementType {
  
  inline def ImageSymbolTableElementInfo(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    src: String
  ): typingsJapgolly.arcgisJsApi.esri.ImageSymbolTableElementInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), opacity = opacity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.ImageSymbolTableElementInfo]
  }
  
  inline def SymbolTableElementInfo(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    label: String | RampTitle,
    propertyIsEnumerable: PropertyKey => Boolean,
    symbol: Symbol
  ): typingsJapgolly.arcgisJsApi.esri.SymbolTableElementInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.arcgisJsApi.esri.SymbolTableElementInfo]
  }
}
