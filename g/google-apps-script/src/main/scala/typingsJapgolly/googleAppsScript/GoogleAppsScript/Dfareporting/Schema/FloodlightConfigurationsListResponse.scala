package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightConfigurationsListResponse extends js.Object {
  var floodlightConfigurations: js.UndefOr[js.Array[FloodlightConfiguration]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object FloodlightConfigurationsListResponse {
  @scala.inline
  def apply(floodlightConfigurations: js.Array[FloodlightConfiguration] = null, kind: String = null): FloodlightConfigurationsListResponse = {
    val __obj = js.Dynamic.literal()
    if (floodlightConfigurations != null) __obj.updateDynamic("floodlightConfigurations")(floodlightConfigurations.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[FloodlightConfigurationsListResponse]
  }
}

