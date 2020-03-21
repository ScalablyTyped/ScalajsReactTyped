package typingsJapgolly.pulumiAws.rdsMod

import typingsJapgolly.pulumiAws.rdsGetInstanceMod.GetInstanceArgs
import typingsJapgolly.pulumiAws.rdsGetInstanceMod.GetInstanceResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds", "getInstance")
@js.native
object getInstance extends js.Object {
  def apply(args: GetInstanceArgs): js.Promise[GetInstanceResult] with GetInstanceResult = js.native
  def apply(args: GetInstanceArgs, opts: InvokeOptions): js.Promise[GetInstanceResult] with GetInstanceResult = js.native
}

