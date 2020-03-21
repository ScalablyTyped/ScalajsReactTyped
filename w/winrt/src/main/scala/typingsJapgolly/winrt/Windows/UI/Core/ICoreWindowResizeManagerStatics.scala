package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreWindowResizeManagerStatics extends js.Object {
  def getForCurrentView(): CoreWindowResizeManager
}

object ICoreWindowResizeManagerStatics {
  @scala.inline
  def apply(getForCurrentView: CallbackTo[CoreWindowResizeManager]): ICoreWindowResizeManagerStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getForCurrentView")(getForCurrentView.toJsFn)
    __obj.asInstanceOf[ICoreWindowResizeManagerStatics]
  }
}

