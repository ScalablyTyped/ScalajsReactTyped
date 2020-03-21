package typingsJapgolly.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngularServeOptions extends ServeOptions {
  var configuration: js.UndefOr[String] = js.undefined
  var consolelogs: js.UndefOr[Boolean] = js.undefined
  var consolelogsPort: js.UndefOr[Double] = js.undefined
  var sourcemaps: js.UndefOr[Boolean] = js.undefined
  var ssl: js.UndefOr[Boolean] = js.undefined
}

object AngularServeOptions {
  @scala.inline
  def apply(
    `--`: js.Array[String],
    address: String,
    devapp: Boolean,
    engine: String,
    lab: Boolean,
    labHost: String,
    labPort: Double,
    livereload: Boolean,
    open: Boolean,
    port: Double,
    proxy: Boolean,
    browser: String = null,
    browserOption: String = null,
    configuration: String = null,
    consolelogs: js.UndefOr[Boolean] = js.undefined,
    consolelogsPort: Int | Double = null,
    externalAddressRequired: js.UndefOr[Boolean] = js.undefined,
    platform: String = null,
    project: String = null,
    sourcemaps: js.UndefOr[Boolean] = js.undefined,
    ssl: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): AngularServeOptions = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], devapp = devapp.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], lab = lab.asInstanceOf[js.Any], labHost = labHost.asInstanceOf[js.Any], labPort = labPort.asInstanceOf[js.Any], livereload = livereload.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (browserOption != null) __obj.updateDynamic("browserOption")(browserOption.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (!js.isUndefined(consolelogs)) __obj.updateDynamic("consolelogs")(consolelogs.asInstanceOf[js.Any])
    if (consolelogsPort != null) __obj.updateDynamic("consolelogsPort")(consolelogsPort.asInstanceOf[js.Any])
    if (!js.isUndefined(externalAddressRequired)) __obj.updateDynamic("externalAddressRequired")(externalAddressRequired.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (!js.isUndefined(sourcemaps)) __obj.updateDynamic("sourcemaps")(sourcemaps.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularServeOptions]
  }
}

