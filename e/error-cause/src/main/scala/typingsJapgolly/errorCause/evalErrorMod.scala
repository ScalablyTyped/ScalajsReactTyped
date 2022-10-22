package typingsJapgolly.errorCause

import typingsJapgolly.errorCause.anon.Cause
import typingsJapgolly.std.EvalErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object evalErrorMod {
  
  @JSImport("error-cause/EvalError", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with EvalError {
    def this(reason: String) = this()
    def this(reason: String, options: Cause) = this()
    def this(reason: Unit, options: Cause) = this()
  }
  
  @js.native
  trait EvalError
    extends StObject
       with EvalErrorConstructor {
    
    var cause: Any = js.native
  }
}
