package typingsJapgolly.dwt

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dbrEnv extends js.Object {
  var bAutoConnectService: Boolean
  var disableAutoDownloadModule: Boolean
  var hideDWASInstallDialog: Boolean
  var logLevel: Double
  var productKey: String
  var resourcesPath: String
  def onAutoConnectServiceError(status: js.Any): Unit
  def onAutoConnectServiceSuccess(): Unit
}

object dbrEnv {
  @scala.inline
  def apply(
    bAutoConnectService: Boolean,
    disableAutoDownloadModule: Boolean,
    hideDWASInstallDialog: Boolean,
    logLevel: Double,
    onAutoConnectServiceError: js.Any => Callback,
    onAutoConnectServiceSuccess: Callback,
    productKey: String,
    resourcesPath: String
  ): dbrEnv = {
    val __obj = js.Dynamic.literal(bAutoConnectService = bAutoConnectService.asInstanceOf[js.Any], disableAutoDownloadModule = disableAutoDownloadModule.asInstanceOf[js.Any], hideDWASInstallDialog = hideDWASInstallDialog.asInstanceOf[js.Any], logLevel = logLevel.asInstanceOf[js.Any], productKey = productKey.asInstanceOf[js.Any], resourcesPath = resourcesPath.asInstanceOf[js.Any])
    __obj.updateDynamic("onAutoConnectServiceError")(js.Any.fromFunction1((t0: js.Any) => onAutoConnectServiceError(t0).runNow()))
    __obj.updateDynamic("onAutoConnectServiceSuccess")(onAutoConnectServiceSuccess.toJsFn)
    __obj.asInstanceOf[dbrEnv]
  }
}

