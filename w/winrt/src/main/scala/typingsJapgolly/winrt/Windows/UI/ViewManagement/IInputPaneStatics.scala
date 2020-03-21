package typingsJapgolly.winrt.Windows.UI.ViewManagement

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputPaneStatics extends js.Object {
  def getForCurrentView(): InputPane
}

object IInputPaneStatics {
  @scala.inline
  def apply(getForCurrentView: CallbackTo[InputPane]): IInputPaneStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getForCurrentView")(getForCurrentView.toJsFn)
    __obj.asInstanceOf[IInputPaneStatics]
  }
}

