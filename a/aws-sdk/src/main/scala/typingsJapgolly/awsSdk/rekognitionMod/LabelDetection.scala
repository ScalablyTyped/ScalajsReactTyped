package typingsJapgolly.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelDetection extends js.Object {
  /**
    * Details about the detected label.
    */
  var Label: js.UndefOr[typingsJapgolly.awsSdk.rekognitionMod.Label] = js.native
  /**
    * Time, in milliseconds from the start of the video, that the label was detected.
    */
  var Timestamp: js.UndefOr[typingsJapgolly.awsSdk.rekognitionMod.Timestamp] = js.native
}

object LabelDetection {
  @scala.inline
  def apply(Label: Label = null, Timestamp: Int | Double = null): LabelDetection = {
    val __obj = js.Dynamic.literal()
    if (Label != null) __obj.updateDynamic("Label")(Label.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelDetection]
  }
}

