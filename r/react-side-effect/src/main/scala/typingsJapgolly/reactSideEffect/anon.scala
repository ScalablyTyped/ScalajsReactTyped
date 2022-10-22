package typingsJapgolly.reactSideEffect

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Peek[TPeek, TRewind] extends StObject {
    
    def peek(): TPeek
    
    def rewind(): TRewind
  }
  object Peek {
    
    inline def apply[TPeek, TRewind](peek: CallbackTo[TPeek], rewind: CallbackTo[TRewind]): Peek[TPeek, TRewind] = {
      val __obj = js.Dynamic.literal(peek = peek.toJsFn, rewind = rewind.toJsFn)
      __obj.asInstanceOf[Peek[TPeek, TRewind]]
    }
    
    extension [Self <: Peek[?, ?], TPeek, TRewind](x: Self & (Peek[TPeek, TRewind])) {
      
      inline def setPeek(value: CallbackTo[TPeek]): Self = StObject.set(x, "peek", value.toJsFn)
      
      inline def setRewind(value: CallbackTo[TRewind]): Self = StObject.set(x, "rewind", value.toJsFn)
    }
  }
}
