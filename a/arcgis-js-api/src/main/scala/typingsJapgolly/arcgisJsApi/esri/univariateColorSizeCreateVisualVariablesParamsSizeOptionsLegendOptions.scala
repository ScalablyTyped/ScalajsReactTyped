package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait univariateColorSizeCreateVisualVariablesParamsSizeOptionsLegendOptions
  extends StObject
     with Object {
  
  /**
    * The title used to represent the given field or expression in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createVisualVariables)
    */
  var title: String
}
object univariateColorSizeCreateVisualVariablesParamsSizeOptionsLegendOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    title: String
  ): univariateColorSizeCreateVisualVariablesParamsSizeOptionsLegendOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[univariateColorSizeCreateVisualVariablesParamsSizeOptionsLegendOptions]
  }
  
  extension [Self <: univariateColorSizeCreateVisualVariablesParamsSizeOptionsLegendOptions](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
