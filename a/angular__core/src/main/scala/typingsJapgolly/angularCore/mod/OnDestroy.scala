package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDestroy extends js.Object {
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * after a directive, pipe, or service instance is destroyed.
    */
  def ngOnDestroy(): Unit
}

object OnDestroy {
  @scala.inline
  def apply(ngOnDestroy: Callback): OnDestroy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ngOnDestroy")(ngOnDestroy.toJsFn)
    __obj.asInstanceOf[OnDestroy]
  }
}

