package typingsJapgolly.firefoxWebextBrowser

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firefoxWebextBrowser.browser.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofpageAction extends js.Object {
  /* pageAction events */
  /** Fired when a page action icon is clicked. This event will not fire if the page action has a popup. */
  val onClicked: WebExtEvent[js.Function1[/* tab */ Tab, Unit]]
  /** Gets the html document set as the popup for this page action. */
  def getPopup(details: AnonTabIdNumber): js.Promise[String]
  /** Gets the title of the page action. */
  def getTitle(details: AnonTabIdNumber): js.Promise[String]
  /**
    * Hides the page action.
    * @param tabId The id of the tab for which you want to modify the page action.
    */
  def hide(tabId: Double): js.Promise[Unit]
  /** Checks whether the page action is shown. */
  def isShown(details: AnonTabIdNumber): js.Promise[Boolean]
  /** Opens the extension page action in the active window. */
  def openPopup(): js.Promise[Unit]
  /**
    * Sets the icon for the page action. The icon can be specified either as the path to an image file or as the pixel
    * data from a canvas element, or as dictionary of either one of those. Either the **path** or the **imageData**
    * property must be specified.
    */
  def setIcon(details: AnonPath): js.Promise[Unit]
  /** Sets the html document to be opened as a popup when the user clicks on the page action's icon. */
  def setPopup(details: AnonPopupTabId): Unit
  /** Sets the title of the page action. This is displayed in a tooltip over the page action. */
  def setTitle(details: AnonTabIdTitle): Unit
  /* pageAction functions */
  /**
    * Shows the page action. The page action is shown whenever the tab is selected.
    * @param tabId The id of the tab for which you want to modify the page action.
    */
  def show(tabId: Double): js.Promise[Unit]
}

object TypeofpageAction {
  @scala.inline
  def apply(
    getPopup: AnonTabIdNumber => CallbackTo[js.Promise[String]],
    getTitle: AnonTabIdNumber => CallbackTo[js.Promise[String]],
    hide: Double => CallbackTo[js.Promise[Unit]],
    isShown: AnonTabIdNumber => CallbackTo[js.Promise[Boolean]],
    onClicked: WebExtEvent[js.Function1[/* tab */ Tab, Unit]],
    openPopup: CallbackTo[js.Promise[Unit]],
    setIcon: AnonPath => CallbackTo[js.Promise[Unit]],
    setPopup: AnonPopupTabId => Callback,
    setTitle: AnonTabIdTitle => Callback,
    show: Double => CallbackTo[js.Promise[Unit]]
  ): TypeofpageAction = {
    val __obj = js.Dynamic.literal(onClicked = onClicked.asInstanceOf[js.Any])
    __obj.updateDynamic("getPopup")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonTabIdNumber) => getPopup(t0).runNow()))
    __obj.updateDynamic("getTitle")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonTabIdNumber) => getTitle(t0).runNow()))
    __obj.updateDynamic("hide")(js.Any.fromFunction1((t0: scala.Double) => hide(t0).runNow()))
    __obj.updateDynamic("isShown")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonTabIdNumber) => isShown(t0).runNow()))
    __obj.updateDynamic("openPopup")(openPopup.toJsFn)
    __obj.updateDynamic("setIcon")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonPath) => setIcon(t0).runNow()))
    __obj.updateDynamic("setPopup")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonPopupTabId) => setPopup(t0).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonTabIdTitle) => setTitle(t0).runNow()))
    __obj.updateDynamic("show")(js.Any.fromFunction1((t0: scala.Double) => show(t0).runNow()))
    __obj.asInstanceOf[TypeofpageAction]
  }
}

