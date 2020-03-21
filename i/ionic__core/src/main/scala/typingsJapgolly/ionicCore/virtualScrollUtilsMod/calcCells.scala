package typingsJapgolly.ionicCore.virtualScrollUtilsMod

import typingsJapgolly.ionicCore.virtualScrollInterfaceMod.Cell
import typingsJapgolly.ionicCore.virtualScrollInterfaceMod.FooterHeightFn
import typingsJapgolly.ionicCore.virtualScrollInterfaceMod.HeaderFn
import typingsJapgolly.ionicCore.virtualScrollInterfaceMod.HeaderHeightFn
import typingsJapgolly.ionicCore.virtualScrollInterfaceMod.ItemHeightFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/virtual-scroll/virtual-scroll-utils", "calcCells")
@js.native
object calcCells extends js.Object {
  def apply(
    items: js.Array[_],
    itemHeight: js.UndefOr[ItemHeightFn],
    headerHeight: js.UndefOr[HeaderHeightFn],
    footerHeight: js.UndefOr[FooterHeightFn],
    headerFn: js.UndefOr[HeaderFn],
    footerFn: js.UndefOr[HeaderFn],
    approxHeaderHeight: Double,
    approxFooterHeight: Double,
    approxItemHeight: Double,
    j: Double,
    offset: Double,
    len: Double
  ): js.Array[Cell] = js.native
}

