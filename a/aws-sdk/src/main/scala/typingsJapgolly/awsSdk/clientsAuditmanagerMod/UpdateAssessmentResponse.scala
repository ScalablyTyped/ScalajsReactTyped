package typingsJapgolly.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAssessmentResponse extends StObject {
  
  /**
    *  The response object for the UpdateAssessmentRequest API. This is the name of the updated assessment.
    */
  var assessment: js.UndefOr[Assessment] = js.undefined
}
object UpdateAssessmentResponse {
  
  inline def apply(): UpdateAssessmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAssessmentResponse]
  }
  
  extension [Self <: UpdateAssessmentResponse](x: Self) {
    
    inline def setAssessment(value: Assessment): Self = StObject.set(x, "assessment", value.asInstanceOf[js.Any])
    
    inline def setAssessmentUndefined: Self = StObject.set(x, "assessment", js.undefined)
  }
}
