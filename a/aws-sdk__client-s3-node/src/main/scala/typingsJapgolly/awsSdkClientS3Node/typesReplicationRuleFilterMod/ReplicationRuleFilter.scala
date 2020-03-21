package typingsJapgolly.awsSdkClientS3Node.typesReplicationRuleFilterMod

import typingsJapgolly.awsSdkClientS3Node.typesReplicationRuleAndOperatorMod.ReplicationRuleAndOperator
import typingsJapgolly.awsSdkClientS3Node.typesTagMod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationRuleFilter extends js.Object {
  /**
    * <p>Container for specifying rule filters. These filters determine the subset of objects to which the rule applies. The element is required only if you specify more than one filter. For example: </p> <ul> <li> <p>You specify both a <code>Prefix</code> and a <code>Tag</code> filters. Then you wrap these in an <code>And</code> tag.</p> </li> <li> <p>You specify filter based on multiple tags. Then you wrap the <code>Tag</code> elements in an <code>And</code> tag.</p> </li> </ul>
    */
  var And: js.UndefOr[ReplicationRuleAndOperator] = js.undefined
  /**
    * <p>Object keyname prefix that identifies subset of objects to which the rule applies.</p>
    */
  var Prefix: js.UndefOr[String] = js.undefined
  /**
    * <p>Container for specifying a tag key and value. </p> <p>The rule applies only to objects having the tag in its tagset.</p>
    */
  var Tag: js.UndefOr[typingsJapgolly.awsSdkClientS3Node.typesTagMod.Tag] = js.undefined
}

object ReplicationRuleFilter {
  @scala.inline
  def apply(And: ReplicationRuleAndOperator = null, Prefix: String = null, Tag: Tag = null): ReplicationRuleFilter = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationRuleFilter]
  }
}

