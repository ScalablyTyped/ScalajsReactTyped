package typingsJapgolly.vscodeDebugprotocol.anon

import typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol.ExceptionBreakMode
import typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol.ExceptionDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakMode extends StObject {
  
  /** Mode that caused the exception notification to be raised. */
  var breakMode: ExceptionBreakMode
  
  /** Descriptive text for the exception. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Detailed information about the exception. */
  var details: js.UndefOr[ExceptionDetails] = js.undefined
  
  /** ID of the exception that was thrown. */
  var exceptionId: String
}
object BreakMode {
  
  inline def apply(breakMode: ExceptionBreakMode, exceptionId: String): BreakMode = {
    val __obj = js.Dynamic.literal(breakMode = breakMode.asInstanceOf[js.Any], exceptionId = exceptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakMode]
  }
  
  extension [Self <: BreakMode](x: Self) {
    
    inline def setBreakMode(value: ExceptionBreakMode): Self = StObject.set(x, "breakMode", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetails(value: ExceptionDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setExceptionId(value: String): Self = StObject.set(x, "exceptionId", value.asInstanceOf[js.Any])
  }
}
