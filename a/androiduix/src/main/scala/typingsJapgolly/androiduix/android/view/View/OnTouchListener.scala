package typingsJapgolly.androiduix.android.view.View

import typingsJapgolly.androiduix.android.view.MotionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnTouchListener extends js.Object {
  def onTouch(v: typingsJapgolly.androiduix.android.view.View, event: MotionEvent): Unit
}

@JSGlobal("android.view.View.OnTouchListener")
@js.native
object OnTouchListener extends js.Object {
  def fromFunction(
    func: js.Function2[/* v */ typingsJapgolly.androiduix.android.view.View, /* event */ MotionEvent, Unit]
  ): OnTouchListener = js.native
}

