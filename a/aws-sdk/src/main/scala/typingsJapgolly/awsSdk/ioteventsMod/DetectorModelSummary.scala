package typingsJapgolly.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectorModelSummary extends js.Object {
  /**
    * The time the detector model was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.native
  /**
    * A brief description of the detector model.
    */
  var detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.native
  /**
    * The name of the detector model.
    */
  var detectorModelName: js.UndefOr[DetectorModelName] = js.native
}

object DetectorModelSummary {
  @scala.inline
  def apply(
    creationTime: js.Date = null,
    detectorModelDescription: DetectorModelDescription = null,
    detectorModelName: DetectorModelName = null
  ): DetectorModelSummary = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (detectorModelDescription != null) __obj.updateDynamic("detectorModelDescription")(detectorModelDescription.asInstanceOf[js.Any])
    if (detectorModelName != null) __obj.updateDynamic("detectorModelName")(detectorModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorModelSummary]
  }
}

