package typingsJapgolly.monacoEditor.mod.editor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDiffNavigator extends js.Object {
  def canNavigate(): Boolean
  def dispose(): Unit
  def next(): Unit
  def previous(): Unit
}

object IDiffNavigator {
  @scala.inline
  def apply(canNavigate: CallbackTo[Boolean], dispose: Callback, next: Callback, previous: Callback): IDiffNavigator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canNavigate")(canNavigate.toJsFn)
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("previous")(previous.toJsFn)
    __obj.asInstanceOf[IDiffNavigator]
  }
}

