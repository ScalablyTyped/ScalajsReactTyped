package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.high
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.low
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewEnvironmentAtmosphereProperties extends Object {
  /**
    * Indicates the quality of the atmosphere visualization. The quality of the atmosphere may have a significant impact on performance. This setting does not have any effect in [local scenes](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewingMode).
    *
    *   Known Value | Example
    *   ------------|---------
    *   low | ![scene-atmosphere](https://developers.arcgis.com/javascript/assets/img/apiref/views/scene-atmosphere.png)
    *   high | ![scene-atmosphere](https://developers.arcgis.com/javascript/assets/img/apiref/views/scene-atmosphere-realistic.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    *
    * @default low
    */
  var quality: js.UndefOr[low | high] = js.undefined
}

object SceneViewEnvironmentAtmosphereProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    quality: low | high = null
  ): SceneViewEnvironmentAtmosphereProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewEnvironmentAtmosphereProperties]
  }
}

