package typingsJapgolly.officeUiFabricReact.scrollablePaneTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollablePane extends js.Object {
  /** Triggers a layout update for the pane. */
  def forceLayoutUpdate(): Unit
  /** Gets the current scroll position of the scrollable pane */
  def getScrollPosition(): Double
}

object IScrollablePane {
  @scala.inline
  def apply(forceLayoutUpdate: Callback, getScrollPosition: CallbackTo[Double]): IScrollablePane = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forceLayoutUpdate")(forceLayoutUpdate.toJsFn)
    __obj.updateDynamic("getScrollPosition")(getScrollPosition.toJsFn)
    __obj.asInstanceOf[IScrollablePane]
  }
}

