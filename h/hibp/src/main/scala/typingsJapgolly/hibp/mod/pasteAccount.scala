package typingsJapgolly.hibp.mod

import typingsJapgolly.hibp.AnonUserAgent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hibp", "pasteAccount")
@js.native
object pasteAccount extends js.Object {
  def apply(email: String): js.Promise[js.Array[Paste] | Null] = js.native
  def apply(email: String, options: AnonUserAgent): js.Promise[js.Array[Paste] | Null] = js.native
}

