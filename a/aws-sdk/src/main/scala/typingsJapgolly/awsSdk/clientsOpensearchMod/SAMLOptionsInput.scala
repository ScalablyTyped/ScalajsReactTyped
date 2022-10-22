package typingsJapgolly.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SAMLOptionsInput extends StObject {
  
  /**
    * True if SAML is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The SAML Identity Provider's information.
    */
  var Idp: js.UndefOr[SAMLIdp] = js.undefined
  
  /**
    * The backend role that the SAML master user is mapped to.
    */
  var MasterBackendRole: js.UndefOr[BackendRole] = js.undefined
  
  /**
    * The SAML master username, which is stored in the Amazon OpenSearch Service domain's internal database.
    */
  var MasterUserName: js.UndefOr[Username] = js.undefined
  
  /**
    * Element of the SAML assertion to use for backend roles. Default is roles.
    */
  var RolesKey: js.UndefOr[String] = js.undefined
  
  /**
    * The duration, in minutes, after which a user session becomes inactive. Acceptable values are between 1 and 1440, and the default value is 60. 
    */
  var SessionTimeoutMinutes: js.UndefOr[IntegerClass] = js.undefined
  
  /**
    * Element of the SAML assertion to use for username. Default is NameID.
    */
  var SubjectKey: js.UndefOr[String] = js.undefined
}
object SAMLOptionsInput {
  
  inline def apply(): SAMLOptionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SAMLOptionsInput]
  }
  
  extension [Self <: SAMLOptionsInput](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setIdp(value: SAMLIdp): Self = StObject.set(x, "Idp", value.asInstanceOf[js.Any])
    
    inline def setIdpUndefined: Self = StObject.set(x, "Idp", js.undefined)
    
    inline def setMasterBackendRole(value: BackendRole): Self = StObject.set(x, "MasterBackendRole", value.asInstanceOf[js.Any])
    
    inline def setMasterBackendRoleUndefined: Self = StObject.set(x, "MasterBackendRole", js.undefined)
    
    inline def setMasterUserName(value: Username): Self = StObject.set(x, "MasterUserName", value.asInstanceOf[js.Any])
    
    inline def setMasterUserNameUndefined: Self = StObject.set(x, "MasterUserName", js.undefined)
    
    inline def setRolesKey(value: String): Self = StObject.set(x, "RolesKey", value.asInstanceOf[js.Any])
    
    inline def setRolesKeyUndefined: Self = StObject.set(x, "RolesKey", js.undefined)
    
    inline def setSessionTimeoutMinutes(value: IntegerClass): Self = StObject.set(x, "SessionTimeoutMinutes", value.asInstanceOf[js.Any])
    
    inline def setSessionTimeoutMinutesUndefined: Self = StObject.set(x, "SessionTimeoutMinutes", js.undefined)
    
    inline def setSubjectKey(value: String): Self = StObject.set(x, "SubjectKey", value.asInstanceOf[js.Any])
    
    inline def setSubjectKeyUndefined: Self = StObject.set(x, "SubjectKey", js.undefined)
  }
}
