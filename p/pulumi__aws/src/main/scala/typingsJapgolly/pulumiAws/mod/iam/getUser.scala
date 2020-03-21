package typingsJapgolly.pulumiAws.mod.iam

import typingsJapgolly.pulumiAws.getUserMod.GetUserArgs
import typingsJapgolly.pulumiAws.getUserMod.GetUserResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "iam.getUser")
@js.native
object getUser extends js.Object {
  def apply(args: GetUserArgs): js.Promise[GetUserResult] with GetUserResult = js.native
  def apply(args: GetUserArgs, opts: InvokeOptions): js.Promise[GetUserResult] with GetUserResult = js.native
}

