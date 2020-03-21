package typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickPreviewResponse extends js.Object {
  var compilerError: js.UndefOr[Boolean] = js.undefined
  var containerVersion: js.UndefOr[ContainerVersion] = js.undefined
  var syncStatus: js.UndefOr[SyncStatus] = js.undefined
}

object QuickPreviewResponse {
  @scala.inline
  def apply(
    compilerError: js.UndefOr[Boolean] = js.undefined,
    containerVersion: ContainerVersion = null,
    syncStatus: SyncStatus = null
  ): QuickPreviewResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compilerError)) __obj.updateDynamic("compilerError")(compilerError.asInstanceOf[js.Any])
    if (containerVersion != null) __obj.updateDynamic("containerVersion")(containerVersion.asInstanceOf[js.Any])
    if (syncStatus != null) __obj.updateDynamic("syncStatus")(syncStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickPreviewResponse]
  }
}

