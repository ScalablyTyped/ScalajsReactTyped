package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualVariablesResultColor
  extends StObject
     with Object {
  
  /**
    * The color scheme used by the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#VisualVariablesResult)
    */
  var colorScheme: ColorScheme
  
  /**
    * A color visual variable configured based on the statistics of the data and the color scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#VisualVariablesResult)
    */
  var visualVariable: ColorVariable
}
object VisualVariablesResultColor {
  
  inline def apply(
    colorScheme: ColorScheme,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    visualVariable: ColorVariable
  ): VisualVariablesResultColor = {
    val __obj = js.Dynamic.literal(colorScheme = colorScheme.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), visualVariable = visualVariable.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualVariablesResultColor]
  }
  
  extension [Self <: VisualVariablesResultColor](x: Self) {
    
    inline def setColorScheme(value: ColorScheme): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    inline def setVisualVariable(value: ColorVariable): Self = StObject.set(x, "visualVariable", value.asInstanceOf[js.Any])
  }
}
