package typingsJapgolly.backlogJs.mod.Error

import org.scalajs.dom.experimental.Response
import typingsJapgolly.backlogJs.AnonErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backlog-js", "Error.BacklogApiError")
@js.native
class BacklogApiError protected () extends BacklogError {
  def this(response: Response) = this()
  def this(response: Response, body: AnonErrors) = this()
}

