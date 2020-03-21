package typingsJapgolly.jupyterlabLogconsole.tokensMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILogger extends IDisposable {
  /**
    * A signal emitted when the log model changes.
    */
  val contentChanged: ISignal[this.type, IContentChange]
  /**
    * Number of outputs logged.
    */
  val length: Double
  /**
    * Log level.
    */
  var level: LogLevel
  /**
    * Max number of messages.
    */
  var maxLength: Double
  /**
    * Output Area Model used to manage log storage in memory.
    */
  val outputAreaModel: ILoggerOutputAreaModel
  /**
    * Rendermime to use when rendering outputs logged.
    */
  var rendermime: IRenderMimeRegistry
  /**
    * The name of the log source.
    */
  val source: String
  /**
    * A signal emitted when the rendermime changes.
    */
  val stateChanged: ISignal[this.type, IStateChange]
  /**
    * The cumulative number of messages the log has stored.
    */
  val version: Double
  /**
    * Add a checkpoint in the log.
    */
  def checkpoint(): Unit
  /**
    * Clear all outputs logged.
    */
  def clear(): Unit
  /**
    * Log an output to logger.
    *
    * @param log - The output to be logged.
    */
  def log(log: ILogPayload): Unit
}

object ILogger {
  @scala.inline
  def apply(
    checkpoint: Callback,
    clear: Callback,
    contentChanged: ISignal[ILogger, IContentChange],
    dispose: Callback,
    isDisposed: Boolean,
    length: Double,
    level: LogLevel,
    log: ILogPayload => Callback,
    maxLength: Double,
    outputAreaModel: ILoggerOutputAreaModel,
    rendermime: IRenderMimeRegistry,
    source: String,
    stateChanged: ISignal[ILogger, IStateChange],
    version: Double
  ): ILogger = {
    val __obj = js.Dynamic.literal(contentChanged = contentChanged.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], outputAreaModel = outputAreaModel.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("checkpoint")(checkpoint.toJsFn)
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: typingsJapgolly.jupyterlabLogconsole.tokensMod.ILogPayload) => log(t0).runNow()))
    __obj.asInstanceOf[ILogger]
  }
}

