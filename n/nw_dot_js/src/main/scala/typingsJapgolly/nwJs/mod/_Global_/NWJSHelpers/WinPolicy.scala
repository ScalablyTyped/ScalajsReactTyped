package typingsJapgolly.nwJs.mod._Global_.NWJSHelpers

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * nw.Window.get().on('new-win-policy') callback policy argument object
  */
trait WinPolicy extends js.Object {
  /**
    * Force the link to be opened in the same frame
    */
  def forceCurrent(): Unit
  /**
    * Force the link to be a downloadable, or open by external program
    */
  def forceDownload(): Unit
  /**
    * Force the link to be opened in a new popup window
    */
  def forceNewPopup(): Unit
  /**
    * Force the link to be opened in a new window
    */
  def forceNewWindow(): Unit
  /**
    * Ignore the request, navigation won’t happen.
    */
  def ignore(): Unit
  /**
    * Control the options for the new popup window.
    *
    *@param m {Object} The object is in the same format as the Window subfields in manifest format.
    */
  def setNewWindowManifest(m: WindowOption): Unit
}

object WinPolicy {
  @scala.inline
  def apply(
    forceCurrent: Callback,
    forceDownload: Callback,
    forceNewPopup: Callback,
    forceNewWindow: Callback,
    ignore: Callback,
    setNewWindowManifest: WindowOption => Callback
  ): WinPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forceCurrent")(forceCurrent.toJsFn)
    __obj.updateDynamic("forceDownload")(forceDownload.toJsFn)
    __obj.updateDynamic("forceNewPopup")(forceNewPopup.toJsFn)
    __obj.updateDynamic("forceNewWindow")(forceNewWindow.toJsFn)
    __obj.updateDynamic("ignore")(ignore.toJsFn)
    __obj.updateDynamic("setNewWindowManifest")(js.Any.fromFunction1((t0: typingsJapgolly.nwJs.mod._Global_.NWJSHelpers.WindowOption) => setNewWindowManifest(t0).runNow()))
    __obj.asInstanceOf[WinPolicy]
  }
}

