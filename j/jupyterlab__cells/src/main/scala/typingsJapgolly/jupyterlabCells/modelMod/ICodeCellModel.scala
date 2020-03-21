package typingsJapgolly.jupyterlabCells.modelMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCells.jupyterlabCellsStrings.code
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.ITextSelection
import typingsJapgolly.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.ExecutionCount
import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.ICell
import typingsJapgolly.jupyterlabObservables.modeldbMod.IModelDB
import typingsJapgolly.jupyterlabObservables.observablejsonMod.IObservableJSON
import typingsJapgolly.jupyterlabObservables.observablemapMod.IObservableMap
import typingsJapgolly.jupyterlabObservables.observablestringMod.IObservableString
import typingsJapgolly.jupyterlabOutputarea.modelMod.IOutputAreaModel
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICodeCellModel extends ICellModel {
  /**
    * The code cell's prompt number. Will be null if the cell has not been run.
    */
  var executionCount: ExecutionCount
  /**
    * The cell outputs.
    */
  val outputs: IOutputAreaModel
  /**
    * The type of the cell.
    *
    * #### Notes
    * This is a read-only property.
    */
  @JSName("type")
  val type_ICodeCellModel: code
}

object ICodeCellModel {
  @scala.inline
  def apply(
    contentChanged: ISignal[ICellModel, Unit],
    dispose: Callback,
    id: String,
    isDisposed: Boolean,
    metadata: IObservableJSON,
    mimeType: String,
    mimeTypeChanged: ISignal[IModel, IChangedArgs[String, String]],
    modelDB: IModelDB,
    outputs: IOutputAreaModel,
    selections: IObservableMap[js.Array[ITextSelection]],
    stateChanged: ISignal[ICellModel, IChangedArgs[_, String]],
    toJSON: CallbackTo[ICell],
    trusted: Boolean,
    `type`: code,
    value: IObservableString,
    executionCount: Int | Double = null
  ): ICodeCellModel = {
    val __obj = js.Dynamic.literal(contentChanged = contentChanged.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (executionCount != null) __obj.updateDynamic("executionCount")(executionCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeCellModel]
  }
}

