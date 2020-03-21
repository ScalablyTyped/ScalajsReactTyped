package typingsJapgolly.simpleUrlCache.mod.privateN

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.simpleUrlCache.mod.RegexRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheCategory extends js.Object {
  /* private */ def getCacheCategory(): String
  def getCategory(): String
  def getCurrentUrl(): String
  /* private */ def getRegexTest(u: RegexRule): Boolean
}

object CacheCategory {
  @scala.inline
  def apply(
    getCacheCategory: CallbackTo[String],
    getCategory: CallbackTo[String],
    getCurrentUrl: CallbackTo[String],
    getRegexTest: RegexRule => CallbackTo[Boolean]
  ): CacheCategory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCacheCategory")(getCacheCategory.toJsFn)
    __obj.updateDynamic("getCategory")(getCategory.toJsFn)
    __obj.updateDynamic("getCurrentUrl")(getCurrentUrl.toJsFn)
    __obj.updateDynamic("getRegexTest")(js.Any.fromFunction1((t0: typingsJapgolly.simpleUrlCache.mod.RegexRule) => getRegexTest(t0).runNow()))
    __obj.asInstanceOf[CacheCategory]
  }
}

