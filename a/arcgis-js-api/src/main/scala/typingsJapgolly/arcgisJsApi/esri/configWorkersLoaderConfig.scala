package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait configWorkersLoaderConfig extends Object {
  /**
    * The AMD loader loads all code relative to the baseUrl.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  /**
    * Determines if the specified feature capabilities are supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var has: js.UndefOr[js.Any] = js.undefined
  /**
    * Map paths in module identifiers to different paths.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var map: js.UndefOr[js.Any] = js.undefined
  /**
    * An array of objects which provide the package name and its location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var packages: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Map of module id fragments to file paths.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var paths: js.UndefOr[js.Any] = js.undefined
}

object configWorkersLoaderConfig {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    baseUrl: String = null,
    has: js.Any = null,
    map: js.Any = null,
    packages: js.Array[_] = null,
    paths: js.Any = null
  ): configWorkersLoaderConfig = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (has != null) __obj.updateDynamic("has")(has.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (packages != null) __obj.updateDynamic("packages")(packages.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[configWorkersLoaderConfig]
  }
}

