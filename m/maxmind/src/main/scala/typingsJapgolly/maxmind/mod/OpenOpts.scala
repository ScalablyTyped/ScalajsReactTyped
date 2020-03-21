package typingsJapgolly.maxmind.mod

import typingsJapgolly.maxmind.AnonMax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenOpts extends js.Object {
  var cache: js.UndefOr[AnonMax] = js.undefined
  var watchForUpdates: js.UndefOr[Boolean] = js.undefined
  var watchForUpdatesHook: js.UndefOr[Callback] = js.undefined
  var watchForUpdatesNonPersistent: js.UndefOr[Boolean] = js.undefined
}

object OpenOpts {
  @scala.inline
  def apply(
    cache: AnonMax = null,
    watchForUpdates: js.UndefOr[Boolean] = js.undefined,
    watchForUpdatesHook: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined,
    watchForUpdatesNonPersistent: js.UndefOr[Boolean] = js.undefined
  ): OpenOpts = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(watchForUpdates)) __obj.updateDynamic("watchForUpdates")(watchForUpdates.asInstanceOf[js.Any])
    watchForUpdatesHook.foreach(p => __obj.updateDynamic("watchForUpdatesHook")(p.toJsFn))
    if (!js.isUndefined(watchForUpdatesNonPersistent)) __obj.updateDynamic("watchForUpdatesNonPersistent")(watchForUpdatesNonPersistent.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenOpts]
  }
}

