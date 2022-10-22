package typingsJapgolly.mmdbLib.libReaderResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mmdbLib.libReaderResponseMod.CountryResponse
  - typingsJapgolly.mmdbLib.libReaderResponseMod.CityResponse
  - typingsJapgolly.mmdbLib.libReaderResponseMod.AnonymousIPResponse
  - typingsJapgolly.mmdbLib.libReaderResponseMod.AsnResponse
  - typingsJapgolly.mmdbLib.libReaderResponseMod.ConnectionTypeResponse
  - typingsJapgolly.mmdbLib.libReaderResponseMod.DomainResponse
  - typingsJapgolly.mmdbLib.libReaderResponseMod.IspResponse
*/
trait Response extends StObject
object Response {
  
  inline def AnonymousIPResponse(): typingsJapgolly.mmdbLib.libReaderResponseMod.AnonymousIPResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.mmdbLib.libReaderResponseMod.AnonymousIPResponse]
  }
  
  inline def AsnResponse(autonomous_system_number: Double, autonomous_system_organization: String): typingsJapgolly.mmdbLib.libReaderResponseMod.AsnResponse = {
    val __obj = js.Dynamic.literal(autonomous_system_number = autonomous_system_number.asInstanceOf[js.Any], autonomous_system_organization = autonomous_system_organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mmdbLib.libReaderResponseMod.AsnResponse]
  }
  
  inline def CityResponse(): typingsJapgolly.mmdbLib.libReaderResponseMod.CityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.mmdbLib.libReaderResponseMod.CityResponse]
  }
  
  inline def ConnectionTypeResponse(connection_type: String): typingsJapgolly.mmdbLib.libReaderResponseMod.ConnectionTypeResponse = {
    val __obj = js.Dynamic.literal(connection_type = connection_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mmdbLib.libReaderResponseMod.ConnectionTypeResponse]
  }
  
  inline def CountryResponse(): typingsJapgolly.mmdbLib.libReaderResponseMod.CountryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.mmdbLib.libReaderResponseMod.CountryResponse]
  }
  
  inline def DomainResponse(domain: String): typingsJapgolly.mmdbLib.libReaderResponseMod.DomainResponse = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mmdbLib.libReaderResponseMod.DomainResponse]
  }
  
  inline def IspResponse(
    autonomous_system_number: Double,
    autonomous_system_organization: String,
    isp: String,
    organization: String
  ): typingsJapgolly.mmdbLib.libReaderResponseMod.IspResponse = {
    val __obj = js.Dynamic.literal(autonomous_system_number = autonomous_system_number.asInstanceOf[js.Any], autonomous_system_organization = autonomous_system_organization.asInstanceOf[js.Any], isp = isp.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mmdbLib.libReaderResponseMod.IspResponse]
  }
}
