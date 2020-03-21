package typingsJapgolly.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProductStatusDataQualityIssue extends js.Object {
  var destination: js.UndefOr[String] = js.native
  var detail: js.UndefOr[String] = js.native
  var fetchStatus: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var location: js.UndefOr[String] = js.native
  var severity: js.UndefOr[String] = js.native
  var timestamp: js.UndefOr[String] = js.native
  var valueOnLandingPage: js.UndefOr[String] = js.native
  var valueProvided: js.UndefOr[String] = js.native
}

object SchemaProductStatusDataQualityIssue {
  @scala.inline
  def apply(
    destination: String = null,
    detail: String = null,
    fetchStatus: String = null,
    id: String = null,
    location: String = null,
    severity: String = null,
    timestamp: String = null,
    valueOnLandingPage: String = null,
    valueProvided: String = null
  ): SchemaProductStatusDataQualityIssue = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (fetchStatus != null) __obj.updateDynamic("fetchStatus")(fetchStatus.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (valueOnLandingPage != null) __obj.updateDynamic("valueOnLandingPage")(valueOnLandingPage.asInstanceOf[js.Any])
    if (valueProvided != null) __obj.updateDynamic("valueProvided")(valueProvided.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProductStatusDataQualityIssue]
  }
}

