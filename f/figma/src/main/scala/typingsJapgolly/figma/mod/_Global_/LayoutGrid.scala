package typingsJapgolly.figma.mod._Global_

import typingsJapgolly.figma.figmaStrings.CENTER
import typingsJapgolly.figma.figmaStrings.COLUMNS
import typingsJapgolly.figma.figmaStrings.GRID
import typingsJapgolly.figma.figmaStrings.MAX
import typingsJapgolly.figma.figmaStrings.MIN
import typingsJapgolly.figma.figmaStrings.ROWS
import typingsJapgolly.figma.figmaStrings.STRETCH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.figma.mod._Global_.RowsColsLayoutGrid
  - typingsJapgolly.figma.mod._Global_.GridLayoutGrid
*/
trait LayoutGrid extends js.Object

object LayoutGrid {
  @scala.inline
  def RowsColsLayoutGrid(
    alignment: MIN | MAX | STRETCH | CENTER,
    count: Double,
    gutterSize: Double,
    pattern: ROWS | COLUMNS,
    color: RGBA = null,
    offset: Int | Double = null,
    sectionSize: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): LayoutGrid = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], gutterSize = gutterSize.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (sectionSize != null) __obj.updateDynamic("sectionSize")(sectionSize.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutGrid]
  }
  @scala.inline
  def GridLayoutGrid(
    pattern: GRID,
    sectionSize: Double,
    color: RGBA = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): LayoutGrid = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], sectionSize = sectionSize.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutGrid]
  }
}

