package typingsJapgolly.typesettable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilsCacheMod {
  
  @JSImport("typesettable/build/src/utils/cache", "Cache")
  @js.native
  open class Cache[T] protected () extends StObject {
    /**
      * @constructor
      *
      * @param {string} compute The function whose results will be cached.
      */
    def this(compute: js.Function1[/* k */ String, T]) = this()
    
    /* private */ var cache: Any = js.native
    
    /**
      * Reset the cache empty.
      *
      * @return {Cache<T>} The calling Cache.
      */
    def clear(): Cache[T] = js.native
    
    /* private */ var compute: Any = js.native
    
    /**
      * Attempt to look up k in the cache, computing the result if it isn't
      * found.
      *
      * @param {string} k The key to look up in the cache.
      * @return {T} The value associated with k; the result of compute(k).
      */
    def get(k: String): T = js.native
  }
}
