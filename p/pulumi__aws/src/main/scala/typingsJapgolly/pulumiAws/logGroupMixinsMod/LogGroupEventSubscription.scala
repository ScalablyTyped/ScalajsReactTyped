package typingsJapgolly.pulumiAws.logGroupMixinsMod

import typingsJapgolly.pulumiAws.lambdaMod.EventSubscription
import typingsJapgolly.pulumiAws.logGroupMod.LogGroup
import typingsJapgolly.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilter
import typingsJapgolly.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch/logGroupMixins", "LogGroupEventSubscription")
@js.native
class LogGroupEventSubscription protected () extends EventSubscription {
  def this(name: String, logGroup: LogGroup, handler: LogGroupEventHandler) = this()
  def this(
    name: String,
    logGroup: LogGroup,
    handler: LogGroupEventHandler,
    args: LogGroupEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    logGroup: LogGroup,
    handler: LogGroupEventHandler,
    args: LogGroupEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
  val logGroup: LogGroup = js.native
  val logSubscriptionFilter: LogSubscriptionFilter = js.native
}

