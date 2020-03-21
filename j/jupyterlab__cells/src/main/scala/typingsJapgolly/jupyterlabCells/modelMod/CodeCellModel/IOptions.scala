package typingsJapgolly.jupyterlabCells.modelMod.CodeCellModel

import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IBaseCell
import typingsJapgolly.jupyterlabObservables.modeldbMod.IModelDB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a `CodeCellModel`.
  */
trait IOptions
  extends typingsJapgolly.jupyterlabCells.modelMod.CellModel.IOptions {
  /**
    * The factory for output area model creation.
    */
  var contentFactory: js.UndefOr[IContentFactory] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    cell: IBaseCell = null,
    contentFactory: IContentFactory = null,
    id: String = null,
    modelDB: IModelDB = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (contentFactory != null) __obj.updateDynamic("contentFactory")(contentFactory.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modelDB != null) __obj.updateDynamic("modelDB")(modelDB.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

