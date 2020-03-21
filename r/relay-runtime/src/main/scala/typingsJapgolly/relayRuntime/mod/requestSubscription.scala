package typingsJapgolly.relayRuntime.mod

import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Disposable
import typingsJapgolly.relayRuntime.requestSubscriptionMod.GraphQLSubscriptionConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "requestSubscription")
@js.native
object requestSubscription extends js.Object {
  def apply[TSubscriptionPayload](
    environment: typingsJapgolly.relayRuntime.relayStoreTypesMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload]
  ): Disposable = js.native
}

