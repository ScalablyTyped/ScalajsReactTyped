package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DotDensityScheme
  extends StObject
     with Object {
  
  /**
    * The dot color for each attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#DotDensityScheme)
    */
  var colors: js.Array[Color_]
  
  /**
    * The unique name of the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#DotDensityScheme)
    */
  var name: String
  
  /**
    * The opacity of the symbol (0 - 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#DotDensityScheme)
    */
  var opacity: Double
  
  /**
    * Properties for defining the outline of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#DotDensityScheme)
    */
  var outline: DotDensitySchemeOutline
  
  /**
    * Tags associated with the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#DotDensityScheme)
    */
  var tags: js.Array[String]
}
object DotDensityScheme {
  
  inline def apply(
    colors: js.Array[Color_],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    opacity: Double,
    outline: DotDensitySchemeOutline,
    propertyIsEnumerable: PropertyKey => Boolean,
    tags: js.Array[String]
  ): DotDensityScheme = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotDensityScheme]
  }
  
  extension [Self <: DotDensityScheme](x: Self) {
    
    inline def setColors(value: js.Array[Color_]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: Color_ *): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOutline(value: DotDensitySchemeOutline): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
