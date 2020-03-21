package typingsJapgolly.relayRuntime.applyOptimisticMutationMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.relayRuntime.relayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typingsJapgolly.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Variables
import typingsJapgolly.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typingsJapgolly.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimisticMutationConfig extends js.Object {
  var configs: js.UndefOr[js.Array[DeclarativeMutationConfig] | Null] = js.undefined
  var mutation: GraphQLTaggedNode
  var optimisticResponse: js.UndefOr[js.Object] = js.undefined
  var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
  var variables: Variables
}

object OptimisticMutationConfig {
  @scala.inline
  def apply(
    mutation: GraphQLTaggedNode,
    variables: Variables,
    configs: js.Array[DeclarativeMutationConfig] = null,
    optimisticResponse: js.Object = null,
    optimisticUpdater: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Callback = null
  ): OptimisticMutationConfig = {
    val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (configs != null) __obj.updateDynamic("configs")(configs.asInstanceOf[js.Any])
    if (optimisticResponse != null) __obj.updateDynamic("optimisticResponse")(optimisticResponse.asInstanceOf[js.Any])
    if (optimisticUpdater != null) __obj.updateDynamic("optimisticUpdater")(js.Any.fromFunction2((t0: /* store */ typingsJapgolly.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy[js.Object], t1: js.Object) => optimisticUpdater(t0, t1).runNow()))
    __obj.asInstanceOf[OptimisticMutationConfig]
  }
}

