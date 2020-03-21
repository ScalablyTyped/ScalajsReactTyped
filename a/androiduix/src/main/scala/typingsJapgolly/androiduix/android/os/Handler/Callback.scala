package typingsJapgolly.androiduix.android.os.Handler

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.androiduix.android.os.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  def handleMessage(msg: Message): Boolean
}

object Callback {
  @scala.inline
  def apply(handleMessage: Message => CallbackTo[Boolean]): Callback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleMessage")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.os.Message) => handleMessage(t0).runNow()))
    __obj.asInstanceOf[Callback]
  }
}

