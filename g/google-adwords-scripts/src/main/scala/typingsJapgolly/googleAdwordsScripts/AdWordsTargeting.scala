package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsTargeting[A, E] extends js.Object {
  def audiences(): AdWordsSelector[A]
  def exculdedAudiences(): AdWordsSelector[E]
}

object AdWordsTargeting {
  @scala.inline
  def apply[A, E](audiences: CallbackTo[AdWordsSelector[A]], exculdedAudiences: CallbackTo[AdWordsSelector[E]]): AdWordsTargeting[A, E] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("audiences")(audiences.toJsFn)
    __obj.updateDynamic("exculdedAudiences")(exculdedAudiences.toJsFn)
    __obj.asInstanceOf[AdWordsTargeting[A, E]]
  }
}

