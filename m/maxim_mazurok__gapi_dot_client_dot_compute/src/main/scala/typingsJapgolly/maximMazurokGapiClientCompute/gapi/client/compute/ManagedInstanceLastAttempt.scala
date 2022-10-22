package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import typingsJapgolly.maximMazurokGapiClientCompute.anon.Errors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedInstanceLastAttempt extends StObject {
  
  /** [Output Only] Encountered errors during the last attempt to create or delete the instance. */
  var errors: js.UndefOr[Errors] = js.undefined
}
object ManagedInstanceLastAttempt {
  
  inline def apply(): ManagedInstanceLastAttempt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedInstanceLastAttempt]
  }
  
  extension [Self <: ManagedInstanceLastAttempt](x: Self) {
    
    inline def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
  }
}
