package typingsJapgolly.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialNotchedOutline.adapterMod.MDCNotchedOutlineAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "notchedOutline")
@js.native
object notchedOutline extends js.Object {
  @js.native
  class MDCNotchedOutline ()
    extends typingsJapgolly.materialNotchedOutline.mod.MDCNotchedOutline
  
  @js.native
  class MDCNotchedOutlineFoundation ()
    extends typingsJapgolly.materialNotchedOutline.mod.MDCNotchedOutlineFoundation
  
  /* static members */
  @js.native
  object MDCNotchedOutline extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialNotchedOutline.mod.MDCNotchedOutline = js.native
  }
  
  /* static members */
  @js.native
  object MDCNotchedOutlineFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialNotchedOutline.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCNotchedOutlineAdapter = js.native
    val strings: typingsJapgolly.materialNotchedOutline.constantsMod.strings = js.native
  }
  
}

