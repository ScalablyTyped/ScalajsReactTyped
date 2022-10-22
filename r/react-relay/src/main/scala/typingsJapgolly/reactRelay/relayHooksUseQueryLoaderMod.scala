package typingsJapgolly.reactRelay

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactRelay.relayHooksEntryPointTypesMod.EnvironmentProviderOptions
import typingsJapgolly.reactRelay.relayHooksEntryPointTypesMod.PreloadableConcreteRequest
import typingsJapgolly.reactRelay.relayHooksEntryPointTypesMod.PreloadedQuery
import typingsJapgolly.relayRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.DisposeFn
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.FetchPolicy
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.VariablesOf
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayHooksUseQueryLoaderMod {
  
  @JSImport("react-relay/relay-hooks/useQueryLoader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useQueryLoader[TQuery /* <: OperationType */](preloadableRequest: PreloadableConcreteRequest[TQuery]): useQueryLoaderHookType[TQuery] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueryLoader")(preloadableRequest.asInstanceOf[js.Any]).asInstanceOf[useQueryLoaderHookType[TQuery]]
  inline def useQueryLoader[TQuery /* <: OperationType */](
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    initialQueryReference: PreloadedQuery[TQuery, EnvironmentProviderOptions[Record[String, Any]]]
  ): useQueryLoaderHookType[TQuery] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQueryLoader")(preloadableRequest.asInstanceOf[js.Any], initialQueryReference.asInstanceOf[js.Any])).asInstanceOf[useQueryLoaderHookType[TQuery]]
  inline def useQueryLoader[TQuery /* <: OperationType */](preloadableRequest: GraphQLTaggedNode): useQueryLoaderHookType[TQuery] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueryLoader")(preloadableRequest.asInstanceOf[js.Any]).asInstanceOf[useQueryLoaderHookType[TQuery]]
  inline def useQueryLoader[TQuery /* <: OperationType */](
    preloadableRequest: GraphQLTaggedNode,
    initialQueryReference: PreloadedQuery[TQuery, EnvironmentProviderOptions[Record[String, Any]]]
  ): useQueryLoaderHookType[TQuery] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQueryLoader")(preloadableRequest.asInstanceOf[js.Any], initialQueryReference.asInstanceOf[js.Any])).asInstanceOf[useQueryLoaderHookType[TQuery]]
  
  /* Inlined react-relay.react-relay/relay-hooks/EntryPointTypes.LoadQueryOptions & std.Readonly<{  __environment :relay-runtime.relay-runtime.IEnvironment | null | undefined}> */
  trait UseQueryLoaderLoadQueryOptions extends StObject {
    
    val __environment: js.UndefOr[Environment | Null] = js.undefined
    
    val fetchPolicy: js.UndefOr[FetchPolicy | Null] = js.undefined
    
    val networkCacheConfig: js.UndefOr[CacheConfig | Null] = js.undefined
    
    val onQueryAstLoadTimeout: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  }
  object UseQueryLoaderLoadQueryOptions {
    
    inline def apply(): UseQueryLoaderLoadQueryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseQueryLoaderLoadQueryOptions]
    }
    
    extension [Self <: UseQueryLoaderLoadQueryOptions](x: Self) {
      
      inline def setFetchPolicy(value: FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
      
      inline def setFetchPolicyNull: Self = StObject.set(x, "fetchPolicy", null)
      
      inline def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
      
      inline def setNetworkCacheConfig(value: CacheConfig): Self = StObject.set(x, "networkCacheConfig", value.asInstanceOf[js.Any])
      
      inline def setNetworkCacheConfigNull: Self = StObject.set(x, "networkCacheConfig", null)
      
      inline def setNetworkCacheConfigUndefined: Self = StObject.set(x, "networkCacheConfig", js.undefined)
      
      inline def setOnQueryAstLoadTimeout(value: Callback): Self = StObject.set(x, "onQueryAstLoadTimeout", value.toJsFn)
      
      inline def setOnQueryAstLoadTimeoutNull: Self = StObject.set(x, "onQueryAstLoadTimeout", null)
      
      inline def setOnQueryAstLoadTimeoutUndefined: Self = StObject.set(x, "onQueryAstLoadTimeout", js.undefined)
      
      inline def set__environment(value: Environment): Self = StObject.set(x, "__environment", value.asInstanceOf[js.Any])
      
      inline def set__environmentNull: Self = StObject.set(x, "__environment", null)
      
      inline def set__environmentUndefined: Self = StObject.set(x, "__environment", js.undefined)
    }
  }
  
  type useQueryLoaderHookType[TQuery /* <: OperationType */] = js.Tuple3[
    js.UndefOr[(PreloadedQuery[TQuery, EnvironmentProviderOptions[Record[String, Any]]]) | Null], 
    js.Function2[
      /* variables */ VariablesOf[TQuery], 
      /* options */ js.UndefOr[UseQueryLoaderLoadQueryOptions], 
      Unit
    ], 
    DisposeFn
  ]
}
