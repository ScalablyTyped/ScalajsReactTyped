package typingsJapgolly.jupyterlabLogconsole.loggerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IOutput
import typingsJapgolly.jupyterlabRendermime.outputmodelMod.IOutputModel
import typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typingsJapgolly.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILogOutputModel extends IOutputModel {
  /**
    * Log level
    */
  val level: FullLogLevel
  /**
    * Date & time when output is logged.
    */
  val timestamp: js.Date
}

object ILogOutputModel {
  @scala.inline
  def apply(
    changed: ISignal[ILogOutputModel, Unit],
    data: ReadonlyJSONObject,
    dispose: Callback,
    level: FullLogLevel,
    metadata: ReadonlyJSONObject,
    setData: ISetDataOptions => Callback,
    timestamp: js.Date,
    toJSON: CallbackTo[IOutput],
    trusted: Boolean,
    `type`: String,
    executionCount: Int | Double = null
  ): ILogOutputModel = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("setData")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions) => setData(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (executionCount != null) __obj.updateDynamic("executionCount")(executionCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILogOutputModel]
  }
}

