package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExperimentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the experiment.
    */
  var ExperimentArn: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.ExperimentArn] = js.undefined
}
object CreateExperimentResponse {
  
  inline def apply(): CreateExperimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateExperimentResponse]
  }
  
  extension [Self <: CreateExperimentResponse](x: Self) {
    
    inline def setExperimentArn(value: ExperimentArn): Self = StObject.set(x, "ExperimentArn", value.asInstanceOf[js.Any])
    
    inline def setExperimentArnUndefined: Self = StObject.set(x, "ExperimentArn", js.undefined)
  }
}
