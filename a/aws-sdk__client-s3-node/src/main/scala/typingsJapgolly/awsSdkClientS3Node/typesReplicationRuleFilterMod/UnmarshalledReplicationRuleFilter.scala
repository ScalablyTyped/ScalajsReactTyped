package typingsJapgolly.awsSdkClientS3Node.typesReplicationRuleFilterMod

import typingsJapgolly.awsSdkClientS3Node.typesReplicationRuleAndOperatorMod.UnmarshalledReplicationRuleAndOperator
import typingsJapgolly.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledReplicationRuleFilter extends ReplicationRuleFilter {
  /**
    * <p>Container for specifying rule filters. These filters determine the subset of objects to which the rule applies. The element is required only if you specify more than one filter. For example: </p> <ul> <li> <p>You specify both a <code>Prefix</code> and a <code>Tag</code> filters. Then you wrap these in an <code>And</code> tag.</p> </li> <li> <p>You specify filter based on multiple tags. Then you wrap the <code>Tag</code> elements in an <code>And</code> tag.</p> </li> </ul>
    */
  @JSName("And")
  var And_UnmarshalledReplicationRuleFilter: js.UndefOr[UnmarshalledReplicationRuleAndOperator] = js.undefined
  /**
    * <p>Container for specifying a tag key and value. </p> <p>The rule applies only to objects having the tag in its tagset.</p>
    */
  @JSName("Tag")
  var Tag_UnmarshalledReplicationRuleFilter: js.UndefOr[UnmarshalledTag] = js.undefined
}

object UnmarshalledReplicationRuleFilter {
  @scala.inline
  def apply(
    And: UnmarshalledReplicationRuleAndOperator = null,
    Prefix: String = null,
    Tag: UnmarshalledTag = null
  ): UnmarshalledReplicationRuleFilter = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledReplicationRuleFilter]
  }
}

