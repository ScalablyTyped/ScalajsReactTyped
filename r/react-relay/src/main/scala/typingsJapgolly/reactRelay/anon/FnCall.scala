package typingsJapgolly.reactRelay.anon

import typingsJapgolly.relayRuntime.libSubscriptionRequestSubscriptionMod.GraphQLSubscriptionConfig
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Disposable
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply[TSubscription /* <: OperationType */](
    environment: typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscription]
  ): Disposable = js.native
}
