package typingsJapgolly.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectStackDriftOutput extends StObject {
  
  /**
    * The ID of the drift detection results of this operation. CloudFormation generates new results, with a new drift detection ID, each time this operation is run. However, the number of drift results CloudFormation retains for any given stack, and for how long, may vary.
    */
  var StackDriftDetectionId: typingsJapgolly.awsSdk.clientsCloudformationMod.StackDriftDetectionId
}
object DetectStackDriftOutput {
  
  inline def apply(StackDriftDetectionId: StackDriftDetectionId): DetectStackDriftOutput = {
    val __obj = js.Dynamic.literal(StackDriftDetectionId = StackDriftDetectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectStackDriftOutput]
  }
  
  extension [Self <: DetectStackDriftOutput](x: Self) {
    
    inline def setStackDriftDetectionId(value: StackDriftDetectionId): Self = StObject.set(x, "StackDriftDetectionId", value.asInstanceOf[js.Any])
  }
}
