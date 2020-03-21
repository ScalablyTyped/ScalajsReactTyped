package typingsJapgolly.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialFormField.adapterMod.MDCFormFieldAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "formField")
@js.native
object formField extends js.Object {
  @js.native
  class MDCFormField ()
    extends typingsJapgolly.materialFormField.mod.MDCFormField
  
  @js.native
  class MDCFormFieldFoundation ()
    extends typingsJapgolly.materialFormField.mod.MDCFormFieldFoundation
  
  /* static members */
  @js.native
  object MDCFormField extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialFormField.mod.MDCFormField = js.native
  }
  
  /* static members */
  @js.native
  object MDCFormFieldFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialFormField.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCFormFieldAdapter = js.native
    val strings: typingsJapgolly.materialFormField.constantsMod.strings = js.native
  }
  
}

