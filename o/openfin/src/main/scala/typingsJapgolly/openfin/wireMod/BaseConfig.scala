package typingsJapgolly.openfin.wireMod

import typingsJapgolly.openfin.AnonAlias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseConfig extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var appAssets: js.UndefOr[js.Array[AnonAlias]] = js.undefined
  var assetsUrl: js.UndefOr[String] = js.undefined
  var client: js.UndefOr[js.Any] = js.undefined
  var customItems: js.UndefOr[js.Array[_]] = js.undefined
  var devToolsPort: js.UndefOr[Double] = js.undefined
  var installerUI: js.UndefOr[Boolean] = js.undefined
  var licenseKey: js.UndefOr[String] = js.undefined
  var lrsUrl: js.UndefOr[String] = js.undefined
  var manifestUrl: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var nonPersistent: js.UndefOr[Boolean] = js.undefined
  var runtime: js.UndefOr[RuntimeConfig] = js.undefined
  var runtimeClient: js.UndefOr[Boolean] = js.undefined
  var services: js.UndefOr[js.Array[ServiceConfig]] = js.undefined
  var startupApp: js.UndefOr[js.Any] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var uuid: js.UndefOr[String] = js.undefined
}

object BaseConfig {
  @scala.inline
  def apply(
    address: String = null,
    appAssets: js.Array[AnonAlias] = null,
    assetsUrl: String = null,
    client: js.Any = null,
    customItems: js.Array[_] = null,
    devToolsPort: Int | Double = null,
    installerUI: js.UndefOr[Boolean] = js.undefined,
    licenseKey: String = null,
    lrsUrl: String = null,
    manifestUrl: String = null,
    name: String = null,
    nonPersistent: js.UndefOr[Boolean] = js.undefined,
    runtime: RuntimeConfig = null,
    runtimeClient: js.UndefOr[Boolean] = js.undefined,
    services: js.Array[ServiceConfig] = null,
    startupApp: js.Any = null,
    timeout: Int | Double = null,
    uuid: String = null
  ): BaseConfig = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (appAssets != null) __obj.updateDynamic("appAssets")(appAssets.asInstanceOf[js.Any])
    if (assetsUrl != null) __obj.updateDynamic("assetsUrl")(assetsUrl.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (customItems != null) __obj.updateDynamic("customItems")(customItems.asInstanceOf[js.Any])
    if (devToolsPort != null) __obj.updateDynamic("devToolsPort")(devToolsPort.asInstanceOf[js.Any])
    if (!js.isUndefined(installerUI)) __obj.updateDynamic("installerUI")(installerUI.asInstanceOf[js.Any])
    if (licenseKey != null) __obj.updateDynamic("licenseKey")(licenseKey.asInstanceOf[js.Any])
    if (lrsUrl != null) __obj.updateDynamic("lrsUrl")(lrsUrl.asInstanceOf[js.Any])
    if (manifestUrl != null) __obj.updateDynamic("manifestUrl")(manifestUrl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(nonPersistent)) __obj.updateDynamic("nonPersistent")(nonPersistent.asInstanceOf[js.Any])
    if (runtime != null) __obj.updateDynamic("runtime")(runtime.asInstanceOf[js.Any])
    if (!js.isUndefined(runtimeClient)) __obj.updateDynamic("runtimeClient")(runtimeClient.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    if (startupApp != null) __obj.updateDynamic("startupApp")(startupApp.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseConfig]
  }
}

