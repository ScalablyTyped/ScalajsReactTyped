package typingsJapgolly.ecol

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.ecol.collectionEventMod.CollectionEvent
import typingsJapgolly.ecol.collectionEventMod.CollectionEvent.Listener
import typingsJapgolly.ecol.collectionEventMod.CollectionEvent.Type
import typingsJapgolly.ecol.ieventdispatcherMod.IEventDispatcher
import typingsJapgolly.tstl.IteratoranyanyanyEquals
import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import typingsJapgolly.tstl.mod.base.Container
import typingsJapgolly.tstl.setContainerMod.SetContainer
import typingsJapgolly.tstl.setContainerMod.SetContainer.InsertRet
import typingsJapgolly.tstl.treeMultiSetMod.TreeMultiSet
import typingsJapgolly.tstl.treeMultiSetMod.TreeMultiSet.Iterator
import typingsJapgolly.tstl.treeMultiSetMod.TreeMultiSet.ReverseIterator
import typingsJapgolly.tstl.tstlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecol/lib/sets/TreeMultiSetCollection", JSImport.Namespace)
@js.native
object treeMultiSetCollectionMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.tstl.isizeMod.ISize because Already inherited
  - typingsJapgolly.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
  - typingsJapgolly.tstl.ipushMod.IPush because Already inherited
  - typingsJapgolly.tstl.iemptyMod.IEmpty because Already inherited
  - typingsJapgolly.std.Iterable because Already inherited
  - typingsJapgolly.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
  - typingsJapgolly.tstl.icontainerMod.IContainer because Already inherited
  - typingsJapgolly.tstl.containerContainerMod.Container because Already inherited
  - typingsJapgolly.ecol.icollectionMod.ICollection because var conflicts: iterator, iterator_IContainer_. Inlined refresh, refresh, refresh */ @js.native
  class TreeMultiSetCollection[T] ()
    extends TreeMultiSet[T]
       with IEventDispatcher[T, TreeMultiSet[T], Iterator[T], ReverseIterator[T]] {
    /**
      * @hidden
      */
    var dispatcher_ : js.Any = js.native
    /* InferMemberOverrides */
    /* protected */ override def _Erase_by_range(first: Iterator[T]): Iterator[T] = js.native
    /* InferMemberOverrides */
    /* protected */ override def _Erase_by_range(first: Iterator[T], last: Iterator[T]): Iterator[T] = js.native
    /* InferMemberOverrides */
    /* protected */ override def _Erase_by_val(key: T): Double = js.native
    /* InferMemberOverrides */
    /* protected */ override def _Handle_erase(first: Iterator[T], last: Iterator[T]): Unit = js.native
    /* InferMemberOverrides */
    /* protected */ override def _Handle_insert(first: Iterator[T], last: Iterator[T]): Unit = js.native
    /* InferMemberOverrides */
    /* protected */ override def _Insert_by_hint(hint: Iterator[T], key: T): Iterator[T] = js.native
    /* InferMemberOverrides */
    /* protected */ override def _Insert_by_key(key: T): InsertRet[T, `false`, TreeMultiSet[T], Iterator[T], ReverseIterator[T]] = js.native
    /* InferMemberOverrides */
    /* protected */ override def _Insert_by_range[InputIterator /* <: IForwardIterator[T, InputIterator] */](begin: InputIterator, end: InputIterator): Unit = js.native
    /* InferMemberOverrides */
    /* protected */ override def _Key_eq(x: T, y: T): Boolean = js.native
    /* CompleteClass */
    override def addEventListener(`type`: Type, listener: Listener[T, TreeMultiSet[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
    /**
      * Range Assigner.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    /* InferMemberOverrides */
    override def assign[InputIterator /* <: IForwardIterator[T, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /**
      * Iterator to the first element.
      *
      * @return Iterator to the first element.
      */
    /* InferMemberOverrides */
    override def begin(): typingsJapgolly.tstl.icontainerMod.IContainer.Iterator[T, TreeMultiSet[T], Iterator[T], ReverseIterator[T], T] = js.native
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
    override def count(key: T): Double = js.native
    /* CompleteClass */
    override def dispatchEvent(event: CollectionEvent[T, TreeMultiSet[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
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
    override def end(): typingsJapgolly.tstl.icontainerMod.IContainer.Iterator[T, TreeMultiSet[T], Iterator[T], ReverseIterator[T], T] = js.native
    /**
      * Erase elements in range.
      *
      * @param first Range of the first position to erase.
      * @param last Rangee of the last position to erase.
      * @return Iterator following the last removed element, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(first: Iterator[T], last: Iterator[T]): Iterator[T] = js.native
    /**
      * Erase an element.
      *
      * @param pos Position to erase.
      * @return Iterator following the *pos*, strained by the erasing.
      */
    /* InferMemberOverrides */
    override def erase(pos: Iterator[T]): Iterator[T] = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    @JSName("erase")
    override def erase_IteratorT(pos: Iterator[T]): Iterator[T] = js.native
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
    override def find(key: T): Iterator[T] = js.native
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
    override def has(key: T): Boolean = js.native
    /* CompleteClass */
    override def hasEventListener(`type`: Type): Boolean = js.native
    /* InferMemberOverrides */
    override def insert(hint: Iterator[T], key: T): Iterator[T] = js.native
    /* InferMemberOverrides */
    override def insert(key: T): InsertRet[T, `false`, TreeMultiSet[T], Iterator[T], ReverseIterator[T]] = js.native
    /* InferMemberOverrides */
    @JSName("insert")
    override def insert_InputIterator_IForwardIteratorKeyInputIterator_Unit[InputIterator /* <: IForwardIterator[T, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    override def merge(source: TreeMultiSet[T]): Unit = js.native
    /**
      * Insert items at the end.
      *
      * @param items Items to insert.
      * @return Number of elements in the container after insertion.
      */
    /* InferMemberOverrides */
    override def push(items: T*): Double = js.native
    /**
      * Reverse iterator to the first element in reverse.
      *
      * @return Reverse iterator to the first.
      */
    /* InferMemberOverrides */
    override def rbegin(): ReverseIterator[T] = js.native
    /**
      * @inheritDoc
      */
    def refresh(): Unit = js.native
    /**
      * @inheritDoc
      */
    def refresh(first: Iterator[T], last: Iterator[T]): Unit = js.native
    /**
      * @inheritDoc
      */
    def refresh(it: Iterator[T]): Unit = js.native
    /* CompleteClass */
    override def removeEventListener(`type`: Type, listener: Listener[T, TreeMultiSet[T], Iterator[T], ReverseIterator[T]]): Unit = js.native
    /**
      * Reverse iterator to the reverse end.
      *
      * @return Reverse iterator to the end.
      */
    /* InferMemberOverrides */
    override def rend(): ReverseIterator[T] = js.native
    /**
      * Number of elements in the container.
      */
    /* InferMemberOverrides */
    override def size(): Double = js.native
    /**
      * Swap elements.
      *
      * @param obj Target container to swap.
      */
    /* InferMemberOverrides */
    override def swap(obj: TreeMultiSet[T]): Unit = js.native
    /**
      * Native function for `JSON.stringify()`.
      *
      * @return An array containing children elements.
      */
    /* InferMemberOverrides */
    override def toJSON(): js.Array[T] = js.native
  }
  
  @js.native
  object TreeMultiSetCollection extends js.Object {
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
    type Event[T] = CollectionEvent[
        T, 
        TreeMultiSet[T], 
        typingsJapgolly.tstl.treeMultiSetMod.TreeMultiSet.Iterator[T], 
        typingsJapgolly.tstl.treeMultiSetMod.TreeMultiSet.ReverseIterator[T]
      ]
    /**
      * Iterator of {@link TreeMultiSet}
      */
    type Iterator[Key] = typingsJapgolly.tstl.setElementListMod.SetElementList.Iterator[Key, typingsJapgolly.ecol.ecolBooleans.`false`, TreeMultiSet[Key]]
    type Listener[T] = typingsJapgolly.ecol.collectionEventMod.CollectionEvent.Listener[
        T, 
        TreeMultiSet[T], 
        typingsJapgolly.tstl.treeMultiSetMod.TreeMultiSet.Iterator[T], 
        typingsJapgolly.tstl.treeMultiSetMod.TreeMultiSet.ReverseIterator[T]
      ]
    /**
      * Reverse iterator of {@link TreeMultiSet}
      */
    type ReverseIterator[Key] = typingsJapgolly.tstl.setElementListMod.SetElementList.ReverseIterator[Key, typingsJapgolly.ecol.ecolBooleans.`false`, TreeMultiSet[Key]]
  }
  
}

