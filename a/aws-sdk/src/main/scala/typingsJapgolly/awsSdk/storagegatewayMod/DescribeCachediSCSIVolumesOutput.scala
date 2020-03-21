package typingsJapgolly.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCachediSCSIVolumesOutput extends js.Object {
  /**
    * An array of objects where each object contains metadata about one cached volume.
    */
  var CachediSCSIVolumes: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.CachediSCSIVolumes] = js.native
}

object DescribeCachediSCSIVolumesOutput {
  @scala.inline
  def apply(CachediSCSIVolumes: CachediSCSIVolumes = null): DescribeCachediSCSIVolumesOutput = {
    val __obj = js.Dynamic.literal()
    if (CachediSCSIVolumes != null) __obj.updateDynamic("CachediSCSIVolumes")(CachediSCSIVolumes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCachediSCSIVolumesOutput]
  }
}

