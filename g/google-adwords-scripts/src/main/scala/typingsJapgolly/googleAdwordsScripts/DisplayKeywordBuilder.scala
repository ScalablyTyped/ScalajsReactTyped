package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayKeywordBuilder[DisplayKeyword] extends DisplayBuilder[DisplayKeywordBuilder[DisplayKeyword]] {
  def withText(text: String): DisplayKeywordBuilder[DisplayKeyword]
}

object DisplayKeywordBuilder {
  @scala.inline
  def apply[DisplayKeyword](
    build: CallbackTo[AdWordsOperation[DisplayKeywordBuilder[DisplayKeyword]]],
    exclude: CallbackTo[AdWordsOperation[DisplayKeywordBuilder[DisplayKeyword]]],
    withCpc: Double => CallbackTo[DisplayKeywordBuilder[DisplayKeyword]],
    withCpm: Double => CallbackTo[DisplayKeywordBuilder[DisplayKeyword]],
    withText: String => CallbackTo[DisplayKeywordBuilder[DisplayKeyword]]
  ): DisplayKeywordBuilder[DisplayKeyword] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("exclude")(exclude.toJsFn)
    __obj.updateDynamic("withCpc")(js.Any.fromFunction1((t0: scala.Double) => withCpc(t0).runNow()))
    __obj.updateDynamic("withCpm")(js.Any.fromFunction1((t0: scala.Double) => withCpm(t0).runNow()))
    __obj.updateDynamic("withText")(js.Any.fromFunction1((t0: java.lang.String) => withText(t0).runNow()))
    __obj.asInstanceOf[DisplayKeywordBuilder[DisplayKeyword]]
  }
}

