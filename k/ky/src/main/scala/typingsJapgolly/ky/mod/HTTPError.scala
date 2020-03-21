package typingsJapgolly.ky.mod

import org.scalajs.dom.experimental.Response
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ky", "HTTPError")
@js.native
class HTTPError protected () extends Error {
  def this(response: Response) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var response: Response = js.native
}

