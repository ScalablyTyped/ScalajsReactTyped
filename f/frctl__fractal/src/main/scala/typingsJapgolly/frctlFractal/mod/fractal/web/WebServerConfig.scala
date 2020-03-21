package typingsJapgolly.frctlFractal.mod.fractal.web

import typingsJapgolly.frctlFractal.mod.WebTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebServerConfig extends js.Object {
  var port: js.UndefOr[Double] = js.undefined
  var sync: js.UndefOr[Boolean] = js.undefined
  var syncOptions: js.UndefOr[WebServerSyncOptions] = js.undefined
  var theme: js.UndefOr[WebTheme | String] = js.undefined
  var watch: js.UndefOr[Boolean] = js.undefined
}

object WebServerConfig {
  @scala.inline
  def apply(
    port: Int | Double = null,
    sync: js.UndefOr[Boolean] = js.undefined,
    syncOptions: WebServerSyncOptions = null,
    theme: WebTheme | String = null,
    watch: js.UndefOr[Boolean] = js.undefined
  ): WebServerConfig = {
    val __obj = js.Dynamic.literal()
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    if (syncOptions != null) __obj.updateDynamic("syncOptions")(syncOptions.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebServerConfig]
  }
}

