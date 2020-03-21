package typingsJapgolly.tstl

import typingsJapgolly.tstl.comparatorMod.Comparator
import typingsJapgolly.tstl.hashBucketsMod.HashBuckets
import typingsJapgolly.tstl.hasherMod.Hasher
import typingsJapgolly.tstl.ihashmapMod.IHashMap
import typingsJapgolly.tstl.ihashmapMod.IHashMap.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/hash/MapHashBuckets", JSImport.Namespace)
@js.native
object mapHashBucketsMod extends js.Object {
  @js.native
  class MapHashBuckets[Key, T, Unique /* <: Boolean */, Source /* <: IHashMap[Key, T, Unique, Source] */] protected () extends HashBuckets[Iterator[Key, T, Unique, Source]] {
    /**
      * Initializer Constructor
      *
      * @param source Source map container
      * @param hash Hash function
      * @param pred Equality function
      */
    def this(source: IHashMap[Key, T, Unique, Source], hash: Hasher[Key], pred: Comparator[Key, Key]) = this()
    var hash_function_ : js.Any = js.native
    var key_eq_ : js.Any = js.native
    var source_ : js.Any = js.native
    def find(key: Key): Iterator[Key, T, Unique, Source] = js.native
    def hash_function(): Hasher[Key] = js.native
    def key_eq(): Comparator[Key, Key] = js.native
  }
  
}

