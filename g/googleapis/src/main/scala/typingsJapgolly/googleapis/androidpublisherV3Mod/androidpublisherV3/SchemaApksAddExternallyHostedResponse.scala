package typingsJapgolly.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaApksAddExternallyHostedResponse extends js.Object {
  /**
    * The definition of the externally-hosted APK and where it is located.
    */
  var externallyHostedApk: js.UndefOr[SchemaExternallyHostedApk] = js.native
}

object SchemaApksAddExternallyHostedResponse {
  @scala.inline
  def apply(externallyHostedApk: SchemaExternallyHostedApk = null): SchemaApksAddExternallyHostedResponse = {
    val __obj = js.Dynamic.literal()
    if (externallyHostedApk != null) __obj.updateDynamic("externallyHostedApk")(externallyHostedApk.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApksAddExternallyHostedResponse]
  }
}

