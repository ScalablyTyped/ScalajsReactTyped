package typingsJapgolly.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartJobRunResponse extends StObject {
  
  /**
    * The ID assigned to this job run.
    */
  var JobRunId: js.UndefOr[IdString] = js.undefined
}
object StartJobRunResponse {
  
  inline def apply(): StartJobRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartJobRunResponse]
  }
  
  extension [Self <: StartJobRunResponse](x: Self) {
    
    inline def setJobRunId(value: IdString): Self = StObject.set(x, "JobRunId", value.asInstanceOf[js.Any])
    
    inline def setJobRunIdUndefined: Self = StObject.set(x, "JobRunId", js.undefined)
  }
}
