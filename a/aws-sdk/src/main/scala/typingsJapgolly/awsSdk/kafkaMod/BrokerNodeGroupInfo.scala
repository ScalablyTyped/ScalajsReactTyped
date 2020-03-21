package typingsJapgolly.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerNodeGroupInfo extends js.Object {
  /**
    * 
    The distribution of broker nodes across Availability Zones. This is an optional parameter. If you don't specify it, Amazon MSK gives it the value DEFAULT. You can also explicitly set this parameter to the value DEFAULT. No other values are currently allowed.
    Amazon MSK distributes the broker nodes evenly across the Availability Zones that correspond to the subnets you provide when you create the cluster.
    
    */
  var BrokerAZDistribution: js.UndefOr[typingsJapgolly.awsSdk.kafkaMod.BrokerAZDistribution] = js.native
  /**
    * 
    The list of subnets to connect to in the client virtual private cloud (VPC). AWS creates elastic network interfaces inside these subnets. Client applications use elastic network interfaces to produce and consume data. Client subnets can't be in Availability Zone us-east-1e.
    
    */
  var ClientSubnets: listOfString = js.native
  /**
    * 
    The type of Amazon EC2 instances to use for Kafka brokers. The following instance types are allowed: kafka.m5.large, kafka.m5.xlarge, kafka.m5.2xlarge,
  kafka.m5.4xlarge, kafka.m5.12xlarge, and kafka.m5.24xlarge.
    
    */
  var InstanceType: stringMin5Max32 = js.native
  /**
    * 
    The AWS security groups to associate with the elastic network interfaces in order to specify who can connect to and communicate with the Amazon MSK cluster. If you don't specify a security group, Amazon MSK uses the default security group associated with the VPC.
    
    */
  var SecurityGroups: js.UndefOr[listOfString] = js.native
  /**
    * 
    Contains information about storage volumes attached to MSK broker nodes.
    
    */
  var StorageInfo: js.UndefOr[typingsJapgolly.awsSdk.kafkaMod.StorageInfo] = js.native
}

object BrokerNodeGroupInfo {
  @scala.inline
  def apply(
    ClientSubnets: listOfString,
    InstanceType: stringMin5Max32,
    BrokerAZDistribution: BrokerAZDistribution = null,
    SecurityGroups: listOfString = null,
    StorageInfo: StorageInfo = null
  ): BrokerNodeGroupInfo = {
    val __obj = js.Dynamic.literal(ClientSubnets = ClientSubnets.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any])
    if (BrokerAZDistribution != null) __obj.updateDynamic("BrokerAZDistribution")(BrokerAZDistribution.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    if (StorageInfo != null) __obj.updateDynamic("StorageInfo")(StorageInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerNodeGroupInfo]
  }
}

