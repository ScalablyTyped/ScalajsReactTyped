package typingsJapgolly.arcgisJsApi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHandle extends js.Object {
  def remove(): Unit
}

object IHandle {
  @scala.inline
  def apply(remove: Callback): IHandle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[IHandle]
  }
}

