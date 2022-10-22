package typingsJapgolly.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopExperimentRequest extends StObject {
  
  /**
    * The ID of the experiment.
    */
  var id: ExperimentId
}
object StopExperimentRequest {
  
  inline def apply(id: ExperimentId): StopExperimentRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopExperimentRequest]
  }
  
  extension [Self <: StopExperimentRequest](x: Self) {
    
    inline def setId(value: ExperimentId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
