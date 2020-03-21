package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.HashMap
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathSymbol3DLayerMaterial extends AnonymousAccessor {
  /**
    * The color of the path. This can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#material)
    *
    * @default white
    */
  var color: js.UndefOr[Color_] = js.undefined
}

object PathSymbol3DLayerMaterial {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    color: Color_ = null,
    get: /* propertyName */ String => CallbackTo[js.Any] = null,
    set: (js.Function2[/* propertyName */ String, /* value */ js.Any, PathSymbol3DLayerMaterial]) with (js.Function1[/* props */ HashMap[_], PathSymbol3DLayerMaterial]) = null,
    watch: (/* path */ String | js.Array[String], /* callback */ WatchCallback, /* sync */ js.UndefOr[Boolean]) => CallbackTo[WatchHandle] = null
  ): PathSymbol3DLayerMaterial = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1((t0: /* propertyName */ java.lang.String) => get(t0).runNow()))
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(js.Any.fromFunction3((t0: /* path */ java.lang.String | js.Array[java.lang.String], t1: /* callback */ typingsJapgolly.arcgisJsApi.esri.WatchCallback, t2: /* sync */ js.UndefOr[scala.Boolean]) => watch(t0, t1, t2).runNow()))
    __obj.asInstanceOf[PathSymbol3DLayerMaterial]
  }
}

