package typingsJapgolly.pulumiAws.inputMod.s3

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketVersioning extends js.Object {
  /**
    * Boolean which indicates if this criteria is enabled.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Enable MFA delete for either `Change the versioning state of your bucket` or `Permanently delete an object version`. Default is `false`.
    */
  var mfaDelete: js.UndefOr[Input[Boolean]] = js.native
}

object BucketVersioning {
  @scala.inline
  def apply(enabled: Input[Boolean] = null, mfaDelete: Input[Boolean] = null): BucketVersioning = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (mfaDelete != null) __obj.updateDynamic("mfaDelete")(mfaDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketVersioning]
  }
}

