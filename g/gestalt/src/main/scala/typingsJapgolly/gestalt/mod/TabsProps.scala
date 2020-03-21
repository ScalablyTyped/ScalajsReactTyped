package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.gestalt.AnonActiveTabIndex
import typingsJapgolly.gestalt.AnonHref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  var activeTabIndex: Double
  var tabs: js.Array[AnonHref]
  var wrap: js.UndefOr[Boolean] = js.undefined
  def onChange(args: AnonActiveTabIndex): Unit
}

object TabsProps {
  @scala.inline
  def apply(
    activeTabIndex: Double,
    onChange: AnonActiveTabIndex => Callback,
    tabs: js.Array[AnonHref],
    wrap: js.UndefOr[Boolean] = js.undefined
  ): TabsProps = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.gestalt.AnonActiveTabIndex) => onChange(t0).runNow()))
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
}

