package typingsJapgolly.reactRelay.relayHooksEntryPointTypesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.relayRuntime.libNetworkRelayNetworkTypesMod.GraphQLResponse
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.DisposeFn
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.VariablesOf
import typingsJapgolly.relayRuntime.mod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Readonly<{  kind :'PreloadedQuery',   environment :relay-runtime.relay-runtime.IEnvironment,   environmentProviderOptions :TEnvironmentProviderOptions | null | undefined,   fetchKey :string | number,   fetchPolicy :react-relay.react-relay/relay-hooks/EntryPointTypes.PreloadFetchPolicy,   networkCacheConfig :relay-runtime.relay-runtime.CacheConfig | null | undefined,   id :string | null | undefined,   name :string,   source :relay-runtime.relay-runtime.Observable<relay-runtime.relay-runtime.GraphQLResponse> | null | undefined,   variables :relay-runtime.relay-runtime.VariablesOf<TQuery>,   dispose :relay-runtime.relay-runtime.DisposeFn,   isDisposed :boolean}> */
trait PreloadedQuery[TQuery /* <: OperationType */, TEnvironmentProviderOptions] extends StObject {
  
  val dispose: DisposeFn
  
  val environment: Environment
  
  val environmentProviderOptions: js.UndefOr[TEnvironmentProviderOptions | Null] = js.undefined
  
  val fetchKey: String | Double
  
  val fetchPolicy: PreloadFetchPolicy
  
  val id: js.UndefOr[String | Null] = js.undefined
  
  val isDisposed: Boolean
  
  val kind: typingsJapgolly.reactRelay.reactRelayStrings.PreloadedQuery
  
  val name: String
  
  val networkCacheConfig: js.UndefOr[CacheConfig | Null] = js.undefined
  
  val source: js.UndefOr[Observable[GraphQLResponse] | Null] = js.undefined
  
  val variables: VariablesOf[TQuery]
}
object PreloadedQuery {
  
  inline def apply[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
    dispose: Callback,
    environment: Environment,
    fetchKey: String | Double,
    fetchPolicy: PreloadFetchPolicy,
    isDisposed: Boolean,
    name: String,
    variables: VariablesOf[TQuery]
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, environment = environment.asInstanceOf[js.Any], fetchKey = fetchKey.asInstanceOf[js.Any], fetchPolicy = fetchPolicy.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], kind = "PreloadedQuery", name = name.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadedQuery[TQuery, TEnvironmentProviderOptions]]
  }
  
  extension [Self <: PreloadedQuery[?, ?], TQuery /* <: OperationType */, TEnvironmentProviderOptions](x: Self & (PreloadedQuery[TQuery, TEnvironmentProviderOptions])) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentProviderOptions(value: TEnvironmentProviderOptions): Self = StObject.set(x, "environmentProviderOptions", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentProviderOptionsNull: Self = StObject.set(x, "environmentProviderOptions", null)
    
    inline def setEnvironmentProviderOptionsUndefined: Self = StObject.set(x, "environmentProviderOptions", js.undefined)
    
    inline def setFetchKey(value: String | Double): Self = StObject.set(x, "fetchKey", value.asInstanceOf[js.Any])
    
    inline def setFetchPolicy(value: PreloadFetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
    
    inline def setKind(value: typingsJapgolly.reactRelay.reactRelayStrings.PreloadedQuery): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNetworkCacheConfig(value: CacheConfig): Self = StObject.set(x, "networkCacheConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkCacheConfigNull: Self = StObject.set(x, "networkCacheConfig", null)
    
    inline def setNetworkCacheConfigUndefined: Self = StObject.set(x, "networkCacheConfig", js.undefined)
    
    inline def setSource(value: Observable[GraphQLResponse]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVariables(value: VariablesOf[TQuery]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
