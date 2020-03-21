package typingsJapgolly.chrome.chrome.permissions

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionsRemovedEvent extends js.Object {
  /**
    * @param callback The callback parameter should be a function that looks like this:
    * function( Permissions permissions) {...};
    * Parameter permissions: The permissions that have been removed.
    */
  def addListener(callback: js.Function1[/* permissions */ Permissions, Unit]): Unit
}

object PermissionsRemovedEvent {
  @scala.inline
  def apply(addListener: js.Function1[/* permissions */ Permissions, Unit] => Callback): PermissionsRemovedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction1((t0: js.Function1[
  /* permissions */ typingsJapgolly.chrome.chrome.permissions.Permissions, 
  scala.Unit]) => addListener(t0).runNow()))
    __obj.asInstanceOf[PermissionsRemovedEvent]
  }
}

