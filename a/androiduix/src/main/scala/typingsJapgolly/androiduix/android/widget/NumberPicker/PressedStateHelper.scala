package typingsJapgolly.androiduix.android.widget.NumberPicker

import typingsJapgolly.androiduix.java.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.NumberPicker.PressedStateHelper")
@js.native
class PressedStateHelper protected () extends Runnable {
  def this(arg: typingsJapgolly.androiduix.android.widget.NumberPicker) = this()
  var MODE_PRESS: js.Any = js.native
  var MODE_TAPPED: js.Any = js.native
  var _NumberPicker_this: typingsJapgolly.androiduix.android.widget.NumberPicker = js.native
  var mManagedButton: js.Any = js.native
  var mMode: js.Any = js.native
  def buttonPressDelayed(button: Double): Unit = js.native
  def buttonTapped(button: Double): Unit = js.native
  def cancel(): Unit = js.native
  /* CompleteClass */
  override def run(): js.Any = js.native
}

/* static members */
@JSGlobal("android.widget.NumberPicker.PressedStateHelper")
@js.native
object PressedStateHelper extends js.Object {
  var BUTTON_DECREMENT: Double = js.native
  var BUTTON_INCREMENT: Double = js.native
}

