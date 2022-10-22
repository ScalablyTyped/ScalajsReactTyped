package typingsJapgolly.ecol

import japgolly.scalajs.react.Callback
import typingsJapgolly.ecol.libBasicCollectionEventMod.CollectionEvent
import typingsJapgolly.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typingsJapgolly.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBasicIeventdispatcherMod {
  
  trait IEventDispatcher[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] extends StObject {
    
    def addEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit
    
    def dispatchEvent(event: CollectionEvent[T, SourceT, IteratorT, ReverseT]): Unit
    
    def hasEventListener(`type`: Type): Boolean
    
    def removeEventListener(`type`: Type, listener: Listener[T, SourceT, IteratorT, ReverseT]): Unit
  }
  object IEventDispatcher {
    
    inline def apply[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */](
      addEventListener: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Callback,
      dispatchEvent: CollectionEvent[T, SourceT, IteratorT, ReverseT] => Callback,
      hasEventListener: Type => Boolean,
      removeEventListener: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Callback
    ): IEventDispatcher[T, SourceT, IteratorT, ReverseT] = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2((t0: Type, t1: Listener[T, SourceT, IteratorT, ReverseT]) => (addEventListener(t0, t1)).runNow()), dispatchEvent = js.Any.fromFunction1((t0: CollectionEvent[T, SourceT, IteratorT, ReverseT]) => dispatchEvent(t0).runNow()), hasEventListener = js.Any.fromFunction1(hasEventListener), removeEventListener = js.Any.fromFunction2((t0: Type, t1: Listener[T, SourceT, IteratorT, ReverseT]) => (removeEventListener(t0, t1)).runNow()))
      __obj.asInstanceOf[IEventDispatcher[T, SourceT, IteratorT, ReverseT]]
    }
    
    extension [Self <: IEventDispatcher[?, ?, ?, ?], T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */](x: Self & (IEventDispatcher[T, SourceT, IteratorT, ReverseT])) {
      
      inline def setAddEventListener(value: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: Type, t1: Listener[T, SourceT, IteratorT, ReverseT]) => (value(t0, t1)).runNow()))
      
      inline def setDispatchEvent(value: CollectionEvent[T, SourceT, IteratorT, ReverseT] => Callback): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1((t0: CollectionEvent[T, SourceT, IteratorT, ReverseT]) => value(t0).runNow()))
      
      inline def setHasEventListener(value: Type => Boolean): Self = StObject.set(x, "hasEventListener", js.Any.fromFunction1(value))
      
      inline def setRemoveEventListener(value: (Type, Listener[T, SourceT, IteratorT, ReverseT]) => Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: Type, t1: Listener[T, SourceT, IteratorT, ReverseT]) => (value(t0, t1)).runNow()))
    }
  }
}
