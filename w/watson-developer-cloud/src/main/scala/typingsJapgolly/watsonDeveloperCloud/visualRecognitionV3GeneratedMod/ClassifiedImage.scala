package typingsJapgolly.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Results for one image. */
trait ClassifiedImage extends js.Object {
  /** The classifiers. */
  var classifiers: js.Array[ClassifierResult]
  /** Information about what might have caused a failure, such as an image that is too large. Not returned when there is no error. */
  var error: js.UndefOr[ErrorInfo] = js.undefined
  /** Relative path of the image file if uploaded directly. Not returned when the image is passed by URL. */
  var image: js.UndefOr[String] = js.undefined
  /** Fully resolved URL of the image after redirects are followed. Not returned when the image is uploaded. */
  var resolved_url: js.UndefOr[String] = js.undefined
  /** Source of the image before any redirects. Not returned when the image is uploaded. */
  var source_url: js.UndefOr[String] = js.undefined
}

object ClassifiedImage {
  @scala.inline
  def apply(
    classifiers: js.Array[ClassifierResult],
    error: ErrorInfo = null,
    image: String = null,
    resolved_url: String = null,
    source_url: String = null
  ): ClassifiedImage = {
    val __obj = js.Dynamic.literal(classifiers = classifiers.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (resolved_url != null) __obj.updateDynamic("resolved_url")(resolved_url.asInstanceOf[js.Any])
    if (source_url != null) __obj.updateDynamic("source_url")(source_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifiedImage]
  }
}

