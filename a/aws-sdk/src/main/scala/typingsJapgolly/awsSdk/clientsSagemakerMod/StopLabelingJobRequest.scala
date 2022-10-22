package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopLabelingJobRequest extends StObject {
  
  /**
    * The name of the labeling job to stop.
    */
  var LabelingJobName: typingsJapgolly.awsSdk.clientsSagemakerMod.LabelingJobName
}
object StopLabelingJobRequest {
  
  inline def apply(LabelingJobName: LabelingJobName): StopLabelingJobRequest = {
    val __obj = js.Dynamic.literal(LabelingJobName = LabelingJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopLabelingJobRequest]
  }
  
  extension [Self <: StopLabelingJobRequest](x: Self) {
    
    inline def setLabelingJobName(value: LabelingJobName): Self = StObject.set(x, "LabelingJobName", value.asInstanceOf[js.Any])
  }
}
