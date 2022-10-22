package typingsJapgolly.ecol

import typingsJapgolly.std.Iterable
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBasicCollectionEventMod {
  
  @JSImport("ecol/lib/basic/CollectionEvent", "CollectionEvent")
  @js.native
  open class CollectionEvent[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] protected ()
    extends StObject
       with Iterable[T] {
    def this(`type`: String, first: IteratorT, last: IteratorT) = this()
    
    val first: IteratorT = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_CollectionEvent: js.Function0[IterableIterator[T]] = js.native
    
    val last: IteratorT = js.native
    
    val `type`: String = js.native
  }
  object CollectionEvent {
    
    type Listener[T, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */] = js.Function1[/* event */ CollectionEvent[T, SourceT, IteratorT, ReverseT], Unit]
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.ecol.ecolStrings.insert
      - typingsJapgolly.ecol.ecolStrings.erase
      - typingsJapgolly.ecol.ecolStrings.refresh
    */
    trait Type extends StObject
    object Type {
      
      inline def erase: typingsJapgolly.ecol.ecolStrings.erase = "erase".asInstanceOf[typingsJapgolly.ecol.ecolStrings.erase]
      
      inline def insert: typingsJapgolly.ecol.ecolStrings.insert = "insert".asInstanceOf[typingsJapgolly.ecol.ecolStrings.insert]
      
      inline def refresh: typingsJapgolly.ecol.ecolStrings.refresh = "refresh".asInstanceOf[typingsJapgolly.ecol.ecolStrings.refresh]
    }
  }
}
