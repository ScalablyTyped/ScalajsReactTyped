package typingsJapgolly.ioredis.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterOptions extends js.Object {
  var clusterRetryStrategy: js.UndefOr[
    js.Function2[/* times */ Double, /* reason */ js.UndefOr[js.Error], Double | Null]
  ] = js.undefined
  var dnsLookup: js.UndefOr[DNSLookupFunction] = js.undefined
  var enableOfflineQueue: js.UndefOr[Boolean] = js.undefined
  var enableReadyCheck: js.UndefOr[Boolean] = js.undefined
  var lazyConnect: js.UndefOr[Boolean] = js.undefined
  var maxRedirections: js.UndefOr[Double] = js.undefined
  var natMap: js.UndefOr[NatMap] = js.undefined
  var redisOptions: js.UndefOr[RedisOptions] = js.undefined
  var retryDelayOnClusterDown: js.UndefOr[Double] = js.undefined
  var retryDelayOnFailover: js.UndefOr[Double] = js.undefined
  var retryDelayOnTryAgain: js.UndefOr[Double] = js.undefined
  var scaleReads: js.UndefOr[String] = js.undefined
  var slotsRefreshInterval: js.UndefOr[Double] = js.undefined
  var slotsRefreshTimeout: js.UndefOr[Double] = js.undefined
}

object ClusterOptions {
  @scala.inline
  def apply(
    clusterRetryStrategy: (/* times */ Double, /* reason */ js.UndefOr[js.Error]) => CallbackTo[Double | Null] = null,
    dnsLookup: (/* hostname */ String, /* callback */ js.Function3[/* err */ ErrnoException, /* address */ String, /* family */ Double, Unit]) => Callback = null,
    enableOfflineQueue: js.UndefOr[Boolean] = js.undefined,
    enableReadyCheck: js.UndefOr[Boolean] = js.undefined,
    lazyConnect: js.UndefOr[Boolean] = js.undefined,
    maxRedirections: Int | Double = null,
    natMap: NatMap = null,
    redisOptions: RedisOptions = null,
    retryDelayOnClusterDown: Int | Double = null,
    retryDelayOnFailover: Int | Double = null,
    retryDelayOnTryAgain: Int | Double = null,
    scaleReads: String = null,
    slotsRefreshInterval: Int | Double = null,
    slotsRefreshTimeout: Int | Double = null
  ): ClusterOptions = {
    val __obj = js.Dynamic.literal()
    if (clusterRetryStrategy != null) __obj.updateDynamic("clusterRetryStrategy")(js.Any.fromFunction2((t0: /* times */ scala.Double, t1: /* reason */ js.UndefOr[js.Error]) => clusterRetryStrategy(t0, t1).runNow()))
    if (dnsLookup != null) __obj.updateDynamic("dnsLookup")(js.Any.fromFunction2((t0: /* hostname */ java.lang.String, t1: /* callback */ js.Function3[
  /* err */ typingsJapgolly.node.NodeJS.ErrnoException, 
  /* address */ java.lang.String, 
  /* family */ scala.Double, 
  scala.Unit]) => dnsLookup(t0, t1).runNow()))
    if (!js.isUndefined(enableOfflineQueue)) __obj.updateDynamic("enableOfflineQueue")(enableOfflineQueue.asInstanceOf[js.Any])
    if (!js.isUndefined(enableReadyCheck)) __obj.updateDynamic("enableReadyCheck")(enableReadyCheck.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyConnect)) __obj.updateDynamic("lazyConnect")(lazyConnect.asInstanceOf[js.Any])
    if (maxRedirections != null) __obj.updateDynamic("maxRedirections")(maxRedirections.asInstanceOf[js.Any])
    if (natMap != null) __obj.updateDynamic("natMap")(natMap.asInstanceOf[js.Any])
    if (redisOptions != null) __obj.updateDynamic("redisOptions")(redisOptions.asInstanceOf[js.Any])
    if (retryDelayOnClusterDown != null) __obj.updateDynamic("retryDelayOnClusterDown")(retryDelayOnClusterDown.asInstanceOf[js.Any])
    if (retryDelayOnFailover != null) __obj.updateDynamic("retryDelayOnFailover")(retryDelayOnFailover.asInstanceOf[js.Any])
    if (retryDelayOnTryAgain != null) __obj.updateDynamic("retryDelayOnTryAgain")(retryDelayOnTryAgain.asInstanceOf[js.Any])
    if (scaleReads != null) __obj.updateDynamic("scaleReads")(scaleReads.asInstanceOf[js.Any])
    if (slotsRefreshInterval != null) __obj.updateDynamic("slotsRefreshInterval")(slotsRefreshInterval.asInstanceOf[js.Any])
    if (slotsRefreshTimeout != null) __obj.updateDynamic("slotsRefreshTimeout")(slotsRefreshTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOptions]
  }
}

