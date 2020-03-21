package typingsJapgolly.androiduix.android.widget.Spinner

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.androiduix.android.graphics.drawable.Drawable
import typingsJapgolly.androiduix.android.widget.ListAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerPopup extends js.Object {
  def dismiss(): Unit
  def getBackground(): Drawable
  def getHintText(): String
  def getHorizontalOffset(): Double
  def getVerticalOffset(): Double
  def isShowing(): Boolean
  def setAdapter(adapter: ListAdapter): Unit
  def setBackgroundDrawable(bg: Drawable): Unit
  def setHorizontalOffset(px: Double): Unit
  def setPromptText(hintText: String): Unit
  def setVerticalOffset(px: Double): Unit
  def showPopup(textDirection: Double, textAlignment: Double): Unit
}

object SpinnerPopup {
  @scala.inline
  def apply(
    dismiss: Callback,
    getBackground: CallbackTo[Drawable],
    getHintText: CallbackTo[String],
    getHorizontalOffset: CallbackTo[Double],
    getVerticalOffset: CallbackTo[Double],
    isShowing: CallbackTo[Boolean],
    setAdapter: ListAdapter => Callback,
    setBackgroundDrawable: Drawable => Callback,
    setHorizontalOffset: Double => Callback,
    setPromptText: String => Callback,
    setVerticalOffset: Double => Callback,
    showPopup: (Double, Double) => Callback
  ): SpinnerPopup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dismiss")(dismiss.toJsFn)
    __obj.updateDynamic("getBackground")(getBackground.toJsFn)
    __obj.updateDynamic("getHintText")(getHintText.toJsFn)
    __obj.updateDynamic("getHorizontalOffset")(getHorizontalOffset.toJsFn)
    __obj.updateDynamic("getVerticalOffset")(getVerticalOffset.toJsFn)
    __obj.updateDynamic("isShowing")(isShowing.toJsFn)
    __obj.updateDynamic("setAdapter")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.widget.ListAdapter) => setAdapter(t0).runNow()))
    __obj.updateDynamic("setBackgroundDrawable")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.graphics.drawable.Drawable) => setBackgroundDrawable(t0).runNow()))
    __obj.updateDynamic("setHorizontalOffset")(js.Any.fromFunction1((t0: scala.Double) => setHorizontalOffset(t0).runNow()))
    __obj.updateDynamic("setPromptText")(js.Any.fromFunction1((t0: java.lang.String) => setPromptText(t0).runNow()))
    __obj.updateDynamic("setVerticalOffset")(js.Any.fromFunction1((t0: scala.Double) => setVerticalOffset(t0).runNow()))
    __obj.updateDynamic("showPopup")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => showPopup(t0, t1).runNow()))
    __obj.asInstanceOf[SpinnerPopup]
  }
}

