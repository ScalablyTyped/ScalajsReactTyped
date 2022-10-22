package typingsJapgolly.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyName extends StObject {
  
  /** Identifies an instance of the type. ID format varies by type. The ID format is defined in the IAM .service file that defines the type, either in path_mapping or in a comment. */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * For Cloud IAM: The location of the Policy. Must be empty or "global" for Policies owned by global IAM. Must name a region from prodspec/cloud-iam-cloudspec for Regional IAM
    * Policies, see go/iam-faq#where-is-iam-currently-deployed. For Local IAM: This field should be set to "local".
    */
  var region: js.UndefOr[String] = js.undefined
  
  /** Resource type. Types are defined in IAM's .service files. Valid values for type might be 'gce', 'gcs', 'project', 'account' etc. */
  var `type`: js.UndefOr[String] = js.undefined
}
object PolicyName {
  
  inline def apply(): PolicyName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyName]
  }
  
  extension [Self <: PolicyName](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
