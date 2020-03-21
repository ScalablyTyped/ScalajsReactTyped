package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait configWorkers extends Object {
  /**
    * The configuration parameters for [the workers framework](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var loaderConfig: js.UndefOr[configWorkersLoaderConfig] = js.undefined
  /**
    * The absolute url to the AMD loader used in the worker. The default url points to the AMD loader used by the API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var loaderUrl: js.UndefOr[js.Any] = js.undefined
}

object configWorkers {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    loaderConfig: configWorkersLoaderConfig = null,
    loaderUrl: js.Any = null
  ): configWorkers = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (loaderConfig != null) __obj.updateDynamic("loaderConfig")(loaderConfig.asInstanceOf[js.Any])
    if (loaderUrl != null) __obj.updateDynamic("loaderUrl")(loaderUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[configWorkers]
  }
}

