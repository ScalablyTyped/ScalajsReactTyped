package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ipv4PrefixSpecificationRequest extends StObject {
  
  /**
    * The IPv4 prefix. For information, see  Assigning prefixes to Amazon EC2 network interfaces in the Amazon Elastic Compute Cloud User Guide.
    */
  var Ipv4Prefix: js.UndefOr[String] = js.undefined
}
object Ipv4PrefixSpecificationRequest {
  
  inline def apply(): Ipv4PrefixSpecificationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ipv4PrefixSpecificationRequest]
  }
  
  extension [Self <: Ipv4PrefixSpecificationRequest](x: Self) {
    
    inline def setIpv4Prefix(value: String): Self = StObject.set(x, "Ipv4Prefix", value.asInstanceOf[js.Any])
    
    inline def setIpv4PrefixUndefined: Self = StObject.set(x, "Ipv4Prefix", js.undefined)
  }
}
