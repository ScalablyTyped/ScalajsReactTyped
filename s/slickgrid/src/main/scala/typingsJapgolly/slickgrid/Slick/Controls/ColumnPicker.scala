package typingsJapgolly.slickgrid.Slick.Controls

import typingsJapgolly.slickgrid.Slick.Column
import typingsJapgolly.slickgrid.Slick.Grid
import typingsJapgolly.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Controls.ColumnPicker")
@js.native
class ColumnPicker[T /* <: SlickData */] protected () extends js.Object {
  def this(columns: js.Array[Column[T]], grid: Grid[T], options: SlickColumnPickerOptions) = this()
  def destroy(): Unit = js.native
  def getAllColumns(): js.Array[Column[T]] = js.native
}

