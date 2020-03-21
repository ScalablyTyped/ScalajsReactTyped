package typingsJapgolly.rsocketCore.rsocketleaseMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disposable extends js.Object {
  def dispose(): Unit
  def isDisposed(): Boolean
}

object Disposable {
  @scala.inline
  def apply(dispose: Callback, isDisposed: CallbackTo[Boolean]): Disposable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("isDisposed")(isDisposed.toJsFn)
    __obj.asInstanceOf[Disposable]
  }
}

