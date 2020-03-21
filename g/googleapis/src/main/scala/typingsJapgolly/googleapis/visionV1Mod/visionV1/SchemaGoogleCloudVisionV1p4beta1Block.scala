package typingsJapgolly.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Logical element on the page.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1Block extends js.Object {
  /**
    * Detected block type (text, image etc) for this block.
    */
  var blockType: js.UndefOr[String] = js.native
  /**
    * The bounding box for the block. The vertices are in the order of
    * top-left, top-right, bottom-right, bottom-left. When a rotation of the
    * bounding box is detected the rotation is represented as around the
    * top-left corner as defined when the text is read in the &#39;natural&#39;
    * orientation. For example:  * when the text is horizontal it might look
    * like:          0----1         |    |         3----2  * when it&#39;s
    * rotated 180 degrees around the top-left corner it becomes: 2----3 |    |
    * 1----0    and the vertex order will still be (0, 1, 2, 3).
    */
  var boundingBox: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1BoundingPoly] = js.native
  /**
    * Confidence of the OCR results on the block. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * List of paragraphs in this block (if this blocks is of type text).
    */
  var paragraphs: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1Paragraph]] = js.native
  /**
    * Additional information detected for the block.
    */
  var property: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1TextAnnotationTextProperty] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1Block {
  @scala.inline
  def apply(
    blockType: String = null,
    boundingBox: SchemaGoogleCloudVisionV1p4beta1BoundingPoly = null,
    confidence: Int | Double = null,
    paragraphs: js.Array[SchemaGoogleCloudVisionV1p4beta1Paragraph] = null,
    property: SchemaGoogleCloudVisionV1p4beta1TextAnnotationTextProperty = null
  ): SchemaGoogleCloudVisionV1p4beta1Block = {
    val __obj = js.Dynamic.literal()
    if (blockType != null) __obj.updateDynamic("blockType")(blockType.asInstanceOf[js.Any])
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (paragraphs != null) __obj.updateDynamic("paragraphs")(paragraphs.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1Block]
  }
}

