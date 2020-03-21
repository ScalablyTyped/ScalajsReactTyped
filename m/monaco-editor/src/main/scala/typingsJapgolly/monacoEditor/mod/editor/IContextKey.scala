package typingsJapgolly.monacoEditor.mod.editor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextKey[T] extends js.Object {
  def get(): js.UndefOr[T]
  def reset(): Unit
  def set(value: T): Unit
}

object IContextKey {
  @scala.inline
  def apply[T](get: CallbackTo[js.UndefOr[T]], reset: Callback, set: T => Callback): IContextKey[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: T) => set(t0).runNow()))
    __obj.asInstanceOf[IContextKey[T]]
  }
}

