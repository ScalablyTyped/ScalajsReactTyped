package typingsJapgolly.pulumiAws.lambdaMixinsMod

import typingsJapgolly.pulumiAws.lambdaFunctionMod.Function
import typingsJapgolly.pulumiAws.permissionMod.Permission
import typingsJapgolly.pulumiPulumi.mod.ComponentResource
import typingsJapgolly.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda/lambdaMixins", "EventSubscription")
@js.native
class EventSubscription protected ()
  extends ComponentResource[js.Any] {
  def this(`type`: String, name: String) = this()
  def this(`type`: String, name: String, opts: ComponentResourceOptions) = this()
  var func: Function = js.native
  var permission: Permission = js.native
}

