package typingsJapgolly.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackTrace extends StObject {
  
  /** The stack trace message. Required */
  var exception: js.UndefOr[String] = js.undefined
}
object StackTrace {
  
  inline def apply(): StackTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackTrace]
  }
  
  extension [Self <: StackTrace](x: Self) {
    
    inline def setException(value: String): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    inline def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
  }
}
