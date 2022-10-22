package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAdsScripts.GoogleAdsScripts.Base.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for VideoTopic objects.
  *
  * Example usage:
  *
  *      var videoTopicBuilder = videoAdGroup.videoTargeting().newTopicBuilder();
  *      var videoTopicOperation = videoTopicBuilder
  *        .withTopicId(3)     // required
  *        .build();           // create the topic
  */
trait VideoTopicBuilder
  extends StObject
     with Builder[VideoTopicOperation] {
  
  /** Builds the excluded video topic. */
  def exclude(): ExcludedVideoTopicOperation
  
  /** Sets the topic ID of the topic. */
  def withTopicId(topicId: Double): this.type
}
object VideoTopicBuilder {
  
  inline def apply(
    build: CallbackTo[VideoTopicOperation],
    exclude: CallbackTo[ExcludedVideoTopicOperation],
    withTopicId: Double => VideoTopicBuilder
  ): VideoTopicBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, exclude = exclude.toJsFn, withTopicId = js.Any.fromFunction1(withTopicId))
    __obj.asInstanceOf[VideoTopicBuilder]
  }
  
  extension [Self <: VideoTopicBuilder](x: Self) {
    
    inline def setExclude(value: CallbackTo[ExcludedVideoTopicOperation]): Self = StObject.set(x, "exclude", value.toJsFn)
    
    inline def setWithTopicId(value: Double => VideoTopicBuilder): Self = StObject.set(x, "withTopicId", js.Any.fromFunction1(value))
  }
}
