package typingsJapgolly.pulumiAws.cloudwatchMod

import typingsJapgolly.pulumiAws.eventRuleMixinsMod.EventRuleEventHandler
import typingsJapgolly.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscriptionArgs
import typingsJapgolly.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch", "EventRuleEventSubscription")
@js.native
class EventRuleEventSubscription protected ()
  extends typingsJapgolly.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription {
  def this(name: String, eventRuleOrSchedule: String, handler: EventRuleEventHandler) = this()
  def this(
    name: String,
    eventRuleOrSchedule: typingsJapgolly.pulumiAws.eventRuleMod.EventRule,
    handler: EventRuleEventHandler
  ) = this()
  def this(
    name: String,
    eventRuleOrSchedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    eventRuleOrSchedule: typingsJapgolly.pulumiAws.eventRuleMod.EventRule,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    eventRuleOrSchedule: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
  def this(
    name: String,
    eventRuleOrSchedule: typingsJapgolly.pulumiAws.eventRuleMod.EventRule,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

