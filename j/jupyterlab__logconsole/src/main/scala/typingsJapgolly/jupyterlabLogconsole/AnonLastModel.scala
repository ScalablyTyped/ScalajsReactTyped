package typingsJapgolly.jupyterlabLogconsole

import typingsJapgolly.jupyterlabLogconsole.loggerMod.ILogOutput
import typingsJapgolly.jupyterlabLogconsole.loggerMod.ILogOutputModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLastModel extends js.Object {
  var lastModel: ILogOutputModel
  var value: ILogOutput
}

object AnonLastModel {
  @scala.inline
  def apply(lastModel: ILogOutputModel, value: ILogOutput): AnonLastModel = {
    val __obj = js.Dynamic.literal(lastModel = lastModel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLastModel]
  }
}

