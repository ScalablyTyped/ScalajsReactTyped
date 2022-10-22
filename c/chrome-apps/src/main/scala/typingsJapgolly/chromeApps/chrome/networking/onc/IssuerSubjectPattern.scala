package typingsJapgolly.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuerSubjectPattern extends StObject {
  
  /** If set, the value against which to match the certificate subject's common name. */
  var CommonName: js.UndefOr[String] = js.undefined
  
  /** If set, the value against which to match the certificate subject's common location. */
  var Locality: js.UndefOr[String] = js.undefined
  
  /**
    * If set, the value against which to match the certificate subject's organizations.
    * At least one organization should match the value.
    */
  var Organization: js.UndefOr[String] = js.undefined
  
  /**
    * If set, the value against which to match the certificate subject's organizational units.
    * At least one organizational unit should match the value.
    */
  var OrganizationalUnit: js.UndefOr[String] = js.undefined
}
object IssuerSubjectPattern {
  
  inline def apply(): IssuerSubjectPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssuerSubjectPattern]
  }
  
  extension [Self <: IssuerSubjectPattern](x: Self) {
    
    inline def setCommonName(value: String): Self = StObject.set(x, "CommonName", value.asInstanceOf[js.Any])
    
    inline def setCommonNameUndefined: Self = StObject.set(x, "CommonName", js.undefined)
    
    inline def setLocality(value: String): Self = StObject.set(x, "Locality", value.asInstanceOf[js.Any])
    
    inline def setLocalityUndefined: Self = StObject.set(x, "Locality", js.undefined)
    
    inline def setOrganization(value: String): Self = StObject.set(x, "Organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "Organization", js.undefined)
    
    inline def setOrganizationalUnit(value: String): Self = StObject.set(x, "OrganizationalUnit", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitUndefined: Self = StObject.set(x, "OrganizationalUnit", js.undefined)
  }
}
