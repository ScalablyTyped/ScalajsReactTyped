package typingsJapgolly.relayRuntime.requestSubscriptionMod

import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.Disposable
import typingsJapgolly.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/subscription/requestSubscription", "requestSubscription")
@js.native
object requestSubscription extends js.Object {
  def apply[TSubscriptionPayload](
    environment: Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload]
  ): Disposable = js.native
}

