package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsIterator[E] extends js.Object {
  def hasNext(): Boolean
  def next(): E
  def totalNumEntities(): Double
}

object AdWordsIterator {
  @scala.inline
  def apply[E](hasNext: CallbackTo[Boolean], next: CallbackTo[E], totalNumEntities: CallbackTo[Double]): AdWordsIterator[E] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasNext")(hasNext.toJsFn)
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("totalNumEntities")(totalNumEntities.toJsFn)
    __obj.asInstanceOf[AdWordsIterator[E]]
  }
}

