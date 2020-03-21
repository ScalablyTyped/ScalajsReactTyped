package typingsJapgolly.shopifyBuy.ShopifyBuy

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageVariant extends Image {
  var dimensions: String
  var name: String
  /**
    * Returns src URL for new image size/variant
    * @param image The image you would like a different size for.
    * @param options Image Max width and height configuration.
    */
  def imageForSize(image: Image, options: ImageOptions): String
}

object ImageVariant {
  @scala.inline
  def apply(
    created_at: String,
    dimensions: String,
    id: String | Double,
    imageForSize: (Image, ImageOptions) => CallbackTo[String],
    name: String,
    position: Double,
    product_id: String,
    src: String,
    updated_at: String,
    variant_ids: js.Array[String],
    attrs: js.Any = null,
    onlineStoreUrl: String = null
  ): ImageVariant = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], product_id = product_id.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], variant_ids = variant_ids.asInstanceOf[js.Any])
    __obj.updateDynamic("imageForSize")(js.Any.fromFunction2((t0: typingsJapgolly.shopifyBuy.ShopifyBuy.Image, t1: typingsJapgolly.shopifyBuy.ShopifyBuy.ImageOptions) => imageForSize(t0, t1).runNow()))
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (onlineStoreUrl != null) __obj.updateDynamic("onlineStoreUrl")(onlineStoreUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageVariant]
  }
}

