package typingsJapgolly.brace.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextMode extends js.Object {
  def autoOutdent(state: js.Any, doc: js.Any, row: js.Any): Unit
  def checkOutdent(state: js.Any, line: js.Any, input: js.Any): Boolean
  def createModeDelegates(mapping: js.Any): Unit
  def createWorker(session: js.Any): js.Any
  def getNextLineIndent(state: js.Any, line: js.Any, tab: js.Any): String
  def getTokenizer(): js.Any
  def toggleCommentLines(state: js.Any, doc: js.Any, startRow: js.Any, endRow: js.Any): Unit
  def transformAction(state: js.Any, action: js.Any, editor: js.Any, session: js.Any, param: js.Any): js.Any
}

object TextMode {
  @scala.inline
  def apply(
    autoOutdent: (js.Any, js.Any, js.Any) => Callback,
    checkOutdent: (js.Any, js.Any, js.Any) => CallbackTo[Boolean],
    createModeDelegates: js.Any => Callback,
    createWorker: js.Any => CallbackTo[js.Any],
    getNextLineIndent: (js.Any, js.Any, js.Any) => CallbackTo[String],
    getTokenizer: CallbackTo[js.Any],
    toggleCommentLines: (js.Any, js.Any, js.Any, js.Any) => Callback,
    transformAction: (js.Any, js.Any, js.Any, js.Any, js.Any) => CallbackTo[js.Any]
  ): TextMode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoOutdent")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => autoOutdent(t0, t1, t2).runNow()))
    __obj.updateDynamic("checkOutdent")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => checkOutdent(t0, t1, t2).runNow()))
    __obj.updateDynamic("createModeDelegates")(js.Any.fromFunction1((t0: js.Any) => createModeDelegates(t0).runNow()))
    __obj.updateDynamic("createWorker")(js.Any.fromFunction1((t0: js.Any) => createWorker(t0).runNow()))
    __obj.updateDynamic("getNextLineIndent")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => getNextLineIndent(t0, t1, t2).runNow()))
    __obj.updateDynamic("getTokenizer")(getTokenizer.toJsFn)
    __obj.updateDynamic("toggleCommentLines")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any) => toggleCommentLines(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("transformAction")(js.Any.fromFunction5((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any, t4: js.Any) => transformAction(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[TextMode]
  }
}

