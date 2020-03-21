package typingsJapgolly.builderUtil.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util", "ExecError")
@js.native
class ExecError protected () extends Error {
  def this(command: String, exitCode: Double, out: String, errorOut: String) = this()
  def this(command: String, exitCode: Double, out: String, errorOut: String, code: String) = this()
  var alreadyLogged: Boolean = js.native
  val exitCode: Double = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

