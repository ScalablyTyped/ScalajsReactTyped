package typingsJapgolly.androiduix.android.widget.SeekBar

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSeekBarChangeListener extends js.Object {
  def onProgressChanged(seekBar: typingsJapgolly.androiduix.android.widget.SeekBar, progress: Double, fromUser: Boolean): Unit
  def onStartTrackingTouch(seekBar: typingsJapgolly.androiduix.android.widget.SeekBar): Unit
  def onStopTrackingTouch(seekBar: typingsJapgolly.androiduix.android.widget.SeekBar): Unit
}

object OnSeekBarChangeListener {
  @scala.inline
  def apply(
    onProgressChanged: (typingsJapgolly.androiduix.android.widget.SeekBar, Double, Boolean) => Callback,
    onStartTrackingTouch: typingsJapgolly.androiduix.android.widget.SeekBar => Callback,
    onStopTrackingTouch: typingsJapgolly.androiduix.android.widget.SeekBar => Callback
  ): OnSeekBarChangeListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onProgressChanged")(js.Any.fromFunction3((t0: typingsJapgolly.androiduix.android.widget.SeekBar, t1: scala.Double, t2: scala.Boolean) => onProgressChanged(t0, t1, t2).runNow()))
    __obj.updateDynamic("onStartTrackingTouch")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.widget.SeekBar) => onStartTrackingTouch(t0).runNow()))
    __obj.updateDynamic("onStopTrackingTouch")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.widget.SeekBar) => onStopTrackingTouch(t0).runNow()))
    __obj.asInstanceOf[OnSeekBarChangeListener]
  }
}

