package typingsJapgolly.pulumiPulumi

import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/utils", JSImport.Namespace)
@js.native
object pulumiPulumiMod extends js.Object {
  def liftProperties[T](promise: js.Promise[T]): js.Promise[T] with T = js.native
  def liftProperties[T](promise: js.Promise[T], opts: InvokeOptions): js.Promise[T] with T = js.native
}

