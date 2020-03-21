package typingsJapgolly.awsSdk.mediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashConfigurationForPut extends js.Object {
  /**
    * The setting that controls whether MediaTailor includes the Location tag in DASH manifests. MediaTailor populates the Location tag with the URL for manifest update requests, to be used by players that don't support sticky redirects. Disable this if you have CDN routing rules set up for accessing MediaTailor manifests, and you are either using client-side reporting or your players support sticky HTTP redirects. Valid values are DISABLED and EMT_DEFAULT. The EMT_DEFAULT setting enables the inclusion of the tag and is the default value. 
    */
  var MpdLocation: js.UndefOr[string] = js.native
  /**
    * The setting that controls whether MediaTailor handles manifests from the origin server as multi-period manifests or single-period manifests. If your origin server produces single-period manifests, set this to SINGLE_PERIOD. The default setting is MULTI_PERIOD. For multi-period manifests, omit this setting or set it to MULTI_PERIOD. 
    */
  var OriginManifestType: js.UndefOr[typingsJapgolly.awsSdk.mediatailorMod.OriginManifestType] = js.native
}

object DashConfigurationForPut {
  @scala.inline
  def apply(MpdLocation: string = null, OriginManifestType: OriginManifestType = null): DashConfigurationForPut = {
    val __obj = js.Dynamic.literal()
    if (MpdLocation != null) __obj.updateDynamic("MpdLocation")(MpdLocation.asInstanceOf[js.Any])
    if (OriginManifestType != null) __obj.updateDynamic("OriginManifestType")(OriginManifestType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashConfigurationForPut]
  }
}

