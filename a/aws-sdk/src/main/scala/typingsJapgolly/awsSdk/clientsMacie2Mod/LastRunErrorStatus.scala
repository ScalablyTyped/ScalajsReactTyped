package typingsJapgolly.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastRunErrorStatus extends StObject {
  
  /**
    * Specifies whether any account- or bucket-level access errors occurred when the job ran. For a recurring job, this value indicates the error status of the job's most recent run. Possible values are: ERROR - One or more errors occurred. Amazon Macie didn't process all the data specified for the job. NONE - No errors occurred. Macie processed all the data specified for the job.
    */
  var code: js.UndefOr[LastRunErrorStatusCode] = js.undefined
}
object LastRunErrorStatus {
  
  inline def apply(): LastRunErrorStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastRunErrorStatus]
  }
  
  extension [Self <: LastRunErrorStatus](x: Self) {
    
    inline def setCode(value: LastRunErrorStatusCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
