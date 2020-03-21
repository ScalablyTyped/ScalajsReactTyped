package typingsJapgolly.reactBootstrapTypeahead.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenContext extends js.Object {
  var active: Boolean
  def onBlur(e: js.Any): Unit
  def onClick(e: js.Any): Unit
  def onFocus(e: js.Any): Unit
  def onKeyDown(e: js.Any): Unit
}

object TokenContext {
  @scala.inline
  def apply(
    active: Boolean,
    onBlur: js.Any => Callback,
    onClick: js.Any => Callback,
    onFocus: js.Any => Callback,
    onKeyDown: js.Any => Callback
  ): TokenContext = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: js.Any) => onBlur(t0).runNow()))
    __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: js.Any) => onClick(t0).runNow()))
    __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: js.Any) => onFocus(t0).runNow()))
    __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: js.Any) => onKeyDown(t0).runNow()))
    __obj.asInstanceOf[TokenContext]
  }
}

