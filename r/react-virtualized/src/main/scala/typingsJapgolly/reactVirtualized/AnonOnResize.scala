package typingsJapgolly.reactVirtualized

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactVirtualized.reactVirtualizedNumbers.`0`
import typingsJapgolly.reactVirtualized.reactVirtualizedNumbers.`150`
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnResize extends js.Object {
  var scrollElement: js.UndefOr[Window_] = js.undefined
  var scrollingResetTimeInterval: `150`
  var serverHeight: `0`
  var serverWidth: `0`
  def onResize(): Unit
  def onScroll(): Unit
}

object AnonOnResize {
  @scala.inline
  def apply(
    onResize: Callback,
    onScroll: Callback,
    scrollingResetTimeInterval: `150`,
    serverHeight: `0`,
    serverWidth: `0`,
    scrollElement: Window_ = null
  ): AnonOnResize = {
    val __obj = js.Dynamic.literal(scrollingResetTimeInterval = scrollingResetTimeInterval.asInstanceOf[js.Any], serverHeight = serverHeight.asInstanceOf[js.Any], serverWidth = serverWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("onResize")(onResize.toJsFn)
    __obj.updateDynamic("onScroll")(onScroll.toJsFn)
    if (scrollElement != null) __obj.updateDynamic("scrollElement")(scrollElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnResize]
  }
}

