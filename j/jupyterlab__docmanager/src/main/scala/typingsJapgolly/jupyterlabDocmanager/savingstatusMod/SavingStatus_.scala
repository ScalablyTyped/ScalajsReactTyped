package typingsJapgolly.jupyterlabDocmanager.savingstatusMod

import typingsJapgolly.jupyterlabApputils.vdomMod.VDomRenderer
import typingsJapgolly.jupyterlabDocmanager.savingstatusMod.SavingStatus.IOptions
import typingsJapgolly.jupyterlabDocmanager.savingstatusMod.SavingStatus.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docmanager/lib/savingstatus", "SavingStatus")
@js.native
class SavingStatus_ protected () extends VDomRenderer[Model] {
  /**
    * Create a new SavingStatus item.
    */
  def this(opts: IOptions) = this()
  var _docManager: js.Any = js.native
}

