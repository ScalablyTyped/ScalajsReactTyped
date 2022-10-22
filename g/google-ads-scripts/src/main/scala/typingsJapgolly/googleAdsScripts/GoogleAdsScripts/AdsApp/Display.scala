package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Access to display criteria that have been added to ad groups in this account: Audience, DisplayKeyword, Placement, Topic. */
trait Display extends StObject {
  
  /** Returns the selector of all audiences in the account. */
  def audiences(): AudienceSelector
  
  /** Returns the selector of all display keywords in the account. */
  def keywords(): DisplayKeywordSelector
  
  /** Returns the selector of all website placements in the account. */
  def placements(): PlacementSelector
  
  /** Returns the selector of all topics in the account. */
  def topics(): TopicSelector
  
  /** Returns the selector of all YouTube channels in the account. */
  def youTubeChannels(): YouTubeChannelSelector
  
  /** Returns the selector of all YouTube videos in the account. */
  def youTubeVideos(): YouTubeVideoSelector
}
object Display {
  
  inline def apply(
    audiences: CallbackTo[AudienceSelector],
    keywords: CallbackTo[DisplayKeywordSelector],
    placements: CallbackTo[PlacementSelector],
    topics: CallbackTo[TopicSelector],
    youTubeChannels: CallbackTo[YouTubeChannelSelector],
    youTubeVideos: CallbackTo[YouTubeVideoSelector]
  ): Display = {
    val __obj = js.Dynamic.literal(audiences = audiences.toJsFn, keywords = keywords.toJsFn, placements = placements.toJsFn, topics = topics.toJsFn, youTubeChannels = youTubeChannels.toJsFn, youTubeVideos = youTubeVideos.toJsFn)
    __obj.asInstanceOf[Display]
  }
  
  extension [Self <: Display](x: Self) {
    
    inline def setAudiences(value: CallbackTo[AudienceSelector]): Self = StObject.set(x, "audiences", value.toJsFn)
    
    inline def setKeywords(value: CallbackTo[DisplayKeywordSelector]): Self = StObject.set(x, "keywords", value.toJsFn)
    
    inline def setPlacements(value: CallbackTo[PlacementSelector]): Self = StObject.set(x, "placements", value.toJsFn)
    
    inline def setTopics(value: CallbackTo[TopicSelector]): Self = StObject.set(x, "topics", value.toJsFn)
    
    inline def setYouTubeChannels(value: CallbackTo[YouTubeChannelSelector]): Self = StObject.set(x, "youTubeChannels", value.toJsFn)
    
    inline def setYouTubeVideos(value: CallbackTo[YouTubeVideoSelector]): Self = StObject.set(x, "youTubeVideos", value.toJsFn)
  }
}
