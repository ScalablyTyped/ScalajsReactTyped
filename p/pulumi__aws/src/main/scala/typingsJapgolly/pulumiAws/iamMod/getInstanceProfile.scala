package typingsJapgolly.pulumiAws.iamMod

import typingsJapgolly.pulumiAws.getInstanceProfileMod.GetInstanceProfileArgs
import typingsJapgolly.pulumiAws.getInstanceProfileMod.GetInstanceProfileResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam", "getInstanceProfile")
@js.native
object getInstanceProfile extends js.Object {
  def apply(args: GetInstanceProfileArgs): js.Promise[GetInstanceProfileResult] with GetInstanceProfileResult = js.native
  def apply(args: GetInstanceProfileArgs, opts: InvokeOptions): js.Promise[GetInstanceProfileResult] with GetInstanceProfileResult = js.native
}

