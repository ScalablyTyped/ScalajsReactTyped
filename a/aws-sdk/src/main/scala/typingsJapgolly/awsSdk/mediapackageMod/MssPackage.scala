package typingsJapgolly.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MssPackage extends js.Object {
  var Encryption: js.UndefOr[MssEncryption] = js.native
  /**
    * The time window (in seconds) contained in each manifest.
    */
  var ManifestWindowSeconds: js.UndefOr[integer] = js.native
  /**
    * The duration (in seconds) of each segment.
    */
  var SegmentDurationSeconds: js.UndefOr[integer] = js.native
  var StreamSelection: js.UndefOr[typingsJapgolly.awsSdk.mediapackageMod.StreamSelection] = js.native
}

object MssPackage {
  @scala.inline
  def apply(
    Encryption: MssEncryption = null,
    ManifestWindowSeconds: Int | Double = null,
    SegmentDurationSeconds: Int | Double = null,
    StreamSelection: StreamSelection = null
  ): MssPackage = {
    val __obj = js.Dynamic.literal()
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (ManifestWindowSeconds != null) __obj.updateDynamic("ManifestWindowSeconds")(ManifestWindowSeconds.asInstanceOf[js.Any])
    if (SegmentDurationSeconds != null) __obj.updateDynamic("SegmentDurationSeconds")(SegmentDurationSeconds.asInstanceOf[js.Any])
    if (StreamSelection != null) __obj.updateDynamic("StreamSelection")(StreamSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[MssPackage]
  }
}

