package typingsJapgolly.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficPolicyInstance extends js.Object {
  /**
    * The ID of the hosted zone that Amazon Route 53 created resource record sets in.
    */
  var HostedZoneId: ResourceId = js.native
  /**
    * The ID that Amazon Route 53 assigned to the new traffic policy instance.
    */
  var Id: TrafficPolicyInstanceId = js.native
  /**
    * If State is Failed, an explanation of the reason for the failure. If State is another value, Message is empty.
    */
  var Message: typingsJapgolly.awsSdk.route53Mod.Message = js.native
  /**
    * The DNS name, such as www.example.com, for which Amazon Route 53 responds to queries by using the resource record sets that are associated with this traffic policy instance. 
    */
  var Name: DNSName = js.native
  /**
    * The value of State is one of the following values:  Applied  Amazon Route 53 has finished creating resource record sets, and changes have propagated to all Route 53 edge locations.  Creating  Route 53 is creating the resource record sets. Use GetTrafficPolicyInstance to confirm that the CreateTrafficPolicyInstance request completed successfully.  Failed  Route 53 wasn't able to create or update the resource record sets. When the value of State is Failed, see Message for an explanation of what caused the request to fail.  
    */
  var State: TrafficPolicyInstanceState = js.native
  /**
    * The TTL that Amazon Route 53 assigned to all of the resource record sets that it created in the specified hosted zone.
    */
  var TTL: typingsJapgolly.awsSdk.route53Mod.TTL = js.native
  /**
    * The ID of the traffic policy that Amazon Route 53 used to create resource record sets in the specified hosted zone.
    */
  var TrafficPolicyId: typingsJapgolly.awsSdk.route53Mod.TrafficPolicyId = js.native
  /**
    * The DNS type that Amazon Route 53 assigned to all of the resource record sets that it created for this traffic policy instance. 
    */
  var TrafficPolicyType: RRType = js.native
  /**
    * The version of the traffic policy that Amazon Route 53 used to create resource record sets in the specified hosted zone.
    */
  var TrafficPolicyVersion: typingsJapgolly.awsSdk.route53Mod.TrafficPolicyVersion = js.native
}

object TrafficPolicyInstance {
  @scala.inline
  def apply(
    HostedZoneId: ResourceId,
    Id: TrafficPolicyInstanceId,
    Message: Message,
    Name: DNSName,
    State: TrafficPolicyInstanceState,
    TTL: TTL,
    TrafficPolicyId: TrafficPolicyId,
    TrafficPolicyType: RRType,
    TrafficPolicyVersion: TrafficPolicyVersion
  ): TrafficPolicyInstance = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], TTL = TTL.asInstanceOf[js.Any], TrafficPolicyId = TrafficPolicyId.asInstanceOf[js.Any], TrafficPolicyType = TrafficPolicyType.asInstanceOf[js.Any], TrafficPolicyVersion = TrafficPolicyVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TrafficPolicyInstance]
  }
}

