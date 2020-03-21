package typingsJapgolly.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of detected objects with bounding boxes.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1LocalizedObjectAnnotation extends js.Object {
  /**
    * Image region to which this object belongs. This must be populated.
    */
  var boundingPoly: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1BoundingPoly] = js.native
  /**
    * The BCP-47 language code, such as &quot;en-US&quot; or
    * &quot;sr-Latn&quot;. For more information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Object ID that should align with EntityAnnotation mid.
    */
  var mid: js.UndefOr[String] = js.native
  /**
    * Object name, expressed in its `language_code` language.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Score of the result. Range [0, 1].
    */
  var score: js.UndefOr[Double] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1LocalizedObjectAnnotation {
  @scala.inline
  def apply(
    boundingPoly: SchemaGoogleCloudVisionV1p4beta1BoundingPoly = null,
    languageCode: String = null,
    mid: String = null,
    name: String = null,
    score: Int | Double = null
  ): SchemaGoogleCloudVisionV1p4beta1LocalizedObjectAnnotation = {
    val __obj = js.Dynamic.literal()
    if (boundingPoly != null) __obj.updateDynamic("boundingPoly")(boundingPoly.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (mid != null) __obj.updateDynamic("mid")(mid.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1LocalizedObjectAnnotation]
  }
}

