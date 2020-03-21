package typingsJapgolly.pulumiAws.inputMod.eks

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterIdentity extends js.Object {
  /**
    * Nested attribute containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster.
    */
  var oidcs: js.UndefOr[Input[js.Array[Input[ClusterIdentityOidc]]]] = js.native
}

object ClusterIdentity {
  @scala.inline
  def apply(oidcs: Input[js.Array[Input[ClusterIdentityOidc]]] = null): ClusterIdentity = {
    val __obj = js.Dynamic.literal()
    if (oidcs != null) __obj.updateDynamic("oidcs")(oidcs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterIdentity]
  }
}

