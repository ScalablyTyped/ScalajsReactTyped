package typingsJapgolly.ngCordova.ngCordova

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastService extends js.Object {
  def show(message: String, duration: String, position: String): js.Any
  def showLongBottom(message: String): js.Any
  def showLongCenter(message: String): js.Any
  def showLongTop(message: String): js.Any
  def showShortBottom(message: String): js.Any
  def showShortCenter(message: String): js.Any
  def showShortTop(message: String): js.Any
}

object IToastService {
  @scala.inline
  def apply(
    show: (String, String, String) => CallbackTo[js.Any],
    showLongBottom: String => CallbackTo[js.Any],
    showLongCenter: String => CallbackTo[js.Any],
    showLongTop: String => CallbackTo[js.Any],
    showShortBottom: String => CallbackTo[js.Any],
    showShortCenter: String => CallbackTo[js.Any],
    showShortTop: String => CallbackTo[js.Any]
  ): IToastService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("show")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => show(t0, t1, t2).runNow()))
    __obj.updateDynamic("showLongBottom")(js.Any.fromFunction1((t0: java.lang.String) => showLongBottom(t0).runNow()))
    __obj.updateDynamic("showLongCenter")(js.Any.fromFunction1((t0: java.lang.String) => showLongCenter(t0).runNow()))
    __obj.updateDynamic("showLongTop")(js.Any.fromFunction1((t0: java.lang.String) => showLongTop(t0).runNow()))
    __obj.updateDynamic("showShortBottom")(js.Any.fromFunction1((t0: java.lang.String) => showShortBottom(t0).runNow()))
    __obj.updateDynamic("showShortCenter")(js.Any.fromFunction1((t0: java.lang.String) => showShortCenter(t0).runNow()))
    __obj.updateDynamic("showShortTop")(js.Any.fromFunction1((t0: java.lang.String) => showShortTop(t0).runNow()))
    __obj.asInstanceOf[IToastService]
  }
}

