package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshOffsetParams
  extends StObject
     with Object {
  
  /**
    * Whether to georeference relative to the globe or the projected coordinate system (PCS).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#offset)
    */
  var geographic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The origin at which to apply the offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#offset)
    */
  var origin: js.UndefOr[Point] = js.undefined
}
object MeshOffsetParams {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): MeshOffsetParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[MeshOffsetParams]
  }
  
  extension [Self <: MeshOffsetParams](x: Self) {
    
    inline def setGeographic(value: Boolean): Self = StObject.set(x, "geographic", value.asInstanceOf[js.Any])
    
    inline def setGeographicUndefined: Self = StObject.set(x, "geographic", js.undefined)
    
    inline def setOrigin(value: Point): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
