package typingsJapgolly.tsmonad.writerMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriterPatterns[S, T, U] extends js.Object {
  def writer(story: js.Array[S], value: T): U
}

object WriterPatterns {
  @scala.inline
  def apply[S, T, U](writer: (js.Array[S], T) => CallbackTo[U]): WriterPatterns[S, T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("writer")(js.Any.fromFunction2((t0: js.Array[S], t1: T) => writer(t0, t1).runNow()))
    __obj.asInstanceOf[WriterPatterns[S, T, U]]
  }
}

