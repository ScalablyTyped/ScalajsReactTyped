package typingsJapgolly.firefoxWebextBrowser

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofsidebarAction extends js.Object {
  /** Closes the extension sidebar in the active window if the sidebar belongs to the extension. */
  def close(): js.Promise[Unit]
  /** Gets the url to the html document set as the panel for this sidebar action. */
  def getPanel(details: AnonTabIdWindowId): js.Promise[String]
  /** Gets the title of the sidebar action. */
  def getTitle(details: AnonTabIdWindowId): js.Promise[String]
  /** Checks whether the sidebar action is open. */
  def isOpen(details: AnonWindowIdNumber): js.Promise[Boolean]
  /** Opens the extension sidebar in the active window. */
  def open(): js.Promise[Unit]
  /**
    * Sets the icon for the sidebar action. The icon can be specified either as the path to an image file or as the
    * pixel data from a canvas element, or as dictionary of either one of those. Either the **path** or the
    * **imageData** property must be specified.
    */
  def setIcon(details: AnonImageDataPath): js.Promise[Unit]
  /**
    * Sets the url to the html document to be opened in the sidebar when the user clicks on the sidebar action's icon.
    */
  def setPanel(details: AnonPanel): js.Promise[Unit]
  /* sidebarAction functions */
  /** Sets the title of the sidebar action. This shows up in the tooltip. */
  def setTitle(details: AnonWindowId): js.Promise[Unit]
}

object TypeofsidebarAction {
  @scala.inline
  def apply(
    close: CallbackTo[js.Promise[Unit]],
    getPanel: AnonTabIdWindowId => CallbackTo[js.Promise[String]],
    getTitle: AnonTabIdWindowId => CallbackTo[js.Promise[String]],
    isOpen: AnonWindowIdNumber => CallbackTo[js.Promise[Boolean]],
    open: CallbackTo[js.Promise[Unit]],
    setIcon: AnonImageDataPath => CallbackTo[js.Promise[Unit]],
    setPanel: AnonPanel => CallbackTo[js.Promise[Unit]],
    setTitle: AnonWindowId => CallbackTo[js.Promise[Unit]]
  ): TypeofsidebarAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("getPanel")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonTabIdWindowId) => getPanel(t0).runNow()))
    __obj.updateDynamic("getTitle")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonTabIdWindowId) => getTitle(t0).runNow()))
    __obj.updateDynamic("isOpen")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonWindowIdNumber) => isOpen(t0).runNow()))
    __obj.updateDynamic("open")(open.toJsFn)
    __obj.updateDynamic("setIcon")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonImageDataPath) => setIcon(t0).runNow()))
    __obj.updateDynamic("setPanel")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonPanel) => setPanel(t0).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonWindowId) => setTitle(t0).runNow()))
    __obj.asInstanceOf[TypeofsidebarAction]
  }
}

