package typingsJapgolly.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitTaskStateChangeResponse extends StObject {
  
  /**
    * Acknowledgement of the state change.
    */
  var acknowledgment: js.UndefOr[String] = js.undefined
}
object SubmitTaskStateChangeResponse {
  
  inline def apply(): SubmitTaskStateChangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitTaskStateChangeResponse]
  }
  
  extension [Self <: SubmitTaskStateChangeResponse](x: Self) {
    
    inline def setAcknowledgment(value: String): Self = StObject.set(x, "acknowledgment", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgmentUndefined: Self = StObject.set(x, "acknowledgment", js.undefined)
  }
}
