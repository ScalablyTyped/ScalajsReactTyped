package typingsJapgolly.pulumiAws.mod.ec2

import typingsJapgolly.pulumiAws.getLaunchConfigurationMod.GetLaunchConfigurationArgs
import typingsJapgolly.pulumiAws.getLaunchConfigurationMod.GetLaunchConfigurationResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getLaunchConfiguration")
@js.native
object getLaunchConfiguration extends js.Object {
  def apply(args: GetLaunchConfigurationArgs): js.Promise[GetLaunchConfigurationResult] with GetLaunchConfigurationResult = js.native
  def apply(args: GetLaunchConfigurationArgs, opts: InvokeOptions): js.Promise[GetLaunchConfigurationResult] with GetLaunchConfigurationResult = js.native
}

