package typingsJapgolly.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A word representation.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1Word extends js.Object {
  /**
    * The bounding box for the word. The vertices are in the order of top-left,
    * top-right, bottom-right, bottom-left. When a rotation of the bounding box
    * is detected the rotation is represented as around the top-left corner as
    * defined when the text is read in the &#39;natural&#39; orientation. For
    * example:   * when the text is horizontal it might look like:      0----1
    * |    |      3----2   * when it&#39;s rotated 180 degrees around the
    * top-left corner it becomes:      2----3      |    |      1----0   and the
    * vertex order will still be (0, 1, 2, 3).
    */
  var boundingBox: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1BoundingPoly] = js.native
  /**
    * Confidence of the OCR results for the word. Range [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Additional information detected for the word.
    */
  var property: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1TextAnnotationTextProperty] = js.native
  /**
    * List of symbols in the word. The order of the symbols follows the natural
    * reading order.
    */
  var symbols: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1Symbol]] = js.native
}

object SchemaGoogleCloudVisionV1p2beta1Word {
  @scala.inline
  def apply(
    boundingBox: SchemaGoogleCloudVisionV1p2beta1BoundingPoly = null,
    confidence: Int | Double = null,
    property: SchemaGoogleCloudVisionV1p2beta1TextAnnotationTextProperty = null,
    symbols: js.Array[SchemaGoogleCloudVisionV1p2beta1Symbol] = null
  ): SchemaGoogleCloudVisionV1p2beta1Word = {
    val __obj = js.Dynamic.literal()
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (symbols != null) __obj.updateDynamic("symbols")(symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1Word]
  }
}

