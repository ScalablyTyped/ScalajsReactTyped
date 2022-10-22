package typingsJapgolly.tryghostContentApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostOrPage
  extends StObject
     with Identification
     with Excerpt
     with CodeInjection
     with Metadata
     with SocialMedia
     with GhostData {
  
  // Authors - Only shown when using Include Param
  var authors: js.UndefOr[js.Array[Author]] = js.undefined
  
  var canonical_url: js.UndefOr[Nullable[String]] = js.undefined
  
  var comment_id: js.UndefOr[String] = js.undefined
  
  // Dates
  var created_at: js.UndefOr[String] = js.undefined
  
  // Custom Template for posts and pages
  var custom_template: js.UndefOr[Nullable[String]] = js.undefined
  
  // Image
  var feature_image: js.UndefOr[Nullable[String]] = js.undefined
  
  var feature_image_alt: js.UndefOr[Nullable[String]] = js.undefined
  
  var feature_image_caption: js.UndefOr[Nullable[String]] = js.undefined
  
  var featured: js.UndefOr[Boolean] = js.undefined
  
  var html: js.UndefOr[Nullable[String]] = js.undefined
  
  // Post or Page
  var page: js.UndefOr[Boolean] = js.undefined
  
  var plaintext: js.UndefOr[Nullable[String]] = js.undefined
  
  var primary_author: js.UndefOr[Nullable[Author]] = js.undefined
  
  var primary_tag: js.UndefOr[Nullable[Tag]] = js.undefined
  
  var published_at: js.UndefOr[Nullable[String]] = js.undefined
  
  // Reading time
  var reading_time: js.UndefOr[Double] = js.undefined
  
  // Tags - Only shown when using Include param
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
  
  // Post or Page
  var title: js.UndefOr[String] = js.undefined
  
  var updated_at: js.UndefOr[Nullable[String]] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  // Identification
  var uuid: js.UndefOr[String] = js.undefined
}
object PostOrPage {
  
  inline def apply(id: String, slug: String): PostOrPage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostOrPage]
  }
  
  extension [Self <: PostOrPage](x: Self) {
    
    inline def setAuthors(value: js.Array[Author]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
    
    inline def setAuthorsUndefined: Self = StObject.set(x, "authors", js.undefined)
    
    inline def setAuthorsVarargs(value: Author*): Self = StObject.set(x, "authors", js.Array(value*))
    
    inline def setCanonical_url(value: Nullable[String]): Self = StObject.set(x, "canonical_url", value.asInstanceOf[js.Any])
    
    inline def setCanonical_urlNull: Self = StObject.set(x, "canonical_url", null)
    
    inline def setCanonical_urlUndefined: Self = StObject.set(x, "canonical_url", js.undefined)
    
    inline def setComment_id(value: String): Self = StObject.set(x, "comment_id", value.asInstanceOf[js.Any])
    
    inline def setComment_idUndefined: Self = StObject.set(x, "comment_id", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setCustom_template(value: Nullable[String]): Self = StObject.set(x, "custom_template", value.asInstanceOf[js.Any])
    
    inline def setCustom_templateNull: Self = StObject.set(x, "custom_template", null)
    
    inline def setCustom_templateUndefined: Self = StObject.set(x, "custom_template", js.undefined)
    
    inline def setFeature_image(value: Nullable[String]): Self = StObject.set(x, "feature_image", value.asInstanceOf[js.Any])
    
    inline def setFeature_imageNull: Self = StObject.set(x, "feature_image", null)
    
    inline def setFeature_imageUndefined: Self = StObject.set(x, "feature_image", js.undefined)
    
    inline def setFeature_image_alt(value: Nullable[String]): Self = StObject.set(x, "feature_image_alt", value.asInstanceOf[js.Any])
    
    inline def setFeature_image_altNull: Self = StObject.set(x, "feature_image_alt", null)
    
    inline def setFeature_image_altUndefined: Self = StObject.set(x, "feature_image_alt", js.undefined)
    
    inline def setFeature_image_caption(value: Nullable[String]): Self = StObject.set(x, "feature_image_caption", value.asInstanceOf[js.Any])
    
    inline def setFeature_image_captionNull: Self = StObject.set(x, "feature_image_caption", null)
    
    inline def setFeature_image_captionUndefined: Self = StObject.set(x, "feature_image_caption", js.undefined)
    
    inline def setFeatured(value: Boolean): Self = StObject.set(x, "featured", value.asInstanceOf[js.Any])
    
    inline def setFeaturedUndefined: Self = StObject.set(x, "featured", js.undefined)
    
    inline def setHtml(value: Nullable[String]): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlNull: Self = StObject.set(x, "html", null)
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setPage(value: Boolean): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPlaintext(value: Nullable[String]): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    
    inline def setPlaintextNull: Self = StObject.set(x, "plaintext", null)
    
    inline def setPlaintextUndefined: Self = StObject.set(x, "plaintext", js.undefined)
    
    inline def setPrimary_author(value: Nullable[Author]): Self = StObject.set(x, "primary_author", value.asInstanceOf[js.Any])
    
    inline def setPrimary_authorNull: Self = StObject.set(x, "primary_author", null)
    
    inline def setPrimary_authorUndefined: Self = StObject.set(x, "primary_author", js.undefined)
    
    inline def setPrimary_tag(value: Nullable[Tag]): Self = StObject.set(x, "primary_tag", value.asInstanceOf[js.Any])
    
    inline def setPrimary_tagNull: Self = StObject.set(x, "primary_tag", null)
    
    inline def setPrimary_tagUndefined: Self = StObject.set(x, "primary_tag", js.undefined)
    
    inline def setPublished_at(value: Nullable[String]): Self = StObject.set(x, "published_at", value.asInstanceOf[js.Any])
    
    inline def setPublished_atNull: Self = StObject.set(x, "published_at", null)
    
    inline def setPublished_atUndefined: Self = StObject.set(x, "published_at", js.undefined)
    
    inline def setReading_time(value: Double): Self = StObject.set(x, "reading_time", value.asInstanceOf[js.Any])
    
    inline def setReading_timeUndefined: Self = StObject.set(x, "reading_time", js.undefined)
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdated_at(value: Nullable[String]): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atNull: Self = StObject.set(x, "updated_at", null)
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
