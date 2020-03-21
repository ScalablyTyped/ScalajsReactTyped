package typingsJapgolly.jupyterlabCells.modelMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabAttachments.modelMod.IAttachmentsModel
import typingsJapgolly.jupyterlabCells.jupyterlabCellsStrings.raw
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.ITextSelection
import typingsJapgolly.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.ICell
import typingsJapgolly.jupyterlabObservables.modeldbMod.IModelDB
import typingsJapgolly.jupyterlabObservables.observablejsonMod.IObservableJSON
import typingsJapgolly.jupyterlabObservables.observablemapMod.IObservableMap
import typingsJapgolly.jupyterlabObservables.observablestringMod.IObservableString
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRawCellModel extends IAttachmentsCellModel {
  /**
    * The type of the cell.
    */
  @JSName("type")
  val type_IRawCellModel: raw
}

object IRawCellModel {
  @scala.inline
  def apply(
    attachments: IAttachmentsModel,
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
    `type`: raw,
    value: IObservableString
  ): IRawCellModel = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], contentChanged = contentChanged.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRawCellModel]
  }
}

