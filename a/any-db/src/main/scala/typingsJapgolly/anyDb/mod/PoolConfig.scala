package typingsJapgolly.anyDb.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoolConfig extends js.Object {
  /**
    * (default 30000) The maximum amount of time a connection can sit idle in the pool before being reaped
    */
  var idleTimeout: js.UndefOr[Double] = js.undefined
  /**
    * max (default 10) The maximum number of connections to keep open in the pool.
    * When this limit is reached further requests for connections will queue waiting
    * for an existing connection to be released back into the pool.
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * min (default 0) The minimum number of connections to keep open in the pool.
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * Called immediately after a connection is first established. Use this to do one-time setup of new connections.
    * The supplied Connection will not be added to the pool until you pass it to the done continuation.
    */
  var onConnect: js.UndefOr[
    js.Function2[
      /* connection */ Connection, 
      /* ready */ js.Function2[/* error */ js.Error, /* result */ Connection, Unit], 
      Unit
    ]
  ] = js.undefined
  /**
    *  (default 1000) How frequently the pool should check for connections that are old enough to be reaped.
    */
  var reapInterval: js.UndefOr[Double] = js.undefined
  /**
    * (default true) When this is true, the pool will reap connections that
    * have been idle for more than idleTimeout milliseconds.
    */
  var refreshIdle: js.UndefOr[Boolean] = js.undefined
  /**
    * Called each time a connection is returned to the pool. Use this to restore a connection to
    * it's original state (e.g. rollback transactions, set the database session vars). If reset
    * fails to call the done continuation the connection will be lost in limbo.
    */
  var reset: js.UndefOr[
    js.Function2[
      /* connection */ Connection, 
      /* done */ js.Function1[/* error */ js.Error, Unit], 
      Unit
    ]
  ] = js.undefined
  /**
    * (default function (err) { return true }) - Called when an error is encountered
    * by pool.query or emitted by an idle connection. If shouldDestroyConnection(error)
    * is truthy the connection will be destroyed, otherwise it will be reset.
    */
  var shouldDestroyConnection: js.UndefOr[js.Function1[/* error */ js.Error, Boolean]] = js.undefined
}

object PoolConfig {
  @scala.inline
  def apply(
    idleTimeout: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onConnect: (/* connection */ Connection, /* ready */ js.Function2[/* error */ js.Error, /* result */ Connection, Unit]) => Callback = null,
    reapInterval: Int | Double = null,
    refreshIdle: js.UndefOr[Boolean] = js.undefined,
    reset: (/* connection */ Connection, /* done */ js.Function1[/* error */ js.Error, Unit]) => Callback = null,
    shouldDestroyConnection: /* error */ js.Error => CallbackTo[Boolean] = null
  ): PoolConfig = {
    val __obj = js.Dynamic.literal()
    if (idleTimeout != null) __obj.updateDynamic("idleTimeout")(idleTimeout.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onConnect != null) __obj.updateDynamic("onConnect")(js.Any.fromFunction2((t0: /* connection */ typingsJapgolly.anyDb.mod.Connection, t1: /* ready */ js.Function2[/* error */ js.Error, /* result */ typingsJapgolly.anyDb.mod.Connection, scala.Unit]) => onConnect(t0, t1).runNow()))
    if (reapInterval != null) __obj.updateDynamic("reapInterval")(reapInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshIdle)) __obj.updateDynamic("refreshIdle")(refreshIdle.asInstanceOf[js.Any])
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction2((t0: /* connection */ typingsJapgolly.anyDb.mod.Connection, t1: /* done */ js.Function1[/* error */ js.Error, scala.Unit]) => reset(t0, t1).runNow()))
    if (shouldDestroyConnection != null) __obj.updateDynamic("shouldDestroyConnection")(js.Any.fromFunction1((t0: /* error */ js.Error) => shouldDestroyConnection(t0).runNow()))
    __obj.asInstanceOf[PoolConfig]
  }
}

