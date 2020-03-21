package typingsJapgolly.winrt.Windows.Media.PlayTo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToManagerStatics extends js.Object {
  def getForCurrentView(): PlayToManager
  def showPlayToUI(): Unit
}

object IPlayToManagerStatics {
  @scala.inline
  def apply(getForCurrentView: CallbackTo[PlayToManager], showPlayToUI: Callback): IPlayToManagerStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getForCurrentView")(getForCurrentView.toJsFn)
    __obj.updateDynamic("showPlayToUI")(showPlayToUI.toJsFn)
    __obj.asInstanceOf[IPlayToManagerStatics]
  }
}

