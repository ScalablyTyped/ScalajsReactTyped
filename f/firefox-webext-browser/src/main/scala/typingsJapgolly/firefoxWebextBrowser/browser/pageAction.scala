package typingsJapgolly.firefoxWebextBrowser.browser

import typingsJapgolly.firefoxWebextBrowser.AnonPath
import typingsJapgolly.firefoxWebextBrowser.AnonPopupTabId
import typingsJapgolly.firefoxWebextBrowser.AnonTabIdNumber
import typingsJapgolly.firefoxWebextBrowser.AnonTabIdTitle
import typingsJapgolly.firefoxWebextBrowser.WebExtEvent
import typingsJapgolly.firefoxWebextBrowser.browser.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Use the `browser.pageAction` API to put icons inside the address bar. Page actions represent actions that can be
  * taken on the current page, but that aren't applicable to all pages.
  *
  * Manifest keys: `page_action`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.pageAction")
@js.native
object pageAction extends js.Object {
  /* pageAction events */
  /** Fired when a page action icon is clicked. This event will not fire if the page action has a popup. */
  val onClicked: WebExtEvent[js.Function1[/* tab */ Tab, Unit]] = js.native
  /** Gets the html document set as the popup for this page action. */
  def getPopup(details: AnonTabIdNumber): js.Promise[String] = js.native
  /** Gets the title of the page action. */
  def getTitle(details: AnonTabIdNumber): js.Promise[String] = js.native
  /**
    * Hides the page action.
    * @param tabId The id of the tab for which you want to modify the page action.
    */
  def hide(tabId: Double): js.Promise[Unit] = js.native
  /** Checks whether the page action is shown. */
  def isShown(details: AnonTabIdNumber): js.Promise[Boolean] = js.native
  /** Opens the extension page action in the active window. */
  def openPopup(): js.Promise[Unit] = js.native
  /**
    * Sets the icon for the page action. The icon can be specified either as the path to an image file or as the pixel
    * data from a canvas element, or as dictionary of either one of those. Either the **path** or the **imageData**
    * property must be specified.
    */
  def setIcon(details: AnonPath): js.Promise[Unit] = js.native
  /** Sets the html document to be opened as a popup when the user clicks on the page action's icon. */
  def setPopup(details: AnonPopupTabId): Unit = js.native
  /** Sets the title of the page action. This is displayed in a tooltip over the page action. */
  def setTitle(details: AnonTabIdTitle): Unit = js.native
  /* pageAction functions */
  /**
    * Shows the page action. The page action is shown whenever the tab is selected.
    * @param tabId The id of the tab for which you want to modify the page action.
    */
  def show(tabId: Double): js.Promise[Unit] = js.native
  /* pageAction types */
  /** Pixel data for an image. Must be an ImageData object (for example, from a `canvas` element). */
  type ImageDataType = js.Object
}

