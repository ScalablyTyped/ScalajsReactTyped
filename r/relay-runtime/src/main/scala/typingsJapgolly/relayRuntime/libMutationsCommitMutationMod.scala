package typingsJapgolly.relayRuntime

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.relayRuntime.libMutationsRelayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.PayloadError
import typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.UploadableMap
import typingsJapgolly.relayRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.RecordSourceSelectorProxy
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.SelectorStoreUpdater
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMutationsCommitMutationMod {
  
  @JSImport("relay-runtime/lib/mutations/commitMutation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def commitMutation[TOperation /* <: MutationParameters */](
    environment: Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: MutationConfig[TOperation]
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("commitMutation")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  trait MutationConfig[TOperation /* <: MutationParameters */] extends StObject {
    
    var cacheConfig: js.UndefOr[CacheConfig] = js.undefined
    
    var configs: js.UndefOr[js.Array[DeclarativeMutationConfig]] = js.undefined
    
    var mutation: GraphQLTaggedNode
    
    var onCompleted: js.UndefOr[
        (js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ /* response */ js.Any, 
          /* errors */ js.UndefOr[js.Array[PayloadError] | Null], 
          Unit
        ]) | Null
      ] = js.undefined
    
    var onError: js.UndefOr[(js.Function1[/* error */ js.Error, Unit]) | Null] = js.undefined
    
    var onUnsubscribe: js.UndefOr[js.Function0[js.UndefOr[Unit | Null]]] = js.undefined
    
    /**
      * An object whose type matches the raw response type of the mutation. Make sure you decorate
      * your mutation with `@raw_response_type` if you are using this field.
      */
    var optimisticResponse: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: TOperation['rawResponse'] extends {} ? TOperation['rawResponse'] : never */ js.Any
      ] = js.undefined
    
    var optimisticUpdater: js.UndefOr[
        (SelectorStoreUpdater[
          /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
        ]) | Null
      ] = js.undefined
    
    var updater: js.UndefOr[
        (SelectorStoreUpdater[
          /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
        ]) | Null
      ] = js.undefined
    
    var uploadables: js.UndefOr[UploadableMap | Null] = js.undefined
    
    var variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
  }
  object MutationConfig {
    
    inline def apply[TOperation /* <: MutationParameters */](
      mutation: GraphQLTaggedNode,
      variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
    ): MutationConfig[TOperation] = {
      val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutationConfig[TOperation]]
    }
    
    extension [Self <: MutationConfig[?], TOperation /* <: MutationParameters */](x: Self & MutationConfig[TOperation]) {
      
      inline def setCacheConfig(value: CacheConfig): Self = StObject.set(x, "cacheConfig", value.asInstanceOf[js.Any])
      
      inline def setCacheConfigUndefined: Self = StObject.set(x, "cacheConfig", js.undefined)
      
      inline def setConfigs(value: js.Array[DeclarativeMutationConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
      
      inline def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
      
      inline def setConfigsVarargs(value: DeclarativeMutationConfig*): Self = StObject.set(x, "configs", js.Array(value*))
      
      inline def setMutation(value: GraphQLTaggedNode): Self = StObject.set(x, "mutation", value.asInstanceOf[js.Any])
      
      inline def setMutationCallbackTo(value: CallbackTo[ReaderFragment | ConcreteRequest]): Self = StObject.set(x, "mutation", value.toJsFn)
      
      inline def setOnCompleted(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ /* response */ js.Any, /* errors */ js.UndefOr[js.Array[PayloadError] | Null]) => Callback
      ): Self = StObject.set(x, "onCompleted", js.Any.fromFunction2((t0: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ /* response */ js.Any, t1: /* errors */ js.UndefOr[js.Array[PayloadError] | Null]) => (value(t0, t1)).runNow()))
      
      inline def setOnCompletedNull: Self = StObject.set(x, "onCompleted", null)
      
      inline def setOnCompletedUndefined: Self = StObject.set(x, "onCompleted", js.undefined)
      
      inline def setOnError(value: /* error */ js.Error => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* error */ js.Error) => value(t0).runNow()))
      
      inline def setOnErrorNull: Self = StObject.set(x, "onError", null)
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnUnsubscribe(value: CallbackTo[js.UndefOr[Unit | Null]]): Self = StObject.set(x, "onUnsubscribe", value.toJsFn)
      
      inline def setOnUnsubscribeUndefined: Self = StObject.set(x, "onUnsubscribe", js.undefined)
      
      inline def setOptimisticResponse(
        value: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['rawResponse'] extends {} ? TOperation['rawResponse'] : never */ js.Any
      ): Self = StObject.set(x, "optimisticResponse", value.asInstanceOf[js.Any])
      
      inline def setOptimisticResponseUndefined: Self = StObject.set(x, "optimisticResponse", js.undefined)
      
      inline def setOptimisticUpdater(
        value: (/* store */ RecordSourceSelectorProxy[
              /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
            ], /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any) => Callback
      ): Self = StObject.set(x, "optimisticUpdater", js.Any.fromFunction2((t0: /* store */ RecordSourceSelectorProxy[
              /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
            ], t1: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any) => (value(t0, t1)).runNow()))
      
      inline def setOptimisticUpdaterNull: Self = StObject.set(x, "optimisticUpdater", null)
      
      inline def setOptimisticUpdaterUndefined: Self = StObject.set(x, "optimisticUpdater", js.undefined)
      
      inline def setUpdater(
        value: (/* store */ RecordSourceSelectorProxy[
              /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
            ], /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any) => Callback
      ): Self = StObject.set(x, "updater", js.Any.fromFunction2((t0: /* store */ RecordSourceSelectorProxy[
              /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
            ], t1: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any) => (value(t0, t1)).runNow()))
      
      inline def setUpdaterNull: Self = StObject.set(x, "updater", null)
      
      inline def setUpdaterUndefined: Self = StObject.set(x, "updater", js.undefined)
      
      inline def setUploadables(value: UploadableMap): Self = StObject.set(x, "uploadables", value.asInstanceOf[js.Any])
      
      inline def setUploadablesNull: Self = StObject.set(x, "uploadables", null)
      
      inline def setUploadablesUndefined: Self = StObject.set(x, "uploadables", js.undefined)
      
      inline def setVariables(
        value: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
      ): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
  
  trait MutationParameters extends StObject {
    
    val rawResponse: js.UndefOr[js.Object] = js.undefined
  }
  object MutationParameters {
    
    inline def apply(): MutationParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MutationParameters]
    }
    
    extension [Self <: MutationParameters](x: Self) {
      
      inline def setRawResponse(value: js.Object): Self = StObject.set(x, "rawResponse", value.asInstanceOf[js.Any])
      
      inline def setRawResponseUndefined: Self = StObject.set(x, "rawResponse", js.undefined)
    }
  }
}
