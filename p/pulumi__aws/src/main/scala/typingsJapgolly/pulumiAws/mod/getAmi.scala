package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.getAmiMod.GetAmiArgs
import typingsJapgolly.pulumiAws.getAmiMod.GetAmiResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "getAmi")
@js.native
object getAmi extends js.Object {
  def apply(args: GetAmiArgs): js.Promise[GetAmiResult] with GetAmiResult = js.native
  def apply(args: GetAmiArgs, opts: InvokeOptions): js.Promise[GetAmiResult] with GetAmiResult = js.native
}

