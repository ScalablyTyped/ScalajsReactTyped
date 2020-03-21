package typingsJapgolly.awsSdkClientXrayNode.typesTraceMod

import typingsJapgolly.awsSdkClientXrayNode.typesSegmentMod.UnmarshalledSegment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledTrace extends Trace {
  /**
    * <p>Segment documents for the segments and subsegments that comprise the trace.</p>
    */
  @JSName("Segments")
  var Segments_UnmarshalledTrace: js.UndefOr[js.Array[UnmarshalledSegment]] = js.undefined
}

object UnmarshalledTrace {
  @scala.inline
  def apply(Duration: Int | Double = null, Id: String = null, Segments: js.Array[UnmarshalledSegment] = null): UnmarshalledTrace = {
    val __obj = js.Dynamic.literal()
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Segments != null) __obj.updateDynamic("Segments")(Segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledTrace]
  }
}

