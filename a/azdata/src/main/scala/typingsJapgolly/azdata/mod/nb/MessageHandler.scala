package typingsJapgolly.azdata.mod.nb

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageHandler[T /* <: IMessage */] extends js.Object {
  def handle(message: T): Unit | Thenable[Unit]
}

object MessageHandler {
  @scala.inline
  def apply[T /* <: IMessage */](handle: T => CallbackTo[Unit | Thenable[Unit]]): MessageHandler[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handle")(js.Any.fromFunction1((t0: T) => handle(t0).runNow()))
    __obj.asInstanceOf[MessageHandler[T]]
  }
}

