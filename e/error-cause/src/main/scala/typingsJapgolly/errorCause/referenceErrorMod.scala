package typingsJapgolly.errorCause

import typingsJapgolly.errorCause.anon.Cause
import typingsJapgolly.std.ReferenceErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object referenceErrorMod {
  
  @JSImport("error-cause/ReferenceError", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ReferenceError {
    def this(reason: String) = this()
    def this(reason: String, options: Cause) = this()
    def this(reason: Unit, options: Cause) = this()
  }
  
  @js.native
  trait ReferenceError
    extends StObject
       with ReferenceErrorConstructor {
    
    var cause: Any = js.native
  }
}
