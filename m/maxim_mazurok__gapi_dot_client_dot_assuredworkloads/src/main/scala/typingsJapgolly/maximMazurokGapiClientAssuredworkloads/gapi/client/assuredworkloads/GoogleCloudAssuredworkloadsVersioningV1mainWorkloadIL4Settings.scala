package typingsJapgolly.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssuredworkloadsVersioningV1mainWorkloadIL4Settings extends StObject {
  
  /** Input only. Immutable. Settings used to create a CMEK crypto key. */
  var kmsSettings: js.UndefOr[GoogleCloudAssuredworkloadsVersioningV1mainWorkloadKMSSettings] = js.undefined
}
object GoogleCloudAssuredworkloadsVersioningV1mainWorkloadIL4Settings {
  
  inline def apply(): GoogleCloudAssuredworkloadsVersioningV1mainWorkloadIL4Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsVersioningV1mainWorkloadIL4Settings]
  }
  
  extension [Self <: GoogleCloudAssuredworkloadsVersioningV1mainWorkloadIL4Settings](x: Self) {
    
    inline def setKmsSettings(value: GoogleCloudAssuredworkloadsVersioningV1mainWorkloadKMSSettings): Self = StObject.set(x, "kmsSettings", value.asInstanceOf[js.Any])
    
    inline def setKmsSettingsUndefined: Self = StObject.set(x, "kmsSettings", js.undefined)
  }
}
