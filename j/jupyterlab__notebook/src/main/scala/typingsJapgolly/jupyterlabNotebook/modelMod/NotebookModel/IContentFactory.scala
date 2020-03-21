package typingsJapgolly.jupyterlabNotebook.modelMod.NotebookModel

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCells.modelMod.ICellModel
import typingsJapgolly.jupyterlabCells.modelMod.ICodeCellModel
import typingsJapgolly.jupyterlabCells.modelMod.IMarkdownCellModel
import typingsJapgolly.jupyterlabCells.modelMod.IRawCellModel
import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.CellType
import typingsJapgolly.jupyterlabObservables.modeldbMod.IModelDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A factory for creating notebook model content.
  */
trait IContentFactory extends js.Object {
  /**
    * The factory for output area models.
    */
  val codeCellContentFactory: typingsJapgolly.jupyterlabCells.modelMod.CodeCellModel.IContentFactory
  /**
    * The IModelDB in which to put data for the notebook model.
    */
  var modelDB: IModelDB
  /**
    * Clone the content factory with a new IModelDB.
    */
  def clone(modelDB: IModelDB): IContentFactory
  /**
    * Create a new cell by cell type.
    *
    * @param type:  the type of the cell to create.
    *
    * @param options: the cell creation options.
    *
    * #### Notes
    * This method is intended to be a convenience method to programmaticaly
    * call the other cell creation methods in the factory.
    */
  def createCell(`type`: CellType, opts: typingsJapgolly.jupyterlabCells.modelMod.CellModel.IOptions): ICellModel
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
    * Create a new markdown cell.
    *
    * @param options - The options used to create the cell.
    *
    * @returns A new markdown cell. If a source cell is provided, the
    *   new cell will be initialized with the data from the source.
    */
  def createMarkdownCell(options: typingsJapgolly.jupyterlabCells.modelMod.CellModel.IOptions): IMarkdownCellModel
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

object IContentFactory {
  @scala.inline
  def apply(
    clone: IModelDB => CallbackTo[IContentFactory],
    codeCellContentFactory: typingsJapgolly.jupyterlabCells.modelMod.CodeCellModel.IContentFactory,
    createCell: (CellType, typingsJapgolly.jupyterlabCells.modelMod.CellModel.IOptions) => CallbackTo[ICellModel],
    createCodeCell: typingsJapgolly.jupyterlabCells.modelMod.CodeCellModel.IOptions => CallbackTo[ICodeCellModel],
    createMarkdownCell: typingsJapgolly.jupyterlabCells.modelMod.CellModel.IOptions => CallbackTo[IMarkdownCellModel],
    createRawCell: typingsJapgolly.jupyterlabCells.modelMod.CellModel.IOptions => CallbackTo[IRawCellModel],
    modelDB: IModelDB
  ): IContentFactory = {
    val __obj = js.Dynamic.literal(codeCellContentFactory = codeCellContentFactory.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabObservables.modeldbMod.IModelDB) => clone(t0).runNow()))
    __obj.updateDynamic("createCell")(js.Any.fromFunction2((t0: typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.CellType, t1: typingsJapgolly.jupyterlabCells.modelMod.CellModel.IOptions) => createCell(t0, t1).runNow()))
    __obj.updateDynamic("createCodeCell")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabCells.modelMod.CodeCellModel.IOptions) => createCodeCell(t0).runNow()))
    __obj.updateDynamic("createMarkdownCell")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabCells.modelMod.CellModel.IOptions) => createMarkdownCell(t0).runNow()))
    __obj.updateDynamic("createRawCell")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabCells.modelMod.CellModel.IOptions) => createRawCell(t0).runNow()))
    __obj.asInstanceOf[IContentFactory]
  }
}

