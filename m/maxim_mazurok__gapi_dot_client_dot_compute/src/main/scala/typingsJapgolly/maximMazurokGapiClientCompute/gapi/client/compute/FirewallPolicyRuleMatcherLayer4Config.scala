package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPolicyRuleMatcherLayer4Config extends StObject {
  
  /**
    * The IP protocol to which this rule applies. The protocol type is required when creating a firewall rule. This value can either be one of the following well known protocol strings
    * (tcp, udp, icmp, esp, ah, ipip, sctp), or the IP protocol number.
    */
  var ipProtocol: js.UndefOr[String] = js.undefined
  
  /**
    * An optional list of ports to which this rule applies. This field is only applicable for UDP or TCP protocol. Each entry must be either an integer or a range. If not specified, this
    * rule applies to connections through any port. Example inputs include: ["22"], ["80","443"], and ["12345-12349"].
    */
  var ports: js.UndefOr[js.Array[String]] = js.undefined
}
object FirewallPolicyRuleMatcherLayer4Config {
  
  inline def apply(): FirewallPolicyRuleMatcherLayer4Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallPolicyRuleMatcherLayer4Config]
  }
  
  extension [Self <: FirewallPolicyRuleMatcherLayer4Config](x: Self) {
    
    inline def setIpProtocol(value: String): Self = StObject.set(x, "ipProtocol", value.asInstanceOf[js.Any])
    
    inline def setIpProtocolUndefined: Self = StObject.set(x, "ipProtocol", js.undefined)
    
    inline def setPorts(value: js.Array[String]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setPortsVarargs(value: String*): Self = StObject.set(x, "ports", js.Array(value*))
  }
}
