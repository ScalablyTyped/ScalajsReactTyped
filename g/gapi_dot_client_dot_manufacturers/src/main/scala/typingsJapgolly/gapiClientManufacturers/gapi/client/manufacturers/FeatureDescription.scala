package typingsJapgolly.gapiClientManufacturers.gapi.client.manufacturers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureDescription extends js.Object {
  /** A short description of the feature. */
  var headline: js.UndefOr[String] = js.undefined
  /** An optional image describing the feature. */
  var image: js.UndefOr[Image] = js.undefined
  /** A detailed description of the feature. */
  var text: js.UndefOr[String] = js.undefined
}

object FeatureDescription {
  @scala.inline
  def apply(headline: String = null, image: Image = null, text: String = null): FeatureDescription = {
    val __obj = js.Dynamic.literal()
    if (headline != null) __obj.updateDynamic("headline")(headline.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureDescription]
  }
}

