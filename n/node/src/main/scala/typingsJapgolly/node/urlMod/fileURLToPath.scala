package typingsJapgolly.node.urlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("url", "fileURLToPath")
@js.native
object fileURLToPath extends js.Object {
  /**
    * This function ensures the correct decodings of percent-encoded characters as
    * well as ensuring a cross-platform valid absolute path string.
    * @param url The file URL string or URL object to convert to a path.
    */
  def apply(url: java.lang.String): java.lang.String = js.native
  def apply(url: URL): java.lang.String = js.native
}

