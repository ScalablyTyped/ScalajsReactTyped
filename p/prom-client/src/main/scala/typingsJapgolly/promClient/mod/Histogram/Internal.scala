package typingsJapgolly.promClient.mod.Histogram

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.promClient.mod.labelValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Internal extends js.Object {
  /**
  		 * Observe value
  		 * @param value The value to observe
  		 */
  def observe(value: Double): Unit
  /**
  		 * Start a timer where the value in seconds will observed
  		 * @param labels Object with label keys and values
  		 * @return Function to invoke when timer should be stopped
  		 */
  def startTimer(): js.Function1[/* labels */ js.UndefOr[labelValues], Unit]
}

object Internal {
  @scala.inline
  def apply(
    observe: Double => Callback,
    startTimer: CallbackTo[js.Function1[/* labels */ js.UndefOr[labelValues], Unit]]
  ): Internal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("observe")(js.Any.fromFunction1((t0: scala.Double) => observe(t0).runNow()))
    __obj.updateDynamic("startTimer")(startTimer.toJsFn)
    __obj.asInstanceOf[Internal]
  }
}

