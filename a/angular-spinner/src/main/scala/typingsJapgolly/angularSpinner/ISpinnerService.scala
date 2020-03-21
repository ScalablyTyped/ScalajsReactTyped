package typingsJapgolly.angularSpinner

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinnerService extends js.Object {
  /**
    * Start selected spinner
    *
    * @param spinner key
    */
  def spin(key: String): Unit
  /**
    * Stop selected spinner
    *
    * @param spinner key
    */
  def stop(key: String): Unit
}

object ISpinnerService {
  @scala.inline
  def apply(spin: String => Callback, stop: String => Callback): ISpinnerService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("spin")(js.Any.fromFunction1((t0: java.lang.String) => spin(t0).runNow()))
    __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: java.lang.String) => stop(t0).runNow()))
    __obj.asInstanceOf[ISpinnerService]
  }
}

