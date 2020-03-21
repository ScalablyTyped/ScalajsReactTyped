package typingsJapgolly.inboxsdk.mod.Conversations

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadButtonDescriptor extends js.Object {
  var downloadFilename: js.UndefOr[String] = js.undefined
  var downloadUrl: String
  var openInNewTab: js.UndefOr[Boolean] = js.undefined
  def onClick(event: js.Any): Unit
}

object DownloadButtonDescriptor {
  @scala.inline
  def apply(
    downloadUrl: String,
    onClick: js.Any => Callback,
    downloadFilename: String = null,
    openInNewTab: js.UndefOr[Boolean] = js.undefined
  ): DownloadButtonDescriptor = {
    val __obj = js.Dynamic.literal(downloadUrl = downloadUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: js.Any) => onClick(t0).runNow()))
    if (downloadFilename != null) __obj.updateDynamic("downloadFilename")(downloadFilename.asInstanceOf[js.Any])
    if (!js.isUndefined(openInNewTab)) __obj.updateDynamic("openInNewTab")(openInNewTab.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadButtonDescriptor]
  }
}

