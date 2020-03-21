package typingsJapgolly.nwJs

import japgolly.scalajs.react.Callback
import typingsJapgolly.nwJs.mod._Global_.NWJSHelpers.CookiesOnChangedCallbackChangeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddListener extends js.Object {
  /**
    * Add a new listener for onChanged event.
    *
    * @param callback {function(changeInfo?)} The callback when cookie has been changed.
    * - (Optional) changeInfo {Objet} Contains details about the cookie that's been changed.
    */
  def addListener(callback: js.Function1[/* changeInfo */ CookiesOnChangedCallbackChangeInfo, Unit]): Unit
}

object AnonAddListener {
  @scala.inline
  def apply(addListener: js.Function1[/* changeInfo */ CookiesOnChangedCallbackChangeInfo, Unit] => Callback): AnonAddListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction1((t0: js.Function1[
  /* changeInfo */ typingsJapgolly.nwJs.mod._Global_.NWJSHelpers.CookiesOnChangedCallbackChangeInfo, 
  scala.Unit]) => addListener(t0).runNow()))
    __obj.asInstanceOf[AnonAddListener]
  }
}

