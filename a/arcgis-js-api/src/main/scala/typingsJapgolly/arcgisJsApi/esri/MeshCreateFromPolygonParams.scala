package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshCreateFromPolygonParams
  extends StObject
     with Object {
  
  /**
    * The material to be used for the mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createFromPolygon)
    */
  var material: js.UndefOr[MeshMaterial] = js.undefined
}
object MeshCreateFromPolygonParams {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): MeshCreateFromPolygonParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[MeshCreateFromPolygonParams]
  }
  
  extension [Self <: MeshCreateFromPolygonParams](x: Self) {
    
    inline def setMaterial(value: MeshMaterial): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
  }
}
