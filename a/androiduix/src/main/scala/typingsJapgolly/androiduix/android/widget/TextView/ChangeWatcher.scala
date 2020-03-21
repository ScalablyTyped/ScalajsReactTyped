package typingsJapgolly.androiduix.android.widget.TextView

import typingsJapgolly.androiduix.android.text.SpanWatcher
import typingsJapgolly.androiduix.android.text.Spannable
import typingsJapgolly.androiduix.android.text.TextWatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.TextView.ChangeWatcher")
@js.native
class ChangeWatcher protected ()
  extends TextWatcher
     with SpanWatcher {
  def this(arg: typingsJapgolly.androiduix.android.widget.TextView) = this()
  var _TextView_this: typingsJapgolly.androiduix.android.widget.TextView = js.native
  var mBeforeText: js.Any = js.native
  /* CompleteClass */
  override def afterTextChanged(s: String): Unit = js.native
  /* CompleteClass */
  override def beforeTextChanged(s: String, start: Double, count: Double, after: Double): Unit = js.native
  /* CompleteClass */
  override def onSpanAdded(text: Spannable, what: js.Any, start: Double, end: Double): Unit = js.native
  /* CompleteClass */
  override def onSpanChanged(text: Spannable, what: js.Any, ostart: Double, oend: Double, nstart: Double, nend: Double): Unit = js.native
  /* CompleteClass */
  override def onSpanRemoved(text: Spannable, what: js.Any, start: Double, end: Double): Unit = js.native
  /* CompleteClass */
  override def onTextChanged(s: String, start: Double, before: Double, count: Double): Unit = js.native
}

