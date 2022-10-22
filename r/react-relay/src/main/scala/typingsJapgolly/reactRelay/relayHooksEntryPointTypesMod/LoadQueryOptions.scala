package typingsJapgolly.reactRelay.relayHooksEntryPointTypesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.FetchPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  fetchPolicy :relay-runtime.relay-runtime.FetchPolicy | null | undefined,   networkCacheConfig :relay-runtime.relay-runtime.CacheConfig | null | undefined,   onQueryAstLoadTimeout :(): void | null | undefined}> */
trait LoadQueryOptions extends StObject {
  
  val fetchPolicy: js.UndefOr[FetchPolicy | Null] = js.undefined
  
  val networkCacheConfig: js.UndefOr[CacheConfig | Null] = js.undefined
  
  val onQueryAstLoadTimeout: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
}
object LoadQueryOptions {
  
  inline def apply(): LoadQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadQueryOptions]
  }
  
  extension [Self <: LoadQueryOptions](x: Self) {
    
    inline def setFetchPolicy(value: FetchPolicy): Self = StObject.set(x, "fetchPolicy", value.asInstanceOf[js.Any])
    
    inline def setFetchPolicyNull: Self = StObject.set(x, "fetchPolicy", null)
    
    inline def setFetchPolicyUndefined: Self = StObject.set(x, "fetchPolicy", js.undefined)
    
    inline def setNetworkCacheConfig(value: CacheConfig): Self = StObject.set(x, "networkCacheConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkCacheConfigNull: Self = StObject.set(x, "networkCacheConfig", null)
    
    inline def setNetworkCacheConfigUndefined: Self = StObject.set(x, "networkCacheConfig", js.undefined)
    
    inline def setOnQueryAstLoadTimeout(value: Callback): Self = StObject.set(x, "onQueryAstLoadTimeout", value.toJsFn)
    
    inline def setOnQueryAstLoadTimeoutNull: Self = StObject.set(x, "onQueryAstLoadTimeout", null)
    
    inline def setOnQueryAstLoadTimeoutUndefined: Self = StObject.set(x, "onQueryAstLoadTimeout", js.undefined)
  }
}
