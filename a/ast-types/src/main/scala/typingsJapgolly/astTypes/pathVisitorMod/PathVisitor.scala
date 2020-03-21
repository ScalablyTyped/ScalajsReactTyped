package typingsJapgolly.astTypes.pathVisitorMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathVisitor extends js.Object {
  var AbortRequest: js.Any
  var Context: js.Any
  var _abortRequested: Boolean
  var _changeReported: js.Any
  var _methodNameTable: js.Any
  var _reusableContextStack: js.Any
  var _shouldVisitComments: js.Any
  var _visiting: js.Any
  var visitor: js.Any
  def abort(): Unit
  def acquireContext(path: js.Any): js.Any
  def releaseContext(context: js.Any): Unit
  def reportChanged(): Unit
  def reset(args: js.Any*): js.Any
  def visit(args: js.Any*): js.Any
  def visitWithoutReset(path: js.Any): js.Any
  def wasChangeReported(): js.Any
}

object PathVisitor {
  @scala.inline
  def apply(
    AbortRequest: js.Any,
    Context: js.Any,
    _abortRequested: Boolean,
    _changeReported: js.Any,
    _methodNameTable: js.Any,
    _reusableContextStack: js.Any,
    _shouldVisitComments: js.Any,
    _visiting: js.Any,
    abort: Callback,
    acquireContext: js.Any => CallbackTo[js.Any],
    releaseContext: js.Any => Callback,
    reportChanged: Callback,
    reset: /* repeated */ js.Any => CallbackTo[js.Any],
    visit: /* repeated */ js.Any => CallbackTo[js.Any],
    visitWithoutReset: js.Any => CallbackTo[js.Any],
    visitor: js.Any,
    wasChangeReported: CallbackTo[js.Any]
  ): PathVisitor = {
    val __obj = js.Dynamic.literal(AbortRequest = AbortRequest.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], _abortRequested = _abortRequested.asInstanceOf[js.Any], _changeReported = _changeReported.asInstanceOf[js.Any], _methodNameTable = _methodNameTable.asInstanceOf[js.Any], _reusableContextStack = _reusableContextStack.asInstanceOf[js.Any], _shouldVisitComments = _shouldVisitComments.asInstanceOf[js.Any], _visiting = _visiting.asInstanceOf[js.Any], visitor = visitor.asInstanceOf[js.Any])
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.updateDynamic("acquireContext")(js.Any.fromFunction1((t0: js.Any) => acquireContext(t0).runNow()))
    __obj.updateDynamic("releaseContext")(js.Any.fromFunction1((t0: js.Any) => releaseContext(t0).runNow()))
    __obj.updateDynamic("reportChanged")(reportChanged.toJsFn)
    __obj.updateDynamic("reset")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => reset(t0).runNow()))
    __obj.updateDynamic("visit")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => visit(t0).runNow()))
    __obj.updateDynamic("visitWithoutReset")(js.Any.fromFunction1((t0: js.Any) => visitWithoutReset(t0).runNow()))
    __obj.updateDynamic("wasChangeReported")(wasChangeReported.toJsFn)
    __obj.asInstanceOf[PathVisitor]
  }
}

