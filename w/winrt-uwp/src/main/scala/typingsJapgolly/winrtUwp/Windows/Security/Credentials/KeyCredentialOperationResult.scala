package typingsJapgolly.winrtUwp.Windows.Security.Credentials

import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of a key credential operation. */
trait KeyCredentialOperationResult extends StObject {
  
  /** Gets the result of the key credential operation. */
  var result: IBuffer
  
  /** Gets the status of the key credential. */
  var status: KeyCredentialStatus
}
object KeyCredentialOperationResult {
  
  inline def apply(result: IBuffer, status: KeyCredentialStatus): KeyCredentialOperationResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCredentialOperationResult]
  }
  
  extension [Self <: KeyCredentialOperationResult](x: Self) {
    
    inline def setResult(value: IBuffer): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: KeyCredentialStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
