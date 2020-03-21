package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshVertex extends Object {
  /**
    * The distance parameter for this vertex; this only applies when tessellating polylines. It starts from 0 and runs up to the total length of the polyline. It is expressed in map units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#MeshVertex)
    */
  var distance: Double
  /**
    * The `u`-coordinate for texture mapping. It varies between 0 and 1 horizontally for quads and polygons, and along the entire length of a polyline.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#MeshVertex)
    */
  var uTexcoord: Double
  /**
    * The `v`-coordinate for texture mapping. It varies between 0 and 1 vertically for quads and polygons, and across the width of a polyline.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#MeshVertex)
    */
  var vTexcoord: Double
  /**
    * The `x`-coordinate, expressed in the same units as the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#MeshVertex)
    */
  var x: Double
  /**
    * The `x`-offset in screen space; this is used to extrude points (into quads) and polylines, and is 0 for polygons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#MeshVertex)
    */
  var xOffset: Double
  /**
    * The `y`-coordinate, expressed in the same units as the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#MeshVertex)
    */
  var y: Double
  /**
    * The `y`-offset in screen space; this is used to extrude points (into quads) and polylines, and is 0 for polygons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#MeshVertex)
    */
  var yOffset: Double
}

object MeshVertex {
  @scala.inline
  def apply(
    constructor: js.Function,
    distance: Double,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    uTexcoord: Double,
    vTexcoord: Double,
    x: Double,
    xOffset: Double,
    y: Double,
    yOffset: Double
  ): MeshVertex = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], uTexcoord = uTexcoord.asInstanceOf[js.Any], vTexcoord = vTexcoord.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xOffset = xOffset.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[MeshVertex]
  }
}

