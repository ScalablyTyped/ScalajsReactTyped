package typingsJapgolly.markdownDraftJs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Close extends StObject {
    
    def close(): String = js.native
    def close(
      entity: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ Any
    ): String = js.native
    
    def open(): String = js.native
    def open(
      entity: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ Any
    ): String = js.native
  }
  
  trait Open extends StObject {
    
    def close(): String
    
    def open(): String
  }
  object Open {
    
    inline def apply(close: CallbackTo[String], open: CallbackTo[String]): Open = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, open = open.toJsFn)
      __obj.asInstanceOf[Open]
    }
    
    extension [Self <: Open](x: Self) {
      
      inline def setClose(value: CallbackTo[String]): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setOpen(value: CallbackTo[String]): Self = StObject.set(x, "open", value.toJsFn)
    }
  }
}
