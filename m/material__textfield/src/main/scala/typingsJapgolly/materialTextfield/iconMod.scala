package typingsJapgolly.materialTextfield

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialTextfield.iconAdapterMod.MDCTextFieldIconAdapter
import typingsJapgolly.materialTextfield.iconFoundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield/icon", JSImport.Namespace)
@js.native
object iconMod extends js.Object {
  @js.native
  class MDCTextFieldIcon ()
    extends typingsJapgolly.materialBase.componentMod.default[MDCTextFieldIconAdapter, default] {
    val foundation: default = js.native
  }
  
  @js.native
  class MDCTextFieldIconFoundation () extends default
  
  /* static members */
  @js.native
  object MDCTextFieldIcon extends js.Object {
    def attachTo(root: Element): MDCTextFieldIcon = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldIconFoundation extends js.Object {
    val defaultAdapter: MDCTextFieldIconAdapter = js.native
    val strings: typingsJapgolly.materialTextfield.iconConstantsMod.strings = js.native
  }
  
}

