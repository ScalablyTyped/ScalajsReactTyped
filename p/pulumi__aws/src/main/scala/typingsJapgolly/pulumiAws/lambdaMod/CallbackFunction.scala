package typingsJapgolly.pulumiAws.lambdaMod

import typingsJapgolly.pulumiAws.lambdaMixinsMod.CallbackFunctionArgs
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda", "CallbackFunction")
@js.native
class CallbackFunction[E, R] protected ()
  extends typingsJapgolly.pulumiAws.lambdaMixinsMod.CallbackFunction[E, R] {
  def this(name: String, args: CallbackFunctionArgs[E, R]) = this()
  def this(name: String, args: CallbackFunctionArgs[E, R], opts: CustomResourceOptions) = this()
}

