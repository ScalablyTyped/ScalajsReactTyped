package typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IngestionInfo extends js.Object {
  var backupIngestionAddress: js.UndefOr[String] = js.undefined
  var ingestionAddress: js.UndefOr[String] = js.undefined
  var streamName: js.UndefOr[String] = js.undefined
}

object IngestionInfo {
  @scala.inline
  def apply(backupIngestionAddress: String = null, ingestionAddress: String = null, streamName: String = null): IngestionInfo = {
    val __obj = js.Dynamic.literal()
    if (backupIngestionAddress != null) __obj.updateDynamic("backupIngestionAddress")(backupIngestionAddress.asInstanceOf[js.Any])
    if (ingestionAddress != null) __obj.updateDynamic("ingestionAddress")(ingestionAddress.asInstanceOf[js.Any])
    if (streamName != null) __obj.updateDynamic("streamName")(streamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestionInfo]
  }
}

