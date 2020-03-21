package typingsJapgolly.pulumiPulumi.mod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Unwrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "secret")
@js.native
object secret extends js.Object {
  def apply[T](): typingsJapgolly.pulumiPulumi.outputMod.Output_[Unwrap[js.UndefOr[T]]] = js.native
  def apply[T](`val`: Input[T]): typingsJapgolly.pulumiPulumi.outputMod.Output_[Unwrap[T]] = js.native
}

