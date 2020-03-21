package typingsJapgolly.apolloReactCommon.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apolloClient.mod.default
import typingsJapgolly.apolloClient.watchQueryOptionsMod.FetchPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseSubscriptionOptions[TData, TVariables] extends js.Object {
  var client: js.UndefOr[default[js.Object]] = js.undefined
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
  var onSubscriptionComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSubscriptionData: js.UndefOr[js.Function1[/* options */ OnSubscriptionDataOptions[TData], _]] = js.undefined
  var shouldResubscribe: js.UndefOr[
    Boolean | (js.Function1[/* options */ BaseSubscriptionOptions[TData, TVariables], Boolean])
  ] = js.undefined
  var skip: js.UndefOr[Boolean] = js.undefined
  var variables: js.UndefOr[TVariables] = js.undefined
}

object BaseSubscriptionOptions {
  @scala.inline
  def apply[TData, TVariables](
    client: default[js.Object] = null,
    fetchPolicy: FetchPolicy = null,
    onSubscriptionComplete: js.UndefOr[Callback] = js.undefined,
    onSubscriptionData: /* options */ OnSubscriptionDataOptions[TData] => CallbackTo[js.Any] = null,
    shouldResubscribe: Boolean | (js.Function1[/* options */ BaseSubscriptionOptions[TData, TVariables], Boolean]) = null,
    skip: js.UndefOr[Boolean] = js.undefined,
    variables: TVariables = null
  ): BaseSubscriptionOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    onSubscriptionComplete.foreach(p => __obj.updateDynamic("onSubscriptionComplete")(p.toJsFn))
    if (onSubscriptionData != null) __obj.updateDynamic("onSubscriptionData")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.apolloReactCommon.typesMod.OnSubscriptionDataOptions[TData]) => onSubscriptionData(t0).runNow()))
    if (shouldResubscribe != null) __obj.updateDynamic("shouldResubscribe")(shouldResubscribe.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseSubscriptionOptions[TData, TVariables]]
  }
}

