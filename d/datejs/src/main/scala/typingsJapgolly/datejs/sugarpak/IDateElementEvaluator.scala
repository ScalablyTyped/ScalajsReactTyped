package typingsJapgolly.datejs.sugarpak

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.datejs.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateElementEvaluator extends js.Object {
  def after(): Date
  def ago(): Date
  def before(): Date
  def fromNow(): Date
}

object IDateElementEvaluator {
  @scala.inline
  def apply(
    after: CallbackTo[Date],
    ago: CallbackTo[Date],
    before: CallbackTo[Date],
    fromNow: CallbackTo[Date]
  ): IDateElementEvaluator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(after.toJsFn)
    __obj.updateDynamic("ago")(ago.toJsFn)
    __obj.updateDynamic("before")(before.toJsFn)
    __obj.updateDynamic("fromNow")(fromNow.toJsFn)
    __obj.asInstanceOf[IDateElementEvaluator]
  }
}

