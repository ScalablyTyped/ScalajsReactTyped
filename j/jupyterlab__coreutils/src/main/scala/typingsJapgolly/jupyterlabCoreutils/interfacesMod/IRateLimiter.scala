package typingsJapgolly.jupyterlabCoreutils.interfacesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRateLimiter[T, U] extends IDisposable {
  /**
    * The rate limit in milliseconds.
    */
  val limit: Double
  /**
    * Invoke the rate limited function.
    */
  def invoke(): js.Promise[T]
  /**
    * Stop the function if it is mid-flight.
    */
  def stop(): js.Promise[Unit]
}

object IRateLimiter {
  @scala.inline
  def apply[T, U](
    dispose: Callback,
    invoke: CallbackTo[js.Promise[T]],
    isDisposed: Boolean,
    limit: Double,
    stop: CallbackTo[js.Promise[Unit]]
  ): IRateLimiter[T, U] = {
    val __obj = js.Dynamic.literal(isDisposed = isDisposed.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("invoke")(invoke.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[IRateLimiter[T, U]]
  }
}

