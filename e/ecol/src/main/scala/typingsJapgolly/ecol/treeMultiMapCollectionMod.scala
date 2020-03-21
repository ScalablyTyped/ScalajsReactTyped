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
import typingsJapgolly.tstl.treeMultiMapMod.TreeMultiMap
import typingsJapgolly.tstl.treeMultiMapMod.TreeMultiMap.Iterator
import typingsJapgolly.tstl.treeMultiMapMod.TreeMultiMap.ReverseIterator
import typingsJapgolly.tstl.tstlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/maps/TreeMultiMapCollection", JSImport.Namespace)
@js.native
object treeMultiMapCollectionMod extends js.Object {
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
  class TreeMultiMapCollection[Key, T] ()
    extends TreeMultiMap[Key, T]
       with IEventDispatcher[Entry[Key, T], TreeMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] {
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
    /* InferMemberOverrides */
    /* protected */ override def _Key_eq(x: Key, y: Key): Boolean = js.native
    /* CompleteClass */
    override def addEventListener(
      `type`: Type,
      listener: Listener[Entry[Key, T], TreeMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]]
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
    /* CompleteClass */
    /* InferMemberOverrides */
    override def begin(): typingsJapgolly.tstl.icontainerMod.IContainer.Iterator[
        Entry[Key, T], 
        TreeMultiMap[Key, T], 
        Iterator[Key, T], 
        ReverseIterator[Key, T], 
        IPair[Key, T]
      ] = js.native
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
    override def dispatchEvent(
      event: CollectionEvent[Entry[Key, T], TreeMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]]
    ): Unit = js.native
    /* InferMemberOverrides */
    override def emplace(key: Key, `val`: T): InsertRet[Key, T, `false`, TreeMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] = js.native
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
    /* CompleteClass */
    /* InferMemberOverrides */
    override def end(): typingsJapgolly.tstl.icontainerMod.IContainer.Iterator[
        Entry[Key, T], 
        TreeMultiMap[Key, T], 
        Iterator[Key, T], 
        ReverseIterator[Key, T], 
        IPair[Key, T]
      ] = js.native
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
    override def insert(pair: IPair[Key, T]): InsertRet[Key, T, `false`, TreeMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]] = js.native
    /* InferMemberOverrides */
    override def insert[InputIterator /* <: IForwardIterator[IPair[Key, T], InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /**
      * Merge two containers.
      *
      * @param source Source container to transfer.
      */
    /* InferMemberOverrides */
    override def merge(source: TreeMultiMap[Key, T]): Unit = js.native
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
    /* CompleteClass */
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
      listener: Listener[Entry[Key, T], TreeMultiMap[Key, T], Iterator[Key, T], ReverseIterator[Key, T]]
    ): Unit = js.native
    /**
      * Reverse iterator to the reverse end.
      *
      * @return Reverse iterator to the end.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def rend(): ReverseIterator[Key, T] = js.native
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
    override def swap(obj: TreeMultiMap[Key, T]): Unit = js.native
    /**
      * Native function for `JSON.stringify()`.
      *
      * @return An array containing children elements.
      */
    /* InferMemberOverrides */
    override def toJSON(): js.Array[Entry[Key, T]] = js.native
  }
  
  @js.native
  object TreeMultiMapCollection extends js.Object {
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
        TreeMultiMap[Key, T], 
        typingsJapgolly.tstl.treeMultiMapMod.TreeMultiMap.Iterator[Key, T], 
        typingsJapgolly.tstl.treeMultiMapMod.TreeMultiMap.ReverseIterator[Key, T]
      ]
    /**
      * Iterator of {@link TreeMultiMap}
      */
    type Iterator[Key, T] = typingsJapgolly.tstl.mapElementListMod.MapElementList.Iterator[Key, T, typingsJapgolly.ecol.ecolBooleans.`false`, TreeMultiMap[Key, T]]
    type Listener[Key, T] = typingsJapgolly.ecol.collectionEventMod.CollectionEvent.Listener[
        Entry[Key, T], 
        TreeMultiMap[Key, T], 
        typingsJapgolly.tstl.treeMultiMapMod.TreeMultiMap.Iterator[Key, T], 
        typingsJapgolly.tstl.treeMultiMapMod.TreeMultiMap.ReverseIterator[Key, T]
      ]
    /**
      * Iterator of {@link TreeMultiMap}
      */
    type ReverseIterator[Key, T] = typingsJapgolly.tstl.mapElementListMod.MapElementList.ReverseIterator[Key, T, typingsJapgolly.ecol.ecolBooleans.`false`, TreeMultiMap[Key, T]]
  }
  
}

