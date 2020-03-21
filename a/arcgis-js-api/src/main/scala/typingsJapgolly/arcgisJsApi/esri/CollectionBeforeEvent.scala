package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionBeforeEvent[T] extends js.Object {
  var item: T
  def preventDefault(): Unit
}

object CollectionBeforeEvent {
  @scala.inline
  def apply[T](item: T, preventDefault: Callback): CollectionBeforeEvent[T] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.asInstanceOf[CollectionBeforeEvent[T]]
  }
}

