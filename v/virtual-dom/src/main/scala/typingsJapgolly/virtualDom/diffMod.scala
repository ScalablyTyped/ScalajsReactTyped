package typingsJapgolly.virtualDom

import typingsJapgolly.virtualDom.VirtualDOM.VPatch
import typingsJapgolly.virtualDom.VirtualDOM.VTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("virtual-dom/diff", JSImport.Namespace)
@js.native
object diffMod extends js.Object {
  def apply(left: VTree, right: VTree): js.Array[VPatch] = js.native
}

