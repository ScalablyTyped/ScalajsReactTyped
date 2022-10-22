package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3VariantsHistory extends StObject {
  
  /** Update time of the variants. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** The flow versions as the variants. */
  var versionVariants: js.UndefOr[GoogleCloudDialogflowCxV3VersionVariants] = js.undefined
}
object GoogleCloudDialogflowCxV3VariantsHistory {
  
  inline def apply(): GoogleCloudDialogflowCxV3VariantsHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3VariantsHistory]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3VariantsHistory](x: Self) {
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVersionVariants(value: GoogleCloudDialogflowCxV3VersionVariants): Self = StObject.set(x, "versionVariants", value.asInstanceOf[js.Any])
    
    inline def setVersionVariantsUndefined: Self = StObject.set(x, "versionVariants", js.undefined)
  }
}
