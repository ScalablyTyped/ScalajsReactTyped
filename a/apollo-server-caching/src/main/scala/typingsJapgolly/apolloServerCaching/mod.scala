package typingsJapgolly.apolloServerCaching

import typingsJapgolly.apolloServerCaching.keyValueCacheMod.KeyValueCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-caching", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class InMemoryLRUCache[V] ()
    extends typingsJapgolly.apolloServerCaching.inMemoryLRUCacheMod.InMemoryLRUCache[V] {
    def this(hasMaxSizeSizeCalculatorOnDispose: AnonMaxSize[V]) = this()
  }
  
  @js.native
  class PrefixingKeyValueCache[V] protected ()
    extends typingsJapgolly.apolloServerCaching.prefixingKeyValueCacheMod.PrefixingKeyValueCache[V] {
    def this(wrapped: KeyValueCache[V], prefix: String) = this()
  }
  
}

