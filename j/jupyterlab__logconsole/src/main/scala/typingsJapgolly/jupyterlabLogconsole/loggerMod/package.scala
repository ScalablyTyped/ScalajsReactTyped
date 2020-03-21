package typingsJapgolly.jupyterlabLogconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loggerMod {
  /**
    * Custom Notebook Output with log info.
    */
  type ILogOutput = typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IOutput with typingsJapgolly.jupyterlabLogconsole.AnonLevel
  type LogOutputModel = typingsJapgolly.jupyterlabLogconsole.loggerMod.LogOutputModel_
  type Logger = typingsJapgolly.jupyterlabLogconsole.loggerMod.Logger_
  type LoggerOutputAreaModel = typingsJapgolly.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel_
}
