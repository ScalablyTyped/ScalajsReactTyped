package typingsJapgolly.reactVirtualized

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactVirtualized.reactVirtualizedBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisableHeight extends js.Object {
  var disableHeight: `false`
  var disableWidth: `false`
  def onResize(): Unit
}

object AnonDisableHeight {
  @scala.inline
  def apply(disableHeight: `false`, disableWidth: `false`, onResize: Callback): AnonDisableHeight = {
    val __obj = js.Dynamic.literal(disableHeight = disableHeight.asInstanceOf[js.Any], disableWidth = disableWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("onResize")(onResize.toJsFn)
    __obj.asInstanceOf[AnonDisableHeight]
  }
}

