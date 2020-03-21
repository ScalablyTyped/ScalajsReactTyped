package typingsJapgolly.chromeApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// For chrome managed storage
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.integer
  - typingsJapgolly.chromeApps.chromeAppsStrings.string
  - typingsJapgolly.chromeApps.chromeAppsStrings.number
*/
trait JSONBasicTypes extends js.Object

object JSONBasicTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def integer: typingsJapgolly.chromeApps.chromeAppsStrings.integer = this.cast("integer")
  @scala.inline
  def number: typingsJapgolly.chromeApps.chromeAppsStrings.number = this.cast("number")
  @scala.inline
  def string: typingsJapgolly.chromeApps.chromeAppsStrings.string = this.cast("string")
}

