package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.HashMap
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewEnvironmentLighting extends AnonymousAccessor {
  /**
    * Indicates whether to show ambient occlusion shading.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default false
    */
  var ambientOcclusionEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the date and time of the simulated sun is automatically updated to maintain the current time of day while the camera changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default true
    */
  var cameraTrackingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The current date and time of the simulated sun. When setting the date, specifying the time zone is important, otherwise the time zone of the browser will be used. This might lead to different lighting for users in different time zones.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default new Date("March 15, 2019 12:00:00 UTC")
    */
  var date: js.UndefOr[js.Date] = js.undefined
  /**
    * Indicates whether to show shadows cast by the sun. Shadows are only displayed for real world 3D objects. Terrain doesn't cast shadows. In local scenes at small zoom levels, shadows are not displayed. For more control on which 3D objects cast shadows use the `castShadows` property available on [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#castShadows), [FillSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#castShadows), [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html#castShadows), and [PathSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html#castShadows).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default false
    */
  var directShadowsEnabled: js.UndefOr[Boolean] = js.undefined
}

object SceneViewEnvironmentLighting {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    ambientOcclusionEnabled: js.UndefOr[Boolean] = js.undefined,
    cameraTrackingEnabled: js.UndefOr[Boolean] = js.undefined,
    date: js.Date = null,
    directShadowsEnabled: js.UndefOr[Boolean] = js.undefined,
    get: /* propertyName */ String => CallbackTo[js.Any] = null,
    set: (js.Function2[/* propertyName */ String, /* value */ js.Any, SceneViewEnvironmentLighting]) with (js.Function1[/* props */ HashMap[_], SceneViewEnvironmentLighting]) = null,
    watch: (/* path */ String | js.Array[String], /* callback */ WatchCallback, /* sync */ js.UndefOr[Boolean]) => CallbackTo[WatchHandle] = null
  ): SceneViewEnvironmentLighting = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (!js.isUndefined(ambientOcclusionEnabled)) __obj.updateDynamic("ambientOcclusionEnabled")(ambientOcclusionEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(cameraTrackingEnabled)) __obj.updateDynamic("cameraTrackingEnabled")(cameraTrackingEnabled.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(directShadowsEnabled)) __obj.updateDynamic("directShadowsEnabled")(directShadowsEnabled.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1((t0: /* propertyName */ java.lang.String) => get(t0).runNow()))
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(js.Any.fromFunction3((t0: /* path */ java.lang.String | js.Array[java.lang.String], t1: /* callback */ typingsJapgolly.arcgisJsApi.esri.WatchCallback, t2: /* sync */ js.UndefOr[scala.Boolean]) => watch(t0, t1, t2).runNow()))
    __obj.asInstanceOf[SceneViewEnvironmentLighting]
  }
}

