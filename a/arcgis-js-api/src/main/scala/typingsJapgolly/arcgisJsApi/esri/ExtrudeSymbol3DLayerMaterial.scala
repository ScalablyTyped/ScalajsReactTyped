package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.HashMap
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtrudeSymbol3DLayerMaterial
  extends StObject
     with AnonymousAccessor {
  
  /**
    * The fill color of the extrusion.
    *
    * @default white
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html#material)
    */
  var color: js.UndefOr[Color_] = js.undefined
}
object ExtrudeSymbol3DLayerMaterial {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ Any, ExtrudeSymbol3DLayerMaterial]
    ]) & (js.UndefOr[js.Function1[/* props */ HashMap[Any], ExtrudeSymbol3DLayerMaterial]])
  ): ExtrudeSymbol3DLayerMaterial = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtrudeSymbol3DLayerMaterial]
  }
  
  extension [Self <: ExtrudeSymbol3DLayerMaterial](x: Self) {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
