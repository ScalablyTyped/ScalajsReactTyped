package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdGroupDisplay
  extends StObject
     with Display {
  
  def excludedAudiences(): AdWordsSelector[ExcludedAudience]
  
  def excludedKeywords(): AdWordsSelector[ExcludedDisplayKeyword]
  
  def excludedPlacements(): AdWordsSelector[ExcludedPlacement]
  
  def excludedTopics(): AdWordsSelector[Topic]
  
  def newAudienceBuilder(): AudienceBuilder[Audience]
  
  def newKeywordBuilder(): DisplayKeywordBuilder[DisplayKeyword]
  
  def newPlacementBuilder(): PlacementBuilder[Placement]
  
  def newTopicBuilder(): TopicBuilder[Topic]
}
object AdGroupDisplay {
  
  inline def apply(
    audiences: CallbackTo[AdWordsSelector[Audience]],
    excludedAudiences: CallbackTo[AdWordsSelector[ExcludedAudience]],
    excludedKeywords: CallbackTo[AdWordsSelector[ExcludedDisplayKeyword]],
    excludedPlacements: CallbackTo[AdWordsSelector[ExcludedPlacement]],
    excludedTopics: CallbackTo[AdWordsSelector[Topic]],
    keywords: CallbackTo[AdWordsSelector[DisplayKeyword]],
    newAudienceBuilder: CallbackTo[AudienceBuilder[Audience]],
    newKeywordBuilder: CallbackTo[DisplayKeywordBuilder[DisplayKeyword]],
    newPlacementBuilder: CallbackTo[PlacementBuilder[Placement]],
    newTopicBuilder: CallbackTo[TopicBuilder[Topic]],
    placements: CallbackTo[AdWordsSelector[Placement]],
    topics: CallbackTo[AdWordsSelector[Topic]]
  ): AdGroupDisplay = {
    val __obj = js.Dynamic.literal(audiences = audiences.toJsFn, excludedAudiences = excludedAudiences.toJsFn, excludedKeywords = excludedKeywords.toJsFn, excludedPlacements = excludedPlacements.toJsFn, excludedTopics = excludedTopics.toJsFn, keywords = keywords.toJsFn, newAudienceBuilder = newAudienceBuilder.toJsFn, newKeywordBuilder = newKeywordBuilder.toJsFn, newPlacementBuilder = newPlacementBuilder.toJsFn, newTopicBuilder = newTopicBuilder.toJsFn, placements = placements.toJsFn, topics = topics.toJsFn)
    __obj.asInstanceOf[AdGroupDisplay]
  }
  
  extension [Self <: AdGroupDisplay](x: Self) {
    
    inline def setExcludedAudiences(value: CallbackTo[AdWordsSelector[ExcludedAudience]]): Self = StObject.set(x, "excludedAudiences", value.toJsFn)
    
    inline def setExcludedKeywords(value: CallbackTo[AdWordsSelector[ExcludedDisplayKeyword]]): Self = StObject.set(x, "excludedKeywords", value.toJsFn)
    
    inline def setExcludedPlacements(value: CallbackTo[AdWordsSelector[ExcludedPlacement]]): Self = StObject.set(x, "excludedPlacements", value.toJsFn)
    
    inline def setExcludedTopics(value: CallbackTo[AdWordsSelector[Topic]]): Self = StObject.set(x, "excludedTopics", value.toJsFn)
    
    inline def setNewAudienceBuilder(value: CallbackTo[AudienceBuilder[Audience]]): Self = StObject.set(x, "newAudienceBuilder", value.toJsFn)
    
    inline def setNewKeywordBuilder(value: CallbackTo[DisplayKeywordBuilder[DisplayKeyword]]): Self = StObject.set(x, "newKeywordBuilder", value.toJsFn)
    
    inline def setNewPlacementBuilder(value: CallbackTo[PlacementBuilder[Placement]]): Self = StObject.set(x, "newPlacementBuilder", value.toJsFn)
    
    inline def setNewTopicBuilder(value: CallbackTo[TopicBuilder[Topic]]): Self = StObject.set(x, "newTopicBuilder", value.toJsFn)
  }
}
