package typingsJapgolly.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectLabelsResponse extends js.Object {
  /**
    * Version number of the label detection model that was used to detect labels.
    */
  var LabelModelVersion: js.UndefOr[String] = js.native
  /**
    * An array of labels for the real-world objects detected. 
    */
  var Labels: js.UndefOr[typingsJapgolly.awsSdk.rekognitionMod.Labels] = js.native
  /**
    * The value of OrientationCorrection is always null. If the input image is in .jpeg format, it might contain exchangeable image file format (Exif) metadata that includes the image's orientation. Amazon Rekognition uses this orientation information to perform image correction. The bounding box coordinates are translated to represent object locations after the orientation information in the Exif metadata is used to correct the image orientation. Images in .png format don't contain Exif metadata. Amazon Rekognition doesn’t perform image correction for images in .png format and .jpeg images without orientation information in the image Exif metadata. The bounding box coordinates aren't translated and represent the object locations before the image is rotated. 
    */
  var OrientationCorrection: js.UndefOr[typingsJapgolly.awsSdk.rekognitionMod.OrientationCorrection] = js.native
}

object DetectLabelsResponse {
  @scala.inline
  def apply(
    LabelModelVersion: String = null,
    Labels: Labels = null,
    OrientationCorrection: OrientationCorrection = null
  ): DetectLabelsResponse = {
    val __obj = js.Dynamic.literal()
    if (LabelModelVersion != null) __obj.updateDynamic("LabelModelVersion")(LabelModelVersion.asInstanceOf[js.Any])
    if (Labels != null) __obj.updateDynamic("Labels")(Labels.asInstanceOf[js.Any])
    if (OrientationCorrection != null) __obj.updateDynamic("OrientationCorrection")(OrientationCorrection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectLabelsResponse]
  }
}

