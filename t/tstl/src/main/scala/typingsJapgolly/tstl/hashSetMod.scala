package typingsJapgolly.tstl

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.tstl.binaryPredicatorMod.BinaryPredicator
import typingsJapgolly.tstl.hashSetMod.HashSet.Iterator
import typingsJapgolly.tstl.hashSetMod.HashSet.ReverseIterator
import typingsJapgolly.tstl.hasherMod.Hasher
import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import typingsJapgolly.tstl.pairMod.Pair
import typingsJapgolly.tstl.setContainerMod.SetContainer
import typingsJapgolly.tstl.tstlBooleans.`true`
import typingsJapgolly.tstl.uniqueSetMod.UniqueSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/HashSet", JSImport.Namespace)
@js.native
object hashSetMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.tstl.isizeMod.ISize because Already inherited
  - typingsJapgolly.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
  - typingsJapgolly.tstl.ipushMod.IPush because Already inherited
  - typingsJapgolly.tstl.iemptyMod.IEmpty because Already inherited
  - typingsJapgolly.std.Iterable because Already inherited
  - typingsJapgolly.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
  - typingsJapgolly.tstl.icontainerMod.IContainer because Already inherited
  - typingsJapgolly.tstl.iassociativecontainerMod.IAssociativeContainer because Already inherited
  - typingsJapgolly.tstl.containerContainerMod.Container because Inheritance from two classes. Inlined empty, rbegin, rend, toJSON
  - typingsJapgolly.tstl.ihashcontainerMod.IHashContainer because var conflicts: iterator. Inlined hash_function, key_eq, bucket, bucket_count, bucket_size, load_factor, max_load_factor, max_load_factor, reserve, rehash
  - typingsJapgolly.tstl.setContainerMod.SetContainer because Inheritance from two classes. Inlined assign, clear, find, has, count, size, push, insert, insert, insert, _Insert_by_key, _Insert_by_hint, _Insert_by_range, erase, erase, erase, _Erase_by_val, _Erase_by_range, _Erase_by_range, swap, merge, _Handle_insert, _Handle_erase
  - typingsJapgolly.tstl.ihashsetMod.IHashSet because Inheritance from two classes. Inlined begin, begin, end, end */ @js.native
  /**
    * Default Constructor.
    *
    * @param hash An unary function returns hash code. Default is {hash}.
    * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
    */
  class HashSet[Key] () extends UniqueSet[Key, HashSet[Key], Iterator[Key], ReverseIterator[Key]] {
    def this(hash: Hasher[Key]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param hash An unary function returns hash code. Default is {hash}.
      * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
      */
    def this(items: js.Array[Key]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: HashSet[Key]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      * @param hash An unary function returns hash code. Default is {hash}.
      * @param equal A binary function predicates two arguments are equal. Default is {@link equal_to}.
      */
    def this(
      first: IForwardIterator[Key, IForwardIterator[Key, _]],
      last: IForwardIterator[Key, IForwardIterator[Key, _]]
    ) = this()
    def this(hash: Hasher[Key], equal: BinaryPredicator[Key, Key]) = this()
    def this(items: js.Array[Key], hash: Hasher[Key]) = this()
    def this(
      first: IForwardIterator[Key, IForwardIterator[Key, _]],
      last: IForwardIterator[Key, IForwardIterator[Key, _]],
      hash: Hasher[Key]
    ) = this()
    def this(items: js.Array[Key], hash: Hasher[Key], equal: BinaryPredicator[Key, Key]) = this()
    def this(
      first: IForwardIterator[Key, IForwardIterator[Key, _]],
      last: IForwardIterator[Key, IForwardIterator[Key, _]],
      hash: Hasher[Key],
      equal: BinaryPredicator[Key, Key]
    ) = this()
    var buckets_ : js.Any = js.native
    /* protected */ def _Handle_erase(
      first: Iterator[Key] | (typingsJapgolly.tstl.ihashsetMod.IHashSet.Iterator[Key, `true`, HashSet[Key]]),
      last: Iterator[Key] | (typingsJapgolly.tstl.ihashsetMod.IHashSet.Iterator[Key, `true`, HashSet[Key]])
    ): Unit = js.native
    /* protected */ def _Handle_insert(
      first: Iterator[Key] | (typingsJapgolly.tstl.ihashsetMod.IHashSet.Iterator[Key, `true`, HashSet[Key]]),
      last: Iterator[Key] | (typingsJapgolly.tstl.ihashsetMod.IHashSet.Iterator[Key, `true`, HashSet[Key]])
    ): Unit = js.native
    @JSName("_Insert_by_hint")
    /* protected */ def _Insert_by_hint_Iterator(hint: Iterator[Key], key: Key): Iterator[Key] = js.native
    @JSName("_Insert_by_key")
    /* protected */ def _Insert_by_key_Pair(key: Key): Pair[Iterator[Key], Boolean] = js.native
    /**
      * Iterator to the first element in a specific bucket.
      *
      * @param index Index number of the specific bucket.
      * @return Iterator from the specific bucket.
      */
    def begin(index: Double): typingsJapgolly.tstl.ihashsetMod.IHashSet.Iterator[Key, `true`, HashSet[Key]] = js.native
    /**
      * @inheritDoc
      */
    @JSName("begin")
    def begin_Iterator(): Iterator[Key] = js.native
    /**
      * @inheritDoc
      */
    @JSName("begin")
    def begin_Iterator(index: Double): Iterator[Key] = js.native
    /**
      * @inheritDoc
      */
    /**
      * Compute bucket index for the *key*.
      *
      * @param key Target key.
      * @return Index number.
      */
    def bucket(key: Key): Double = js.native
    /**
      * @inheritDoc
      */
    /**
      * Get number of buckets.
      */
    def bucket_count(): Double = js.native
    /**
      * @inheritDoc
      */
    /**
      * Get size of a specific bucket.
      *
      * @param index Specific position.
      * @return Size of the specific bucket.
      */
    def bucket_size(n: Double): Double = js.native
    /**
      * Iterator to the end in a specific bucket.
      *
      * @param index Index number of the specific bucket.
      * @return Iterator from the specific bucket.
      */
    def end(index: Double): typingsJapgolly.tstl.ihashsetMod.IHashSet.Iterator[Key, `true`, HashSet[Key]] = js.native
    /**
      * @inheritDoc
      */
    @JSName("end")
    def end_Iterator(): Iterator[Key] = js.native
    /**
      * @inheritDoc
      */
    @JSName("end")
    def end_Iterator(index: Double): Iterator[Key] = js.native
    /**
      * @inheritDoc
      */
    @JSName("find")
    def find_Iterator(key: Key): Iterator[Key] = js.native
    /**
      * @inheritDoc
      */
    /**
      * Get hash function.
      *
      * @return The hash function.
      */
    def hash_function(): Hasher[Key] = js.native
    def insert[InputIterator /* <: IForwardIterator[Key, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /**
      * @inheritDoc
      */
    /**
      * Get key equality predicator.
      *
      * @return The key equality predicator.
      */
    def key_eq(): BinaryPredicator[Key, Key] = js.native
    /**
      * @inheritDoc
      */
    /**
      * Compute load factor.
      *
      * @return `this.size() / this.bucket_count()`
      */
    def load_factor(): Double = js.native
    /**
      * @inheritDoc
      */
    /**
      * Get maximum load factor that allowable.
      *
      * @return The maximum load factor.
      */
    def max_load_factor(): Double = js.native
    /**
      * @inheritDoc
      */
    /**
      * Set maximum load factor.
      *
      * @param z The new value to change.
      */
    def max_load_factor(z: Double): Unit = js.native
    /**
      * @inheritDoc
      */
    def rbegin(index: Double): ReverseIterator[Key] = js.native
    /**
      * @inheritDoc
      */
    @JSName("rbegin")
    def rbegin_ReverseIterator(): ReverseIterator[Key] = js.native
    /**
      * @inheritDoc
      */
    /**
      * Change of bucktes.
      *
      * @param n The number to change.
      */
    def rehash(n: Double): Unit = js.native
    /**
      * @inheritDoc
      */
    def rend(index: Double): ReverseIterator[Key] = js.native
    /**
      * @inheritDoc
      */
    @JSName("rend")
    def rend_ReverseIterator(): ReverseIterator[Key] = js.native
    /**
      * @inheritDoc
      */
    /**
      * Reserve buckets enable to store *n* elements.
      *
      * @param n The capacity to reserve.
      */
    def reserve(n: Double): Unit = js.native
  }
  
  @js.native
  object HashSet extends js.Object {
    val Iterator: Instantiable0[
        typingsJapgolly.tstl.setElementListMod.SetElementList.Iterator[
          js.Object, 
          Boolean, 
          SetContainer[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
            IteratoranyanyanyEquals, 
            typingsJapgolly.tstl.setElementListMod.SetElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val ReverseIterator: Instantiable0[
        typingsJapgolly.tstl.setElementListMod.SetElementList.ReverseIterator[
          js.Object, 
          Boolean, 
          SetContainer[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
            IteratoranyanyanyEquals, 
            typingsJapgolly.tstl.setElementListMod.SetElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    /**
      * Iterator of {@link HashSet}
      */
    type Iterator[Key] = typingsJapgolly.tstl.setElementListMod.SetElementList.Iterator[Key, `true`, HashSet[Key]]
    /**
      * Reverse iterator of {@link HashSet}
      */
    type ReverseIterator[Key] = typingsJapgolly.tstl.setElementListMod.SetElementList.ReverseIterator[Key, `true`, HashSet[Key]]
  }
  
}

