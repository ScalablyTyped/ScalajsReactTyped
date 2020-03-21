package typingsJapgolly.istanbulLibReport.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor[N /* <: Node */] extends js.Object {
  def onDetail(root: N, state: js.Any): Unit
  def onEnd(root: N, state: js.Any): Unit
  def onStart(root: N, state: js.Any): Unit
  def onSummary(root: N, state: js.Any): Unit
  def onSummaryEnd(root: N, state: js.Any): Unit
}

object Visitor {
  @scala.inline
  def apply[N /* <: Node */](
    onDetail: (N, js.Any) => Callback,
    onEnd: (N, js.Any) => Callback,
    onStart: (N, js.Any) => Callback,
    onSummary: (N, js.Any) => Callback,
    onSummaryEnd: (N, js.Any) => Callback
  ): Visitor[N] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onDetail")(js.Any.fromFunction2((t0: N, t1: js.Any) => onDetail(t0, t1).runNow()))
    __obj.updateDynamic("onEnd")(js.Any.fromFunction2((t0: N, t1: js.Any) => onEnd(t0, t1).runNow()))
    __obj.updateDynamic("onStart")(js.Any.fromFunction2((t0: N, t1: js.Any) => onStart(t0, t1).runNow()))
    __obj.updateDynamic("onSummary")(js.Any.fromFunction2((t0: N, t1: js.Any) => onSummary(t0, t1).runNow()))
    __obj.updateDynamic("onSummaryEnd")(js.Any.fromFunction2((t0: N, t1: js.Any) => onSummaryEnd(t0, t1).runNow()))
    __obj.asInstanceOf[Visitor[N]]
  }
}

