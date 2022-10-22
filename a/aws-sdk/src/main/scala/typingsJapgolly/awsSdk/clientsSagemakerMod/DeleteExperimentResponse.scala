package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteExperimentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the experiment that is being deleted.
    */
  var ExperimentArn: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.ExperimentArn] = js.undefined
}
object DeleteExperimentResponse {
  
  inline def apply(): DeleteExperimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteExperimentResponse]
  }
  
  extension [Self <: DeleteExperimentResponse](x: Self) {
    
    inline def setExperimentArn(value: ExperimentArn): Self = StObject.set(x, "ExperimentArn", value.asInstanceOf[js.Any])
    
    inline def setExperimentArnUndefined: Self = StObject.set(x, "ExperimentArn", js.undefined)
  }
}
