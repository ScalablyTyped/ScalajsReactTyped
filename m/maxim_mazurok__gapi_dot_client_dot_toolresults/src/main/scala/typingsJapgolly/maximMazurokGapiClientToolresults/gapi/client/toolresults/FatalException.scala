package typingsJapgolly.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FatalException extends StObject {
  
  /** The stack trace of the fatal exception. Optional. */
  var stackTrace: js.UndefOr[StackTrace] = js.undefined
}
object FatalException {
  
  inline def apply(): FatalException = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FatalException]
  }
  
  extension [Self <: FatalException](x: Self) {
    
    inline def setStackTrace(value: StackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    inline def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
  }
}
