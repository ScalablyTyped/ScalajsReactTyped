package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.multiply
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.replace
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.tint
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillSymbol3DLayerMaterialProperties extends Object {
  /**
    * The color of the fill. This can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material)
    *
    * @default white
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  /**
    * Specifies how the material `color` is applied to the geometry color/texture information. This property applies only to [MeshSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MeshSymbol3D.html) symbols.
    *
    * Value | Description
    * ------|------------
    * tint | Applies the material `color` to the desaturated geometry/texture color.
    * replace | Removes the geometry/texture color and applies the material `color`.
    * multiply | Multiplies geometry/texture color value with the material `color` value. The result is a darker color. Multiplying with white keeps the geometry color the same.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material)
    *
    * @default multiply
    */
  var colorMixMode: js.UndefOr[tint | replace | multiply] = js.undefined
}

object FillSymbol3DLayerMaterialProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    color: Color_ | js.Array[Double] | String = null,
    colorMixMode: tint | replace | multiply = null
  ): FillSymbol3DLayerMaterialProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorMixMode != null) __obj.updateDynamic("colorMixMode")(colorMixMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillSymbol3DLayerMaterialProperties]
  }
}

