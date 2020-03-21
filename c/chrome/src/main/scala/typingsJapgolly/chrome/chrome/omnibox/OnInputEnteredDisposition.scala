package typingsJapgolly.chrome.chrome.omnibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chrome.chromeStrings.currentTab
  - typingsJapgolly.chrome.chromeStrings.newForegroundTab
  - typingsJapgolly.chrome.chromeStrings.newBackgroundTab
*/
trait OnInputEnteredDisposition extends js.Object

object OnInputEnteredDisposition {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def currentTab: typingsJapgolly.chrome.chromeStrings.currentTab = this.cast("currentTab")
  @scala.inline
  def newBackgroundTab: typingsJapgolly.chrome.chromeStrings.newBackgroundTab = this.cast("newBackgroundTab")
  @scala.inline
  def newForegroundTab: typingsJapgolly.chrome.chromeStrings.newForegroundTab = this.cast("newForegroundTab")
}

