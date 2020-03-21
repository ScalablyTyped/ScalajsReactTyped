package typingsJapgolly.angularIdle.mod.idle

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Keepalive will use a timeout to periodically wake, broadcast a Keepalive event on the root scope,
  * and optionally make an $http request. By default, the Idle service will stop and start Keepalive
  * when a user becomes idle or returns from idle, respectively. It is also started automatically when
  * Idle.watch() is called. This can be disabled by configuring the IdleProvider.
  */
trait IKeepAliveService extends js.Object {
  /**
    * Performs one ping only.
    */
  def ping(): Unit
  /**
    * Changes the interval value at runtime.
    * You will need to restart the pinging process by calling start() manually for the changes to be reflected.
    */
  def setInterval(seconds: Double): Unit
  /**
    * Starts pinging periodically until stop() is called.
    */
  def start(): Unit
  /**
    * Stops pinging.
    */
  def stop(): Unit
}

object IKeepAliveService {
  @scala.inline
  def apply(ping: Callback, setInterval: Double => Callback, start: Callback, stop: Callback): IKeepAliveService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ping")(ping.toJsFn)
    __obj.updateDynamic("setInterval")(js.Any.fromFunction1((t0: scala.Double) => setInterval(t0).runNow()))
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[IKeepAliveService]
  }
}

