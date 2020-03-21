package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.HashMap
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.auto
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.manual
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewConstraintsTilt extends AnonymousAccessor {
  /**
    * Specifies the maximum amount of tilt (in degrees) allowed in the view and may range from 0.5 to 179.5 degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the mode of the constraint. There are two possible values: `auto` or `manual`. In `auto` mode, the maximum tilt value is automatically determined based on the altitude of the view camera. In `manual` mode, the maximum tilt value is a user defined, constant value. **Note:** The mode automatically changes to `manual` whenever the `max` property is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    *
    * @default auto
    */
  var mode: js.UndefOr[auto | manual] = js.undefined
}

object SceneViewConstraintsTilt {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    get: /* propertyName */ String => CallbackTo[js.Any] = null,
    max: Int | Double = null,
    mode: auto | manual = null,
    set: (js.Function2[/* propertyName */ String, /* value */ js.Any, SceneViewConstraintsTilt]) with (js.Function1[/* props */ HashMap[_], SceneViewConstraintsTilt]) = null,
    watch: (/* path */ String | js.Array[String], /* callback */ WatchCallback, /* sync */ js.UndefOr[Boolean]) => CallbackTo[WatchHandle] = null
  ): SceneViewConstraintsTilt = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1((t0: /* propertyName */ java.lang.String) => get(t0).runNow()))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(js.Any.fromFunction3((t0: /* path */ java.lang.String | js.Array[java.lang.String], t1: /* callback */ typingsJapgolly.arcgisJsApi.esri.WatchCallback, t2: /* sync */ js.UndefOr[scala.Boolean]) => watch(t0, t1, t2).runNow()))
    __obj.asInstanceOf[SceneViewConstraintsTilt]
  }
}

