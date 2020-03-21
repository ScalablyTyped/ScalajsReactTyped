package typingsJapgolly.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialGridList.adapterMod.MDCGridListAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "gridList")
@js.native
object gridList extends js.Object {
  @js.native
  class MDCGridList ()
    extends typingsJapgolly.materialGridList.mod.MDCGridList
  
  @js.native
  class MDCGridListFoundation ()
    extends typingsJapgolly.materialGridList.mod.MDCGridListFoundation
  
  /* static members */
  @js.native
  object MDCGridList extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialGridList.mod.MDCGridList = js.native
  }
  
  /* static members */
  @js.native
  object MDCGridListFoundation extends js.Object {
    val defaultAdapter: MDCGridListAdapter = js.native
    val strings: typingsJapgolly.materialGridList.constantsMod.strings = js.native
  }
  
}

