package typingsJapgolly.jupyterlabCells.celldragutilsMod.CellDragUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabCells.jupyterlabCellsStrings.input
  - typingsJapgolly.jupyterlabCells.jupyterlabCellsStrings.prompt
  - typingsJapgolly.jupyterlabCells.jupyterlabCellsStrings.cell
  - typingsJapgolly.jupyterlabCells.jupyterlabCellsStrings.unknown
*/
trait ICellTargetArea extends js.Object

object ICellTargetArea {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cell: typingsJapgolly.jupyterlabCells.jupyterlabCellsStrings.cell = this.cast("cell")
  @scala.inline
  def input: typingsJapgolly.jupyterlabCells.jupyterlabCellsStrings.input = this.cast("input")
  @scala.inline
  def prompt: typingsJapgolly.jupyterlabCells.jupyterlabCellsStrings.prompt = this.cast("prompt")
  @scala.inline
  def unknown: typingsJapgolly.jupyterlabCells.jupyterlabCellsStrings.unknown = this.cast("unknown")
}

