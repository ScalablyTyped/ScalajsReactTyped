package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VertexAttributes extends Object {
  /**
    * The normal buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#VertexAttributes)
    */
  var normal: js.UndefOr[scala.scalajs.js.typedarray.Float32Array] = js.undefined
  /**
    * The position buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#VertexAttributes)
    */
  var position: scala.scalajs.js.typedarray.Float64Array
  /**
    * The tangent buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#VertexAttributes)
    */
  var tangent: js.UndefOr[scala.scalajs.js.typedarray.Float32Array] = js.undefined
}

object VertexAttributes {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    position: scala.scalajs.js.typedarray.Float64Array,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    normal: scala.scalajs.js.typedarray.Float32Array = null,
    tangent: scala.scalajs.js.typedarray.Float32Array = null
  ): VertexAttributes = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (normal != null) __obj.updateDynamic("normal")(normal.asInstanceOf[js.Any])
    if (tangent != null) __obj.updateDynamic("tangent")(tangent.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexAttributes]
  }
}

