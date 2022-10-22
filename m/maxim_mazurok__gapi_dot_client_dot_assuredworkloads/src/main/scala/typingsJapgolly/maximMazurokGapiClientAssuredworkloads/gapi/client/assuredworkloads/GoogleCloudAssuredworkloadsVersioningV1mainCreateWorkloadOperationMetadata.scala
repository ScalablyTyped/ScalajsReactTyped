package typingsJapgolly.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssuredworkloadsVersioningV1mainCreateWorkloadOperationMetadata extends StObject {
  
  /** Optional. Compliance controls that should be applied to the resources managed by the workload. */
  var complianceRegime: js.UndefOr[String] = js.undefined
  
  /** Optional. Time when the operation was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Optional. The display name of the workload. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Optional. The parent of the workload. */
  var parent: js.UndefOr[String] = js.undefined
  
  /** Optional. Resource properties in the input that are used for creating/customizing workload resources. */
  var resourceSettings: js.UndefOr[js.Array[GoogleCloudAssuredworkloadsVersioningV1mainWorkloadResourceSettings]] = js.undefined
}
object GoogleCloudAssuredworkloadsVersioningV1mainCreateWorkloadOperationMetadata {
  
  inline def apply(): GoogleCloudAssuredworkloadsVersioningV1mainCreateWorkloadOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsVersioningV1mainCreateWorkloadOperationMetadata]
  }
  
  extension [Self <: GoogleCloudAssuredworkloadsVersioningV1mainCreateWorkloadOperationMetadata](x: Self) {
    
    inline def setComplianceRegime(value: String): Self = StObject.set(x, "complianceRegime", value.asInstanceOf[js.Any])
    
    inline def setComplianceRegimeUndefined: Self = StObject.set(x, "complianceRegime", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setResourceSettings(value: js.Array[GoogleCloudAssuredworkloadsVersioningV1mainWorkloadResourceSettings]): Self = StObject.set(x, "resourceSettings", value.asInstanceOf[js.Any])
    
    inline def setResourceSettingsUndefined: Self = StObject.set(x, "resourceSettings", js.undefined)
    
    inline def setResourceSettingsVarargs(value: GoogleCloudAssuredworkloadsVersioningV1mainWorkloadResourceSettings*): Self = StObject.set(x, "resourceSettings", js.Array(value*))
  }
}
