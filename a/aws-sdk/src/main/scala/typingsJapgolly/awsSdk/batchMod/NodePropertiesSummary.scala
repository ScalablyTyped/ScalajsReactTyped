package typingsJapgolly.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodePropertiesSummary extends js.Object {
  /**
    * Specifies whether the current node is the main node for a multi-node parallel job.
    */
  var isMainNode: js.UndefOr[Boolean] = js.native
  /**
    * The node index for the node. Node index numbering begins at zero. This index is also available on the node with the AWS_BATCH_JOB_NODE_INDEX environment variable.
    */
  var nodeIndex: js.UndefOr[Integer] = js.native
  /**
    * The number of nodes associated with a multi-node parallel job.
    */
  var numNodes: js.UndefOr[Integer] = js.native
}

object NodePropertiesSummary {
  @scala.inline
  def apply(
    isMainNode: js.UndefOr[scala.Boolean] = js.undefined,
    nodeIndex: Int | Double = null,
    numNodes: Int | Double = null
  ): NodePropertiesSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isMainNode)) __obj.updateDynamic("isMainNode")(isMainNode.asInstanceOf[js.Any])
    if (nodeIndex != null) __obj.updateDynamic("nodeIndex")(nodeIndex.asInstanceOf[js.Any])
    if (numNodes != null) __obj.updateDynamic("numNodes")(numNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodePropertiesSummary]
  }
}

