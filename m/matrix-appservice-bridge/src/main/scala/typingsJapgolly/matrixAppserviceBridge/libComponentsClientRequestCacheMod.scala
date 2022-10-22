package typingsJapgolly.matrixAppserviceBridge

import typingsJapgolly.matrixAppserviceBridge.anon.Ts
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsClientRequestCacheMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/client-request-cache", "ClientRequestCache")
  @js.native
  open class ClientRequestCache[T, P /* <: js.Array[Any] */] protected () extends StObject {
    /**
      * @param ttl How old a result can be before it gets expired.
      * @param size How many results to store before we trim.
      * @param requestFunc The function to use on cache miss.
      */
    def this(
      ttl: Double,
      maxSize: Double,
      requestFunc: js.Function2[/* key */ String, /* args */ P, js.Promise[T]]
    ) = this()
    
    /**
      * Gets a result of a request from the cache, or otherwise
      * tries to fetch the the result with this.requestFunc
      *
      * @param key Key of the item to get/store.
      * @param args A set of arguments to pass to the request func.
      * @returns {Promise} The request, or undefined if not retrievable.
      * @throws {Error} If the key is not a string.
      */
    def get(
      key: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type P is not an array type */ args: P
    ): T | js.Promise[T] = js.native
    
    /**
      * Clone the current request result cache, mapping keys to their cache records.
      * @returns {Map<string,any>}
      */
    def getCachedResults(): Map[String, Ts[T]] = js.native
    
    def invalidate(key: String): Unit = js.native
    
    /* private */ val maxSize: Any = js.native
    
    /* private */ var requestContent: Any = js.native
    
    /* private */ val requestFunc: Any = js.native
    
    /* private */ val ttl: Any = js.native
  }
}
