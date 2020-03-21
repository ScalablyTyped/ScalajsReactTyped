package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicBuilder[Topic] extends DisplayBuilder[TopicBuilder[Topic]] {
  def withTopicId(topicId: Double): TopicBuilder[Topic]
}

object TopicBuilder {
  @scala.inline
  def apply[Topic](
    build: CallbackTo[AdWordsOperation[TopicBuilder[Topic]]],
    exclude: CallbackTo[AdWordsOperation[TopicBuilder[Topic]]],
    withCpc: Double => CallbackTo[TopicBuilder[Topic]],
    withCpm: Double => CallbackTo[TopicBuilder[Topic]],
    withTopicId: Double => CallbackTo[TopicBuilder[Topic]]
  ): TopicBuilder[Topic] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("exclude")(exclude.toJsFn)
    __obj.updateDynamic("withCpc")(js.Any.fromFunction1((t0: scala.Double) => withCpc(t0).runNow()))
    __obj.updateDynamic("withCpm")(js.Any.fromFunction1((t0: scala.Double) => withCpm(t0).runNow()))
    __obj.updateDynamic("withTopicId")(js.Any.fromFunction1((t0: scala.Double) => withTopicId(t0).runNow()))
    __obj.asInstanceOf[TopicBuilder[Topic]]
  }
}

