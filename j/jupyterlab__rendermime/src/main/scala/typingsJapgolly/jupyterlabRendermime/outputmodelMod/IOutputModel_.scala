package typingsJapgolly.jupyterlabRendermime.outputmodelMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.ExecutionCount
import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IOutput
import typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel
import typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typingsJapgolly.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOutputModel_ extends IMimeModel {
  /**
    * A signal emitted when the output model changes.
    */
  val changed: ISignal[this.type, Unit]
  /**
    * The execution count of the model.
    */
  val executionCount: ExecutionCount
  /**
    * The output type.
    */
  val `type`: String
  /**
    * Dispose of the resources used by the output model.
    */
  def dispose(): Unit
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): IOutput
}

object IOutputModel_ {
  @scala.inline
  def apply(
    changed: ISignal[IOutputModel_, Unit],
    data: ReadonlyJSONObject,
    dispose: Callback,
    metadata: ReadonlyJSONObject,
    setData: ISetDataOptions => Callback,
    toJSON: CallbackTo[IOutput],
    trusted: Boolean,
    `type`: String,
    executionCount: Int | Double = null
  ): IOutputModel_ = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("setData")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions) => setData(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (executionCount != null) __obj.updateDynamic("executionCount")(executionCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOutputModel_]
  }
}

