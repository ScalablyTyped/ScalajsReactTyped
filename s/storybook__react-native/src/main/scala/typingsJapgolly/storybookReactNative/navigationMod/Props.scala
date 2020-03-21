package typingsJapgolly.storybookReactNative.navigationMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var initialUiVisible: js.UndefOr[Boolean] = js.undefined
  var tabOpen: Double
  def onChangeTab(index: Double): Unit
}

object Props {
  @scala.inline
  def apply(
    onChangeTab: Double => Callback,
    tabOpen: Double,
    initialUiVisible: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(tabOpen = tabOpen.asInstanceOf[js.Any])
    __obj.updateDynamic("onChangeTab")(js.Any.fromFunction1((t0: scala.Double) => onChangeTab(t0).runNow()))
    if (!js.isUndefined(initialUiVisible)) __obj.updateDynamic("initialUiVisible")(initialUiVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

