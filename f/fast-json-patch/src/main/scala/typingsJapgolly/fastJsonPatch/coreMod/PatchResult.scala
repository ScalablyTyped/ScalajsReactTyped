package typingsJapgolly.fastJsonPatch.coreMod

import typingsJapgolly.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchResult[T] extends Array[OperationResult[T]] {
  var newDocument: T = js.native
}

