package typingsJapgolly.next

import typingsJapgolly.next.anon.Entry
import typingsJapgolly.next.anon.IsPrefetch
import typingsJapgolly.next.distServerResponseCacheTypesMod.IncrementalCache
import typingsJapgolly.next.distServerResponseCacheTypesMod.ResponseCacheEntry
import typingsJapgolly.next.distServerResponseCacheTypesMod.ResponseGenerator
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerResponseCacheMod {
  
  @JSImport("next/dist/server/response-cache", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ResponseCache {
    def this(incrementalCache: IncrementalCache, minimalMode: Boolean) = this()
  }
  
  @js.native
  trait ResponseCache extends StObject {
    
    def get(key: String, responseGenerator: ResponseGenerator, context: IsPrefetch): js.Promise[ResponseCacheEntry | Null] = js.native
    def get(key: Null, responseGenerator: ResponseGenerator, context: IsPrefetch): js.Promise[ResponseCacheEntry | Null] = js.native
    
    var incrementalCache: IncrementalCache = js.native
    
    var minimalMode: js.UndefOr[Boolean] = js.native
    
    var pendingResponses: Map[String, js.Promise[ResponseCacheEntry | Null]] = js.native
    
    var previousCacheItem: js.UndefOr[Entry] = js.native
  }
}
