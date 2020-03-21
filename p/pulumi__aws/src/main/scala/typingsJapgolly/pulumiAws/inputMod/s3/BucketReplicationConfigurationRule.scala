package typingsJapgolly.pulumiAws.inputMod.s3

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketReplicationConfigurationRule extends js.Object {
  /**
    * Specifies the destination for the rule (documented below).
    */
  var destination: Input[BucketReplicationConfigurationRuleDestination] = js.native
  /**
    * Filter that identifies subset of objects to which the replication rule applies (documented below).
    */
  var filter: js.UndefOr[Input[BucketReplicationConfigurationRuleFilter]] = js.native
  /**
    * Unique identifier for the rule.
    */
  var id: js.UndefOr[Input[String]] = js.native
  /**
    * Object keyname prefix that identifies subset of objects to which the rule applies.
    */
  var prefix: js.UndefOr[Input[String]] = js.native
  /**
    * The priority associated with the rule.
    */
  var priority: js.UndefOr[Input[Double]] = js.native
  /**
    * Specifies special object selection criteria (documented below).
    */
  var sourceSelectionCriteria: js.UndefOr[Input[BucketReplicationConfigurationRuleSourceSelectionCriteria]] = js.native
  /**
    * The status of the rule. Either `Enabled` or `Disabled`. The rule is ignored if status is not Enabled.
    */
  var status: Input[String] = js.native
}

object BucketReplicationConfigurationRule {
  @scala.inline
  def apply(
    destination: Input[BucketReplicationConfigurationRuleDestination],
    status: Input[String],
    filter: Input[BucketReplicationConfigurationRuleFilter] = null,
    id: Input[String] = null,
    prefix: Input[String] = null,
    priority: Input[Double] = null,
    sourceSelectionCriteria: Input[BucketReplicationConfigurationRuleSourceSelectionCriteria] = null
  ): BucketReplicationConfigurationRule = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (sourceSelectionCriteria != null) __obj.updateDynamic("sourceSelectionCriteria")(sourceSelectionCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfigurationRule]
  }
}

