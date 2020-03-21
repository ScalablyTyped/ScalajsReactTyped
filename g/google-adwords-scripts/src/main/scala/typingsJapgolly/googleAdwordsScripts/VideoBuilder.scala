package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoBuilder[Media] extends AdWordsBuilder[Media] {
  def withYouTubeVideoId(youTubeVideoId: String): VideoBuilder[Media]
}

object VideoBuilder {
  @scala.inline
  def apply[Media](
    build: CallbackTo[AdWordsOperation[Media]],
    withYouTubeVideoId: String => CallbackTo[VideoBuilder[Media]]
  ): VideoBuilder[Media] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("withYouTubeVideoId")(js.Any.fromFunction1((t0: java.lang.String) => withYouTubeVideoId(t0).runNow()))
    __obj.asInstanceOf[VideoBuilder[Media]]
  }
}

