package typingsJapgolly.mmdbLib.libReaderResponseMod

import typingsJapgolly.mmdbLib.mmdbLibStrings.business
import typingsJapgolly.mmdbLib.mmdbLibStrings.cafe
import typingsJapgolly.mmdbLib.mmdbLibStrings.cellular
import typingsJapgolly.mmdbLib.mmdbLibStrings.college
import typingsJapgolly.mmdbLib.mmdbLibStrings.content_delivery_network
import typingsJapgolly.mmdbLib.mmdbLibStrings.dialup
import typingsJapgolly.mmdbLib.mmdbLibStrings.government
import typingsJapgolly.mmdbLib.mmdbLibStrings.hosting
import typingsJapgolly.mmdbLib.mmdbLibStrings.library
import typingsJapgolly.mmdbLib.mmdbLibStrings.military
import typingsJapgolly.mmdbLib.mmdbLibStrings.residential
import typingsJapgolly.mmdbLib.mmdbLibStrings.router
import typingsJapgolly.mmdbLib.mmdbLibStrings.school
import typingsJapgolly.mmdbLib.mmdbLibStrings.search_engine_spider
import typingsJapgolly.mmdbLib.mmdbLibStrings.traveler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraitsRecord extends StObject {
  
  val autonomous_system_number: js.UndefOr[Double] = js.undefined
  
  val autonomous_system_organization: js.UndefOr[String] = js.undefined
  
  val connection_type: js.UndefOr[String] = js.undefined
  
  val domain: js.UndefOr[String] = js.undefined
  
  var ip_address: js.UndefOr[String] = js.undefined
  
  val is_anonymous: js.UndefOr[Boolean] = js.undefined
  
  val is_anonymous_proxy: js.UndefOr[Boolean] = js.undefined
  
  val is_anonymous_vpn: js.UndefOr[Boolean] = js.undefined
  
  val is_hosting_provider: js.UndefOr[Boolean] = js.undefined
  
  val is_legitimate_proxy: js.UndefOr[Boolean] = js.undefined
  
  val is_public_proxy: js.UndefOr[Boolean] = js.undefined
  
  val is_satellite_provider: js.UndefOr[Boolean] = js.undefined
  
  val is_tor_exit_node: js.UndefOr[Boolean] = js.undefined
  
  val isp: js.UndefOr[String] = js.undefined
  
  val mobile_country_code: js.UndefOr[String] = js.undefined
  
  val mobile_network_code: js.UndefOr[String] = js.undefined
  
  val organization: js.UndefOr[String] = js.undefined
  
  val user_type: js.UndefOr[
    business | cafe | cellular | college | content_delivery_network | dialup | government | hosting | library | military | residential | router | school | search_engine_spider | traveler
  ] = js.undefined
}
object TraitsRecord {
  
  inline def apply(): TraitsRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraitsRecord]
  }
  
  extension [Self <: TraitsRecord](x: Self) {
    
    inline def setAutonomous_system_number(value: Double): Self = StObject.set(x, "autonomous_system_number", value.asInstanceOf[js.Any])
    
    inline def setAutonomous_system_numberUndefined: Self = StObject.set(x, "autonomous_system_number", js.undefined)
    
    inline def setAutonomous_system_organization(value: String): Self = StObject.set(x, "autonomous_system_organization", value.asInstanceOf[js.Any])
    
    inline def setAutonomous_system_organizationUndefined: Self = StObject.set(x, "autonomous_system_organization", js.undefined)
    
    inline def setConnection_type(value: String): Self = StObject.set(x, "connection_type", value.asInstanceOf[js.Any])
    
    inline def setConnection_typeUndefined: Self = StObject.set(x, "connection_type", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setIp_address(value: String): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
    
    inline def setIp_addressUndefined: Self = StObject.set(x, "ip_address", js.undefined)
    
    inline def setIs_anonymous(value: Boolean): Self = StObject.set(x, "is_anonymous", value.asInstanceOf[js.Any])
    
    inline def setIs_anonymousUndefined: Self = StObject.set(x, "is_anonymous", js.undefined)
    
    inline def setIs_anonymous_proxy(value: Boolean): Self = StObject.set(x, "is_anonymous_proxy", value.asInstanceOf[js.Any])
    
    inline def setIs_anonymous_proxyUndefined: Self = StObject.set(x, "is_anonymous_proxy", js.undefined)
    
    inline def setIs_anonymous_vpn(value: Boolean): Self = StObject.set(x, "is_anonymous_vpn", value.asInstanceOf[js.Any])
    
    inline def setIs_anonymous_vpnUndefined: Self = StObject.set(x, "is_anonymous_vpn", js.undefined)
    
    inline def setIs_hosting_provider(value: Boolean): Self = StObject.set(x, "is_hosting_provider", value.asInstanceOf[js.Any])
    
    inline def setIs_hosting_providerUndefined: Self = StObject.set(x, "is_hosting_provider", js.undefined)
    
    inline def setIs_legitimate_proxy(value: Boolean): Self = StObject.set(x, "is_legitimate_proxy", value.asInstanceOf[js.Any])
    
    inline def setIs_legitimate_proxyUndefined: Self = StObject.set(x, "is_legitimate_proxy", js.undefined)
    
    inline def setIs_public_proxy(value: Boolean): Self = StObject.set(x, "is_public_proxy", value.asInstanceOf[js.Any])
    
    inline def setIs_public_proxyUndefined: Self = StObject.set(x, "is_public_proxy", js.undefined)
    
    inline def setIs_satellite_provider(value: Boolean): Self = StObject.set(x, "is_satellite_provider", value.asInstanceOf[js.Any])
    
    inline def setIs_satellite_providerUndefined: Self = StObject.set(x, "is_satellite_provider", js.undefined)
    
    inline def setIs_tor_exit_node(value: Boolean): Self = StObject.set(x, "is_tor_exit_node", value.asInstanceOf[js.Any])
    
    inline def setIs_tor_exit_nodeUndefined: Self = StObject.set(x, "is_tor_exit_node", js.undefined)
    
    inline def setIsp(value: String): Self = StObject.set(x, "isp", value.asInstanceOf[js.Any])
    
    inline def setIspUndefined: Self = StObject.set(x, "isp", js.undefined)
    
    inline def setMobile_country_code(value: String): Self = StObject.set(x, "mobile_country_code", value.asInstanceOf[js.Any])
    
    inline def setMobile_country_codeUndefined: Self = StObject.set(x, "mobile_country_code", js.undefined)
    
    inline def setMobile_network_code(value: String): Self = StObject.set(x, "mobile_network_code", value.asInstanceOf[js.Any])
    
    inline def setMobile_network_codeUndefined: Self = StObject.set(x, "mobile_network_code", js.undefined)
    
    inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setUser_type(
      value: business | cafe | cellular | college | content_delivery_network | dialup | government | hosting | library | military | residential | router | school | search_engine_spider | traveler
    ): Self = StObject.set(x, "user_type", value.asInstanceOf[js.Any])
    
    inline def setUser_typeUndefined: Self = StObject.set(x, "user_type", js.undefined)
  }
}
