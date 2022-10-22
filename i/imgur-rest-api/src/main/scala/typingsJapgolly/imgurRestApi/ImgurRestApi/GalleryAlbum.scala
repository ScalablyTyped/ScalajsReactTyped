package typingsJapgolly.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GalleryAlbum
  extends StObject
     with GalleryItem {
  
  var cover: String
  
  var cover_height: Double
  
  var cover_width: Double
  
  var images: js.Array[Image]
  
  var images_count: Double
  
  var layout: String
  
  var privacy: String
}
object GalleryAlbum {
  
  inline def apply(
    comment_count: Double,
    cover: String,
    cover_height: Double,
    cover_width: Double,
    datetime: Double,
    description: String,
    downs: Double,
    favorite: Boolean,
    id: String,
    images: js.Array[Image],
    images_count: Double,
    is_album: Boolean,
    layout: String,
    link: String,
    privacy: String,
    score: Double,
    title: String,
    topic: String,
    topic_id: Double,
    ups: Double,
    views: Double
  ): GalleryAlbum = {
    val __obj = js.Dynamic.literal(comment_count = comment_count.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], cover_height = cover_height.asInstanceOf[js.Any], cover_width = cover_width.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], downs = downs.asInstanceOf[js.Any], favorite = favorite.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], images_count = images_count.asInstanceOf[js.Any], is_album = is_album.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], topic_id = topic_id.asInstanceOf[js.Any], ups = ups.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[GalleryAlbum]
  }
  
  extension [Self <: GalleryAlbum](x: Self) {
    
    inline def setCover(value: String): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
    
    inline def setCover_height(value: Double): Self = StObject.set(x, "cover_height", value.asInstanceOf[js.Any])
    
    inline def setCover_width(value: Double): Self = StObject.set(x, "cover_width", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setImages_count(value: Double): Self = StObject.set(x, "images_count", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setPrivacy(value: String): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
  }
}
