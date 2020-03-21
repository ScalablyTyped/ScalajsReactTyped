package typingsJapgolly.slickgrid.Slick.Data

import typingsJapgolly.slickgrid.Slick.Group
import typingsJapgolly.slickgrid.Slick.GroupTotals
import typingsJapgolly.slickgrid.Slick.RowMetadata
import typingsJapgolly.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Data.GroupItemMetadataProvider")
@js.native
class GroupItemMetadataProvider[T /* <: SlickData */] () extends js.Object {
  def destroy(): Unit = js.native
  def getGroupRowMetadata(): RowMetadata[T] = js.native
  def getGroupRowMetadata(item: Group[T]): RowMetadata[T] = js.native
  def getTotalsRowMetadata(): RowMetadata[T] = js.native
  def getTotalsRowMetadata(item: GroupTotals[T]): RowMetadata[T] = js.native
  def init(): Unit = js.native
}

