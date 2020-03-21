package typingsJapgolly.pulumiAws.mod.cloudwatch

import typingsJapgolly.pulumiAws.logGroupMixinsMod.LogGroupEventHandler
import typingsJapgolly.pulumiAws.logGroupMixinsMod.LogGroupEventSubscriptionArgs
import typingsJapgolly.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cloudwatch.LogGroupEventSubscription")
@js.native
class LogGroupEventSubscription protected ()
  extends typingsJapgolly.pulumiAws.cloudwatchMod.LogGroupEventSubscription {
  def this(
    name: String,
    logGroup: typingsJapgolly.pulumiAws.logGroupMod.LogGroup,
    handler: LogGroupEventHandler
  ) = this()
  def this(
    name: String,
    logGroup: typingsJapgolly.pulumiAws.logGroupMod.LogGroup,
    handler: LogGroupEventHandler,
    args: LogGroupEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    logGroup: typingsJapgolly.pulumiAws.logGroupMod.LogGroup,
    handler: LogGroupEventHandler,
    args: LogGroupEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

