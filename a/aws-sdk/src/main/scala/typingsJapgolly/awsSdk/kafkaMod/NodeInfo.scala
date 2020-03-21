package typingsJapgolly.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeInfo extends js.Object {
  /**
    * 
    The start time.
    
    */
  var AddedToClusterTime: js.UndefOr[string] = js.native
  /**
    * 
    The broker node info.
    
    */
  var BrokerNodeInfo: js.UndefOr[typingsJapgolly.awsSdk.kafkaMod.BrokerNodeInfo] = js.native
  /**
    * 
    The instance type.
    
    */
  var InstanceType: js.UndefOr[string] = js.native
  /**
    * 
    The Amazon Resource Name (ARN) of the node.
    
    */
  var NodeARN: js.UndefOr[string] = js.native
  /**
    * 
    The node type.
    
    */
  var NodeType: js.UndefOr[typingsJapgolly.awsSdk.kafkaMod.NodeType] = js.native
  /**
    * 
    The ZookeeperNodeInfo.
    
    */
  var ZookeeperNodeInfo: js.UndefOr[typingsJapgolly.awsSdk.kafkaMod.ZookeeperNodeInfo] = js.native
}

object NodeInfo {
  @scala.inline
  def apply(
    AddedToClusterTime: string = null,
    BrokerNodeInfo: BrokerNodeInfo = null,
    InstanceType: string = null,
    NodeARN: string = null,
    NodeType: NodeType = null,
    ZookeeperNodeInfo: ZookeeperNodeInfo = null
  ): NodeInfo = {
    val __obj = js.Dynamic.literal()
    if (AddedToClusterTime != null) __obj.updateDynamic("AddedToClusterTime")(AddedToClusterTime.asInstanceOf[js.Any])
    if (BrokerNodeInfo != null) __obj.updateDynamic("BrokerNodeInfo")(BrokerNodeInfo.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (NodeARN != null) __obj.updateDynamic("NodeARN")(NodeARN.asInstanceOf[js.Any])
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType.asInstanceOf[js.Any])
    if (ZookeeperNodeInfo != null) __obj.updateDynamic("ZookeeperNodeInfo")(ZookeeperNodeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInfo]
  }
}

