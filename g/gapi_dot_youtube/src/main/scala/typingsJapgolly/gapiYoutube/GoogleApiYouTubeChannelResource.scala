package typingsJapgolly.gapiYoutube

import typingsJapgolly.gapiYoutube.anon.Channel
import typingsJapgolly.gapiYoutube.anon.CommentCount
import typingsJapgolly.gapiYoutube.anon.Description
import typingsJapgolly.gapiYoutube.anon.GooglePlusUserId
import typingsJapgolly.gapiYoutube.anon.IsLinked
import typingsJapgolly.gapiYoutube.anon.Items
import typingsJapgolly.gapiYoutube.anon.TopicIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiYouTubeChannelResource extends StObject {
  
  /**
    * The brandingSettings object encapsulates information about the branding of the channel.
    */
  var brandingSettings: Channel
  
  /**
    * The contentDetails object encapsulates information about the channels content.
    */
  var contentDetails: GooglePlusUserId
  
  /**
    * The ETag for the channel resource.
    */
  var etag: String
  
  /**
    * The ID that YouTube uses to uniquely identify the channel.
    */
  var id: String
  
  /**
    * The invideoPromotion object encapsulates information about a promotional campaign associated with the channel. A channel can use an in-video promotional campaign to display the thumbnail image of a promoted video in the video player during playback of the channels videos
    */
  var invideoPromotion: Items
  
  /**
    * The type of the API resource. For channel resources, the value will be youtube#channel.
    */
  var kind: String
  
  /**
    * The snippet object contains basic details about the channel, such as its title, description, and thumbnail images.
    */
  var snippet: Description
  
  /**
    * The statistics object encapsulates statistics for the channel.
    */
  var statistics: CommentCount
  
  /**
    * The status object encapsulates information about the privacy status of the channel.
    */
  var status: IsLinked
  
  /**
    * The topicDetails object encapsulates information about Freebase topics associated with the channel.
    */
  var topicDetails: TopicIds
}
object GoogleApiYouTubeChannelResource {
  
  inline def apply(
    brandingSettings: Channel,
    contentDetails: GooglePlusUserId,
    etag: String,
    id: String,
    invideoPromotion: Items,
    kind: String,
    snippet: Description,
    statistics: CommentCount,
    status: IsLinked,
    topicDetails: TopicIds
  ): GoogleApiYouTubeChannelResource = {
    val __obj = js.Dynamic.literal(brandingSettings = brandingSettings.asInstanceOf[js.Any], contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invideoPromotion = invideoPromotion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], topicDetails = topicDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeChannelResource]
  }
  
  extension [Self <: GoogleApiYouTubeChannelResource](x: Self) {
    
    inline def setBrandingSettings(value: Channel): Self = StObject.set(x, "brandingSettings", value.asInstanceOf[js.Any])
    
    inline def setContentDetails(value: GooglePlusUserId): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvideoPromotion(value: Items): Self = StObject.set(x, "invideoPromotion", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setSnippet(value: Description): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setStatistics(value: CommentCount): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: IsLinked): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTopicDetails(value: TopicIds): Self = StObject.set(x, "topicDetails", value.asInstanceOf[js.Any])
  }
}
