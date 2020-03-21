package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.HashMap
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewHighlightOptions extends AnonymousAccessor {
  /**
    * The color of the highlight fill.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    *
    * @default #00ffff
    */
  var color: js.UndefOr[Color_] = js.undefined
  /**
    * The opacity of the fill (area within the halo). This will be multiplied with the opacity specified in `color`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    *
    * @default 0.25
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /**
    * The color of the halo surrounding the highlight. If no `haloColor` is provided, then the halo will be colored with the specified `color`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    */
  var haloColor: js.UndefOr[Color_] = js.undefined
  /**
    * The opacity of the highlight halo. This will be multiplied with any opacity specified in `color`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    *
    * @default 1
    */
  var haloOpacity: js.UndefOr[Double] = js.undefined
}

object MapViewHighlightOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    color: Color_ = null,
    fillOpacity: Int | Double = null,
    get: /* propertyName */ String => CallbackTo[js.Any] = null,
    haloColor: Color_ = null,
    haloOpacity: Int | Double = null,
    set: (js.Function2[/* propertyName */ String, /* value */ js.Any, MapViewHighlightOptions]) with (js.Function1[/* props */ HashMap[_], MapViewHighlightOptions]) = null,
    watch: (/* path */ String | js.Array[String], /* callback */ WatchCallback, /* sync */ js.UndefOr[Boolean]) => CallbackTo[WatchHandle] = null
  ): MapViewHighlightOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1((t0: /* propertyName */ java.lang.String) => get(t0).runNow()))
    if (haloColor != null) __obj.updateDynamic("haloColor")(haloColor.asInstanceOf[js.Any])
    if (haloOpacity != null) __obj.updateDynamic("haloOpacity")(haloOpacity.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(js.Any.fromFunction3((t0: /* path */ java.lang.String | js.Array[java.lang.String], t1: /* callback */ typingsJapgolly.arcgisJsApi.esri.WatchCallback, t2: /* sync */ js.UndefOr[scala.Boolean]) => watch(t0, t1, t2).runNow()))
    __obj.asInstanceOf[MapViewHighlightOptions]
  }
}

