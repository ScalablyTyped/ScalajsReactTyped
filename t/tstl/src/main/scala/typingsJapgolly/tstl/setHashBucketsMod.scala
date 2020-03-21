package typingsJapgolly.tstl

import typingsJapgolly.tstl.comparatorMod.Comparator
import typingsJapgolly.tstl.hashBucketsMod.HashBuckets
import typingsJapgolly.tstl.hasherMod.Hasher
import typingsJapgolly.tstl.ihashsetMod.IHashSet
import typingsJapgolly.tstl.ihashsetMod.IHashSet.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/hash/SetHashBuckets", JSImport.Namespace)
@js.native
object setHashBucketsMod extends js.Object {
  @js.native
  class SetHashBuckets[Key, Unique /* <: Boolean */, Source /* <: IHashSet[Key, Unique, Source] */] protected () extends HashBuckets[Iterator[Key, Unique, Source]] {
    def this(source: IHashSet[Key, Unique, Source], hash: Hasher[Key], pred: Comparator[Key, Key]) = this()
    var hash_function_ : js.Any = js.native
    var key_eq_ : js.Any = js.native
    var source_ : js.Any = js.native
    def find(`val`: Key): Iterator[Key, Unique, Source] = js.native
    def hash_function(): Hasher[Key] = js.native
    def key_eq(): Comparator[Key, Key] = js.native
  }
  
}

