package typingsJapgolly.shopifyPrime.productMod

import typingsJapgolly.shopifyPrime.baseMod.ShopifyObject
import typingsJapgolly.shopifyPrime.productImageMod.ProductImage
import typingsJapgolly.shopifyPrime.productOptionMod.ProductOption
import typingsJapgolly.shopifyPrime.productVariantMod.ProductVariant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Product extends ShopifyObject {
  /**
    * The description of the product, complete with HTML formatting.
    */
  var body_html: js.UndefOr[String] = js.undefined
  /**
    * The date and time when the product was created. The API returns this value in ISO 8601 format.
    */
  var created_at: js.UndefOr[String] = js.undefined
  /**
    * A human-friendly unique string for the Product automatically generated from its title.
    * They are used by the Liquid templating language to refer to objects.
    */
  var handle: js.UndefOr[String] = js.undefined
  /**
    * A list of image objects, each one representing an image associated with the product.
    */
  var images: js.UndefOr[js.Array[ProductImage]] = js.undefined
  /**
    * The description of the product, to be used for SEO purposes. This will generally be added to the <meta name='description'> tag.
    */
  var metafields_global_description_tag: js.UndefOr[String] = js.undefined
  /**
    * The name of the product, to be used for SEO purposes. This will generally be added to the <meta name='title'> tag.
    */
  var metafields_global_title_tag: js.UndefOr[String] = js.undefined
  /**
    * Custom product property names like "Size", "Color", and "Material".
    * Products are based on permutations of these options.
    * A product may have a maximum of 3 options. 255 characters limit each.
    */
  var options: js.UndefOr[js.Array[ProductOption]] = js.undefined
  /**
    * A categorization that a product can be tagged with, commonly used for filtering and searching.
    */
  var product_type: js.UndefOr[String] = js.undefined
  /**
    * The date and time when the product was published. The API returns this value in ISO 8601 format.
    * Set to NULL to unpublish a product
    */
  var published_at: js.UndefOr[String] = js.undefined
  /**
    * The sales channels in which the product is visible.
    */
  var published_scope: js.UndefOr[String] = js.undefined
  /**
    * A categorization that a product can be tagged with, commonly used for filtering and searching.
    * Each comma-separated tag has a character limit of 255.
    */
  var tags: js.UndefOr[String] = js.undefined
  /**
    * The suffix of the liquid template being used.
    * By default, the original template is called product.liquid, without any suffix.
    * Any additional templates will be: product.suffix.liquid.
    */
  var template_suffix: js.UndefOr[String] = js.undefined
  /**
    * The name of the product. In a shop's catalog, clicking on a product's title takes you to that product's page.
    * On a product's page, the product's title typically appears in a large font.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The date and time when the product was last modified. The API returns this value in ISO 8601 format.
    */
  var updated_at: js.UndefOr[String] = js.undefined
  /**
    * A list of variant objects, each one representing a slightly different version of the product.
    * For example, if a product comes in different sizes and colors, each size and color permutation (such as "small black", "medium black", "large blue"), would be a variant.
    * To reorder variants, update the product with the variants in the desired order.The position attribute on the variant will be ignored.
    */
  var variants: js.UndefOr[js.Array[ProductVariant]] = js.undefined
  /**
    * The name of the vendor of the product.
    */
  var vendor: js.UndefOr[String] = js.undefined
}

object Product {
  @scala.inline
  def apply(
    admin_graphql_api_id: String = null,
    body_html: String = null,
    created_at: String = null,
    handle: String = null,
    id: Int | Double = null,
    images: js.Array[ProductImage] = null,
    metafields_global_description_tag: String = null,
    metafields_global_title_tag: String = null,
    options: js.Array[ProductOption] = null,
    product_type: String = null,
    published_at: String = null,
    published_scope: String = null,
    tags: String = null,
    template_suffix: String = null,
    title: String = null,
    updated_at: String = null,
    variants: js.Array[ProductVariant] = null,
    vendor: String = null
  ): Product = {
    val __obj = js.Dynamic.literal()
    if (admin_graphql_api_id != null) __obj.updateDynamic("admin_graphql_api_id")(admin_graphql_api_id.asInstanceOf[js.Any])
    if (body_html != null) __obj.updateDynamic("body_html")(body_html.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (metafields_global_description_tag != null) __obj.updateDynamic("metafields_global_description_tag")(metafields_global_description_tag.asInstanceOf[js.Any])
    if (metafields_global_title_tag != null) __obj.updateDynamic("metafields_global_title_tag")(metafields_global_title_tag.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (product_type != null) __obj.updateDynamic("product_type")(product_type.asInstanceOf[js.Any])
    if (published_at != null) __obj.updateDynamic("published_at")(published_at.asInstanceOf[js.Any])
    if (published_scope != null) __obj.updateDynamic("published_scope")(published_scope.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (template_suffix != null) __obj.updateDynamic("template_suffix")(template_suffix.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated_at != null) __obj.updateDynamic("updated_at")(updated_at.asInstanceOf[js.Any])
    if (variants != null) __obj.updateDynamic("variants")(variants.asInstanceOf[js.Any])
    if (vendor != null) __obj.updateDynamic("vendor")(vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
}

