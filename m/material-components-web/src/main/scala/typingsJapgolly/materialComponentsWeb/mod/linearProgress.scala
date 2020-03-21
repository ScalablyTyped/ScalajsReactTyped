package typingsJapgolly.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialLinearProgress.adapterMod.MDCLinearProgressAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "linearProgress")
@js.native
object linearProgress extends js.Object {
  @js.native
  class MDCLinearProgress ()
    extends typingsJapgolly.materialLinearProgress.mod.MDCLinearProgress
  
  @js.native
  class MDCLinearProgressFoundation ()
    extends typingsJapgolly.materialLinearProgress.mod.MDCLinearProgressFoundation
  
  /* static members */
  @js.native
  object MDCLinearProgress extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialLinearProgress.mod.MDCLinearProgress = js.native
  }
  
  /* static members */
  @js.native
  object MDCLinearProgressFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialLinearProgress.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCLinearProgressAdapter = js.native
    val strings: typingsJapgolly.materialLinearProgress.constantsMod.strings = js.native
  }
  
}

