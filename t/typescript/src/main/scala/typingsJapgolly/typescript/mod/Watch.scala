package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Watch[T] extends js.Object {
  /** Closes the watch */
  def close(): Unit
  /** Synchronize with host and get updated program */
  def getProgram(): T
}

object Watch {
  @scala.inline
  def apply[T](close: Callback, getProgram: CallbackTo[T]): Watch[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("getProgram")(getProgram.toJsFn)
    __obj.asInstanceOf[Watch[T]]
  }
}

