package typingsJapgolly.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Face extends js.Object {
  /**
    * Bounding box of the face.
    */
  var BoundingBox: js.UndefOr[typingsJapgolly.awsSdk.rekognitionMod.BoundingBox] = js.native
  /**
    * Confidence level that the bounding box contains a face (and not a different object such as a tree).
    */
  var Confidence: js.UndefOr[Percent] = js.native
  /**
    * Identifier that you assign to all the faces in the input image.
    */
  var ExternalImageId: js.UndefOr[typingsJapgolly.awsSdk.rekognitionMod.ExternalImageId] = js.native
  /**
    * Unique identifier that Amazon Rekognition assigns to the face.
    */
  var FaceId: js.UndefOr[typingsJapgolly.awsSdk.rekognitionMod.FaceId] = js.native
  /**
    * Unique identifier that Amazon Rekognition assigns to the input image.
    */
  var ImageId: js.UndefOr[typingsJapgolly.awsSdk.rekognitionMod.ImageId] = js.native
}

object Face {
  @scala.inline
  def apply(
    BoundingBox: BoundingBox = null,
    Confidence: Int | Double = null,
    ExternalImageId: ExternalImageId = null,
    FaceId: FaceId = null,
    ImageId: ImageId = null
  ): Face = {
    val __obj = js.Dynamic.literal()
    if (BoundingBox != null) __obj.updateDynamic("BoundingBox")(BoundingBox.asInstanceOf[js.Any])
    if (Confidence != null) __obj.updateDynamic("Confidence")(Confidence.asInstanceOf[js.Any])
    if (ExternalImageId != null) __obj.updateDynamic("ExternalImageId")(ExternalImageId.asInstanceOf[js.Any])
    if (FaceId != null) __obj.updateDynamic("FaceId")(FaceId.asInstanceOf[js.Any])
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Face]
  }
}

