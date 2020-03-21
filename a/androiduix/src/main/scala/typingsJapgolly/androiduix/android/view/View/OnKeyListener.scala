package typingsJapgolly.androiduix.android.view.View

import typingsJapgolly.androiduix.android.view.KeyEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnKeyListener extends js.Object {
  def onKey(v: typingsJapgolly.androiduix.android.view.View, keyCode: Double, event: KeyEvent): Unit
}

@JSGlobal("android.view.View.OnKeyListener")
@js.native
object OnKeyListener extends js.Object {
  def fromFunction(
    func: js.Function3[
      /* v */ typingsJapgolly.androiduix.android.view.View, 
      /* keyCode */ Double, 
      /* event */ KeyEvent, 
      Unit
    ]
  ): OnKeyListener = js.native
}

