package typingsJapgolly.jupyterlabCells.modelMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.ITextSelection
import typingsJapgolly.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.CellType
import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.ICell
import typingsJapgolly.jupyterlabObservables.modeldbMod.IModelDB
import typingsJapgolly.jupyterlabObservables.observablejsonMod.IObservableJSON
import typingsJapgolly.jupyterlabObservables.observablemapMod.IObservableMap
import typingsJapgolly.jupyterlabObservables.observablestringMod.IObservableString
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellModel extends IModel {
  /**
    * A signal emitted when the content of the model changes.
    */
  val contentChanged: ISignal[ICellModel, Unit]
  /**
    * A unique identifier for the cell.
    */
  val id: String
  /**
    * The metadata associated with the cell.
    */
  val metadata: IObservableJSON
  /**
    * A signal emitted when a model state changes.
    */
  val stateChanged: ISignal[ICellModel, IChangedArgs[_, String]]
  /**
    * Whether the cell is trusted.
    */
  var trusted: Boolean
  /**
    * The type of the cell.
    */
  val `type`: CellType
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): ICell
}

object ICellModel {
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
    selections: IObservableMap[js.Array[ITextSelection]],
    stateChanged: ISignal[ICellModel, IChangedArgs[_, String]],
    toJSON: CallbackTo[ICell],
    trusted: Boolean,
    `type`: CellType,
    value: IObservableString
  ): ICellModel = {
    val __obj = js.Dynamic.literal(contentChanged = contentChanged.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellModel]
  }
}

