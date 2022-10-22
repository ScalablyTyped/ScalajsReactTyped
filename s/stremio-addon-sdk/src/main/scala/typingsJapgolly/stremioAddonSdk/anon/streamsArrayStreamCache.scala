package typingsJapgolly.stremioAddonSdk.anon

import typingsJapgolly.stremioAddonSdk.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  streams :std.Array<stremio-addon-sdk.stremio-addon-sdk.Stream>} & stremio-addon-sdk.stremio-addon-sdk.Cache */
trait streamsArrayStreamCache extends StObject {
  
  /**
    * (in seconds) sets the Cache-Control header to max-age=$cacheMaxAge
    * and overwrites the global cache time set in serveHTTP options.
    */
  var cacheMaxAge: js.UndefOr[Double] = js.undefined
  
  /**
    * (in seconds) sets the Cache-Control header to stale-if-error=$staleError.
    */
  var staleError: js.UndefOr[Double] = js.undefined
  
  /**
    * (in seconds) sets the Cache-Control header to stale-while-revalidate=$staleRevalidate.
    */
  var staleRevalidate: js.UndefOr[Double] = js.undefined
  
  var streams: js.Array[Stream]
}
object streamsArrayStreamCache {
  
  inline def apply(streams: js.Array[Stream]): streamsArrayStreamCache = {
    val __obj = js.Dynamic.literal(streams = streams.asInstanceOf[js.Any])
    __obj.asInstanceOf[streamsArrayStreamCache]
  }
  
  extension [Self <: streamsArrayStreamCache](x: Self) {
    
    inline def setCacheMaxAge(value: Double): Self = StObject.set(x, "cacheMaxAge", value.asInstanceOf[js.Any])
    
    inline def setCacheMaxAgeUndefined: Self = StObject.set(x, "cacheMaxAge", js.undefined)
    
    inline def setStaleError(value: Double): Self = StObject.set(x, "staleError", value.asInstanceOf[js.Any])
    
    inline def setStaleErrorUndefined: Self = StObject.set(x, "staleError", js.undefined)
    
    inline def setStaleRevalidate(value: Double): Self = StObject.set(x, "staleRevalidate", value.asInstanceOf[js.Any])
    
    inline def setStaleRevalidateUndefined: Self = StObject.set(x, "staleRevalidate", js.undefined)
    
    inline def setStreams(value: js.Array[Stream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
    
    inline def setStreamsVarargs(value: Stream*): Self = StObject.set(x, "streams", js.Array(value*))
  }
}
