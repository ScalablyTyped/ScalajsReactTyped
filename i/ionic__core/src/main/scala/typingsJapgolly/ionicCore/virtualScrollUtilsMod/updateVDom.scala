package typingsJapgolly.ionicCore.virtualScrollUtilsMod

import typingsJapgolly.ionicCore.virtualScrollInterfaceMod.Cell
import typingsJapgolly.ionicCore.virtualScrollInterfaceMod.VirtualNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/virtual-scroll/virtual-scroll-utils", "updateVDom")
@js.native
object updateVDom extends js.Object {
  def apply(
    dom: js.Array[VirtualNode],
    heightIndex: scala.scalajs.js.typedarray.Uint32Array,
    cells: js.Array[Cell],
    range: Range
  ): Unit = js.native
}

