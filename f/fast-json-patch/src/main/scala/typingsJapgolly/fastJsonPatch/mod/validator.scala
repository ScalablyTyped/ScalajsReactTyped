package typingsJapgolly.fastJsonPatch.mod

import typingsJapgolly.fastJsonPatch.moduleCoreMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch", "validator")
@js.native
object validator extends js.Object {
  def apply(operation: Operation, index: Double): Unit = js.native
  def apply(operation: Operation, index: Double, document: js.Any): Unit = js.native
  def apply(operation: Operation, index: Double, document: js.Any, existingPathFragment: String): Unit = js.native
}

