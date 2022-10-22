package typingsJapgolly.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiServiceusageV1beta1ServiceIdentity extends StObject {
  
  /** The email address of the service account that a service producer would use to access consumer resources. */
  var email: js.UndefOr[String] = js.undefined
  
  /** The unique and stable id of the service account. https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts#ServiceAccount */
  var uniqueId: js.UndefOr[String] = js.undefined
}
object GoogleApiServiceusageV1beta1ServiceIdentity {
  
  inline def apply(): GoogleApiServiceusageV1beta1ServiceIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleApiServiceusageV1beta1ServiceIdentity]
  }
  
  extension [Self <: GoogleApiServiceusageV1beta1ServiceIdentity](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setUniqueId(value: String): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    
    inline def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
  }
}
