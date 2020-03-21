package typingsJapgolly.androiduix.android.text

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpanWatcher extends js.Object {
  def onSpanAdded(text: Spannable, what: js.Any, start: Double, end: Double): Unit
  def onSpanChanged(text: Spannable, what: js.Any, ostart: Double, oend: Double, nstart: Double, nend: Double): Unit
  def onSpanRemoved(text: Spannable, what: js.Any, start: Double, end: Double): Unit
}

object SpanWatcher {
  @scala.inline
  def apply(
    onSpanAdded: (Spannable, js.Any, Double, Double) => Callback,
    onSpanChanged: (Spannable, js.Any, Double, Double, Double, Double) => Callback,
    onSpanRemoved: (Spannable, js.Any, Double, Double) => Callback
  ): SpanWatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onSpanAdded")(js.Any.fromFunction4((t0: typingsJapgolly.androiduix.android.text.Spannable, t1: js.Any, t2: scala.Double, t3: scala.Double) => onSpanAdded(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("onSpanChanged")(js.Any.fromFunction6((t0: typingsJapgolly.androiduix.android.text.Spannable, t1: js.Any, t2: scala.Double, t3: scala.Double, t4: scala.Double, t5: scala.Double) => onSpanChanged(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("onSpanRemoved")(js.Any.fromFunction4((t0: typingsJapgolly.androiduix.android.text.Spannable, t1: js.Any, t2: scala.Double, t3: scala.Double) => onSpanRemoved(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[SpanWatcher]
  }
}

