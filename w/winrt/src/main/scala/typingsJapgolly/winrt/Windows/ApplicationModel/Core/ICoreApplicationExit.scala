package typingsJapgolly.winrt.Windows.ApplicationModel.Core

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreApplicationExit extends js.Object {
  var onexiting: js.Any
  def exit(): Unit
}

object ICoreApplicationExit {
  @scala.inline
  def apply(exit: Callback, onexiting: js.Any): ICoreApplicationExit = {
    val __obj = js.Dynamic.literal(onexiting = onexiting.asInstanceOf[js.Any])
    __obj.updateDynamic("exit")(exit.toJsFn)
    __obj.asInstanceOf[ICoreApplicationExit]
  }
}

