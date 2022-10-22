package typingsJapgolly.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobResponse extends StObject {
  
  /**
    * A section of the response body that provides information about the job that is created.
    */
  var Job: js.UndefOr[typingsJapgolly.awsSdk.clientsElastictranscoderMod.Job] = js.undefined
}
object CreateJobResponse {
  
  inline def apply(): CreateJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobResponse]
  }
  
  extension [Self <: CreateJobResponse](x: Self) {
    
    inline def setJob(value: Job): Self = StObject.set(x, "Job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "Job", js.undefined)
  }
}
