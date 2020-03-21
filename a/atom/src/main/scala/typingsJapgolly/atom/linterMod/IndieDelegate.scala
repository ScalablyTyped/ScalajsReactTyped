package typingsJapgolly.atom.linterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atom.mod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndieDelegate extends js.Object {
  var name: String
  def clearMessages(): Unit
  def dispose(): Unit
  def getMessages(): js.Array[Message]
  def onDidDestroy(callback: js.Function0[Unit]): Disposable
  def onDidUpdate(callback: js.Function0[Unit]): Disposable
  def setAllMessages(messages: js.Array[Message]): Unit
  def setMessages(filePath: String, messages: js.Array[Message]): Unit
}

object IndieDelegate {
  @scala.inline
  def apply(
    clearMessages: Callback,
    dispose: Callback,
    getMessages: CallbackTo[js.Array[Message]],
    name: String,
    onDidDestroy: js.Function0[Unit] => CallbackTo[Disposable],
    onDidUpdate: js.Function0[Unit] => CallbackTo[Disposable],
    setAllMessages: js.Array[Message] => Callback,
    setMessages: (String, js.Array[Message]) => Callback
  ): IndieDelegate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("clearMessages")(clearMessages.toJsFn)
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("getMessages")(getMessages.toJsFn)
    __obj.updateDynamic("onDidDestroy")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => onDidDestroy(t0).runNow()))
    __obj.updateDynamic("onDidUpdate")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => onDidUpdate(t0).runNow()))
    __obj.updateDynamic("setAllMessages")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.atom.linterMod.Message]) => setAllMessages(t0).runNow()))
    __obj.updateDynamic("setMessages")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Array[typingsJapgolly.atom.linterMod.Message]) => setMessages(t0, t1).runNow()))
    __obj.asInstanceOf[IndieDelegate]
  }
}

