package typingsJapgolly.pulumiAws

import typingsJapgolly.pulumiAws.eventRuleMixinsMod.EventRuleEventHandler
import typingsJapgolly.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription
import typingsJapgolly.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscriptionArgs
import typingsJapgolly.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch/cloudwatchMixins", JSImport.Namespace)
@js.native
object cloudwatchMixinsMod extends js.Object {
  def onSchedule(name: String, schedule: String, handler: EventRuleEventHandler): EventRuleEventSubscription = js.native
  def onSchedule(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs
  ): EventRuleEventSubscription = js.native
  def onSchedule(
    name: String,
    schedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): EventRuleEventSubscription = js.native
}

