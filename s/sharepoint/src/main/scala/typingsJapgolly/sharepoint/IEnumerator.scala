package typingsJapgolly.sharepoint

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IEnumerator[T] extends js.Object {
  def get_current(): T
  def moveNext(): Boolean
  def reset(): Unit
}

object IEnumerator {
  @scala.inline
  def apply[T](get_current: CallbackTo[T], moveNext: CallbackTo[Boolean], reset: Callback): IEnumerator[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get_current")(get_current.toJsFn)
    __obj.updateDynamic("moveNext")(moveNext.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[IEnumerator[T]]
  }
}

