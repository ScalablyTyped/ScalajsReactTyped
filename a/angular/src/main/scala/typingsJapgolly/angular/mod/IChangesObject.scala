package typingsJapgolly.angular.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChangesObject[T] extends js.Object {
  var currentValue: T
  var previousValue: T
  def isFirstChange(): Boolean
}

object IChangesObject {
  @scala.inline
  def apply[T](currentValue: T, isFirstChange: CallbackTo[Boolean], previousValue: T): IChangesObject[T] = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], previousValue = previousValue.asInstanceOf[js.Any])
    __obj.updateDynamic("isFirstChange")(isFirstChange.toJsFn)
    __obj.asInstanceOf[IChangesObject[T]]
  }
}

