package typingsJapgolly.winrt.Windows.UI.Core

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreWindowResizeManager extends js.Object {
  def notifyLayoutCompleted(): Unit
}

object ICoreWindowResizeManager {
  @scala.inline
  def apply(notifyLayoutCompleted: Callback): ICoreWindowResizeManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("notifyLayoutCompleted")(notifyLayoutCompleted.toJsFn)
    __obj.asInstanceOf[ICoreWindowResizeManager]
  }
}

