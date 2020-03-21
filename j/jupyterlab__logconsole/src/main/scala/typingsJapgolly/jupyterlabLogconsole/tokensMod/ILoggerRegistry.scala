package typingsJapgolly.jupyterlabLogconsole.tokensMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.phosphorCoreutils.mod.Token
import typingsJapgolly.phosphorDisposable.mod.IDisposable
import typingsJapgolly.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoggerRegistry extends IDisposable {
  /**
    * A signal emitted when the logger registry changes.
    */
  val registryChanged: ISignal[this.type, ILoggerRegistryChange]
  /**
    * Get the logger for the specified source.
    *
    * @param source - The name of the log source.
    *
    * @returns The logger for the specified source.
    */
  def getLogger(source: String): ILogger
  /**
    * Get all loggers registered.
    *
    * @returns The array containing all registered loggers.
    */
  def getLoggers(): js.Array[ILogger]
}

@JSImport("@jupyterlab/logconsole/lib/tokens", "ILoggerRegistry")
@js.native
object ILoggerRegistry extends TopLevel[Token[ILoggerRegistry]]

