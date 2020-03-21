package typingsJapgolly.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHsmResponse extends js.Object {
  /**
    * Information about the HSM that was created.
    */
  var Hsm: js.UndefOr[typingsJapgolly.awsSdk.cloudhsmv2Mod.Hsm] = js.native
}

object CreateHsmResponse {
  @scala.inline
  def apply(Hsm: Hsm = null): CreateHsmResponse = {
    val __obj = js.Dynamic.literal()
    if (Hsm != null) __obj.updateDynamic("Hsm")(Hsm.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHsmResponse]
  }
}

