package typingsJapgolly.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1Study extends StObject {
  
  /** Output only. Time at which the study was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. A human readable reason why the Study is inactive. This should be empty if a study is ACTIVE or COMPLETED. */
  var inactiveReason: js.UndefOr[String] = js.undefined
  
  /** Output only. The name of a study. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The detailed state of a study. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Required. Configuration of the study. */
  var studyConfig: js.UndefOr[GoogleCloudMlV1StudyConfig] = js.undefined
}
object GoogleCloudMlV1Study {
  
  inline def apply(): GoogleCloudMlV1Study = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1Study]
  }
  
  extension [Self <: GoogleCloudMlV1Study](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setInactiveReason(value: String): Self = StObject.set(x, "inactiveReason", value.asInstanceOf[js.Any])
    
    inline def setInactiveReasonUndefined: Self = StObject.set(x, "inactiveReason", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStudyConfig(value: GoogleCloudMlV1StudyConfig): Self = StObject.set(x, "studyConfig", value.asInstanceOf[js.Any])
    
    inline def setStudyConfigUndefined: Self = StObject.set(x, "studyConfig", js.undefined)
  }
}
