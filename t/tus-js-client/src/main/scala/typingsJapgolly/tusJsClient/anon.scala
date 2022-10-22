package typingsJapgolly.tusJsClient

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.ReadableStreamReadResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait End extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object End {
    
    inline def apply(end: Double, start: Double): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<std.ReadableStreamDefaultReader<any>, 'read'> */
  trait PickReadableStreamDefault extends StObject {
    
    def read(): js.Promise[ReadableStreamReadResult[Any]]
    @JSName("read")
    var read_Original: js.Function0[js.Promise[ReadableStreamReadResult[Any]]]
  }
  object PickReadableStreamDefault {
    
    inline def apply(read: CallbackTo[js.Promise[ReadableStreamReadResult[Any]]]): PickReadableStreamDefault = {
      val __obj = js.Dynamic.literal(read = read.toJsFn)
      __obj.asInstanceOf[PickReadableStreamDefault]
    }
    
    extension [Self <: PickReadableStreamDefault](x: Self) {
      
      inline def setRead(value: CallbackTo[js.Promise[ReadableStreamReadResult[Any]]]): Self = StObject.set(x, "read", value.toJsFn)
    }
  }
}
