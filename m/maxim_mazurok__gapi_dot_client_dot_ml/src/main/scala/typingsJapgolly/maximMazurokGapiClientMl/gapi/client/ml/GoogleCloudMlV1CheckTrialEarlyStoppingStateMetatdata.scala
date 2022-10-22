package typingsJapgolly.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata extends StObject {
  
  /** The time at which the operation was submitted. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The name of the study that the trial belongs to. */
  var study: js.UndefOr[String] = js.undefined
  
  /** The trial name. */
  var trial: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata {
  
  inline def apply(): GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata]
  }
  
  extension [Self <: GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setStudy(value: String): Self = StObject.set(x, "study", value.asInstanceOf[js.Any])
    
    inline def setStudyUndefined: Self = StObject.set(x, "study", js.undefined)
    
    inline def setTrial(value: String): Self = StObject.set(x, "trial", value.asInstanceOf[js.Any])
    
    inline def setTrialUndefined: Self = StObject.set(x, "trial", js.undefined)
  }
}
