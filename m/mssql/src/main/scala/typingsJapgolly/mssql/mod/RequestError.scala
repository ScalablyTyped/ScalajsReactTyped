package typingsJapgolly.mssql.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mssql", "RequestError")
@js.native
class RequestError protected () extends Error {
  def this(message: String) = this()
  def this(message: String, code: js.Any) = this()
  var `class`: js.UndefOr[Double] = js.native
  var code: String = js.native
  var lineNumber: js.UndefOr[Double] = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var number: js.UndefOr[Double] = js.native
  var procName: js.UndefOr[String] = js.native
  var serverName: js.UndefOr[String] = js.native
  var state: js.UndefOr[Double] = js.native
}

