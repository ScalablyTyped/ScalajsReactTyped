package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.auto
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.blend
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.mask
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.opaque
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshMaterial
  extends StObject
     with Accessor {
  
  /**
    * Specifies how transparency on the object is handled.
    *
    * @default 0.5
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaCutoff)
    */
  var alphaCutoff: Double = js.native
  
  /**
    * Specifies how transparency on the object is handled.
    *
    * @default "auto"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#alphaMode)
    */
  var alphaMode: auto | blend | opaque | mask = js.native
  
  /**
    * Specifies a single, uniform color for the mesh component.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#color)
    */
  var color: Color_ = js.native
  
  /**
    * Specifies a texture from which to get color information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#colorTexture)
    */
  var colorTexture: MeshTexture = js.native
  
  /**
    * Specifies whether both sides of each triangle are displayed, or only the front sides.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#doubleSided)
    */
  var doubleSided: Boolean = js.native
  
  /**
    * Specifies a texture from which to get normal information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshMaterial.html#normalTexture)
    */
  var normalTexture: MeshTexture = js.native
}
