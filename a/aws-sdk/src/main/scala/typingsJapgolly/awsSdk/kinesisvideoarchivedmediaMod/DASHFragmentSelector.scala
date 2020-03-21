package typingsJapgolly.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DASHFragmentSelector extends js.Object {
  /**
    * The source of the timestamps for the requested media. When FragmentSelectorType is set to PRODUCER_TIMESTAMP and GetDASHStreamingSessionURLInput$PlaybackMode is ON_DEMAND or LIVE_REPLAY, the first fragment ingested with a producer timestamp within the specified FragmentSelector$TimestampRange is included in the media playlist. In addition, the fragments with producer timestamps within the TimestampRange ingested immediately following the first fragment (up to the GetDASHStreamingSessionURLInput$MaxManifestFragmentResults value) are included.  Fragments that have duplicate producer timestamps are deduplicated. This means that if producers are producing a stream of fragments with producer timestamps that are approximately equal to the true clock time, the MPEG-DASH manifest will contain all of the fragments within the requested timestamp range. If some fragments are ingested within the same time range and very different points in time, only the oldest ingested collection of fragments are returned. When FragmentSelectorType is set to PRODUCER_TIMESTAMP and GetDASHStreamingSessionURLInput$PlaybackMode is LIVE, the producer timestamps are used in the MP4 fragments and for deduplication. But the most recently ingested fragments based on server timestamps are included in the MPEG-DASH manifest. This means that even if fragments ingested in the past have producer timestamps with values now, they are not included in the HLS media playlist. The default is SERVER_TIMESTAMP.
    */
  var FragmentSelectorType: js.UndefOr[DASHFragmentSelectorType] = js.native
  /**
    * The start and end of the timestamp range for the requested media. This value should not be present if PlaybackType is LIVE.
    */
  var TimestampRange: js.UndefOr[DASHTimestampRange] = js.native
}

object DASHFragmentSelector {
  @scala.inline
  def apply(FragmentSelectorType: DASHFragmentSelectorType = null, TimestampRange: DASHTimestampRange = null): DASHFragmentSelector = {
    val __obj = js.Dynamic.literal()
    if (FragmentSelectorType != null) __obj.updateDynamic("FragmentSelectorType")(FragmentSelectorType.asInstanceOf[js.Any])
    if (TimestampRange != null) __obj.updateDynamic("TimestampRange")(TimestampRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[DASHFragmentSelector]
  }
}

