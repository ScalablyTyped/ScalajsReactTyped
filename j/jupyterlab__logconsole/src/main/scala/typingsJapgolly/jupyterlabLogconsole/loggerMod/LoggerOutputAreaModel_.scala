package typingsJapgolly.jupyterlabLogconsole.loggerMod

import typingsJapgolly.jupyterlabLogconsole.AnonLastModel
import typingsJapgolly.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel.IOptions
import typingsJapgolly.jupyterlabOutputarea.mod.OutputAreaModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.phosphorDisposable.mod.IDisposable because Already inherited
- typingsJapgolly.jupyterlabOutputarea.modelMod.IOutputAreaModel because Already inherited
- typingsJapgolly.jupyterlabLogconsole.tokensMod.ILoggerOutputAreaModel because var conflicts: trusted. Inlined maxLength */ @JSImport("@jupyterlab/logconsole/lib/logger", "LoggerOutputAreaModel")
@js.native
class LoggerOutputAreaModel_ protected () extends OutputAreaModel {
  def this(hasMaxLengthOptions: IOptions) = this()
  /**
    * Manually apply length limit.
    */
  var _applyMaxLength: js.Any = js.native
  var _maxLength: js.Any = js.native
  /**
    * Maximum number of outputs to store in the model.
    */
  var maxLength: Double = js.native
  /**
    * Whether an output should combine with the previous output.
    *
    * We combine if the two outputs are in the same second, which is the
    * resolution for our time display.
    */
  /* protected */ def shouldCombine(options: AnonLastModel): Boolean = js.native
}

