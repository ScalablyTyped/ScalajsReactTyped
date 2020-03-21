package typingsJapgolly.firefoxWebextBrowser.browser.browserSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* browserSettings types */
/** How images should be animated in the browser. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.none
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.once
*/
trait ImageAnimationBehavior_ extends js.Object

object ImageAnimationBehavior_ {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.none = this.cast("none")
  @scala.inline
  def normal: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.normal = this.cast("normal")
  @scala.inline
  def once: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.once = this.cast("once")
}

