package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RendererResultClassBreaks
  extends StObject
     with Object {
  
  /**
    * The class breaks generated for values in the `field1` parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#RendererResult)
    */
  var field1: ClassBreaksResult
  
  /**
    * The class breaks generated for values in the `field2` parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#RendererResult)
    */
  var field2: ClassBreaksResult
}
object RendererResultClassBreaks {
  
  inline def apply(
    constructor: js.Function,
    field1: ClassBreaksResult,
    field2: ClassBreaksResult,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): RendererResultClassBreaks = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], field1 = field1.asInstanceOf[js.Any], field2 = field2.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[RendererResultClassBreaks]
  }
  
  extension [Self <: RendererResultClassBreaks](x: Self) {
    
    inline def setField1(value: ClassBreaksResult): Self = StObject.set(x, "field1", value.asInstanceOf[js.Any])
    
    inline def setField2(value: ClassBreaksResult): Self = StObject.set(x, "field2", value.asInstanceOf[js.Any])
  }
}
