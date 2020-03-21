package typingsJapgolly.rxCore.Rx

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Observer
trait Observer[T] extends js.Object {
  def checked(): Observer[_]
}

object Observer {
  @scala.inline
  def apply[T](checked: CallbackTo[Observer[js.Any]]): Observer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checked")(checked.toJsFn)
    __obj.asInstanceOf[Observer[T]]
  }
}

