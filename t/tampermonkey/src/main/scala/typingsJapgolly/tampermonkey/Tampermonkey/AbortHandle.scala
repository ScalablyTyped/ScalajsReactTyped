package typingsJapgolly.tampermonkey.Tampermonkey

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortHandle[TReturn] extends js.Object {
  def abort(): TReturn
}

object AbortHandle {
  @scala.inline
  def apply[TReturn](abort: CallbackTo[TReturn]): AbortHandle[TReturn] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.asInstanceOf[AbortHandle[TReturn]]
  }
}

