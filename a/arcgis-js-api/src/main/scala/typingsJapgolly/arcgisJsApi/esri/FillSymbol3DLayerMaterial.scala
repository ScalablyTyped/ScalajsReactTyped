package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.HashMap
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.multiply
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.replace
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.tint
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillSymbol3DLayerMaterial
  extends StObject
     with AnonymousAccessor {
  
  /**
    * The color of the fill.
    *
    * @default white
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material)
    */
  var color: js.UndefOr[Color_] = js.undefined
  
  /**
    * Specifies how the material `color` is applied to the geometry color/texture information.
    *
    * @default multiply
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material)
    */
  var colorMixMode: js.UndefOr[tint | replace | multiply] = js.undefined
}
object FillSymbol3DLayerMaterial {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ Any, FillSymbol3DLayerMaterial]
    ]) & (js.UndefOr[js.Function1[/* props */ HashMap[Any], FillSymbol3DLayerMaterial]])
  ): FillSymbol3DLayerMaterial = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillSymbol3DLayerMaterial]
  }
  
  extension [Self <: FillSymbol3DLayerMaterial](x: Self) {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorMixMode(value: tint | replace | multiply): Self = StObject.set(x, "colorMixMode", value.asInstanceOf[js.Any])
    
    inline def setColorMixModeUndefined: Self = StObject.set(x, "colorMixMode", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
