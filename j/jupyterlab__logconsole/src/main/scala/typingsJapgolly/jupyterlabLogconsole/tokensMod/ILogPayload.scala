package typingsJapgolly.jupyterlabLogconsole.tokensMod

import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IOutput
import typingsJapgolly.jupyterlabLogconsole.jupyterlabLogconsoleStrings.html
import typingsJapgolly.jupyterlabLogconsole.jupyterlabLogconsoleStrings.output
import typingsJapgolly.jupyterlabLogconsole.jupyterlabLogconsoleStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabLogconsole.tokensMod.ITextLog
  - typingsJapgolly.jupyterlabLogconsole.tokensMod.IHtmlLog
  - typingsJapgolly.jupyterlabLogconsole.tokensMod.IOutputLog
*/
trait ILogPayload extends js.Object

object ILogPayload {
  @scala.inline
  def ITextLog(data: String, level: LogLevel, `type`: text): ILogPayload = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILogPayload]
  }
  @scala.inline
  def IHtmlLog(data: String, level: LogLevel, `type`: html): ILogPayload = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILogPayload]
  }
  @scala.inline
  def IOutputLog(data: IOutput, level: LogLevel, `type`: output): ILogPayload = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILogPayload]
  }
}

