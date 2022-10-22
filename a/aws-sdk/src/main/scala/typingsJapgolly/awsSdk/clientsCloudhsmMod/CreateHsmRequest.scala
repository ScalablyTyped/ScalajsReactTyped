package typingsJapgolly.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHsmRequest extends StObject {
  
  /**
    * A user-defined token to ensure idempotence. Subsequent calls to this operation with the same token will be ignored.
    */
  var ClientToken: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudhsmMod.ClientToken] = js.undefined
  
  /**
    * The IP address to assign to the HSM's ENI. If an IP address is not specified, an IP address will be randomly chosen from the CIDR range of the subnet.
    */
  var EniIp: js.UndefOr[IpAddress] = js.undefined
  
  /**
    * The external ID from IamRoleArn, if present.
    */
  var ExternalId: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudhsmMod.ExternalId] = js.undefined
  
  /**
    * The ARN of an IAM role to enable the AWS CloudHSM service to allocate an ENI on your behalf.
    */
  var IamRoleArn: typingsJapgolly.awsSdk.clientsCloudhsmMod.IamRoleArn
  
  /**
    * The SSH public key to install on the HSM.
    */
  var SshKey: typingsJapgolly.awsSdk.clientsCloudhsmMod.SshKey
  
  /**
    * The identifier of the subnet in your VPC in which to place the HSM.
    */
  var SubnetId: typingsJapgolly.awsSdk.clientsCloudhsmMod.SubnetId
  
  var SubscriptionType: typingsJapgolly.awsSdk.clientsCloudhsmMod.SubscriptionType
  
  /**
    * The IP address for the syslog monitoring server. The AWS CloudHSM service only supports one syslog monitoring server.
    */
  var SyslogIp: js.UndefOr[IpAddress] = js.undefined
}
object CreateHsmRequest {
  
  inline def apply(IamRoleArn: IamRoleArn, SshKey: SshKey, SubnetId: SubnetId, SubscriptionType: SubscriptionType): CreateHsmRequest = {
    val __obj = js.Dynamic.literal(IamRoleArn = IamRoleArn.asInstanceOf[js.Any], SshKey = SshKey.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any], SubscriptionType = SubscriptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHsmRequest]
  }
  
  extension [Self <: CreateHsmRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setEniIp(value: IpAddress): Self = StObject.set(x, "EniIp", value.asInstanceOf[js.Any])
    
    inline def setEniIpUndefined: Self = StObject.set(x, "EniIp", js.undefined)
    
    inline def setExternalId(value: ExternalId): Self = StObject.set(x, "ExternalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "ExternalId", js.undefined)
    
    inline def setIamRoleArn(value: IamRoleArn): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setSshKey(value: SshKey): Self = StObject.set(x, "SshKey", value.asInstanceOf[js.Any])
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionType(value: SubscriptionType): Self = StObject.set(x, "SubscriptionType", value.asInstanceOf[js.Any])
    
    inline def setSyslogIp(value: IpAddress): Self = StObject.set(x, "SyslogIp", value.asInstanceOf[js.Any])
    
    inline def setSyslogIpUndefined: Self = StObject.set(x, "SyslogIp", js.undefined)
  }
}
