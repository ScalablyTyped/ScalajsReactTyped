package typingsJapgolly.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifyTaskProperties extends TaskProperties {
  /**
    * Specify the geodatabase version to search. Requires ArcGIS Server service 10.1 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-IdentifyTask.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.undefined
}

object IdentifyTaskProperties {
  @scala.inline
  def apply(gdbVersion: String = null, requestOptions: js.Any = null, url: String = null): IdentifyTaskProperties = {
    val __obj = js.Dynamic.literal()
    if (gdbVersion != null) __obj.updateDynamic("gdbVersion")(gdbVersion.asInstanceOf[js.Any])
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifyTaskProperties]
  }
}

