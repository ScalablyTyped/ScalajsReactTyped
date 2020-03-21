package typingsJapgolly.chayns

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UI Functions
  * chayns.ui.modeswitch
  * interfaces
  */
// chayns.ui.modeswitch.init()
trait ModeSwitchConfig extends js.Object {
  var headline: js.UndefOr[String] = js.undefined
  var items: js.Array[ModeSwitchItem]
  var preventclose: js.UndefOr[Boolean] = js.undefined
  def callback(result: ModeSwitchItem): Unit
}

object ModeSwitchConfig {
  @scala.inline
  def apply(
    callback: ModeSwitchItem => Callback,
    items: js.Array[ModeSwitchItem],
    headline: String = null,
    preventclose: js.UndefOr[Boolean] = js.undefined
  ): ModeSwitchConfig = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: typingsJapgolly.chayns.ModeSwitchItem) => callback(t0).runNow()))
    if (headline != null) __obj.updateDynamic("headline")(headline.asInstanceOf[js.Any])
    if (!js.isUndefined(preventclose)) __obj.updateDynamic("preventclose")(preventclose.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModeSwitchConfig]
  }
}

