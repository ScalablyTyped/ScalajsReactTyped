package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLabelingJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the labeling job. You use this ARN to identify the labeling job.
    */
  var LabelingJobArn: typingsJapgolly.awsSdk.clientsSagemakerMod.LabelingJobArn
}
object CreateLabelingJobResponse {
  
  inline def apply(LabelingJobArn: LabelingJobArn): CreateLabelingJobResponse = {
    val __obj = js.Dynamic.literal(LabelingJobArn = LabelingJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLabelingJobResponse]
  }
  
  extension [Self <: CreateLabelingJobResponse](x: Self) {
    
    inline def setLabelingJobArn(value: LabelingJobArn): Self = StObject.set(x, "LabelingJobArn", value.asInstanceOf[js.Any])
  }
}
