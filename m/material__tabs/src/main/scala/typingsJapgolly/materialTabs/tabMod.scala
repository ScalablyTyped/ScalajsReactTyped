package typingsJapgolly.materialTabs

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialTabs.tabAdapterMod.MDCTabAdapter
import typingsJapgolly.materialTabs.tabFoundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tabs/tab", JSImport.Namespace)
@js.native
object tabMod extends js.Object {
  @js.native
  class MDCTab ()
    extends typingsJapgolly.materialBase.componentMod.default[MDCTabAdapter, default] {
    val computedLeft: Double = js.native
    val computedWidth: Double = js.native
    var isActive: Boolean = js.native
    var preventDefaultOnClick: Boolean = js.native
    def measureSelf(): Unit = js.native
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
    val cssClasses: typingsJapgolly.materialTabs.tabConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabAdapter = js.native
    val strings: typingsJapgolly.materialTabs.tabConstantsMod.strings = js.native
  }
  
}

