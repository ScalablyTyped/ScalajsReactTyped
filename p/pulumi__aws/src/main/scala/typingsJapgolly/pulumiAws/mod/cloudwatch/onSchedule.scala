package typingsJapgolly.pulumiAws.mod.cloudwatch

import typingsJapgolly.pulumiAws.eventRuleMixinsMod.EventRuleEventHandler
import typingsJapgolly.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscriptionArgs
import typingsJapgolly.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cloudwatch.onSchedule")
@js.native
object onSchedule extends js.Object {
  def apply(name: String, schedule: String, handler: EventRuleEventHandler): typingsJapgolly.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
  def apply(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs
  ): typingsJapgolly.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
  def apply(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): typingsJapgolly.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription = js.native
}

