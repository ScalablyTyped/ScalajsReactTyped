package typingsJapgolly.powerAssert.mod

import typingsJapgolly.powerAssert.AnonActual
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("power-assert", "AssertionError")
@js.native
class AssertionError () extends Error {
  def this(options: AnonActual) = this()
  var actual: js.Any = js.native
  var expected: js.Any = js.native
  var generatedMessage: Boolean = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var operator: String = js.native
}

