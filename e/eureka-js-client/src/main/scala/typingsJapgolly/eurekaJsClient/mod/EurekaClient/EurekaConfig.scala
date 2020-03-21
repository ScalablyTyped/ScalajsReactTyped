package typingsJapgolly.eurekaJsClient.mod.EurekaClient

import japgolly.scalajs.react.Callback
import typingsJapgolly.eurekaJsClient.AnonDebug
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EurekaConfig extends js.Object {
  var eureka: EurekaClientConfig
  var instance: EurekaInstanceConfig
  var logger: js.UndefOr[AnonDebug] = js.undefined
  var requestMiddleware: js.UndefOr[
    js.Function2[/* requestOpts */ js.Any, /* done */ js.Function1[/* opts */ js.Any, Unit], Unit]
  ] = js.undefined
  var shouldUseDelta: js.UndefOr[Boolean] = js.undefined
}

object EurekaConfig {
  @scala.inline
  def apply(
    eureka: EurekaClientConfig,
    instance: EurekaInstanceConfig,
    logger: AnonDebug = null,
    requestMiddleware: (/* requestOpts */ js.Any, /* done */ js.Function1[/* opts */ js.Any, Unit]) => Callback = null,
    shouldUseDelta: js.UndefOr[Boolean] = js.undefined
  ): EurekaConfig = {
    val __obj = js.Dynamic.literal(eureka = eureka.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (requestMiddleware != null) __obj.updateDynamic("requestMiddleware")(js.Any.fromFunction2((t0: /* requestOpts */ js.Any, t1: /* done */ js.Function1[/* opts */ js.Any, scala.Unit]) => requestMiddleware(t0, t1).runNow()))
    if (!js.isUndefined(shouldUseDelta)) __obj.updateDynamic("shouldUseDelta")(shouldUseDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[EurekaConfig]
  }
}

