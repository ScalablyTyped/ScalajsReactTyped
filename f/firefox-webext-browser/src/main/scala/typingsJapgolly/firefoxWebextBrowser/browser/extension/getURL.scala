package typingsJapgolly.firefoxWebextBrowser.browser.extension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.extension.getURL")
@js.native
object getURL extends js.Object {
  /* extension functions */
  /**
    * Converts a relative path within an extension install directory to a fully-qualified URL.
    * @param path A path to a resource within an extension expressed relative to its install directory.
    * @returns The fully-qualified URL to the resource.
    */
  def apply(path: String): String = js.native
}

