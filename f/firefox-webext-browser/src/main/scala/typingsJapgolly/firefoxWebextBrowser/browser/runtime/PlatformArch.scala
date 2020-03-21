package typingsJapgolly.firefoxWebextBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The machine's processor architecture. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.arm
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.`x86-32`
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.`x86-64`
*/
trait PlatformArch extends js.Object

object PlatformArch {
  @scala.inline
  def arm: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.arm = this.cast("arm")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `x86-32`: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.`x86-32` = this.cast("x86-32")
  @scala.inline
  def `x86-64`: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.`x86-64` = this.cast("x86-64")
}

