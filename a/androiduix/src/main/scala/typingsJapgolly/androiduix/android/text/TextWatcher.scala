package typingsJapgolly.androiduix.android.text

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextWatcher extends js.Object {
  def afterTextChanged(s: String): Unit
  def beforeTextChanged(s: String, start: Double, count: Double, after: Double): Unit
  def onTextChanged(s: String, start: Double, before: Double, count: Double): Unit
}

object TextWatcher {
  @scala.inline
  def apply(
    afterTextChanged: String => Callback,
    beforeTextChanged: (String, Double, Double, Double) => Callback,
    onTextChanged: (String, Double, Double, Double) => Callback
  ): TextWatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("afterTextChanged")(js.Any.fromFunction1((t0: java.lang.String) => afterTextChanged(t0).runNow()))
    __obj.updateDynamic("beforeTextChanged")(js.Any.fromFunction4((t0: java.lang.String, t1: scala.Double, t2: scala.Double, t3: scala.Double) => beforeTextChanged(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("onTextChanged")(js.Any.fromFunction4((t0: java.lang.String, t1: scala.Double, t2: scala.Double, t3: scala.Double) => onTextChanged(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[TextWatcher]
  }
}

