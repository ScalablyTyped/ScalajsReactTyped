package typingsJapgolly.ecol

import typingsJapgolly.ecol.libBasicCollectionEventMod.CollectionEvent
import typingsJapgolly.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typingsJapgolly.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typingsJapgolly.ecol.libBasicIeventdispatcherMod.IEventDispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBasicEventDispatcherMod {
  
  @JSImport("ecol/lib/basic/EventDispatcher", "EventDispatcher")
  @js.native
  open class EventDispatcher[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] ()
    extends StObject
       with IEventDispatcher[T, SourceT, IteratorT, ReverseT] {
    
    /* CompleteClass */
    override def addEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit = js.native
    
    /* CompleteClass */
    override def dispatchEvent(event: CollectionEvent[T, SourceT, IteratorT, ReverseT]): Unit = js.native
    
    /* CompleteClass */
    override def hasEventListener(`type`: Type): Boolean = js.native
    
    /**
      * @hidden
      */
    /* private */ var listeners_ : Any = js.native
    
    /* CompleteClass */
    override def removeEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit = js.native
  }
}
