package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdGroupDisplay extends Display {
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
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("audiences")(audiences.toJsFn)
    __obj.updateDynamic("excludedAudiences")(excludedAudiences.toJsFn)
    __obj.updateDynamic("excludedKeywords")(excludedKeywords.toJsFn)
    __obj.updateDynamic("excludedPlacements")(excludedPlacements.toJsFn)
    __obj.updateDynamic("excludedTopics")(excludedTopics.toJsFn)
    __obj.updateDynamic("keywords")(keywords.toJsFn)
    __obj.updateDynamic("newAudienceBuilder")(newAudienceBuilder.toJsFn)
    __obj.updateDynamic("newKeywordBuilder")(newKeywordBuilder.toJsFn)
    __obj.updateDynamic("newPlacementBuilder")(newPlacementBuilder.toJsFn)
    __obj.updateDynamic("newTopicBuilder")(newTopicBuilder.toJsFn)
    __obj.updateDynamic("placements")(placements.toJsFn)
    __obj.updateDynamic("topics")(topics.toJsFn)
    __obj.asInstanceOf[AdGroupDisplay]
  }
}

