package typingsJapgolly.feathersjsErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/errors", "Unavailable")
@js.native
class Unavailable () extends FeathersError {
  def this(msg: String) = this()
  def this(msg: js.Error) = this()
  def this(msg: String, data: js.Any) = this()
  def this(msg: js.Error, data: js.Any) = this()
}

