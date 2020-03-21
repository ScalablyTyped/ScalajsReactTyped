package typingsJapgolly.reactSideEffect

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPeek[TPeek, TRewind] extends js.Object {
  def peek(): TPeek
  def rewind(): TRewind
}

object AnonPeek {
  @scala.inline
  def apply[TPeek, TRewind](peek: CallbackTo[TPeek], rewind: CallbackTo[TRewind]): AnonPeek[TPeek, TRewind] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("peek")(peek.toJsFn)
    __obj.updateDynamic("rewind")(rewind.toJsFn)
    __obj.asInstanceOf[AnonPeek[TPeek, TRewind]]
  }
}

