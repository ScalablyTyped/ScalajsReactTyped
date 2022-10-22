package typingsJapgolly.typescriptOptional

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptOptional.typescriptOptionalStrings.empty
import typingsJapgolly.typescriptOptional.typescriptOptionalStrings.present
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmTypesMod {
  
  trait Cases[T, U] extends StObject {
    
    def empty(): U
    
    def present(value: T): U
  }
  object Cases {
    
    inline def apply[T, U](empty: CallbackTo[U], present: T => U): Cases[T, U] = {
      val __obj = js.Dynamic.literal(empty = empty.toJsFn, present = js.Any.fromFunction1(present))
      __obj.asInstanceOf[Cases[T, U]]
    }
    
    extension [Self <: Cases[?, ?], T, U](x: Self & (Cases[T, U])) {
      
      inline def setEmpty(value: CallbackTo[U]): Self = StObject.set(x, "empty", value.toJsFn)
      
      inline def setPresent(value: T => U): Self = StObject.set(x, "present", js.Any.fromFunction1(value))
    }
  }
  
  trait Empty[T]
    extends StObject
       with Option[T] {
    
    var kind: empty
  }
  object Empty {
    
    inline def apply[T](): Empty[T] = {
      val __obj = js.Dynamic.literal(kind = "empty")
      __obj.asInstanceOf[Empty[T]]
    }
    
    extension [Self <: Empty[?], T](x: Self & Empty[T]) {
      
      inline def setKind(value: empty): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typescriptOptional.distEsmTypesMod.Present[T]
    - typingsJapgolly.typescriptOptional.distEsmTypesMod.Empty[T]
  */
  trait Option[T] extends StObject
  object Option {
    
    inline def Empty[T](): typingsJapgolly.typescriptOptional.distEsmTypesMod.Empty[T] = {
      val __obj = js.Dynamic.literal(kind = "empty")
      __obj.asInstanceOf[typingsJapgolly.typescriptOptional.distEsmTypesMod.Empty[T]]
    }
    
    inline def Present[T](value: T): typingsJapgolly.typescriptOptional.distEsmTypesMod.Present[T] = {
      val __obj = js.Dynamic.literal(kind = "present", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.typescriptOptional.distEsmTypesMod.Present[T]]
    }
  }
  
  trait Present[T]
    extends StObject
       with Option[T] {
    
    var kind: present
    
    var value: T
  }
  object Present {
    
    inline def apply[T](value: T): Present[T] = {
      val __obj = js.Dynamic.literal(kind = "present", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Present[T]]
    }
    
    extension [Self <: Present[?], T](x: Self & Present[T]) {
      
      inline def setKind(value: present): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
