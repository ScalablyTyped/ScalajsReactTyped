package typingsJapgolly.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2VpcDetails extends StObject {
  
  /**
    * Information about the IPv4 CIDR blocks associated with the VPC.
    */
  var CidrBlockAssociationSet: js.UndefOr[CidrBlockAssociationList] = js.undefined
  
  /**
    * The identifier of the set of Dynamic Host Configuration Protocol (DHCP) options that are associated with the VPC. If the default options are associated with the VPC, then this is default.
    */
  var DhcpOptionsId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the IPv6 CIDR blocks associated with the VPC.
    */
  var Ipv6CidrBlockAssociationSet: js.UndefOr[Ipv6CidrBlockAssociationList] = js.undefined
  
  /**
    * The current state of the VPC. Valid values are available or pending.
    */
  var State: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2VpcDetails {
  
  inline def apply(): AwsEc2VpcDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2VpcDetails]
  }
  
  extension [Self <: AwsEc2VpcDetails](x: Self) {
    
    inline def setCidrBlockAssociationSet(value: CidrBlockAssociationList): Self = StObject.set(x, "CidrBlockAssociationSet", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockAssociationSetUndefined: Self = StObject.set(x, "CidrBlockAssociationSet", js.undefined)
    
    inline def setCidrBlockAssociationSetVarargs(value: CidrBlockAssociation*): Self = StObject.set(x, "CidrBlockAssociationSet", js.Array(value*))
    
    inline def setDhcpOptionsId(value: NonEmptyString): Self = StObject.set(x, "DhcpOptionsId", value.asInstanceOf[js.Any])
    
    inline def setDhcpOptionsIdUndefined: Self = StObject.set(x, "DhcpOptionsId", js.undefined)
    
    inline def setIpv6CidrBlockAssociationSet(value: Ipv6CidrBlockAssociationList): Self = StObject.set(x, "Ipv6CidrBlockAssociationSet", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlockAssociationSetUndefined: Self = StObject.set(x, "Ipv6CidrBlockAssociationSet", js.undefined)
    
    inline def setIpv6CidrBlockAssociationSetVarargs(value: Ipv6CidrBlockAssociation*): Self = StObject.set(x, "Ipv6CidrBlockAssociationSet", js.Array(value*))
    
    inline def setState(value: NonEmptyString): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
