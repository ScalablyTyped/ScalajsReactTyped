package typingsJapgolly.firefoxWebextBrowser

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firefoxWebextBrowser.browser.permissions.AnyPermissions
import typingsJapgolly.firefoxWebextBrowser.browser.permissions.Permissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpermissions extends js.Object {
  /* permissions events */
  /**
    * Fired when the extension acquires new permissions.
    * @deprecated Unsupported on Firefox at this time.
    */
  val onAdded: js.UndefOr[WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]]] = js.undefined
  /**
    * Fired when permissions are removed from the extension.
    * @deprecated Unsupported on Firefox at this time.
    */
  val onRemoved: js.UndefOr[WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]]] = js.undefined
  /** Check if the extension has the given permissions. */
  def contains(permissions: AnyPermissions): js.Promise[Boolean]
  /* permissions functions */
  /** Get a list of all the extension's permissions. */
  def getAll(): js.Promise[AnyPermissions]
  /** Relinquish the given permissions. */
  def remove(permissions: Permissions): js.Promise[Boolean]
  /**
    * Request the given permissions.
    *
    * Not allowed in: Devtools pages
    */
  def request(permissions: Permissions): js.Promise[Boolean]
}

object Typeofpermissions {
  @scala.inline
  def apply(
    contains: AnyPermissions => CallbackTo[js.Promise[Boolean]],
    getAll: CallbackTo[js.Promise[AnyPermissions]],
    remove: Permissions => CallbackTo[js.Promise[Boolean]],
    request: Permissions => CallbackTo[js.Promise[Boolean]],
    onAdded: WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]] = null,
    onRemoved: WebExtEvent[js.Function1[/* permissions */ Permissions, Unit]] = null
  ): Typeofpermissions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.browser.permissions.AnyPermissions) => contains(t0).runNow()))
    __obj.updateDynamic("getAll")(getAll.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.browser.permissions.Permissions) => remove(t0).runNow()))
    __obj.updateDynamic("request")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.browser.permissions.Permissions) => request(t0).runNow()))
    if (onAdded != null) __obj.updateDynamic("onAdded")(onAdded.asInstanceOf[js.Any])
    if (onRemoved != null) __obj.updateDynamic("onRemoved")(onRemoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofpermissions]
  }
}

