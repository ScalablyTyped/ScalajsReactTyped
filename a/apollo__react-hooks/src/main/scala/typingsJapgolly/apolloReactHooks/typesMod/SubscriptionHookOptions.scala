package typingsJapgolly.apolloReactHooks.typesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apolloClient.mod.default
import typingsJapgolly.apolloClient.watchQueryOptionsMod.FetchPolicy
import typingsJapgolly.apolloReactCommon.typesMod.BaseSubscriptionOptions
import typingsJapgolly.apolloReactCommon.typesMod.OnSubscriptionDataOptions
import typingsJapgolly.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionHookOptions[TData, TVariables] extends BaseSubscriptionOptions[TData, TVariables] {
  var subscription: js.UndefOr[DocumentNode] = js.undefined
}

object SubscriptionHookOptions {
  @scala.inline
  def apply[TData, TVariables](
    client: default[js.Object] = null,
    fetchPolicy: FetchPolicy = null,
    onSubscriptionComplete: js.UndefOr[Callback] = js.undefined,
    onSubscriptionData: /* options */ OnSubscriptionDataOptions[TData] => CallbackTo[js.Any] = null,
    shouldResubscribe: Boolean | (js.Function1[/* options */ BaseSubscriptionOptions[TData, TVariables], Boolean]) = null,
    skip: js.UndefOr[Boolean] = js.undefined,
    subscription: DocumentNode = null,
    variables: TVariables = null
  ): SubscriptionHookOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    onSubscriptionComplete.foreach(p => __obj.updateDynamic("onSubscriptionComplete")(p.toJsFn))
    if (onSubscriptionData != null) __obj.updateDynamic("onSubscriptionData")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.apolloReactCommon.typesMod.OnSubscriptionDataOptions[TData]) => onSubscriptionData(t0).runNow()))
    if (shouldResubscribe != null) __obj.updateDynamic("shouldResubscribe")(shouldResubscribe.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionHookOptions[TData, TVariables]]
  }
}

