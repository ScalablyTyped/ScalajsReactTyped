package typingsJapgolly.fastJsonPatch.mod

import typingsJapgolly.fastJsonPatch.moduleCoreMod.Operation
import typingsJapgolly.fastJsonPatch.moduleCoreMod.Validator_
import typingsJapgolly.fastJsonPatch.moduleHelpersMod.PatchError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch", "validate")
@js.native
object validate extends js.Object {
  def apply[T](sequence: js.Array[Operation]): PatchError = js.native
  def apply[T](sequence: js.Array[Operation], document: T): PatchError = js.native
  def apply[T](sequence: js.Array[Operation], document: T, externalValidator: Validator_[T]): PatchError = js.native
}

