package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.HashMap
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.multiply
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.replace
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.tint
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillSymbol3DLayerMaterial extends AnonymousAccessor {
  /**
    * The color of the fill. This can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material)
    *
    * @default white
    */
  var color: js.UndefOr[Color_] = js.undefined
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

object FillSymbol3DLayerMaterial {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    color: Color_ = null,
    colorMixMode: tint | replace | multiply = null,
    get: /* propertyName */ String => CallbackTo[js.Any] = null,
    set: (js.Function2[/* propertyName */ String, /* value */ js.Any, FillSymbol3DLayerMaterial]) with (js.Function1[/* props */ HashMap[_], FillSymbol3DLayerMaterial]) = null,
    watch: (/* path */ String | js.Array[String], /* callback */ WatchCallback, /* sync */ js.UndefOr[Boolean]) => CallbackTo[WatchHandle] = null
  ): FillSymbol3DLayerMaterial = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colorMixMode != null) __obj.updateDynamic("colorMixMode")(colorMixMode.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1((t0: /* propertyName */ java.lang.String) => get(t0).runNow()))
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(js.Any.fromFunction3((t0: /* path */ java.lang.String | js.Array[java.lang.String], t1: /* callback */ typingsJapgolly.arcgisJsApi.esri.WatchCallback, t2: /* sync */ js.UndefOr[scala.Boolean]) => watch(t0, t1, t2).runNow()))
    __obj.asInstanceOf[FillSymbol3DLayerMaterial]
  }
}

