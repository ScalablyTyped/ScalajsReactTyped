package typingsJapgolly.materialSelect

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialBase.mod.MDCComponent
import typingsJapgolly.materialFloatingLabel.mod.MDCFloatingLabel
import typingsJapgolly.materialLineRipple.mod.MDCLineRipple
import typingsJapgolly.materialSelect.adapterMod.MDCSelectAdapter
import typingsJapgolly.materialSelect.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/select", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCSelect () extends MDCComponent[MDCSelectAdapter, default] {
    var disabled: Boolean = js.native
    var selectedIndex: Double = js.native
    var value: String = js.native
    def initialize(): Unit = js.native
    def initialize(labelFactory: js.Function1[/* el */ Element, MDCFloatingLabel]): Unit = js.native
    def initialize(
      labelFactory: js.Function1[/* el */ Element, MDCFloatingLabel],
      lineRippleFactory: js.Function1[/* el */ Element, MDCLineRipple]
    ): Unit = js.native
  }
  
  @js.native
  class MDCSelectFoundation () extends default
  
  /* static members */
  @js.native
  object MDCSelect extends js.Object {
    def attachTo(root: Element): MDCSelect = js.native
  }
  
  /* static members */
  @js.native
  object MDCSelectFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialSelect.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSelectAdapter = js.native
    val strings: typingsJapgolly.materialSelect.constantsMod.strings = js.native
  }
  
}

