package typingsJapgolly.historyJs

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryAdapter extends js.Object {
  def bind(element: js.Any, event: String, callback: js.Function0[Unit]): Unit
  def onDomLoad(callback: js.Function0[Unit]): Unit
  def trigger(element: js.Any, event: String): Unit
}

object HistoryAdapter {
  @scala.inline
  def apply(
    bind: (js.Any, String, js.Function0[Unit]) => Callback,
    onDomLoad: js.Function0[Unit] => Callback,
    trigger: (js.Any, String) => Callback
  ): HistoryAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bind")(js.Any.fromFunction3((t0: js.Any, t1: java.lang.String, t2: js.Function0[scala.Unit]) => bind(t0, t1, t2).runNow()))
    __obj.updateDynamic("onDomLoad")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => onDomLoad(t0).runNow()))
    __obj.updateDynamic("trigger")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => trigger(t0, t1).runNow()))
    __obj.asInstanceOf[HistoryAdapter]
  }
}

