package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NearestPointResult extends Object {
  /**
    * A vertex within the specified distance of the search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#NearestPointResult)
    */
  var coordinate: Point
  /**
    * The distance from the `inputPoint` in the units of the view's spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#NearestPointResult)
    */
  var distance: Double
  /**
    * Indicates if it is an empty geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#NearestPointResult)
    */
  var isEmpty: Boolean
  /**
    * Indicates if the vertex is on the right side of the `geometry`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#NearestPointResult)
    */
  var isRightSide: Boolean
  /**
    * The index of the vertex within the geometry's rings or paths.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#NearestPointResult)
    */
  var vertexIndex: Double
}

object NearestPointResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    coordinate: Point,
    distance: Double,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    isEmpty: Boolean,
    isRightSide: Boolean,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    vertexIndex: Double
  ): NearestPointResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], isRightSide = isRightSide.asInstanceOf[js.Any], vertexIndex = vertexIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[NearestPointResult]
  }
}

