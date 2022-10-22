package typingsJapgolly.ensureError

import typingsJapgolly.ensureError.anon.ErrorWithStackError
import typingsJapgolly.ensureError.anon.Stack
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ensure-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](input: T): IfAny[
    T, 
    ErrorWithStackError, 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Error ? ensure-error.ensure-error.ErrorWithStack<T> : ensure-error.ensure-error.NonError */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[IfAny[
    T, 
    ErrorWithStackError, 
    /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Error ? ensure-error.ensure-error.ErrorWithStack<T> : ensure-error.ensure-error.NonError */ js.Any
  ]]
  
  type ErrorWithStack[T] = T & Stack
  
  // IfAny<T, ThenType, ElseType> resolves to ThenType if T is `any` and resolves to ElseType otherwise
  // https://stackoverflow.com/a/49928360/4135063
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    0 extends 1 & T ? ThenType : ElseType
    }}}
    */
  @js.native
  trait IfAny[T, ThenType, ElseType] extends StObject
  
  trait NonError
    extends StObject
       with Error {
    
    @JSName("name")
    var name_NonError: typingsJapgolly.ensureError.ensureErrorStrings.NonError
    
    @JSName("stack")
    var stack_NonError: String
  }
  object NonError {
    
    inline def apply(message: String, stack: String): NonError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = "NonError", stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[NonError]
    }
    
    extension [Self <: NonError](x: Self) {
      
      inline def setName(value: typingsJapgolly.ensureError.ensureErrorStrings.NonError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
}
