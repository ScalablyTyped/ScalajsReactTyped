package typingsJapgolly.pulumiAws.mod.rds

import typingsJapgolly.pulumiAws.rdsGetClusterMod.GetClusterArgs
import typingsJapgolly.pulumiAws.rdsGetClusterMod.GetClusterResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "rds.getCluster")
@js.native
object getCluster extends js.Object {
  def apply(args: GetClusterArgs): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def apply(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] with GetClusterResult = js.native
}

