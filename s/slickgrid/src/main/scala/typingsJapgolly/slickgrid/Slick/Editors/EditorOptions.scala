package typingsJapgolly.slickgrid.Slick.Editors

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.slickgrid.Slick.CellPosition
import typingsJapgolly.slickgrid.Slick.Column
import typingsJapgolly.slickgrid.Slick.Grid
import typingsJapgolly.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorOptions[T /* <: SlickData */] extends js.Object {
  var cancelChanges: js.UndefOr[js.Function0[Unit]] = js.undefined
  var column: Column[T]
  var commitChanges: js.UndefOr[js.Function0[Unit]] = js.undefined
  var container: HTMLElement
  var grid: Grid[T]
  var gridPosition: js.UndefOr[CellPosition] = js.undefined
  var item: js.UndefOr[T] = js.undefined
  var position: js.UndefOr[CellPosition] = js.undefined
}

object EditorOptions {
  @scala.inline
  def apply[T /* <: SlickData */](
    column: Column[T],
    container: HTMLElement,
    grid: Grid[T],
    cancelChanges: js.UndefOr[Callback] = js.undefined,
    commitChanges: js.UndefOr[Callback] = js.undefined,
    gridPosition: CellPosition = null,
    item: T = null,
    position: CellPosition = null
  ): EditorOptions[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
    cancelChanges.foreach(p => __obj.updateDynamic("cancelChanges")(p.toJsFn))
    commitChanges.foreach(p => __obj.updateDynamic("commitChanges")(p.toJsFn))
    if (gridPosition != null) __obj.updateDynamic("gridPosition")(gridPosition.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorOptions[T]]
  }
}

