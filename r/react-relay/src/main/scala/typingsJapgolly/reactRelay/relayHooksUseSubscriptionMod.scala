package typingsJapgolly.reactRelay

import typingsJapgolly.reactRelay.anon.FnCall
import typingsJapgolly.relayRuntime.libSubscriptionRequestSubscriptionMod.GraphQLSubscriptionConfig
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayHooksUseSubscriptionMod {
  
  @JSImport("react-relay/relay-hooks/useSubscription", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useSubscription[TSubscriptionPayload /* <: OperationType */](
    // The actual subtype of OperationType is required to allow for type inference inside GraphQLSubscriptionConfig.s
  // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useSubscription")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useSubscription[TSubscriptionPayload /* <: OperationType */](
    // The actual subtype of OperationType is required to allow for type inference inside GraphQLSubscriptionConfig.s
  // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscriptionPayload],
    requestSubscriptionFn: FnCall
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useSubscription")(config.asInstanceOf[js.Any], requestSubscriptionFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
