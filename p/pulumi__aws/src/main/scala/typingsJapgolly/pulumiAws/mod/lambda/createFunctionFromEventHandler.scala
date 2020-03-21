package typingsJapgolly.pulumiAws.mod.lambda

import typingsJapgolly.pulumiAws.lambdaMixinsMod.EventHandler
import typingsJapgolly.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "lambda.createFunctionFromEventHandler")
@js.native
object createFunctionFromEventHandler extends js.Object {
  def apply[E, R](name: String, handler: EventHandler[E, R]): typingsJapgolly.pulumiAws.lambdaFunctionMod.Function = js.native
  def apply[E, R](name: String, handler: EventHandler[E, R], opts: ResourceOptions): typingsJapgolly.pulumiAws.lambdaFunctionMod.Function = js.native
}

