package typingsJapgolly.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreExceptionsMod {
  
  /* note: abstract class */ @JSImport("sip.js/lib/core/exceptions", "Exception")
  @js.native
  /* protected */ open class Exception ()
    extends typingsJapgolly.sipJs.libCoreExceptionsExceptionMod.Exception {
    /* protected */ def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/core/exceptions", "TransactionStateError")
  @js.native
  open class TransactionStateError ()
    extends typingsJapgolly.sipJs.libCoreExceptionsTransactionStateErrorMod.TransactionStateError {
    def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/core/exceptions", "TransportError")
  @js.native
  open class TransportError ()
    extends typingsJapgolly.sipJs.libCoreExceptionsTransportErrorMod.TransportError {
    def this(message: String) = this()
  }
}
