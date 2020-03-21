package typingsJapgolly.winrt.Windows.Networking.NetworkOperators

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUssdMessageFactory extends js.Object {
  def createMessage(messageText: String): UssdMessage
}

object IUssdMessageFactory {
  @scala.inline
  def apply(createMessage: String => CallbackTo[UssdMessage]): IUssdMessageFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createMessage")(js.Any.fromFunction1((t0: java.lang.String) => createMessage(t0).runNow()))
    __obj.asInstanceOf[IUssdMessageFactory]
  }
}

