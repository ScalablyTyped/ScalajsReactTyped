package typingsJapgolly.blueprintjsCore.utilsMod

import typingsJapgolly.blueprintjsCore.compareUtilsMod.IKeyBlacklist
import typingsJapgolly.blueprintjsCore.compareUtilsMod.IKeyWhitelist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/utils", "shallowCompareKeys")
@js.native
object shallowCompareKeys extends js.Object {
  def apply[T /* <: js.Object */](objA: T, objB: T): Boolean = js.native
  def apply[T /* <: js.Object */](objA: T, objB: T, keys: IKeyBlacklist[T]): Boolean = js.native
  def apply[T /* <: js.Object */](objA: T, objB: T, keys: IKeyWhitelist[T]): Boolean = js.native
}

