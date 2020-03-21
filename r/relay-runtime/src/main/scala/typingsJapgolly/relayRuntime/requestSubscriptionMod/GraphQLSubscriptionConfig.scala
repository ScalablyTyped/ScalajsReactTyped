package typingsJapgolly.relayRuntime.requestSubscriptionMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.relayRuntime.relayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typingsJapgolly.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import typingsJapgolly.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typingsJapgolly.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLSubscriptionConfig[TSubscriptionPayload] extends js.Object {
  var configs: js.UndefOr[js.Array[DeclarativeMutationConfig]] = js.undefined
  var onCompleted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  var onNext: js.UndefOr[js.Function1[/* response */ js.UndefOr[TSubscriptionPayload | Null], Unit]] = js.undefined
  var subscription: GraphQLTaggedNode
  var updater: js.UndefOr[SelectorStoreUpdater[TSubscriptionPayload]] = js.undefined
  var variables: Variables
}

object GraphQLSubscriptionConfig {
  @scala.inline
  def apply[TSubscriptionPayload](
    subscription: GraphQLTaggedNode,
    variables: Variables,
    configs: js.Array[DeclarativeMutationConfig] = null,
    onCompleted: js.UndefOr[Callback] = js.undefined,
    onError: /* error */ js.Error => Callback = null,
    onNext: /* response */ js.UndefOr[TSubscriptionPayload | Null] => Callback = null,
    updater: (/* store */ RecordSourceSelectorProxy[TSubscriptionPayload], TSubscriptionPayload) => Callback = null
  ): GraphQLSubscriptionConfig[TSubscriptionPayload] = {
    val __obj = js.Dynamic.literal(subscription = subscription.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (configs != null) __obj.updateDynamic("configs")(configs.asInstanceOf[js.Any])
    onCompleted.foreach(p => __obj.updateDynamic("onCompleted")(p.toJsFn))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onError(t0).runNow()))
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction1((t0: /* response */ js.UndefOr[TSubscriptionPayload | scala.Null]) => onNext(t0).runNow()))
    if (updater != null) __obj.updateDynamic("updater")(js.Any.fromFunction2((t0: /* store */ typingsJapgolly.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy[TSubscriptionPayload], t1: TSubscriptionPayload) => updater(t0, t1).runNow()))
    __obj.asInstanceOf[GraphQLSubscriptionConfig[TSubscriptionPayload]]
  }
}

