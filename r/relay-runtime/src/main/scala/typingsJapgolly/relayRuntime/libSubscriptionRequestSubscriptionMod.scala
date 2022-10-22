package typingsJapgolly.relayRuntime

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.relayRuntime.libMutationsRelayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typingsJapgolly.relayRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.RecordSourceSelectorProxy
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.SelectorStoreUpdater
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Disposable
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSubscriptionRequestSubscriptionMod {
  
  @JSImport("relay-runtime/lib/subscription/requestSubscription", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def requestSubscription[TSubscription /* <: OperationType */](
    environment: Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscription]
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("requestSubscription")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  trait GraphQLSubscriptionConfig[TSubscription /* <: OperationType */] extends StObject {
    
    var configs: js.UndefOr[js.Array[DeclarativeMutationConfig]] = js.undefined
    
    var onCompleted: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    var onNext: js.UndefOr[
        js.Function1[
          /* response */ js.UndefOr[
            (/* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any) | Null
          ], 
          Unit
        ]
      ] = js.undefined
    
    var subscription: GraphQLTaggedNode
    
    var updater: js.UndefOr[
        SelectorStoreUpdater[
          /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any
        ]
      ] = js.undefined
    
    var variables: /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['variables'] */ js.Any
  }
  object GraphQLSubscriptionConfig {
    
    inline def apply[TSubscription /* <: OperationType */](
      subscription: GraphQLTaggedNode,
      variables: /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['variables'] */ js.Any
    ): GraphQLSubscriptionConfig[TSubscription] = {
      val __obj = js.Dynamic.literal(subscription = subscription.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLSubscriptionConfig[TSubscription]]
    }
    
    extension [Self <: GraphQLSubscriptionConfig[?], TSubscription /* <: OperationType */](x: Self & GraphQLSubscriptionConfig[TSubscription]) {
      
      inline def setConfigs(value: js.Array[DeclarativeMutationConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
      
      inline def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
      
      inline def setConfigsVarargs(value: DeclarativeMutationConfig*): Self = StObject.set(x, "configs", js.Array(value*))
      
      inline def setOnCompleted(value: Callback): Self = StObject.set(x, "onCompleted", value.toJsFn)
      
      inline def setOnCompletedUndefined: Self = StObject.set(x, "onCompleted", js.undefined)
      
      inline def setOnError(value: /* error */ js.Error => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* error */ js.Error) => value(t0).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnNext(
        value: /* response */ js.UndefOr[
              (/* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any) | Null
            ] => Callback
      ): Self = StObject.set(x, "onNext", js.Any.fromFunction1((t0: /* response */ js.UndefOr[
              (/* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any) | Null
            ]) => value(t0).runNow()))
      
      inline def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
      
      inline def setSubscription(value: GraphQLTaggedNode): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionCallbackTo(value: CallbackTo[ReaderFragment | ConcreteRequest]): Self = StObject.set(x, "subscription", value.toJsFn)
      
      inline def setUpdater(
        value: (/* store */ RecordSourceSelectorProxy[
              /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any
            ], /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any) => Callback
      ): Self = StObject.set(x, "updater", js.Any.fromFunction2((t0: /* store */ RecordSourceSelectorProxy[
              /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any
            ], t1: /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any) => (value(t0, t1)).runNow()))
      
      inline def setUpdaterUndefined: Self = StObject.set(x, "updater", js.undefined)
      
      inline def setVariables(
        value: /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['variables'] */ js.Any
      ): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
}
