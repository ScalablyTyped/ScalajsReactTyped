package typingsJapgolly.jupyterlabLogconsole.loggerMod.LogOutputModel

import typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat.IOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions
  extends typingsJapgolly.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions

object IOptions {
  @scala.inline
  def apply(value: IOutput, trusted: js.UndefOr[Boolean] = js.undefined): IOptions = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(trusted)) __obj.updateDynamic("trusted")(trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

