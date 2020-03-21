package typingsJapgolly.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  /**
    * Contribution for the group.
    */
  var contribution: WitContribution
  /**
    * Controls to be put in the group.
    */
  var controls: js.Array[Control]
  /**
    * The height for the contribution.
    */
  var height: Double
  /**
    * The id for the layout node.
    */
  var id: String
  /**
    * A value indicating whether this layout node has been inherited from a parent layout.  This is expected to only be only set by the combiner.
    */
  var inherited: Boolean
  /**
    * A value indicating if the layout node is contribution are not.
    */
  var isContribution: Boolean
  /**
    * Label for the group.
    */
  var label: String
  /**
    * Order in which the group should appear in the section.
    */
  var order: Double
  /**
    * A value indicating whether this layout node has been overridden by a child layout.
    */
  var overridden: Boolean
  /**
    * A value indicating if the group should be hidden or not.
    */
  var visible: Boolean
}

object Group {
  @scala.inline
  def apply(
    contribution: WitContribution,
    controls: js.Array[Control],
    height: Double,
    id: String,
    inherited: Boolean,
    isContribution: Boolean,
    label: String,
    order: Double,
    overridden: Boolean,
    visible: Boolean
  ): Group = {
    val __obj = js.Dynamic.literal(contribution = contribution.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inherited = inherited.asInstanceOf[js.Any], isContribution = isContribution.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], overridden = overridden.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Group]
  }
}

