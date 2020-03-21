package typingsJapgolly.materialFormField

import typingsJapgolly.materialFormField.adapterMod.MDCFormFieldAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/form-field/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class default ()
    extends typingsJapgolly.materialBase.foundationMod.default[MDCFormFieldAdapter]
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typingsJapgolly.materialFormField.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCFormFieldAdapter = js.native
    val strings: typingsJapgolly.materialFormField.constantsMod.strings = js.native
  }
  
  type MDCFormFieldFoundation = typingsJapgolly.materialBase.foundationMod.default[MDCFormFieldAdapter]
}

