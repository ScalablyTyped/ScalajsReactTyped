package typingsJapgolly.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialFloatingLabel.adapterMod.MDCFloatingLabelAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "floatingLabel")
@js.native
object floatingLabel extends js.Object {
  @js.native
  class MDCFloatingLabel ()
    extends typingsJapgolly.materialFloatingLabel.mod.MDCFloatingLabel
  
  @js.native
  class MDCFloatingLabelFoundation ()
    extends typingsJapgolly.materialFloatingLabel.mod.MDCFloatingLabelFoundation
  
  /* static members */
  @js.native
  object MDCFloatingLabel extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialFloatingLabel.mod.MDCFloatingLabel = js.native
  }
  
  /* static members */
  @js.native
  object MDCFloatingLabelFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialFloatingLabel.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCFloatingLabelAdapter = js.native
  }
  
}

