package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsBuilder[E] extends js.Object {
  def build(): AdWordsOperation[E]
}

object AdWordsBuilder {
  @scala.inline
  def apply[E](build: CallbackTo[AdWordsOperation[E]]): AdWordsBuilder[E] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.asInstanceOf[AdWordsBuilder[E]]
  }
}

