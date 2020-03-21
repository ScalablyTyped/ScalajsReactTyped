package typingsJapgolly.apolloServerCaching

import typingsJapgolly.apolloServerCaching.keyValueCacheMod.KeyValueCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-caching/dist/PrefixingKeyValueCache", JSImport.Namespace)
@js.native
object prefixingKeyValueCacheMod extends js.Object {
  @js.native
  class PrefixingKeyValueCache[V] protected () extends KeyValueCache[V] {
    def this(wrapped: KeyValueCache[V], prefix: String) = this()
    var prefix: js.Any = js.native
    var wrapped: js.Any = js.native
  }
  
}

