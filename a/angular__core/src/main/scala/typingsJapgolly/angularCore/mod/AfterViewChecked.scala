package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterViewChecked extends js.Object {
  /**
    * A callback method that is invoked immediately after the
    * default change detector has completed one change-check cycle
    * for a component's view.
    */
  def ngAfterViewChecked(): Unit
}

object AfterViewChecked {
  @scala.inline
  def apply(ngAfterViewChecked: Callback): AfterViewChecked = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ngAfterViewChecked")(ngAfterViewChecked.toJsFn)
    __obj.asInstanceOf[AfterViewChecked]
  }
}

