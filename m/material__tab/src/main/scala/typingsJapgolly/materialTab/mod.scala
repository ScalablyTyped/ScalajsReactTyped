package typingsJapgolly.materialTab

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialTab.adapterMod.MDCTabAdapter
import typingsJapgolly.materialTab.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tab", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCTab ()
    extends typingsJapgolly.materialBase.componentMod.default[MDCTabAdapter, default] {
    var active: Boolean = js.native
  }
  
  @js.native
  class MDCTabFoundation () extends default
  
  /* static members */
  @js.native
  object MDCTab extends js.Object {
    def attachTo(root: Element): MDCTab = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialTab.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabAdapter = js.native
    val strings: typingsJapgolly.materialTab.constantsMod.strings = js.native
  }
  
}

