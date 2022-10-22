package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access to aggregated ad group-level video criteria for a campaign and campaign-level excluded video criteria for a campaign.
  * For example, to access all video keywords in all ad groups in this campaign:
  *
  *  var videoKeywordIterator = videoCampaign.videoTargeting().keywords().get();
  *  while (videoKeywordIterator.hasNext()) {
  *    var videoKeyword = videoKeywordIterator.next();
  *  }
  */
trait CampaignVideoTargeting extends StObject {
  
  /** Returns the selector of all ages in the campaign. */
  def ages(): VideoAgeSelector
  
  /** Returns the selector of all audiences in the campaign. */
  def audiences(): VideoAudienceSelector
  
  /** Returns the selector of all excluded ages in the campaign. */
  def excludedAges(): ExcludedVideoAgeSelector
  
  /** Returns the selector of all excluded audiences in the campaign. */
  def excludedAudiences(): ExcludedVideoAudienceSelector
  
  /** Returns the selector of all excluded genders in the campaign. */
  def excludedGenders(): ExcludedVideoGenderSelector
  
  /** Returns the selector of all excluded keywords in the campaign. */
  def excludedKeywords(): ExcludedVideoKeywordSelector
  
  /** Returns the selector of all excluded mobile application categories in the campaign. */
  def excludedMobileAppCategories(): ExcludedVideoMobileAppCategorySelector
  
  /** Returns the selector of all excluded mobile applications in the campaign. */
  def excludedMobileApplications(): ExcludedVideoMobileApplicationSelector
  
  /** Returns the selector of all excluded parental statuses in the campaign. */
  def excludedParentalStatuses(): ExcludedVideoParentalStatusSelector
  
  /** Returns the selector of all excluded placements in the campaign. */
  def excludedPlacements(): ExcludedVideoPlacementSelector
  
  /** Returns the selector of all excluded topics in the campaign. */
  def excludedTopics(): ExcludedVideoTopicSelector
  
  /** Returns the selector of all excluded YouTube channels in the campaign. */
  def excludedYouTubeChannels(): ExcludedVideoYouTubeChannelSelector
  
  /** Returns the selector of all excluded YouTube videos in the campaign. */
  def excludedYouTubeVideos(): ExcludedVideoYouTubeVideoSelector
  
  /** Returns the selector of all genders in the campaign. */
  def genders(): VideoGenderSelector
  
  /** Returns the selector of all keywords in the campaign. */
  def keywords(): VideoKeywordSelector
  
  /** Returns the selector of all mobile application categories in the campaign. */
  def mobileAppCategories(): VideoMobileAppCategorySelector
  
  /** Returns the selector of all mobile applications in the campaign. */
  def mobileApplications(): VideoMobileApplicationSelector
  
  /** Returns a new age builder for this campaign. */
  def newAgeBuilder(): VideoAgeBuilder
  
  /** Returns a new audience builder for this campaign. */
  def newAudienceBuilder(): VideoAudienceBuilder
  
  /** Returns a new age gender for this campaign. */
  def newGenderBuilder(): VideoGenderBuilder
  
  /** Returns a new keyword builder for this campaign. */
  def newKeywordBuilder(): VideoKeywordBuilder
  
  /** Returns a new mobile application category builder for this campaign. */
  def newMobileAppCategoryBuilder(): VideoMobileAppCategoryBuilder
  
  /** Returns a new mobile application builder for this campaign. */
  def newMobileApplicationBuilder(): VideoMobileApplicationBuilder
  
  /** Returns a new parental status builder for this campaign. */
  def newParentalStatusBuilder(): VideoParentalStatusBuilder
  
  /** Returns a new placement builder for this campaign. */
  def newPlacementBuilder(): VideoPlacementBuilder
  
  /** Returns a new video topic builder for this campaign. */
  def newTopicBuilder(): VideoTopicBuilder
  
  /** Returns a new YouTube channel builder for this campaign. */
  def newYouTubeChannelBuilder(): VideoYouTubeChannelBuilder
  
  /** Returns a new YouTube video builder for this campaign. */
  def newYouTubeVideoBuilder(): VideoYouTubeVideoBuilder
  
  /** Returns the selector of all parental statuses in the campaign. */
  def parentalStatuses(): VideoParentalStatusSelector
  
  /** Returns the selector of all placements in the campaign. */
  def placements(): VideoPlacementSelector
  
  /** Returns the selector of all topics in the campaign. */
  def topics(): VideoTopicSelector
  
  /** Returns the selector of all YouTube channels in the campaign. */
  def youTubeChannels(): VideoYouTubeChannelSelector
  
  /** Returns the selector of all YouTube videos in the campaign. */
  def youTubeVideos(): VideoYouTubeVideoSelector
}
object CampaignVideoTargeting {
  
  inline def apply(
    ages: CallbackTo[VideoAgeSelector],
    audiences: CallbackTo[VideoAudienceSelector],
    excludedAges: CallbackTo[ExcludedVideoAgeSelector],
    excludedAudiences: CallbackTo[ExcludedVideoAudienceSelector],
    excludedGenders: CallbackTo[ExcludedVideoGenderSelector],
    excludedKeywords: CallbackTo[ExcludedVideoKeywordSelector],
    excludedMobileAppCategories: CallbackTo[ExcludedVideoMobileAppCategorySelector],
    excludedMobileApplications: CallbackTo[ExcludedVideoMobileApplicationSelector],
    excludedParentalStatuses: CallbackTo[ExcludedVideoParentalStatusSelector],
    excludedPlacements: CallbackTo[ExcludedVideoPlacementSelector],
    excludedTopics: CallbackTo[ExcludedVideoTopicSelector],
    excludedYouTubeChannels: CallbackTo[ExcludedVideoYouTubeChannelSelector],
    excludedYouTubeVideos: CallbackTo[ExcludedVideoYouTubeVideoSelector],
    genders: CallbackTo[VideoGenderSelector],
    keywords: CallbackTo[VideoKeywordSelector],
    mobileAppCategories: CallbackTo[VideoMobileAppCategorySelector],
    mobileApplications: CallbackTo[VideoMobileApplicationSelector],
    newAgeBuilder: CallbackTo[VideoAgeBuilder],
    newAudienceBuilder: CallbackTo[VideoAudienceBuilder],
    newGenderBuilder: CallbackTo[VideoGenderBuilder],
    newKeywordBuilder: CallbackTo[VideoKeywordBuilder],
    newMobileAppCategoryBuilder: CallbackTo[VideoMobileAppCategoryBuilder],
    newMobileApplicationBuilder: CallbackTo[VideoMobileApplicationBuilder],
    newParentalStatusBuilder: CallbackTo[VideoParentalStatusBuilder],
    newPlacementBuilder: CallbackTo[VideoPlacementBuilder],
    newTopicBuilder: CallbackTo[VideoTopicBuilder],
    newYouTubeChannelBuilder: CallbackTo[VideoYouTubeChannelBuilder],
    newYouTubeVideoBuilder: CallbackTo[VideoYouTubeVideoBuilder],
    parentalStatuses: CallbackTo[VideoParentalStatusSelector],
    placements: CallbackTo[VideoPlacementSelector],
    topics: CallbackTo[VideoTopicSelector],
    youTubeChannels: CallbackTo[VideoYouTubeChannelSelector],
    youTubeVideos: CallbackTo[VideoYouTubeVideoSelector]
  ): CampaignVideoTargeting = {
    val __obj = js.Dynamic.literal(ages = ages.toJsFn, audiences = audiences.toJsFn, excludedAges = excludedAges.toJsFn, excludedAudiences = excludedAudiences.toJsFn, excludedGenders = excludedGenders.toJsFn, excludedKeywords = excludedKeywords.toJsFn, excludedMobileAppCategories = excludedMobileAppCategories.toJsFn, excludedMobileApplications = excludedMobileApplications.toJsFn, excludedParentalStatuses = excludedParentalStatuses.toJsFn, excludedPlacements = excludedPlacements.toJsFn, excludedTopics = excludedTopics.toJsFn, excludedYouTubeChannels = excludedYouTubeChannels.toJsFn, excludedYouTubeVideos = excludedYouTubeVideos.toJsFn, genders = genders.toJsFn, keywords = keywords.toJsFn, mobileAppCategories = mobileAppCategories.toJsFn, mobileApplications = mobileApplications.toJsFn, newAgeBuilder = newAgeBuilder.toJsFn, newAudienceBuilder = newAudienceBuilder.toJsFn, newGenderBuilder = newGenderBuilder.toJsFn, newKeywordBuilder = newKeywordBuilder.toJsFn, newMobileAppCategoryBuilder = newMobileAppCategoryBuilder.toJsFn, newMobileApplicationBuilder = newMobileApplicationBuilder.toJsFn, newParentalStatusBuilder = newParentalStatusBuilder.toJsFn, newPlacementBuilder = newPlacementBuilder.toJsFn, newTopicBuilder = newTopicBuilder.toJsFn, newYouTubeChannelBuilder = newYouTubeChannelBuilder.toJsFn, newYouTubeVideoBuilder = newYouTubeVideoBuilder.toJsFn, parentalStatuses = parentalStatuses.toJsFn, placements = placements.toJsFn, topics = topics.toJsFn, youTubeChannels = youTubeChannels.toJsFn, youTubeVideos = youTubeVideos.toJsFn)
    __obj.asInstanceOf[CampaignVideoTargeting]
  }
  
  extension [Self <: CampaignVideoTargeting](x: Self) {
    
    inline def setAges(value: CallbackTo[VideoAgeSelector]): Self = StObject.set(x, "ages", value.toJsFn)
    
    inline def setAudiences(value: CallbackTo[VideoAudienceSelector]): Self = StObject.set(x, "audiences", value.toJsFn)
    
    inline def setExcludedAges(value: CallbackTo[ExcludedVideoAgeSelector]): Self = StObject.set(x, "excludedAges", value.toJsFn)
    
    inline def setExcludedAudiences(value: CallbackTo[ExcludedVideoAudienceSelector]): Self = StObject.set(x, "excludedAudiences", value.toJsFn)
    
    inline def setExcludedGenders(value: CallbackTo[ExcludedVideoGenderSelector]): Self = StObject.set(x, "excludedGenders", value.toJsFn)
    
    inline def setExcludedKeywords(value: CallbackTo[ExcludedVideoKeywordSelector]): Self = StObject.set(x, "excludedKeywords", value.toJsFn)
    
    inline def setExcludedMobileAppCategories(value: CallbackTo[ExcludedVideoMobileAppCategorySelector]): Self = StObject.set(x, "excludedMobileAppCategories", value.toJsFn)
    
    inline def setExcludedMobileApplications(value: CallbackTo[ExcludedVideoMobileApplicationSelector]): Self = StObject.set(x, "excludedMobileApplications", value.toJsFn)
    
    inline def setExcludedParentalStatuses(value: CallbackTo[ExcludedVideoParentalStatusSelector]): Self = StObject.set(x, "excludedParentalStatuses", value.toJsFn)
    
    inline def setExcludedPlacements(value: CallbackTo[ExcludedVideoPlacementSelector]): Self = StObject.set(x, "excludedPlacements", value.toJsFn)
    
    inline def setExcludedTopics(value: CallbackTo[ExcludedVideoTopicSelector]): Self = StObject.set(x, "excludedTopics", value.toJsFn)
    
    inline def setExcludedYouTubeChannels(value: CallbackTo[ExcludedVideoYouTubeChannelSelector]): Self = StObject.set(x, "excludedYouTubeChannels", value.toJsFn)
    
    inline def setExcludedYouTubeVideos(value: CallbackTo[ExcludedVideoYouTubeVideoSelector]): Self = StObject.set(x, "excludedYouTubeVideos", value.toJsFn)
    
    inline def setGenders(value: CallbackTo[VideoGenderSelector]): Self = StObject.set(x, "genders", value.toJsFn)
    
    inline def setKeywords(value: CallbackTo[VideoKeywordSelector]): Self = StObject.set(x, "keywords", value.toJsFn)
    
    inline def setMobileAppCategories(value: CallbackTo[VideoMobileAppCategorySelector]): Self = StObject.set(x, "mobileAppCategories", value.toJsFn)
    
    inline def setMobileApplications(value: CallbackTo[VideoMobileApplicationSelector]): Self = StObject.set(x, "mobileApplications", value.toJsFn)
    
    inline def setNewAgeBuilder(value: CallbackTo[VideoAgeBuilder]): Self = StObject.set(x, "newAgeBuilder", value.toJsFn)
    
    inline def setNewAudienceBuilder(value: CallbackTo[VideoAudienceBuilder]): Self = StObject.set(x, "newAudienceBuilder", value.toJsFn)
    
    inline def setNewGenderBuilder(value: CallbackTo[VideoGenderBuilder]): Self = StObject.set(x, "newGenderBuilder", value.toJsFn)
    
    inline def setNewKeywordBuilder(value: CallbackTo[VideoKeywordBuilder]): Self = StObject.set(x, "newKeywordBuilder", value.toJsFn)
    
    inline def setNewMobileAppCategoryBuilder(value: CallbackTo[VideoMobileAppCategoryBuilder]): Self = StObject.set(x, "newMobileAppCategoryBuilder", value.toJsFn)
    
    inline def setNewMobileApplicationBuilder(value: CallbackTo[VideoMobileApplicationBuilder]): Self = StObject.set(x, "newMobileApplicationBuilder", value.toJsFn)
    
    inline def setNewParentalStatusBuilder(value: CallbackTo[VideoParentalStatusBuilder]): Self = StObject.set(x, "newParentalStatusBuilder", value.toJsFn)
    
    inline def setNewPlacementBuilder(value: CallbackTo[VideoPlacementBuilder]): Self = StObject.set(x, "newPlacementBuilder", value.toJsFn)
    
    inline def setNewTopicBuilder(value: CallbackTo[VideoTopicBuilder]): Self = StObject.set(x, "newTopicBuilder", value.toJsFn)
    
    inline def setNewYouTubeChannelBuilder(value: CallbackTo[VideoYouTubeChannelBuilder]): Self = StObject.set(x, "newYouTubeChannelBuilder", value.toJsFn)
    
    inline def setNewYouTubeVideoBuilder(value: CallbackTo[VideoYouTubeVideoBuilder]): Self = StObject.set(x, "newYouTubeVideoBuilder", value.toJsFn)
    
    inline def setParentalStatuses(value: CallbackTo[VideoParentalStatusSelector]): Self = StObject.set(x, "parentalStatuses", value.toJsFn)
    
    inline def setPlacements(value: CallbackTo[VideoPlacementSelector]): Self = StObject.set(x, "placements", value.toJsFn)
    
    inline def setTopics(value: CallbackTo[VideoTopicSelector]): Self = StObject.set(x, "topics", value.toJsFn)
    
    inline def setYouTubeChannels(value: CallbackTo[VideoYouTubeChannelSelector]): Self = StObject.set(x, "youTubeChannels", value.toJsFn)
    
    inline def setYouTubeVideos(value: CallbackTo[VideoYouTubeVideoSelector]): Self = StObject.set(x, "youTubeVideos", value.toJsFn)
  }
}
