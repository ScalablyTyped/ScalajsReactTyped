package typingsJapgolly.jupyterlabDocregistry.defaultMod

import typingsJapgolly.jupyterlabCodeeditor.mod.CodeEditor.Model
import typingsJapgolly.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsJapgolly.jupyterlabObservables.modeldbMod.IModelDB
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONValue
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry/lib/default", "DocumentModel")
@js.native
/**
  * Construct a new document model.
  */
class DocumentModel ()
  extends Model
     with IModel {
  def this(languagePreference: String) = this()
  def this(languagePreference: String, modelDB: IModelDB) = this()
  var _contentChanged: js.Any = js.native
  var _defaultLang: js.Any = js.native
  var _dirty: js.Any = js.native
  var _readOnly: js.Any = js.native
  var _stateChanged: js.Any = js.native
  /**
    * A signal emitted when the document content changes.
    */
  /* CompleteClass */
  override var contentChanged: ISignal[this.type, Unit] = js.native
  /**
    * The default kernel language of the document.
    */
  /* CompleteClass */
  override val defaultKernelLanguage: String = js.native
  /**
    * The default kernel name of the document.
    */
  /* CompleteClass */
  override val defaultKernelName: String = js.native
  /**
    * The dirty state of the model.
    *
    * #### Notes
    * This should be cleared when the document is loaded from
    * or saved to disk.
    */
  /* CompleteClass */
  override var dirty: Boolean = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* InferMemberOverrides */
  override val isDisposed: Boolean = js.native
  /**
    * The underlying `IModelDB` instance in which model
    * data is stored.
    *
    * ### Notes
    * Making direct edits to the values stored in the`IModelDB`
    * is not recommended, and may produce unpredictable results.
    */
  /* InferMemberOverrides */
  override val modelDB: IModelDB = js.native
  /**
    * The read-only state of the model.
    */
  /* CompleteClass */
  override var readOnly: Boolean = js.native
  /**
    * A signal emitted when the model state changes.
    */
  /* CompleteClass */
  override var stateChanged: ISignal[this.type, IChangedArgs[_, String]] = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  /**
    * Deserialize the model from JSON.
    *
    * #### Notes
    * Should emit a [contentChanged] signal.
    */
  /* CompleteClass */
  override def fromJSON(value: js.Any): Unit = js.native
  /**
    * Deserialize the model from JSON.
    *
    * #### Notes
    * Should emit a [contentChanged] signal.
    */
  def fromJSON(value: JSONValue): Unit = js.native
  /**
    * Deserialize the model from a string.
    *
    * #### Notes
    * Should emit a [contentChanged] signal.
    */
  /* CompleteClass */
  override def fromString(value: String): Unit = js.native
  /**
    * Initialize model state after initial data load.
    *
    * #### Notes
    * This function must be called after the initial data is loaded to set up
    * initial model state, such as an initial undo stack, etc.
    */
  /* CompleteClass */
  override def initialize(): Unit = js.native
  /**
    * Serialize the model to JSON.
    */
  /* CompleteClass */
  override def toJSON(): JSONValue = js.native
  /**
    * Trigger a content changed signal.
    */
  /* protected */ def triggerContentChange(): Unit = js.native
  /**
    * Trigger a state change signal.
    */
  /* protected */ def triggerStateChange(args: IChangedArgs[_, String]): Unit = js.native
}

