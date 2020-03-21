package typingsJapgolly.jestUtil

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofpreRunMessage extends js.Object {
  def print(stream: WritableStream): Unit
  def remove(stream: WritableStream): Unit
}

object TypeofpreRunMessage {
  @scala.inline
  def apply(print: WritableStream => Callback, remove: WritableStream => Callback): TypeofpreRunMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("print")(js.Any.fromFunction1((t0: typingsJapgolly.node.NodeJS.WritableStream) => print(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: typingsJapgolly.node.NodeJS.WritableStream) => remove(t0).runNow()))
    __obj.asInstanceOf[TypeofpreRunMessage]
  }
}

