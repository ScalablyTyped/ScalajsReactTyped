package typingsJapgolly.reactVirtualized.esScrollSyncMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollSyncChildProps extends js.Object {
  var clientHeight: Double
  var clientWidth: Double
  var scrollHeight: Double
  var scrollLeft: Double
  var scrollTop: Double
  var scrollWidth: Double
  def onScroll(params: OnScrollParams): Unit
}

object ScrollSyncChildProps {
  @scala.inline
  def apply(
    clientHeight: Double,
    clientWidth: Double,
    onScroll: OnScrollParams => Callback,
    scrollHeight: Double,
    scrollLeft: Double,
    scrollTop: Double,
    scrollWidth: Double
  ): ScrollSyncChildProps = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: typingsJapgolly.reactVirtualized.esScrollSyncMod.OnScrollParams) => onScroll(t0).runNow()))
    __obj.asInstanceOf[ScrollSyncChildProps]
  }
}

