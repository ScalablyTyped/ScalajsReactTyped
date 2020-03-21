package typingsJapgolly.nwJs.mod._Global_.NWJSHelpers

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * nw.Window.get().on('navigation') callback policy argument object
  */
trait WinNavigationPolicy extends js.Object {
  /**
    * Ignore the request, navigation won’t happen.
    */
  def ignore(): Unit
}

object WinNavigationPolicy {
  @scala.inline
  def apply(ignore: Callback): WinNavigationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ignore")(ignore.toJsFn)
    __obj.asInstanceOf[WinNavigationPolicy]
  }
}

