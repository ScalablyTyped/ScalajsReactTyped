package typingsJapgolly.ace.AceAjax

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Completer extends js.Object {
  /**
    * Provides tooltip information about a completion result.
    * @param item The completion result
    */
  var getDocTooltip: js.UndefOr[js.Function1[/* item */ Completion, Unit]] = js.undefined
  /**
    * Provides possible completion results asynchronously using the given callback.
    * @param editor The editor to associate with
    * @param session The `EditSession` to refer to
    * @param pos An object containing the row and column
    * @param prefix The prefixing string before the current position
    * @param callback Function to provide the results or error
    */
  def getCompletions(editor: Editor, session: IEditSession, pos: Position, prefix: String, callback: CompletionCallback): Unit
}

object Completer {
  @scala.inline
  def apply(
    getCompletions: (Editor, IEditSession, Position, String, CompletionCallback) => Callback,
    getDocTooltip: /* item */ Completion => Callback = null
  ): Completer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCompletions")(js.Any.fromFunction5((t0: typingsJapgolly.ace.AceAjax.Editor, t1: typingsJapgolly.ace.AceAjax.IEditSession, t2: typingsJapgolly.ace.AceAjax.Position, t3: java.lang.String, t4: typingsJapgolly.ace.AceAjax.CompletionCallback) => getCompletions(t0, t1, t2, t3, t4).runNow()))
    if (getDocTooltip != null) __obj.updateDynamic("getDocTooltip")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.ace.AceAjax.Completion) => getDocTooltip(t0).runNow()))
    __obj.asInstanceOf[Completer]
  }
}

