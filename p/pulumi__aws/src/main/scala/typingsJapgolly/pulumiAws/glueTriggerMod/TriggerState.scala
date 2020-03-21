package typingsJapgolly.pulumiAws.glueTriggerMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.glue.TriggerAction
import typingsJapgolly.pulumiAws.inputMod.glue.TriggerPredicate
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerState extends js.Object {
  /**
    * List of actions initiated by this trigger when it fires. Defined below.
    */
  val actions: js.UndefOr[Input[js.Array[Input[TriggerAction]]]] = js.native
  /**
    * Amazon Resource Name (ARN) of Glue Trigger
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A description of the new trigger.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Start the trigger. Defaults to `true`. Not valid to disable for `ON_DEMAND` type.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name of the trigger.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A predicate to specify when the new trigger should fire. Required when trigger type is `CONDITIONAL`. Defined below.
    */
  val predicate: js.UndefOr[Input[TriggerPredicate]] = js.native
  /**
    * A cron expression used to specify the schedule. [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html)
    */
  val schedule: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The type of trigger. Valid values are `CONDITIONAL`, `ON_DEMAND`, and `SCHEDULED`.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
  /**
    * A workflow to which the trigger should be associated to. Every workflow graph (DAG) needs a starting trigger (`ON_DEMAND` or `SCHEDULED` type) and can contain multiple additional `CONDITIONAL` triggers.
    */
  val workflowName: js.UndefOr[Input[String]] = js.native
}

object TriggerState {
  @scala.inline
  def apply(
    actions: Input[js.Array[Input[TriggerAction]]] = null,
    arn: Input[String] = null,
    description: Input[String] = null,
    enabled: Input[Boolean] = null,
    name: Input[String] = null,
    predicate: Input[TriggerPredicate] = null,
    schedule: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    `type`: Input[String] = null,
    workflowName: Input[String] = null
  ): TriggerState = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (predicate != null) __obj.updateDynamic("predicate")(predicate.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (workflowName != null) __obj.updateDynamic("workflowName")(workflowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerState]
  }
}

