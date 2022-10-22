package typingsJapgolly.gapiYoutube

import typingsJapgolly.gapiYoutube.anon.ChannelIdChannelTitle
import typingsJapgolly.gapiYoutube.anon.ChannelIdDescription
import typingsJapgolly.gapiYoutube.anon.NewItemCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiYouTubeSubscriptionResource extends StObject {
  
  /**
    *
    */
  var contentDetails: NewItemCount
  
  /**
    * The ETag of the subscription resource.
    */
  var etag: String
  
  /**
    * The ID that YouTube uses to uniquely identify the subscription.
    */
  var id: String
  
  /**
    * The type of the API resource. For subscription resources, the value will be youtube#subscription.
    */
  var kind: String
  
  /**
    * The snippet object contains basic details about the subscription, including its title and the channel that the user subscribed to.
    */
  var snippet: ChannelIdChannelTitle
  
  /**
    *
    */
  var subscriberSnippet: ChannelIdDescription
}
object GoogleApiYouTubeSubscriptionResource {
  
  inline def apply(
    contentDetails: NewItemCount,
    etag: String,
    id: String,
    kind: String,
    snippet: ChannelIdChannelTitle,
    subscriberSnippet: ChannelIdDescription
  ): GoogleApiYouTubeSubscriptionResource = {
    val __obj = js.Dynamic.literal(contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any], subscriberSnippet = subscriberSnippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeSubscriptionResource]
  }
  
  extension [Self <: GoogleApiYouTubeSubscriptionResource](x: Self) {
    
    inline def setContentDetails(value: NewItemCount): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setSnippet(value: ChannelIdChannelTitle): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSubscriberSnippet(value: ChannelIdDescription): Self = StObject.set(x, "subscriberSnippet", value.asInstanceOf[js.Any])
  }
}
