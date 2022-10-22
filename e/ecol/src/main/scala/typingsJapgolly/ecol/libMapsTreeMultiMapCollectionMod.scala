package typingsJapgolly.ecol

import typingsJapgolly.ecol.libBasicCollectionEventMod.CollectionEvent
import typingsJapgolly.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typingsJapgolly.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typingsJapgolly.ecol.libBasicIcollectionMod.ICollection
import typingsJapgolly.ecol.libMapsTreeMultiMapCollectionMod.TreeMultiMapCollection.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMapsTreeMultiMapCollectionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeMultiMap<Key, T> * / any */ @JSImport("ecol/lib/maps/TreeMultiMapCollection", "TreeMultiMapCollection")
  @js.native
  open class TreeMultiMapCollection[Key, T] ()
    extends StObject
       with ICollection[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entry<Key, T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiMap<Key, T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiMap.Iterator<Key, T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiMap.ReverseIterator<Key, T> */ Any
        ] {
    
    /**
      * @hidden
      */
    /* protected */ def _Handle_erase(
      first: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeMultiMap.Iterator<Key, T> */ Any,
      last: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeMultiMap.Iterator<Key, T> */ Any
    ): Unit = js.native
    
    /**
      * @hidden
      */
    /* protected */ def _Handle_insert(
      first: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeMultiMap.Iterator<Key, T> */ Any,
      last: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeMultiMap.Iterator<Key, T> */ Any
    ): Unit = js.native
    
    /* CompleteClass */
    override def addEventListener(
      `type`: Type,
      listener: Listener[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entry<Key, T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiMap<Key, T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiMap.Iterator<Key, T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiMap.ReverseIterator<Key, T> */ Any
        ]
    ): Unit = js.native
    
    def clear(): Unit = js.native
    
    /* CompleteClass */
    override def dispatchEvent(
      event: CollectionEvent[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entry<Key, T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiMap<Key, T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiMap.Iterator<Key, T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiMap.ReverseIterator<Key, T> */ Any
        ]
    ): Unit = js.native
    /**
      * @inheritDoc
      */
    def dispatchEvent(
      event: Event[
          Key, 
          T, 
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entry<Key, T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiMap<Key, T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiMap.Iterator<Key, T> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HashMultiMap.ReverseIterator<Key, T> */ Any
        ]
    ): Unit = js.native
  }
  object TreeMultiMapCollection {
    
    /* was `typeof CollectionEvent` */
    @JSImport("ecol/lib/maps/TreeMultiMapCollection", "TreeMultiMapCollection.Event")
    @js.native
    open class Event[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] protected () extends CollectionEvent[T, SourceT, IteratorT, ReverseT] {
      def this(`type`: String, first: IteratorT, last: IteratorT) = this()
    }
    
    type Listener[Key, T] = typingsJapgolly.ecol.libBasicCollectionEventMod.CollectionEvent.Listener[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entry<Key, T> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeMultiMap<Key, T> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeMultiMap.Iterator<Key, T> */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TreeMultiMap.ReverseIterator<Key, T> */ Any
      ]
  }
}
