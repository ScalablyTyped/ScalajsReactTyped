package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsOperation[E] extends js.Object {
  def getErrors(): js.Array[String]
  def getResult(): E
  def isSuccessful(): Boolean
}

object AdWordsOperation {
  @scala.inline
  def apply[E](
    getErrors: CallbackTo[js.Array[String]],
    getResult: CallbackTo[E],
    isSuccessful: CallbackTo[Boolean]
  ): AdWordsOperation[E] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getErrors")(getErrors.toJsFn)
    __obj.updateDynamic("getResult")(getResult.toJsFn)
    __obj.updateDynamic("isSuccessful")(isSuccessful.toJsFn)
    __obj.asInstanceOf[AdWordsOperation[E]]
  }
}

