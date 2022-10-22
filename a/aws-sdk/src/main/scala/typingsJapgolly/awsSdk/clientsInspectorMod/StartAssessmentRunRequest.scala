package typingsJapgolly.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartAssessmentRunRequest extends StObject {
  
  /**
    * You can specify the name for the assessment run. The name must be unique for the assessment template whose ARN is used to start the assessment run.
    */
  var assessmentRunName: js.UndefOr[AssessmentRunName] = js.undefined
  
  /**
    * The ARN of the assessment template of the assessment run that you want to start.
    */
  var assessmentTemplateArn: Arn
}
object StartAssessmentRunRequest {
  
  inline def apply(assessmentTemplateArn: Arn): StartAssessmentRunRequest = {
    val __obj = js.Dynamic.literal(assessmentTemplateArn = assessmentTemplateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAssessmentRunRequest]
  }
  
  extension [Self <: StartAssessmentRunRequest](x: Self) {
    
    inline def setAssessmentRunName(value: AssessmentRunName): Self = StObject.set(x, "assessmentRunName", value.asInstanceOf[js.Any])
    
    inline def setAssessmentRunNameUndefined: Self = StObject.set(x, "assessmentRunName", js.undefined)
    
    inline def setAssessmentTemplateArn(value: Arn): Self = StObject.set(x, "assessmentTemplateArn", value.asInstanceOf[js.Any])
  }
}
