package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access to aggregated ad group-level display criteria for a campaign and campaign-level excluded display criteria for a campaign.
  * For example, to access all display keywords in all ad groups in this campaign:
  *
  *      var displayKeywordIterator = campaign.display().keywords().get();
  *      while (displayKeywordIterator.hasNext()) {
  *        var displayKeyword = displayKeywordIterator.next();
  *      }
  */
trait CampaignDisplay extends StObject {
  
  /** Returns the selector of all audiences in the campaign. */
  def audiences(): AudienceSelector
  
  /** Returns the selector of all excluded audiences in the campaign. */
  def excludedAudiences(): ExcludedAudienceSelector
  
  /** Returns the selector of all excluded display keywords in the campaign. */
  def excludedKeywords(): ExcludedDisplayKeywordSelector
  
  /** Returns the selector of all excluded website placements in the campaign. */
  def excludedPlacements(): ExcludedPlacementSelector
  
  /** Returns the selector of all excluded topics in the campaign. */
  def excludedTopics(): ExcludedTopicSelector
  
  /** Returns the selector of all excluded YouTube channels in the campaign. */
  def excludedYouTubeChannels(): ExcludedYouTubeChannelSelector
  
  /** Returns the selector of all excluded YouTube videos in the campaign. */
  def excludedYouTubeVideos(): ExcludedYouTubeVideoSelector
  
  /** Returns the selector of all display keywords in all ad groups in the campaign. */
  def keywords(): DisplayKeywordSelector
  
  /** Returns a new audience builder for this campaign. */
  def newAudienceBuilder(): AudienceBuilder
  
  /** Returns a new display keyword builder for this campaign. */
  def newKeywordBuilder(): DisplayKeywordBuilder
  
  /** Returns a new placement builder for this campaign. */
  def newPlacementBuilder(): PlacementBuilder
  
  /** Returns a new topic builder for this campaign. */
  def newTopicBuilder(): TopicBuilder
  
  /** Returns a new YouTube channel builder for this campaign. */
  def newYouTubeChannelBuilder(): YouTubeChannelBuilder
  
  /** Returns a new YouTube video builder for this campaign. */
  def newYouTubeVideoBuilder(): YouTubeVideoBuilder
  
  /** Returns the selector of all website placements in all ad groups in the campaign. */
  def placements(): PlacementSelector
  
  /** Returns the selector of all topics in all ad groups in the campaign. */
  def topics(): TopicSelector
  
  /** Returns the selector of all YouTube channels in the campaign. */
  def youTubeChannels(): YouTubeChannelSelector
  
  /** Returns the selector of all YouTube videos in the campaign. */
  def youTubeVideos(): YouTubeVideoSelector
}
object CampaignDisplay {
  
  inline def apply(
    audiences: CallbackTo[AudienceSelector],
    excludedAudiences: CallbackTo[ExcludedAudienceSelector],
    excludedKeywords: CallbackTo[ExcludedDisplayKeywordSelector],
    excludedPlacements: CallbackTo[ExcludedPlacementSelector],
    excludedTopics: CallbackTo[ExcludedTopicSelector],
    excludedYouTubeChannels: CallbackTo[ExcludedYouTubeChannelSelector],
    excludedYouTubeVideos: CallbackTo[ExcludedYouTubeVideoSelector],
    keywords: CallbackTo[DisplayKeywordSelector],
    newAudienceBuilder: CallbackTo[AudienceBuilder],
    newKeywordBuilder: CallbackTo[DisplayKeywordBuilder],
    newPlacementBuilder: CallbackTo[PlacementBuilder],
    newTopicBuilder: CallbackTo[TopicBuilder],
    newYouTubeChannelBuilder: CallbackTo[YouTubeChannelBuilder],
    newYouTubeVideoBuilder: CallbackTo[YouTubeVideoBuilder],
    placements: CallbackTo[PlacementSelector],
    topics: CallbackTo[TopicSelector],
    youTubeChannels: CallbackTo[YouTubeChannelSelector],
    youTubeVideos: CallbackTo[YouTubeVideoSelector]
  ): CampaignDisplay = {
    val __obj = js.Dynamic.literal(audiences = audiences.toJsFn, excludedAudiences = excludedAudiences.toJsFn, excludedKeywords = excludedKeywords.toJsFn, excludedPlacements = excludedPlacements.toJsFn, excludedTopics = excludedTopics.toJsFn, excludedYouTubeChannels = excludedYouTubeChannels.toJsFn, excludedYouTubeVideos = excludedYouTubeVideos.toJsFn, keywords = keywords.toJsFn, newAudienceBuilder = newAudienceBuilder.toJsFn, newKeywordBuilder = newKeywordBuilder.toJsFn, newPlacementBuilder = newPlacementBuilder.toJsFn, newTopicBuilder = newTopicBuilder.toJsFn, newYouTubeChannelBuilder = newYouTubeChannelBuilder.toJsFn, newYouTubeVideoBuilder = newYouTubeVideoBuilder.toJsFn, placements = placements.toJsFn, topics = topics.toJsFn, youTubeChannels = youTubeChannels.toJsFn, youTubeVideos = youTubeVideos.toJsFn)
    __obj.asInstanceOf[CampaignDisplay]
  }
  
  extension [Self <: CampaignDisplay](x: Self) {
    
    inline def setAudiences(value: CallbackTo[AudienceSelector]): Self = StObject.set(x, "audiences", value.toJsFn)
    
    inline def setExcludedAudiences(value: CallbackTo[ExcludedAudienceSelector]): Self = StObject.set(x, "excludedAudiences", value.toJsFn)
    
    inline def setExcludedKeywords(value: CallbackTo[ExcludedDisplayKeywordSelector]): Self = StObject.set(x, "excludedKeywords", value.toJsFn)
    
    inline def setExcludedPlacements(value: CallbackTo[ExcludedPlacementSelector]): Self = StObject.set(x, "excludedPlacements", value.toJsFn)
    
    inline def setExcludedTopics(value: CallbackTo[ExcludedTopicSelector]): Self = StObject.set(x, "excludedTopics", value.toJsFn)
    
    inline def setExcludedYouTubeChannels(value: CallbackTo[ExcludedYouTubeChannelSelector]): Self = StObject.set(x, "excludedYouTubeChannels", value.toJsFn)
    
    inline def setExcludedYouTubeVideos(value: CallbackTo[ExcludedYouTubeVideoSelector]): Self = StObject.set(x, "excludedYouTubeVideos", value.toJsFn)
    
    inline def setKeywords(value: CallbackTo[DisplayKeywordSelector]): Self = StObject.set(x, "keywords", value.toJsFn)
    
    inline def setNewAudienceBuilder(value: CallbackTo[AudienceBuilder]): Self = StObject.set(x, "newAudienceBuilder", value.toJsFn)
    
    inline def setNewKeywordBuilder(value: CallbackTo[DisplayKeywordBuilder]): Self = StObject.set(x, "newKeywordBuilder", value.toJsFn)
    
    inline def setNewPlacementBuilder(value: CallbackTo[PlacementBuilder]): Self = StObject.set(x, "newPlacementBuilder", value.toJsFn)
    
    inline def setNewTopicBuilder(value: CallbackTo[TopicBuilder]): Self = StObject.set(x, "newTopicBuilder", value.toJsFn)
    
    inline def setNewYouTubeChannelBuilder(value: CallbackTo[YouTubeChannelBuilder]): Self = StObject.set(x, "newYouTubeChannelBuilder", value.toJsFn)
    
    inline def setNewYouTubeVideoBuilder(value: CallbackTo[YouTubeVideoBuilder]): Self = StObject.set(x, "newYouTubeVideoBuilder", value.toJsFn)
    
    inline def setPlacements(value: CallbackTo[PlacementSelector]): Self = StObject.set(x, "placements", value.toJsFn)
    
    inline def setTopics(value: CallbackTo[TopicSelector]): Self = StObject.set(x, "topics", value.toJsFn)
    
    inline def setYouTubeChannels(value: CallbackTo[YouTubeChannelSelector]): Self = StObject.set(x, "youTubeChannels", value.toJsFn)
    
    inline def setYouTubeVideos(value: CallbackTo[YouTubeVideoSelector]): Self = StObject.set(x, "youTubeVideos", value.toJsFn)
  }
}
