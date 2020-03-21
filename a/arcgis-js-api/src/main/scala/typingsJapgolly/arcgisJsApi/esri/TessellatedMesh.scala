package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TessellatedMesh extends Object {
  /**
    * The indices of the triangles that connect vertices together; each consecutive triplet of indices denotes a triangle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#TessellatedMesh)
    */
  var indices: js.Array[Double]
  /**
    * The vertices that make up the mesh. Each element is a module:esri/views/2d/layers/BaseLayerViewGL2D#MeshVertex.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#TessellatedMesh)
    */
  var vertices: js.Array[MeshVertex]
}

object TessellatedMesh {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    indices: js.Array[Double],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    vertices: js.Array[MeshVertex]
  ): TessellatedMesh = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[TessellatedMesh]
  }
}

