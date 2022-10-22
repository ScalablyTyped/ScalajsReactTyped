package typingsJapgolly.reactRelay.relayHooksEntryPointTypesMod

import typingsJapgolly.reactRelay.reactRelayStrings.cache
import typingsJapgolly.reactRelay.reactRelayStrings.network
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  cacheConfig :relay-runtime.relay-runtime.CacheConfig | null | undefined,   source :'cache' | 'network',   fetchTime :number | null | undefined}> */
trait PreloadQueryStatus extends StObject {
  
  val cacheConfig: js.UndefOr[CacheConfig | Null] = js.undefined
  
  val fetchTime: js.UndefOr[Double | Null] = js.undefined
  
  val source: cache | network
}
object PreloadQueryStatus {
  
  inline def apply(source: cache | network): PreloadQueryStatus = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadQueryStatus]
  }
  
  extension [Self <: PreloadQueryStatus](x: Self) {
    
    inline def setCacheConfig(value: CacheConfig): Self = StObject.set(x, "cacheConfig", value.asInstanceOf[js.Any])
    
    inline def setCacheConfigNull: Self = StObject.set(x, "cacheConfig", null)
    
    inline def setCacheConfigUndefined: Self = StObject.set(x, "cacheConfig", js.undefined)
    
    inline def setFetchTime(value: Double): Self = StObject.set(x, "fetchTime", value.asInstanceOf[js.Any])
    
    inline def setFetchTimeNull: Self = StObject.set(x, "fetchTime", null)
    
    inline def setFetchTimeUndefined: Self = StObject.set(x, "fetchTime", js.undefined)
    
    inline def setSource(value: cache | network): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
