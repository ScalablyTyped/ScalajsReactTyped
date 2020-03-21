package typingsJapgolly.jupyterlabLogconsole

import typingsJapgolly.jupyterlabLogconsole.loggerMod.LogOutputModel.IOptions
import typingsJapgolly.phosphorCoreutils.mod.Token
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/logconsole", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class LogConsolePanel protected ()
    extends typingsJapgolly.jupyterlabLogconsole.widgetMod.LogConsolePanel {
    /**
      * Construct a LogConsolePanel instance.
      *
      * @param loggerRegistry - The logger registry that provides
      * logs to be displayed.
      */
    def this(loggerRegistry: typingsJapgolly.jupyterlabLogconsole.tokensMod.ILoggerRegistry) = this()
  }
  
  @js.native
  class LogOutputModel protected ()
    extends typingsJapgolly.jupyterlabLogconsole.loggerMod.LogOutputModel {
    /**
      * Construct a LogOutputModel.
      *
      * @param options - The model initialization options.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class Logger protected ()
    extends typingsJapgolly.jupyterlabLogconsole.loggerMod.Logger {
    /**
      * Construct a Logger.
      *
      * @param source - The name of the log source.
      */
    def this(options: typingsJapgolly.jupyterlabLogconsole.loggerMod.Logger.IOptions) = this()
  }
  
  @js.native
  class LoggerOutputAreaModel protected ()
    extends typingsJapgolly.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel {
    def this(hasMaxLengthOptions: typingsJapgolly.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel.IOptions) = this()
  }
  
  @js.native
  class LoggerRegistry protected ()
    extends typingsJapgolly.jupyterlabLogconsole.registryMod.LoggerRegistry {
    /**
      * Construct a LoggerRegistry.
      *
      * @param defaultRendermime - Default rendermime to render outputs
      * with when logger is not supplied with one.
      */
    def this(options: typingsJapgolly.jupyterlabLogconsole.registryMod.LoggerRegistry.IOptions) = this()
  }
  
  @js.native
  class ScrollingWidget[T /* <: Widget */] protected ()
    extends typingsJapgolly.jupyterlabLogconsole.widgetMod.ScrollingWidget[T] {
    def this(hasContentOptions: typingsJapgolly.jupyterlabLogconsole.widgetMod.ScrollingWidget.IOptions[T]) = this()
  }
  
  val ILoggerRegistry: Token[typingsJapgolly.jupyterlabLogconsole.tokensMod.ILoggerRegistry] = js.native
  /**
    * Log Output Model namespace that defines initialization options.
    */
  @js.native
  object LogOutputModel extends js.Object
  
}

