package typingsJapgolly.ytSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoMetadataResult extends StObject {
  
  var ago: String
  
  var author: Author
  
  var description: String
  
  var duration: Duration
  
  var genre: String
  
  var image: String
  
  var seconds: Double
  
  var thumbnail: String
  
  var timestamp: String
  
  var title: String
  
  var uploadDate: String
  
  var url: String
  
  var videoId: String
  
  var views: Double
}
object VideoMetadataResult {
  
  inline def apply(
    ago: String,
    author: Author,
    description: String,
    duration: Duration,
    genre: String,
    image: String,
    seconds: Double,
    thumbnail: String,
    timestamp: String,
    title: String,
    uploadDate: String,
    url: String,
    videoId: String,
    views: Double
  ): VideoMetadataResult = {
    val __obj = js.Dynamic.literal(ago = ago.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], genre = genre.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uploadDate = uploadDate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoMetadataResult]
  }
  
  extension [Self <: VideoMetadataResult](x: Self) {
    
    inline def setAgo(value: String): Self = StObject.set(x, "ago", value.asInstanceOf[js.Any])
    
    inline def setAuthor(value: Author): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setGenre(value: String): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUploadDate(value: String): Self = StObject.set(x, "uploadDate", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    inline def setViews(value: Double): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
  }
}
