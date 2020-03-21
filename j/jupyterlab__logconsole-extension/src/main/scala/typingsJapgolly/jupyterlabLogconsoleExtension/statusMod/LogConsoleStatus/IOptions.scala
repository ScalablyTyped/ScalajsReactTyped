package typingsJapgolly.jupyterlabLogconsoleExtension.statusMod.LogConsoleStatus

import japgolly.scalajs.react.Callback
import typingsJapgolly.jupyterlabLogconsole.tokensMod.ILoggerRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating a new LogConsoleStatus item
  */
trait IOptions extends js.Object {
  /**
    * The logger registry providing the logs.
    */
  var loggerRegistry: ILoggerRegistry
  /**
    * A click handler for the item. By default
    * Log Console panel is launched.
    */
  def handleClick(): Unit
}

object IOptions {
  @scala.inline
  def apply(handleClick: Callback, loggerRegistry: ILoggerRegistry): IOptions = {
    val __obj = js.Dynamic.literal(loggerRegistry = loggerRegistry.asInstanceOf[js.Any])
    __obj.updateDynamic("handleClick")(handleClick.toJsFn)
    __obj.asInstanceOf[IOptions]
  }
}

