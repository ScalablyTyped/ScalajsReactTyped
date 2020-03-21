package typingsJapgolly.firebase.mod.performance

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Performance extends js.Object {
  /**
    * Controls the logging of custom traces.
    */
  var dataCollectionEnabled: Boolean
  /**
    * Controls the logging of automatic traces and HTTP/S network monitoring.
    */
  var instrumentationEnabled: Boolean
  /**
    * Creates an uninitialized instance of {@link firebase.performance.Trace `trace`} and returns
    * it.
    *
    * @param traceName The name of the trace instance.
    * @return The Trace instance.
    */
  def trace(traceName: String): Trace
}

object Performance {
  @scala.inline
  def apply(
    dataCollectionEnabled: Boolean,
    instrumentationEnabled: Boolean,
    trace: String => CallbackTo[Trace]
  ): Performance = {
    val __obj = js.Dynamic.literal(dataCollectionEnabled = dataCollectionEnabled.asInstanceOf[js.Any], instrumentationEnabled = instrumentationEnabled.asInstanceOf[js.Any])
    __obj.updateDynamic("trace")(js.Any.fromFunction1((t0: java.lang.String) => trace(t0).runNow()))
    __obj.asInstanceOf[Performance]
  }
}

