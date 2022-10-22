package typingsJapgolly.awsSdk.clientsCodestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConfiguration extends StObject {
  
  /**
    * The ID of the security group or security groups associated with the Amazon VPC connected to the infrastructure where your provider type is installed.
    */
  var SecurityGroupIds: typingsJapgolly.awsSdk.clientsCodestarconnectionsMod.SecurityGroupIds
  
  /**
    * The ID of the subnet or subnets associated with the Amazon VPC connected to the infrastructure where your provider type is installed.
    */
  var SubnetIds: typingsJapgolly.awsSdk.clientsCodestarconnectionsMod.SubnetIds
  
  /**
    * The value of the Transport Layer Security (TLS) certificate associated with the infrastructure where your provider type is installed.
    */
  var TlsCertificate: js.UndefOr[typingsJapgolly.awsSdk.clientsCodestarconnectionsMod.TlsCertificate] = js.undefined
  
  /**
    * The ID of the Amazon VPC connected to the infrastructure where your provider type is installed.
    */
  var VpcId: typingsJapgolly.awsSdk.clientsCodestarconnectionsMod.VpcId
}
object VpcConfiguration {
  
  inline def apply(SecurityGroupIds: SecurityGroupIds, SubnetIds: SubnetIds, VpcId: VpcId): VpcConfiguration = {
    val __obj = js.Dynamic.literal(SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfiguration]
  }
  
  extension [Self <: VpcConfiguration](x: Self) {
    
    inline def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: SubnetIds): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setTlsCertificate(value: TlsCertificate): Self = StObject.set(x, "TlsCertificate", value.asInstanceOf[js.Any])
    
    inline def setTlsCertificateUndefined: Self = StObject.set(x, "TlsCertificate", js.undefined)
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
