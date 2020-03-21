package typingsJapgolly.jupyterlabLogconsole.loggerMod

import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.ExecutionCount
import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IOutput
import typingsJapgolly.jupyterlabLogconsole.loggerMod.LogOutputModel.IOptions
import typingsJapgolly.jupyterlabRendermime.mod.OutputModel
import typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typingsJapgolly.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/logconsole/lib/logger", "LogOutputModel")
@js.native
class LogOutputModel_ protected ()
  extends OutputModel
     with ILogOutputModel {
  /**
    * Construct a LogOutputModel.
    *
    * @param options - The model initialization options.
    */
  def this(options: IOptions) = this()
  /**
    * A signal emitted when the output model changes.
    */
  /* InferMemberOverrides */
  override val changed: ISignal[this.type, Unit] = js.native
  /**
    * The data associated with the model.
    */
  /* CompleteClass */
  override val data: ReadonlyJSONObject = js.native
  /**
    * The execution count of the model.
    */
  /* InferMemberOverrides */
  override val executionCount: ExecutionCount = js.native
  /**
    * Log level
    */
  /* CompleteClass */
  override val level: FullLogLevel = js.native
  /**
    * The metadata associated with the model.
    *
    * Among others, it can include an attribute named `fragment`
    * that stores a URI fragment identifier for the MIME resource.
    */
  /* CompleteClass */
  override val metadata: ReadonlyJSONObject = js.native
  /**
    * Date & time when output is logged.
    */
  /* CompleteClass */
  override val timestamp: js.Date = js.native
  /**
    * Whether the data in the model is trusted.
    */
  /* CompleteClass */
  override val trusted: Boolean = js.native
  /**
    * The output type.
    */
  /* InferMemberOverrides */
  override val `type`: String = js.native
  /**
    * Dispose of the resources used by the output model.
    */
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  /**
    * Set the data associated with the model.
    *
    * #### Notes
    * Calling this function may trigger an asynchronous operation
    * that could cause the renderer to be rendered with a new model
    * containing the new data.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def setData(options: ISetDataOptions): Unit = js.native
  /**
    * Serialize the model to JSON.
    */
  /* InferMemberOverrides */
  override def toJSON(): IOutput = js.native
}

