package typingsJapgolly.jupyterlabConsole.widgetMod.CodeConsole

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCells.modelMod.ICodeCellModel
import typingsJapgolly.jupyterlabCells.modelMod.IRawCellModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A model factory for a console widget.
  */
trait IModelFactory extends js.Object {
  /**
    * The factory for code cell content.
    */
  val codeCellContentFactory: typingsJapgolly.jupyterlabCells.modelMod.CodeCellModel.IContentFactory
  /**
    * Create a new code cell.
    *
    * @param options - The options used to create the cell.
    *
    * @returns A new code cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createCodeCell(options: typingsJapgolly.jupyterlabCells.modelMod.CodeCellModel.IOptions): ICodeCellModel
  /**
    * Create a new raw cell.
    *
    * @param options - The options used to create the cell.
    *
    * @returns A new raw cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createRawCell(options: typingsJapgolly.jupyterlabCells.modelMod.CellModel.IOptions): IRawCellModel
}

object IModelFactory {
  @scala.inline
  def apply(
    codeCellContentFactory: typingsJapgolly.jupyterlabCells.modelMod.CodeCellModel.IContentFactory,
    createCodeCell: typingsJapgolly.jupyterlabCells.modelMod.CodeCellModel.IOptions => CallbackTo[ICodeCellModel],
    createRawCell: typingsJapgolly.jupyterlabCells.modelMod.CellModel.IOptions => CallbackTo[IRawCellModel]
  ): IModelFactory = {
    val __obj = js.Dynamic.literal(codeCellContentFactory = codeCellContentFactory.asInstanceOf[js.Any])
    __obj.updateDynamic("createCodeCell")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabCells.modelMod.CodeCellModel.IOptions) => createCodeCell(t0).runNow()))
    __obj.updateDynamic("createRawCell")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabCells.modelMod.CellModel.IOptions) => createRawCell(t0).runNow()))
    __obj.asInstanceOf[IModelFactory]
  }
}

