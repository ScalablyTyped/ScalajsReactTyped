package typingsJapgolly.ecol

import typingsJapgolly.ecol.libBasicCollectionEventMod.CollectionEvent
import typingsJapgolly.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typingsJapgolly.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typingsJapgolly.ecol.libBasicIcollectionMod.ICollection
import typingsJapgolly.ecol.libLinearListCollectionMod.ListCollection.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLinearListCollectionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify List<T> * / any */ @JSImport("ecol/lib/linear/ListCollection", "ListCollection")
  @js.native
  open class ListCollection[T] ()
    extends StObject
       with ICollection[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.Iterator<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.ReverseIterator<T> */ Any
        ] {
    
    /**
      * @hidden
      */
    /* protected */ def _Erase_by_range(
      first: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify List.Iterator<T> */ Any,
      last: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify List.Iterator<T> */ Any
    ): Any = js.native
    
    /**
      * @hidden
      */
    /* protected */ def _Insert_by_range[U /* <: T */, InputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IForwardIterator<U, InputIterator> */ Any */](
      pos: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify List.Iterator<T> */ Any,
      first: InputIterator,
      last: InputIterator
    ): Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var _Notify_erase: Any = js.native
    
    /**
      * @hidden
      */
    /* private */ var _Notify_insert: Any = js.native
    
    /* CompleteClass */
    override def addEventListener(
      `type`: Type,
      listener: Listener[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.Iterator<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.ReverseIterator<T> */ Any
        ]
    ): Unit = js.native
    
    def clear(): Unit = js.native
    
    /* CompleteClass */
    override def dispatchEvent(
      event: CollectionEvent[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.Iterator<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.ReverseIterator<T> */ Any
        ]
    ): Unit = js.native
    /**
      * @inheritdoc
      */
    def dispatchEvent(
      event: Event[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any
        ]
    ): Unit = js.native
    
    /**
      * @hidden
      */
    /* private */ var dispatcher_ : Any = js.native
    
    /* CompleteClass */
    override def hasEventListener(`type`: Type): Boolean = js.native
    
    /* CompleteClass */
    override def removeEventListener(
      `type`: Type,
      listener: Listener[
          T, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.Iterator<T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeSet.ReverseIterator<T> */ Any
        ]
    ): Unit = js.native
    
    /**
      * @inheritDoc
      */
    def reverse(): Unit = js.native
    
    /**
      * @inheritDoc
      */
    def sort(): Unit = js.native
    /**
      * @inheritDoc
      */
    def sort(comp: js.Function2[/* x */ T, /* y */ T, Boolean]): Unit = js.native
  }
  object ListCollection {
    
    /* was `typeof CollectionEvent` */
    @JSImport("ecol/lib/linear/ListCollection", "ListCollection.Event")
    @js.native
    open class Event[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] protected () extends CollectionEvent[T, SourceT, IteratorT, ReverseT] {
      def this(`type`: String, first: IteratorT, last: IteratorT) = this()
    }
    
    type Listener[T] = typingsJapgolly.ecol.libBasicCollectionEventMod.CollectionEvent.Listener[
        T, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify List<T> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify List.Iterator<T> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify List.ReverseIterator<T> */ Any
      ]
  }
}
