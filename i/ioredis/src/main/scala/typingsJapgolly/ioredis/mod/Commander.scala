package typingsJapgolly.ioredis.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ioredis.AnonLua
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commander extends js.Object {
  def createBuiltinCommand(commandName: String): js.Object
  def defineCommand(name: String, definition: AnonLua): Unit
  def getBuiltinCommands(): js.Array[String]
  def sendCommand(): Unit
}

object Commander {
  @scala.inline
  def apply(
    createBuiltinCommand: String => CallbackTo[js.Object],
    defineCommand: (String, AnonLua) => Callback,
    getBuiltinCommands: CallbackTo[js.Array[String]],
    sendCommand: Callback
  ): Commander = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createBuiltinCommand")(js.Any.fromFunction1((t0: java.lang.String) => createBuiltinCommand(t0).runNow()))
    __obj.updateDynamic("defineCommand")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.ioredis.AnonLua) => defineCommand(t0, t1).runNow()))
    __obj.updateDynamic("getBuiltinCommands")(getBuiltinCommands.toJsFn)
    __obj.updateDynamic("sendCommand")(sendCommand.toJsFn)
    __obj.asInstanceOf[Commander]
  }
}

