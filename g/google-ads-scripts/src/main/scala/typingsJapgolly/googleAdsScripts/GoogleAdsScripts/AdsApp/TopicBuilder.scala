package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for Topic objects.
  *
  * Example usage:
  *
  *      var topicBuilder = adGroup.display().newKeywordBuilder();
  *      var topic = topicBuilder
  *        .withTopicId(3)                 // required
  *        .withCpc(0.50)                  // optional
  *        .build()                        // create the topic
  */
trait TopicBuilder
  extends StObject
     with Builder[TopicOperation] {
  
  /** Builds the excluded topic. */
  def exclude(): ExcludedTopicOperation
  
  /** Sets the max CPC bid of the new topic to the specified value. */
  def withCpc(cpc: Double): this.type
  
  /** Sets the CPM bid of the new topic to the specified value. */
  def withCpm(cpm: Double): this.type
  
  /** Sets the topic ID of the topic. */
  def withTopicId(topicId: Double): this.type
}
object TopicBuilder {
  
  inline def apply(
    build: CallbackTo[TopicOperation],
    exclude: CallbackTo[ExcludedTopicOperation],
    withCpc: Double => TopicBuilder,
    withCpm: Double => TopicBuilder,
    withTopicId: Double => TopicBuilder
  ): TopicBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, exclude = exclude.toJsFn, withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm), withTopicId = js.Any.fromFunction1(withTopicId))
    __obj.asInstanceOf[TopicBuilder]
  }
  
  extension [Self <: TopicBuilder](x: Self) {
    
    inline def setExclude(value: CallbackTo[ExcludedTopicOperation]): Self = StObject.set(x, "exclude", value.toJsFn)
    
    inline def setWithCpc(value: Double => TopicBuilder): Self = StObject.set(x, "withCpc", js.Any.fromFunction1(value))
    
    inline def setWithCpm(value: Double => TopicBuilder): Self = StObject.set(x, "withCpm", js.Any.fromFunction1(value))
    
    inline def setWithTopicId(value: Double => TopicBuilder): Self = StObject.set(x, "withTopicId", js.Any.fromFunction1(value))
  }
}
