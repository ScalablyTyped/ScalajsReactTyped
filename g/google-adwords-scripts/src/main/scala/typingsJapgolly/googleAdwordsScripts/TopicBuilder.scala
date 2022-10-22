package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicBuilder[Topic]
  extends StObject
     with DisplayBuilder[TopicBuilder[Topic]] {
  
  def withTopicId(topicId: Double): TopicBuilder[Topic]
}
object TopicBuilder {
  
  inline def apply[Topic](
    build: CallbackTo[AdWordsOperation[TopicBuilder[Topic]]],
    exclude: CallbackTo[AdWordsOperation[TopicBuilder[Topic]]],
    withCpc: Double => TopicBuilder[Topic],
    withCpm: Double => TopicBuilder[Topic],
    withTopicId: Double => TopicBuilder[Topic]
  ): TopicBuilder[Topic] = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, exclude = exclude.toJsFn, withCpc = js.Any.fromFunction1(withCpc), withCpm = js.Any.fromFunction1(withCpm), withTopicId = js.Any.fromFunction1(withTopicId))
    __obj.asInstanceOf[TopicBuilder[Topic]]
  }
  
  extension [Self <: TopicBuilder[?], Topic](x: Self & TopicBuilder[Topic]) {
    
    inline def setWithTopicId(value: Double => TopicBuilder[Topic]): Self = StObject.set(x, "withTopicId", js.Any.fromFunction1(value))
  }
}
