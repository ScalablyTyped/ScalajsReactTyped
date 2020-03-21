package typingsJapgolly.materialFormField

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialFormField.adapterMod.MDCFormFieldAdapter
import typingsJapgolly.materialFormField.foundationMod.default
import typingsJapgolly.materialSelectionControl.mod.MDCSelectionControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/form-field", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCFormField ()
    extends typingsJapgolly.materialBase.componentMod.default[MDCFormFieldAdapter, default] {
    var input: MDCSelectionControl = js.native
  }
  
  @js.native
  class MDCFormFieldFoundation () extends default
  
  /* static members */
  @js.native
  object MDCFormField extends js.Object {
    def attachTo(root: Element): MDCFormField = js.native
  }
  
  /* static members */
  @js.native
  object MDCFormFieldFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialFormField.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCFormFieldAdapter = js.native
    val strings: typingsJapgolly.materialFormField.constantsMod.strings = js.native
  }
  
}

