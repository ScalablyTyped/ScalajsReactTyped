package typingsJapgolly.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssuredworkloadsV1beta1WorkloadCJISSettings extends StObject {
  
  /** Input only. Immutable. Settings used to create a CMEK crypto key. */
  var kmsSettings: js.UndefOr[GoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings] = js.undefined
}
object GoogleCloudAssuredworkloadsV1beta1WorkloadCJISSettings {
  
  inline def apply(): GoogleCloudAssuredworkloadsV1beta1WorkloadCJISSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsV1beta1WorkloadCJISSettings]
  }
  
  extension [Self <: GoogleCloudAssuredworkloadsV1beta1WorkloadCJISSettings](x: Self) {
    
    inline def setKmsSettings(value: GoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings): Self = StObject.set(x, "kmsSettings", value.asInstanceOf[js.Any])
    
    inline def setKmsSettingsUndefined: Self = StObject.set(x, "kmsSettings", js.undefined)
  }
}
