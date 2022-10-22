package typingsJapgolly.lruCache.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.lruCache.mod.LimitedByCount
  - typingsJapgolly.lruCache.mod.LimitedBySize[K, V]
  - typingsJapgolly.lruCache.mod.LimitedByTTL
*/
trait SafetyBounds[K, V] extends StObject
object SafetyBounds {
  
  inline def LimitedByCount(max: Double): typingsJapgolly.lruCache.mod.LimitedByCount = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.lruCache.mod.LimitedByCount]
  }
  
  inline def LimitedBySize[K, V](maxSize: Double): typingsJapgolly.lruCache.mod.LimitedBySize[K, V] = {
    val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.lruCache.mod.LimitedBySize[K, V]]
  }
  
  inline def LimitedByTTL(ttl: Double): typingsJapgolly.lruCache.mod.LimitedByTTL = {
    val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.lruCache.mod.LimitedByTTL]
  }
}
