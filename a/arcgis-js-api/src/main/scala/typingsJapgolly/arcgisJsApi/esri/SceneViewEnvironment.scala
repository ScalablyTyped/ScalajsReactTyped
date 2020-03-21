package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.HashMap
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewEnvironment extends AnonymousAccessor {
  /**
    * Atmosphere conditions of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var atmosphere: js.UndefOr[SceneViewEnvironmentAtmosphere] = js.undefined
  /**
    * Indicates whether atmosphere visualization is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var atmosphereEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies how the background of the scene (which lies behind sky, stars and atmosphere) should be displayed. By default this is simply a single, fully opaque, black color. Currently [ColorBackground](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-background-ColorBackground.html) is the only type of background supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var background: js.UndefOr[Background] = js.undefined
  /**
    * Lighting conditions of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var lighting: js.UndefOr[SceneViewEnvironmentLighting] = js.undefined
  /**
    * Indicates whether stars visualization is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default true
    */
  var starsEnabled: js.UndefOr[Boolean] = js.undefined
}

object SceneViewEnvironment {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    atmosphere: SceneViewEnvironmentAtmosphere = null,
    atmosphereEnabled: js.UndefOr[Boolean] = js.undefined,
    background: Background = null,
    get: /* propertyName */ String => CallbackTo[js.Any] = null,
    lighting: SceneViewEnvironmentLighting = null,
    set: (js.Function2[/* propertyName */ String, /* value */ js.Any, SceneViewEnvironment]) with (js.Function1[/* props */ HashMap[_], SceneViewEnvironment]) = null,
    starsEnabled: js.UndefOr[Boolean] = js.undefined,
    watch: (/* path */ String | js.Array[String], /* callback */ WatchCallback, /* sync */ js.UndefOr[Boolean]) => CallbackTo[WatchHandle] = null
  ): SceneViewEnvironment = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (atmosphere != null) __obj.updateDynamic("atmosphere")(atmosphere.asInstanceOf[js.Any])
    if (!js.isUndefined(atmosphereEnabled)) __obj.updateDynamic("atmosphereEnabled")(atmosphereEnabled.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1((t0: /* propertyName */ java.lang.String) => get(t0).runNow()))
    if (lighting != null) __obj.updateDynamic("lighting")(lighting.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (!js.isUndefined(starsEnabled)) __obj.updateDynamic("starsEnabled")(starsEnabled.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(js.Any.fromFunction3((t0: /* path */ java.lang.String | js.Array[java.lang.String], t1: /* callback */ typingsJapgolly.arcgisJsApi.esri.WatchCallback, t2: /* sync */ js.UndefOr[scala.Boolean]) => watch(t0, t1, t2).runNow()))
    __obj.asInstanceOf[SceneViewEnvironment]
  }
}

