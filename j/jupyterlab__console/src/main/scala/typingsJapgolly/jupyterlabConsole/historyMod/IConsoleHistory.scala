package typingsJapgolly.jupyterlabConsole.historyMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabApputils.clientsessionMod.IClientSession
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsoleHistory extends IDisposable {
  /**
    * The current editor used by the history widget.
    */
  var editor: IEditor | Null
  /**
    * The placeholder text that a history session began with.
    */
  val placeholder: String
  /**
    * The client session used by the foreign handler.
    */
  val session: IClientSession
  /**
    * Get the previous item in the console history.
    *
    * @param placeholder - The placeholder string that gets temporarily added
    * to the history only for the duration of one history session. If multiple
    * placeholders are sent within a session, only the first one is accepted.
    *
    * @returns A Promise for console command text or `undefined` if unavailable.
    */
  def back(placeholder: String): js.Promise[String]
  /**
    * Get the next item in the console history.
    *
    * @param placeholder - The placeholder string that gets temporarily added
    * to the history only for the duration of one history session. If multiple
    * placeholders are sent within a session, only the first one is accepted.
    *
    * @returns A Promise for console command text or `undefined` if unavailable.
    */
  def forward(placeholder: String): js.Promise[String]
  /**
    * Add a new item to the bottom of history.
    *
    * @param item The item being added to the bottom of history.
    *
    * #### Notes
    * If the item being added is undefined or empty, it is ignored. If the item
    * being added is the same as the last item in history, it is ignored as well
    * so that the console's history will consist of no contiguous repetitions.
    */
  def push(item: String): Unit
  /**
    * Reset the history navigation state, i.e., start a new history session.
    */
  def reset(): Unit
}

object IConsoleHistory {
  @scala.inline
  def apply(
    back: String => CallbackTo[js.Promise[String]],
    dispose: Callback,
    forward: String => CallbackTo[js.Promise[String]],
    isDisposed: Boolean,
    placeholder: String,
    push: String => Callback,
    reset: Callback,
    session: IClientSession,
    editor: IEditor = null
  ): IConsoleHistory = {
    val __obj = js.Dynamic.literal(isDisposed = isDisposed.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.updateDynamic("back")(js.Any.fromFunction1((t0: java.lang.String) => back(t0).runNow()))
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("forward")(js.Any.fromFunction1((t0: java.lang.String) => forward(t0).runNow()))
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: java.lang.String) => push(t0).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsoleHistory]
  }
}

