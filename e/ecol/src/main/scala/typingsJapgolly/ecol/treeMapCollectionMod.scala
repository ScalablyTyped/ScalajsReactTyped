package typingsJapgolly.ecol

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.ecol.collectionEventMod.CollectionEvent
import typingsJapgolly.ecol.collectionEventMod.CollectionEvent.Listener
import typingsJapgolly.ecol.collectionEventMod.CollectionEvent.Type
import typingsJapgolly.ecol.ieventdispatcherMod.IEventDispatcher
import typingsJapgolly.tstl.IteratoranyanyanyanyEquals
import typingsJapgolly.tstl.entryMod.Entry
import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import typingsJapgolly.tstl.ipairMod.IPair
import typingsJapgolly.tstl.mapContainerMod.MapContainer
import typingsJapgolly.tstl.mapContainerMod.MapContainer.InsertRet
import typingsJapgolly.tstl.mod.base.Container
import typingsJapgolly.tstl.pairMod.Pair
import typingsJapgolly.tstl.treeMapMod.TreeMap
import typingsJapgolly.tstl.treeMapMod.TreeMap.Iterator
import typingsJapgolly.tstl.treeMapMod.TreeMap.ReverseIterator
import typingsJapgolly.tstl.tstlBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/maps/TreeMapCollection", JSImport.Namespace)
@js.native
object treeMapCollectionMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.tstl.isizeMod.ISize because Already inherited
  - typingsJapgolly.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
  - typingsJapgolly.tstl.ipushMod.IPush because Already inherited
  - typingsJapgolly.tstl.iemptyMod.IEmpty because Already inherited
  - typingsJapgolly.std.Iterable because Already inherited
  - typingsJapgolly.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
  - typingsJapgolly.tstl.icontainerMod.IContainer because Already inherited
  - typingsJapgolly.tstl.containerContainerMod.Container because Inheritance from two classes. Inlined begin, empty, end, push, rbegin, rend, size
  - typingsJapgolly.ecol.icollectionMod.ICollection because Inheritance from two classes. Inlined refresh, refresh, refresh */ @js.native
  class TreeMapCollection[Key, T] ()
    extends TreeMap[Key, T]
       with IEventDispatcher[Entry[Key, T], TreeMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] {
    /**
      * @hidden
      */
    var dispatcher_ : js.Any = js.native
    /* InferMemberOverrides */
    /* protected */ override def _Erase_by_key(key: Key): Double = js.native
    /* InferMemberOverrides */
    /* protected */ override def _Erase_by_range(first: Iterator[Key, T]): Iterator[Key, T] = js.native
    /* InferMemberOverrides */
    /* protected */ override def _Erase_by_range(first: Iterator[Key, T], last: Iterator[Key, T]): Iterator[Key, T] = js.native
    /* InferMemberOverrides */
    /* protected */ override def _Handle_erase(first: Iterator[Key, T], last: Iterator[Key, T]): Unit = js.native
    /* InferMemberOverrides */
    /* protected */ override def _Handle_insert(first: Iterator[Key, T], last: Iterator[Key, T]): Unit = js.native
    /* InferMemberOverrides */
    /* protected */ override def _Insert_by_range[InputIterator /* <: IForwardIterator[IPair[Key, T], InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /* CompleteClass */
    override def addEventListener(
      `type`: Type,
      listener: Listener[Entry[Key, T], TreeMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]]
    ): Unit = js.native
    /**
      * Range Assigner.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    /* InferMemberOverrides */
    override def assign[InputIterator /* <: IForwardIterator[IPair[Key, T], InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /**
      * Iterator to the first element.
      *
      * @return Iterator to the first element.
      */
    /* InferMemberOverrides */
    override def begin(): typingsJapgolly.tstl.icontainerMod.IContainer.Iterator[Entry[Key, T], TreeMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T], IPair[Key, T]] = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def clear(): Unit = js.native
    /**
      * @inheritDoc
      */
    /**
      * Count elements with a specified key.
      *
      * @param key Key to search for.
      * @return Number of elements with the specified key.
      */
    /* InferMemberOverrides */
    override def count(key: Key): Double = js.native
    /* CompleteClass */
    override def dispatchEvent(event: CollectionEvent[Entry[Key, T], TreeMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]]): Unit = js.native
    /* InferMemberOverrides */
    override def emplace(key: Key, `val`: T): InsertRet[Key, T, `true`, TreeMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] = js.native
    /* InferMemberOverrides */
    override def emplace_hint(hint: Iterator[Key, T], key: Key, `val`: T): Iterator[Key, T] = js.native
    /**
      * Test whether container is empty.
      */
    /* InferMemberOverrides */
    override def empty(): Boolean = js.native
    /**
      * Iterator to the end.
      *
      * @return Iterator to the end.
      */
    /* InferMemberOverrides */
    override def end(): typingsJapgolly.tstl.icontainerMod.IContainer.Iterator[Entry[Key, T], TreeMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T], IPair[Key, T]] = js.native
    /**
      * Erase elements in range.
      *
      * @param first Range of the first position to erase.
      * @param last Rangee of the last position to erase.
      * @return Iterator following the last removed element, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(first: Iterator[Key, T], last: Iterator[Key, T]): Iterator[Key, T] = js.native
    /**
      * Erase an element.
      *
      * @param pos Position to erase.
      * @return Iterator following the *pos*, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(pos: Iterator[Key, T]): Iterator[Key, T] = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    @JSName("erase")
    override def erase_IteratorT(it: Iterator[Key, T]): Iterator[Key, T] = js.native
    /**
      * Extract an element by key.
      *
      * @param key Key to search for.
      * @return The extracted element.
      */
    /* InferMemberOverrides */
    override def extract(key: Key): Entry[Key, T] = js.native
    /**
      * Extract an element by iterator.
      *
      * @param pos The iterator to the element for extraction.
      * @return Iterator following the *pos*, strained by the extraction.
      */
    /* InferMemberOverrides */
    @JSName("extract")
    override def extract_Iterator(pos: Iterator[Key, T]): Iterator[Key, T] = js.native
    /**
      * @inheritDoc
      */
    /**
      * Get iterator to element.
      *
      * @param key Key to search for.
      * @return An iterator to the element, if the specified key is found, otherwise `this.end()`.
      */
    /* InferMemberOverrides */
    override def find(key: Key): Iterator[Key, T] = js.native
    /**
      * Get a value.
      *
      * @param key Key to search for.
      * @return The value mapped by the key.
      */
    /* InferMemberOverrides */
    override def get(key: Key): T = js.native
    /**
      * @inheritDoc
      */
    /**
      * Test whether a key exists.
      *
      * @param key Key to search for.
      * @return Whether the specified key exists.
      */
    /* InferMemberOverrides */
    override def has(key: Key): Boolean = js.native
    /* CompleteClass */
    override def hasEventListener(`type`: Type): Boolean = js.native
    /* InferMemberOverrides */
    override def insert(hint: Iterator[Key, T], pair: IPair[Key, T]): Iterator[Key, T] = js.native
    /* InferMemberOverrides */
    override def insert(pair: IPair[Key, T]): InsertRet[Key, T, `true`, TreeMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] = js.native
    /* InferMemberOverrides */
    override def insert[InputIterator /* <: IForwardIterator[IPair[Key, T], InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /**
      * Insert or assign an element with hint.
      *
      * @param hint Hint for the position where the element can be inserted.
      * @param key Key to be mapped or search for.
      * @param value Value to insert or assign.
      * @return An iterator to the newly inserted element, if the specified key doesn't exist, otherwise an iterator to the ordinary element.
      */
    /* InferMemberOverrides */
    override def insert_or_assign(hint: Iterator[Key, T], key: Key, value: T): Iterator[Key, T] = js.native
    /**
      * Insert or assign an element.
      *
      * @param key Key to be mapped or search for.
      * @param value Value to insert or assign.
      * @return {@link Pair} of an iterator to the newly inserted element and `true`, if the specified *key* doesn't exist, otherwise {@link Pair} of iterator to the ordinary element and `false`.
      */
    /* InferMemberOverrides */
    override def insert_or_assign(key: Key, value: T): Pair[Iterator[Key, T], Boolean] = js.native
    /**
      * Merge two containers.
      *
      * @param source Source container to transfer.
      */
    /* InferMemberOverrides */
    override def merge(source: TreeMap[Key, T]): Unit = js.native
    /**
      * Insert items at the end.
      *
      * @param items Items to insert.
      * @return Number of elements in the container after insertion.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def push(items: (IPair[Key, T])*): Double = js.native
    /**
      * Reverse iterator to the first element in reverse.
      *
      * @return Reverse iterator to the first.
      */
    /* InferMemberOverrides */
    override def rbegin(): ReverseIterator[Key, T] = js.native
    /**
      * @inheritDoc
      */
    def refresh(): Unit = js.native
    /**
      * @inheritDoc
      */
    def refresh(first: Iterator[Key, T], last: Iterator[Key, T]): Unit = js.native
    /**
      * @inheritDoc
      */
    def refresh(it: Iterator[Key, T]): Unit = js.native
    /* CompleteClass */
    override def removeEventListener(
      `type`: Type,
      listener: Listener[Entry[Key, T], TreeMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]]
    ): Unit = js.native
    /**
      * Reverse iterator to the reverse end.
      *
      * @return Reverse iterator to the end.
      */
    /* InferMemberOverrides */
    override def rend(): ReverseIterator[Key, T] = js.native
    /**
      * Set a value with key.
      *
      * @param key Key to be mapped or search for.
      * @param val Value to insert or assign.
      */
    /* InferMemberOverrides */
    override def set(key: Key, `val`: T): Unit = js.native
    /**
      * Number of elements in the container.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def size(): Double = js.native
    /**
      * Swap elements.
      *
      * @param obj Target container to swap.
      */
    /* InferMemberOverrides */
    override def swap(obj: TreeMap[Key, T]): Unit = js.native
    /**
      * Native function for `JSON.stringify()`.
      *
      * @return An array containing children elements.
      */
    /* InferMemberOverrides */
    override def toJSON(): js.Array[Entry[Key, T]] = js.native
  }
  
  @js.native
  object TreeMapCollection extends js.Object {
    val Event: Instantiable3[
        /* type */ String, 
        /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ /* first */ js.Any, 
        /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ /* last */ js.Any, 
        CollectionEvent[
          js.Object, 
          Container[
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam SourceT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam IteratorT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam ReverseT */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
          ], 
          js.Iterator[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any
        ]
      ] = js.native
    val Iterator: Instantiable0[
        typingsJapgolly.tstl.mapElementListMod.MapElementList.Iterator[
          js.Object, 
          js.Object, 
          Boolean, 
          MapContainer[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
            IteratoranyanyanyanyEquals, 
            typingsJapgolly.tstl.mapElementListMod.MapElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val ReverseIterator: Instantiable0[
        typingsJapgolly.tstl.mapElementListMod.MapElementList.ReverseIterator[
          js.Object, 
          js.Object, 
          Boolean, 
          MapContainer[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
            IteratoranyanyanyanyEquals, 
            typingsJapgolly.tstl.mapElementListMod.MapElementList.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    type Event[Key, T] = CollectionEvent[
        Entry[Key, T], 
        TreeMap[Key, T], 
        typingsJapgolly.tstl.treeMapMod.TreeMap.Iterator[Key, T], 
        typingsJapgolly.tstl.treeMapMod.TreeMap.ReverseIterator[Key, T]
      ]
    /**
      * Iterator of {@link TreeMap}
      */
    type Iterator[Key, T] = typingsJapgolly.tstl.mapElementListMod.MapElementList.Iterator[Key, T, typingsJapgolly.ecol.ecolBooleans.`true`, TreeMap[Key, T]]
    type Listener[Key, T] = typingsJapgolly.ecol.collectionEventMod.CollectionEvent.Listener[
        Entry[Key, T], 
        TreeMap[Key, T], 
        typingsJapgolly.tstl.treeMapMod.TreeMap.Iterator[Key, T], 
        typingsJapgolly.tstl.treeMapMod.TreeMap.ReverseIterator[Key, T]
      ]
    /**
      * Reverse iterator of {@link TreeMap}
      */
    type ReverseIterator[Key, T] = typingsJapgolly.tstl.mapElementListMod.MapElementList.ReverseIterator[Key, T, typingsJapgolly.ecol.ecolBooleans.`true`, TreeMap[Key, T]]
  }
  
}

