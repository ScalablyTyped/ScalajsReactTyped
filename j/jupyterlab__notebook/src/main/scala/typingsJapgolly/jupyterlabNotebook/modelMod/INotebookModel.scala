package typingsJapgolly.jupyterlabNotebook.modelMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCells.modelMod.ICellModel
import typingsJapgolly.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsJapgolly.jupyterlabNotebook.modelMod.NotebookModel.IContentFactory
import typingsJapgolly.jupyterlabObservables.modeldbMod.IModelDB
import typingsJapgolly.jupyterlabObservables.observablejsonMod.IObservableJSON
import typingsJapgolly.jupyterlabObservables.undoablelistMod.IObservableUndoableList
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONValue
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotebookModel extends IModel {
  /**
    * The list of cells in the notebook.
    */
  val cells: IObservableUndoableList[ICellModel]
  /**
    * The cell model factory for the notebook.
    */
  val contentFactory: IContentFactory
  /**
    * The array of deleted cells since the notebook was last run.
    */
  val deletedCells: js.Array[String]
  /**
    * The metadata associated with the notebook.
    */
  val metadata: IObservableJSON
  /**
    * The major version number of the nbformat.
    */
  val nbformat: Double
  /**
    * The minor version number of the nbformat.
    */
  val nbformatMinor: Double
}

object INotebookModel {
  @scala.inline
  def apply(
    cells: IObservableUndoableList[ICellModel],
    contentChanged: ISignal[INotebookModel, Unit],
    contentFactory: IContentFactory,
    defaultKernelLanguage: String,
    defaultKernelName: String,
    deletedCells: js.Array[String],
    dirty: Boolean,
    dispose: Callback,
    fromJSON: js.Any => Callback,
    fromString: String => Callback,
    initialize: Callback,
    isDisposed: Boolean,
    metadata: IObservableJSON,
    modelDB: IModelDB,
    nbformat: Double,
    nbformatMinor: Double,
    readOnly: Boolean,
    stateChanged: ISignal[INotebookModel, IChangedArgs[_, String]],
    toJSON: CallbackTo[JSONValue]
  ): INotebookModel = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], contentChanged = contentChanged.asInstanceOf[js.Any], contentFactory = contentFactory.asInstanceOf[js.Any], defaultKernelLanguage = defaultKernelLanguage.asInstanceOf[js.Any], defaultKernelName = defaultKernelName.asInstanceOf[js.Any], deletedCells = deletedCells.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], nbformat = nbformat.asInstanceOf[js.Any], nbformatMinor = nbformatMinor.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("fromJSON")(js.Any.fromFunction1((t0: js.Any) => fromJSON(t0).runNow()))
    __obj.updateDynamic("fromString")(js.Any.fromFunction1((t0: java.lang.String) => fromString(t0).runNow()))
    __obj.updateDynamic("initialize")(initialize.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[INotebookModel]
  }
}

