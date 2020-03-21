package typingsJapgolly.autobahn.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.when.When.Promise_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnectionOptions extends js.Object {
  var authid: js.UndefOr[String] = js.undefined
  var authmethods: js.UndefOr[js.Array[String]] = js.undefined
  var initial_retry_delay: js.UndefOr[Double] = js.undefined
  var max_retries: js.UndefOr[Double] = js.undefined
  var max_retry_delay: js.UndefOr[Double] = js.undefined
  var onchallenge: js.UndefOr[OnChallengeHandler] = js.undefined
  var protocols: js.UndefOr[js.Array[String]] = js.undefined
  var realm: String
  var retry_delay_growth: js.UndefOr[Double] = js.undefined
  var retry_delay_jitter: js.UndefOr[Double] = js.undefined
  var retry_if_unreachable: js.UndefOr[Boolean] = js.undefined
  var transports: js.UndefOr[js.Array[ITransportDefinition]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  // use explicit deferred factory, e.g. jQuery.Deferred or Q.defer
  var use_deferred: js.UndefOr[DeferFactory] = js.undefined
  var use_es6_promises: js.UndefOr[Boolean] = js.undefined
}

object IConnectionOptions {
  @scala.inline
  def apply(
    realm: String,
    authid: String = null,
    authmethods: js.Array[String] = null,
    initial_retry_delay: Int | Double = null,
    max_retries: Int | Double = null,
    max_retry_delay: Int | Double = null,
    onchallenge: (/* session */ Session, /* method */ String, /* extra */ js.Any) => CallbackTo[String | Promise_[String]] = null,
    protocols: js.Array[String] = null,
    retry_delay_growth: Int | Double = null,
    retry_delay_jitter: Int | Double = null,
    retry_if_unreachable: js.UndefOr[Boolean] = js.undefined,
    transports: js.Array[ITransportDefinition] = null,
    url: String = null,
    use_deferred: js.UndefOr[CallbackTo[Promise_[js.Any]]] = js.undefined,
    use_es6_promises: js.UndefOr[Boolean] = js.undefined
  ): IConnectionOptions = {
    val __obj = js.Dynamic.literal(realm = realm.asInstanceOf[js.Any])
    if (authid != null) __obj.updateDynamic("authid")(authid.asInstanceOf[js.Any])
    if (authmethods != null) __obj.updateDynamic("authmethods")(authmethods.asInstanceOf[js.Any])
    if (initial_retry_delay != null) __obj.updateDynamic("initial_retry_delay")(initial_retry_delay.asInstanceOf[js.Any])
    if (max_retries != null) __obj.updateDynamic("max_retries")(max_retries.asInstanceOf[js.Any])
    if (max_retry_delay != null) __obj.updateDynamic("max_retry_delay")(max_retry_delay.asInstanceOf[js.Any])
    if (onchallenge != null) __obj.updateDynamic("onchallenge")(js.Any.fromFunction3((t0: /* session */ typingsJapgolly.autobahn.mod.Session, t1: /* method */ java.lang.String, t2: /* extra */ js.Any) => onchallenge(t0, t1, t2).runNow()))
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (retry_delay_growth != null) __obj.updateDynamic("retry_delay_growth")(retry_delay_growth.asInstanceOf[js.Any])
    if (retry_delay_jitter != null) __obj.updateDynamic("retry_delay_jitter")(retry_delay_jitter.asInstanceOf[js.Any])
    if (!js.isUndefined(retry_if_unreachable)) __obj.updateDynamic("retry_if_unreachable")(retry_if_unreachable.asInstanceOf[js.Any])
    if (transports != null) __obj.updateDynamic("transports")(transports.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    use_deferred.foreach(p => __obj.updateDynamic("use_deferred")(p.toJsFn))
    if (!js.isUndefined(use_es6_promises)) __obj.updateDynamic("use_es6_promises")(use_es6_promises.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectionOptions]
  }
}

