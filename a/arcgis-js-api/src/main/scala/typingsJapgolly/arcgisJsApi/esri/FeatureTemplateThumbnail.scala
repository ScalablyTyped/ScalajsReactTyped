package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.image
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.jpeg
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.jpg
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.png
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureTemplateThumbnail extends Object {
  /**
    * The MIME type of the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#thumbnail)
    */
  var contentType: image | png | jpg | jpeg
  /**
    * The height of the thumbnail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#thumbnail)
    */
  var height: Double
  /**
    * The [base64EncodedImageData](https://developer.mozilla.org/en-US/docs/Web/API/WindowBase64/Base64_encoding_and_decoding) presenting the thumbnail image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#thumbnail)
    */
  var imageData: String
  /**
    * The width of the thumbnail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#thumbnail)
    */
  var width: Double
}

object FeatureTemplateThumbnail {
  @scala.inline
  def apply(
    constructor: js.Function,
    contentType: image | png | jpg | jpeg,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    height: Double,
    imageData: String,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    width: Double
  ): FeatureTemplateThumbnail = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], imageData = imageData.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[FeatureTemplateThumbnail]
  }
}

