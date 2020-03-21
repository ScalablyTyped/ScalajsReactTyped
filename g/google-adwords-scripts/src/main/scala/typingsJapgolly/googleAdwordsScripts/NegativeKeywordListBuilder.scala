package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NegativeKeywordListBuilder[NegativeKeywordList] extends AdWordsBuilder[NegativeKeywordList] {
  def withName(name: String): NegativeKeywordListBuilder[NegativeKeywordList]
}

object NegativeKeywordListBuilder {
  @scala.inline
  def apply[NegativeKeywordList](
    build: CallbackTo[AdWordsOperation[NegativeKeywordList]],
    withName: String => CallbackTo[NegativeKeywordListBuilder[NegativeKeywordList]]
  ): NegativeKeywordListBuilder[NegativeKeywordList] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("withName")(js.Any.fromFunction1((t0: java.lang.String) => withName(t0).runNow()))
    __obj.asInstanceOf[NegativeKeywordListBuilder[NegativeKeywordList]]
  }
}

