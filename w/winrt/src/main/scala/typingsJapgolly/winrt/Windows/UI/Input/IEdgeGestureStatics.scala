package typingsJapgolly.winrt.Windows.UI.Input

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEdgeGestureStatics extends js.Object {
  def getForCurrentView(): EdgeGesture
}

object IEdgeGestureStatics {
  @scala.inline
  def apply(getForCurrentView: CallbackTo[EdgeGesture]): IEdgeGestureStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getForCurrentView")(getForCurrentView.toJsFn)
    __obj.asInstanceOf[IEdgeGestureStatics]
  }
}

