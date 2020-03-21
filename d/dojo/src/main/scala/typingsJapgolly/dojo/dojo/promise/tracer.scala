package typingsJapgolly.dojo.dojo.promise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/promise/tracer.html
  *
  * Trace promise fulfillment.
  * Trace promise fulfillment. Calling .trace() or .traceError() on a
  * promise enables tracing. Will emit resolved, rejected or progress
  * events.
  *
  */
trait tracer extends js.Object {
  /**
    * Subscribe to traces.
    * See dojo/Evented#on().
    *
    * @param type resolved, rejected, or progress
    * @param listener The listener is passed the traced value and any argumentsthat were used with the .trace() call.
    */
  def on(`type`: String, listener: js.Function): Unit
}

object tracer {
  @scala.inline
  def apply(on: (String, js.Function) => japgolly.scalajs.react.Callback): tracer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function) => on(t0, t1).runNow()))
    __obj.asInstanceOf[tracer]
  }
}

