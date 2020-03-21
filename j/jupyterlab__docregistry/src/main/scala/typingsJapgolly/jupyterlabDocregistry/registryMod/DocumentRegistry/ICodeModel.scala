package typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.ITextSelection
import typingsJapgolly.jupyterlabObservables.modeldbMod.IModelDB
import typingsJapgolly.jupyterlabObservables.observablemapMod.IObservableMap
import typingsJapgolly.jupyterlabObservables.observablestringMod.IObservableString
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONValue
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for a document model that represents code.
  */
trait ICodeModel
  extends IModel
     with typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IModel {
  /**
    * The underlying `IModelDB` instance in which model
    * data is stored.
    */
  /* InferMemberOverrides */
  override val modelDB: IModelDB
}

object ICodeModel {
  @scala.inline
  def apply(
    contentChanged: ISignal[ICodeModel, Unit],
    defaultKernelLanguage: String,
    defaultKernelName: String,
    dirty: Boolean,
    dispose: Callback,
    fromJSON: js.Any => Callback,
    fromString: String => Callback,
    initialize: Callback,
    isDisposed: Boolean,
    mimeType: String,
    mimeTypeChanged: ISignal[
      typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor.IModel, 
      typingsJapgolly.jupyterlabCoreutils.interfacesMod.IChangedArgs[String, String]
    ],
    modelDB: IModelDB,
    readOnly: Boolean,
    selections: IObservableMap[js.Array[ITextSelection]],
    stateChanged: ISignal[
      ICodeModel, 
      typingsJapgolly.jupyterlabCoreutils.interfacesMod.IChangedArgs[_, String]
    ],
    toJSON: CallbackTo[JSONValue],
    value: IObservableString
  ): ICodeModel = {
    val __obj = js.Dynamic.literal(contentChanged = contentChanged.asInstanceOf[js.Any], defaultKernelLanguage = defaultKernelLanguage.asInstanceOf[js.Any], defaultKernelName = defaultKernelName.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("fromJSON")(js.Any.fromFunction1((t0: js.Any) => fromJSON(t0).runNow()))
    __obj.updateDynamic("fromString")(js.Any.fromFunction1((t0: java.lang.String) => fromString(t0).runNow()))
    __obj.updateDynamic("initialize")(initialize.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[ICodeModel]
  }
}

