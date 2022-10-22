package typingsJapgolly.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDirectoryConfigRequest extends StObject {
  
  /**
    * The fully qualified name of the directory (for example, corp.example.com).
    */
  var DirectoryName: typingsJapgolly.awsSdk.clientsAppstreamMod.DirectoryName
  
  /**
    * The distinguished names of the organizational units for computer accounts.
    */
  var OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList
  
  /**
    * The credentials for the service account used by the fleet or image builder to connect to the directory.
    */
  var ServiceAccountCredentials: js.UndefOr[typingsJapgolly.awsSdk.clientsAppstreamMod.ServiceAccountCredentials] = js.undefined
}
object CreateDirectoryConfigRequest {
  
  inline def apply(
    DirectoryName: DirectoryName,
    OrganizationalUnitDistinguishedNames: OrganizationalUnitDistinguishedNamesList
  ): CreateDirectoryConfigRequest = {
    val __obj = js.Dynamic.literal(DirectoryName = DirectoryName.asInstanceOf[js.Any], OrganizationalUnitDistinguishedNames = OrganizationalUnitDistinguishedNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectoryConfigRequest]
  }
  
  extension [Self <: CreateDirectoryConfigRequest](x: Self) {
    
    inline def setDirectoryName(value: DirectoryName): Self = StObject.set(x, "DirectoryName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitDistinguishedNames(value: OrganizationalUnitDistinguishedNamesList): Self = StObject.set(x, "OrganizationalUnitDistinguishedNames", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitDistinguishedNamesVarargs(value: OrganizationalUnitDistinguishedName*): Self = StObject.set(x, "OrganizationalUnitDistinguishedNames", js.Array(value*))
    
    inline def setServiceAccountCredentials(value: ServiceAccountCredentials): Self = StObject.set(x, "ServiceAccountCredentials", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountCredentialsUndefined: Self = StObject.set(x, "ServiceAccountCredentials", js.undefined)
  }
}
