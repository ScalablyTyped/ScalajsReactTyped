package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.perf

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseBooleans.`false`
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trace extends js.Object {
  /**
    * Return an attribute by name, or null if it does not exist.
    */
  def getAttribute(attribute: String): js.Promise[String | Null]
  /**
    * Return an object of key-value attributes.
    */
  def getAttributes(): js.Promise[js.Object]
  /**
    * Get a metric by name. Returns 0 if it does not exist.
    */
  def getMetric(metricName: String): js.Promise[Double]
  /**
    * Increment a metric by name and value.
    */
  def incrementMetric(metricName: String, incrementBy: Double): js.Promise[Null]
  /**
    * Set an attribute. Returns true if it was set, false if it was not.
    */
  def putAttribute(attribute: String, value: String): js.Promise[`true` | `false`]
  /**
    * Set a metric.
    */
  def putMetric(metricName: String, value: Double): js.Promise[Null]
  /**
    * Remove an attribute by name.
    */
  def removeAttribute(attribute: String): js.Promise[Null]
  /**
    * Start a Trace instance.
    */
  def start(): js.Promise[Null]
  /**
    * Stop a Trace instance.
    */
  def stop(): js.Promise[Null]
}

object Trace {
  @scala.inline
  def apply(
    getAttribute: String => CallbackTo[js.Promise[String | Null]],
    getAttributes: CallbackTo[js.Promise[js.Object]],
    getMetric: String => CallbackTo[js.Promise[Double]],
    incrementMetric: (String, Double) => CallbackTo[js.Promise[Null]],
    putAttribute: (String, String) => CallbackTo[js.Promise[`true` | `false`]],
    putMetric: (String, Double) => CallbackTo[js.Promise[Null]],
    removeAttribute: String => CallbackTo[js.Promise[Null]],
    start: CallbackTo[js.Promise[Null]],
    stop: CallbackTo[js.Promise[Null]]
  ): Trace = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAttribute")(js.Any.fromFunction1((t0: java.lang.String) => getAttribute(t0).runNow()))
    __obj.updateDynamic("getAttributes")(getAttributes.toJsFn)
    __obj.updateDynamic("getMetric")(js.Any.fromFunction1((t0: java.lang.String) => getMetric(t0).runNow()))
    __obj.updateDynamic("incrementMetric")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => incrementMetric(t0, t1).runNow()))
    __obj.updateDynamic("putAttribute")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => putAttribute(t0, t1).runNow()))
    __obj.updateDynamic("putMetric")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => putMetric(t0, t1).runNow()))
    __obj.updateDynamic("removeAttribute")(js.Any.fromFunction1((t0: java.lang.String) => removeAttribute(t0).runNow()))
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[Trace]
  }
}

