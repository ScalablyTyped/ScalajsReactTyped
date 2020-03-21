package typingsJapgolly.firefoxWebextBrowser.browser

import typingsJapgolly.firefoxWebextBrowser.AnonCaseSensitive
import typingsJapgolly.firefoxWebextBrowser.AnonCount
import typingsJapgolly.firefoxWebextBrowser.AnonNoScroll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Use the `browser.find` API to interact with the browser's `Find` interface.
  *
  * Permissions: `find`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.find")
@js.native
object find extends js.Object {
  /* find functions */
  /**
    * Search for text in document and store found ranges in array, in document order.
    * @param queryphrase The string to search for.
    * @param [params] Search parameters.
    */
  def find(queryphrase: String): js.Promise[AnonCount] = js.native
  def find(queryphrase: String, params: AnonCaseSensitive): js.Promise[AnonCount] = js.native
  /**
    * Highlight a range
    * @param [params] highlightResults parameters
    */
  def highlightResults(): Unit = js.native
  def highlightResults(params: AnonNoScroll): Unit = js.native
  /**
    * Remove all highlighting from previous searches.
    * @param [tabId] Tab to highlight. Defaults to the active tab.
    */
  def removeHighlighting(): Unit = js.native
  def removeHighlighting(tabId: Double): Unit = js.native
}

