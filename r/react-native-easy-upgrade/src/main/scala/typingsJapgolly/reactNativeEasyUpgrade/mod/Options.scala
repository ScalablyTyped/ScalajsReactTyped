package typingsJapgolly.reactNativeEasyUpgrade.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var downloadApkName: String
  var downloadDescription: String
  var downloadDestDirectory: String
  var downloadTitle: String
  var iOSAppId: String
  var iOSAppLookupUrl: String
  var shouldCheckApkHasDownloaded: Boolean
  def downloadApkEnd(path: String): js.Any
  def onError(err: js.Error): js.Any
}

object Options {
  @scala.inline
  def apply(
    downloadApkEnd: String => CallbackTo[js.Any],
    downloadApkName: String,
    downloadDescription: String,
    downloadDestDirectory: String,
    downloadTitle: String,
    iOSAppId: String,
    iOSAppLookupUrl: String,
    onError: js.Error => CallbackTo[js.Any],
    shouldCheckApkHasDownloaded: Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(downloadApkName = downloadApkName.asInstanceOf[js.Any], downloadDescription = downloadDescription.asInstanceOf[js.Any], downloadDestDirectory = downloadDestDirectory.asInstanceOf[js.Any], downloadTitle = downloadTitle.asInstanceOf[js.Any], iOSAppId = iOSAppId.asInstanceOf[js.Any], iOSAppLookupUrl = iOSAppLookupUrl.asInstanceOf[js.Any], shouldCheckApkHasDownloaded = shouldCheckApkHasDownloaded.asInstanceOf[js.Any])
    __obj.updateDynamic("downloadApkEnd")(js.Any.fromFunction1((t0: java.lang.String) => downloadApkEnd(t0).runNow()))
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: js.Error) => onError(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

