package typingsJapgolly.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainDetail extends StObject {
  
  /**
    * The domain configuration. Currently, this includes only the domain's retention period.
    */
  var configuration: DomainConfiguration
  
  /**
    * The basic information about a domain, such as its name, status, and description.
    */
  var domainInfo: DomainInfo
}
object DomainDetail {
  
  inline def apply(configuration: DomainConfiguration, domainInfo: DomainInfo): DomainDetail = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], domainInfo = domainInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDetail]
  }
  
  extension [Self <: DomainDetail](x: Self) {
    
    inline def setConfiguration(value: DomainConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setDomainInfo(value: DomainInfo): Self = StObject.set(x, "domainInfo", value.asInstanceOf[js.Any])
  }
}
