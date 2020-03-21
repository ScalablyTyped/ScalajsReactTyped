package typingsJapgolly.fastJsonPatch.mod

import typingsJapgolly.fastJsonPatch.moduleCoreMod.Operation
import typingsJapgolly.fastJsonPatch.moduleDuplexMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch", "generate")
@js.native
object generate extends js.Object {
  def apply[T](observer: Observer[js.Object]): js.Array[Operation] = js.native
  def apply[T](observer: Observer[js.Object], invertible: Boolean): js.Array[Operation] = js.native
}

