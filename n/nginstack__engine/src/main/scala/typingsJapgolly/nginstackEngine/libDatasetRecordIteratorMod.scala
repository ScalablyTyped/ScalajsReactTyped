package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetRecordIteratorMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dataset/RecordIterator", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with RecordIterator {
    
    /* CompleteClass */
    override def next(): Any = js.native
  }
  @JSImport("@nginstack/engine/lib/dataset/RecordIterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait RecordIterator extends StObject {
    
    def next(): Any
  }
  object RecordIterator {
    
    inline def apply(next: CallbackTo[Any]): RecordIterator = {
      val __obj = js.Dynamic.literal(next = next.toJsFn)
      __obj.asInstanceOf[RecordIterator]
    }
    
    extension [Self <: RecordIterator](x: Self) {
      
      inline def setNext(value: CallbackTo[Any]): Self = StObject.set(x, "next", value.toJsFn)
    }
  }
}
