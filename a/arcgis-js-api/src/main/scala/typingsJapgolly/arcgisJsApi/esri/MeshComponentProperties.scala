package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.flat
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.smooth
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshComponentProperties extends StObject {
  
  /**
    * A flat array of indices that refer to vertices in the [vertexAttributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes) of the mesh to which the component belongs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#faces)
    */
  var faces: js.UndefOr[js.typedarray.Uint32Array | js.Array[Double] | js.typedarray.Uint16Array] = js.undefined
  
  /**
    * The material determines how the component is visualized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#material)
    */
  var material: js.UndefOr[MeshMaterialProperties | MeshMaterialMetallicRoughnessProperties] = js.undefined
  
  /**
    * Specifies the type of normals used for lighting.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#shading)
    */
  var shading: js.UndefOr[source | flat | smooth] = js.undefined
}
object MeshComponentProperties {
  
  inline def apply(): MeshComponentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshComponentProperties]
  }
  
  extension [Self <: MeshComponentProperties](x: Self) {
    
    inline def setFaces(value: js.typedarray.Uint32Array | js.Array[Double] | js.typedarray.Uint16Array): Self = StObject.set(x, "faces", value.asInstanceOf[js.Any])
    
    inline def setFacesUndefined: Self = StObject.set(x, "faces", js.undefined)
    
    inline def setFacesVarargs(value: Double*): Self = StObject.set(x, "faces", js.Array(value*))
    
    inline def setMaterial(value: MeshMaterialProperties | MeshMaterialMetallicRoughnessProperties): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setShading(value: source | flat | smooth): Self = StObject.set(x, "shading", value.asInstanceOf[js.Any])
    
    inline def setShadingUndefined: Self = StObject.set(x, "shading", js.undefined)
  }
}
