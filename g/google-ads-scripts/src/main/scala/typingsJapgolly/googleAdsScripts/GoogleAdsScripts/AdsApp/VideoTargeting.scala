package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Access to video criteria that have been added to ad groups in this account. */
trait VideoTargeting extends StObject {
  
  /** Returns the selector of all ages in the account. */
  def ages(): VideoAgeSelector
  
  /** Returns the selector of all audiences in the account. */
  def audiences(): VideoAudienceSelector
  
  /** Returns the selector of all genders in the account. */
  def genders(): VideoGenderSelector
  
  /** Returns the selector of all keywords in the account. */
  def keywords(): VideoKeywordSelector
  
  /** Returns the selector of all mobile application categories in the account. */
  def mobileAppCategories(): VideoMobileAppCategorySelector
  
  /** Returns the selector of all mobile applications in the account. */
  def mobileApplications(): VideoMobileApplicationSelector
  
  /** Returns the selector of all parental statuses in the account. */
  def parentalStatuses(): VideoParentalStatusSelector
  
  /** Returns the selector of all placements in the account. */
  def placements(): VideoPlacementSelector
  
  /** Returns the selector of all topics in the account. */
  def topics(): VideoTopicSelector
  
  /** Returns the selector of all YouTube channels in the account. */
  def youTubeChannels(): VideoYouTubeChannelSelector
  
  /** Returns the selector of all YouTube videos in the account. */
  def youTubeVideos(): VideoYouTubeVideoSelector
}
object VideoTargeting {
  
  inline def apply(
    ages: CallbackTo[VideoAgeSelector],
    audiences: CallbackTo[VideoAudienceSelector],
    genders: CallbackTo[VideoGenderSelector],
    keywords: CallbackTo[VideoKeywordSelector],
    mobileAppCategories: CallbackTo[VideoMobileAppCategorySelector],
    mobileApplications: CallbackTo[VideoMobileApplicationSelector],
    parentalStatuses: CallbackTo[VideoParentalStatusSelector],
    placements: CallbackTo[VideoPlacementSelector],
    topics: CallbackTo[VideoTopicSelector],
    youTubeChannels: CallbackTo[VideoYouTubeChannelSelector],
    youTubeVideos: CallbackTo[VideoYouTubeVideoSelector]
  ): VideoTargeting = {
    val __obj = js.Dynamic.literal(ages = ages.toJsFn, audiences = audiences.toJsFn, genders = genders.toJsFn, keywords = keywords.toJsFn, mobileAppCategories = mobileAppCategories.toJsFn, mobileApplications = mobileApplications.toJsFn, parentalStatuses = parentalStatuses.toJsFn, placements = placements.toJsFn, topics = topics.toJsFn, youTubeChannels = youTubeChannels.toJsFn, youTubeVideos = youTubeVideos.toJsFn)
    __obj.asInstanceOf[VideoTargeting]
  }
  
  extension [Self <: VideoTargeting](x: Self) {
    
    inline def setAges(value: CallbackTo[VideoAgeSelector]): Self = StObject.set(x, "ages", value.toJsFn)
    
    inline def setAudiences(value: CallbackTo[VideoAudienceSelector]): Self = StObject.set(x, "audiences", value.toJsFn)
    
    inline def setGenders(value: CallbackTo[VideoGenderSelector]): Self = StObject.set(x, "genders", value.toJsFn)
    
    inline def setKeywords(value: CallbackTo[VideoKeywordSelector]): Self = StObject.set(x, "keywords", value.toJsFn)
    
    inline def setMobileAppCategories(value: CallbackTo[VideoMobileAppCategorySelector]): Self = StObject.set(x, "mobileAppCategories", value.toJsFn)
    
    inline def setMobileApplications(value: CallbackTo[VideoMobileApplicationSelector]): Self = StObject.set(x, "mobileApplications", value.toJsFn)
    
    inline def setParentalStatuses(value: CallbackTo[VideoParentalStatusSelector]): Self = StObject.set(x, "parentalStatuses", value.toJsFn)
    
    inline def setPlacements(value: CallbackTo[VideoPlacementSelector]): Self = StObject.set(x, "placements", value.toJsFn)
    
    inline def setTopics(value: CallbackTo[VideoTopicSelector]): Self = StObject.set(x, "topics", value.toJsFn)
    
    inline def setYouTubeChannels(value: CallbackTo[VideoYouTubeChannelSelector]): Self = StObject.set(x, "youTubeChannels", value.toJsFn)
    
    inline def setYouTubeVideos(value: CallbackTo[VideoYouTubeVideoSelector]): Self = StObject.set(x, "youTubeVideos", value.toJsFn)
  }
}
