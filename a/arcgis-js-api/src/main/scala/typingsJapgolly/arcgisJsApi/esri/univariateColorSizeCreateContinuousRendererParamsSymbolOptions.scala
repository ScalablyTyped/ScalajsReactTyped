package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`circle-arrow`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`circle-caret`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`circle-plus-minus`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`happy-sad`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`plus-minus`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.arrow
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.caret
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.circle
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.square_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.thumb
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.triangle_
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait univariateColorSizeCreateContinuousRendererParamsSymbolOptions
  extends StObject
     with Object {
  
  /**
    * Sets above and below symbols based on pre-defined named symbol pairs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var symbolStyle: js.UndefOr[
    caret | `circle-caret` | arrow | `circle-arrow` | `plus-minus` | `circle-plus-minus` | square_ | circle | triangle_ | `happy-sad` | thumb
  ] = js.undefined
  
  /**
    * Allows you to specify custom symbols in the `above-and-below` theme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  var symbols: js.UndefOr[univariateColorSizeCreateContinuousRendererParamsSymbolOptionsSymbols] = js.undefined
}
object univariateColorSizeCreateContinuousRendererParamsSymbolOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): univariateColorSizeCreateContinuousRendererParamsSymbolOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[univariateColorSizeCreateContinuousRendererParamsSymbolOptions]
  }
  
  extension [Self <: univariateColorSizeCreateContinuousRendererParamsSymbolOptions](x: Self) {
    
    inline def setSymbolStyle(
      value: caret | `circle-caret` | arrow | `circle-arrow` | `plus-minus` | `circle-plus-minus` | square_ | circle | triangle_ | `happy-sad` | thumb
    ): Self = StObject.set(x, "symbolStyle", value.asInstanceOf[js.Any])
    
    inline def setSymbolStyleUndefined: Self = StObject.set(x, "symbolStyle", js.undefined)
    
    inline def setSymbols(value: univariateColorSizeCreateContinuousRendererParamsSymbolOptionsSymbols): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
  }
}
