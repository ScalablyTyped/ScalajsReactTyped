package typingsJapgolly.chromeApps.chrome.clipboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Image type */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.png
  - typingsJapgolly.chromeApps.chromeAppsStrings.jpeg
*/
trait ImageType extends js.Object

object ImageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def jpeg: typingsJapgolly.chromeApps.chromeAppsStrings.jpeg = this.cast("jpeg")
  @scala.inline
  def png: typingsJapgolly.chromeApps.chromeAppsStrings.png = this.cast("png")
}

