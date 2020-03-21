package typingsJapgolly.materialGridList

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialBase.mod.MDCComponent
import typingsJapgolly.materialGridList.adapterMod.MDCGridListAdapter
import typingsJapgolly.materialGridList.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/grid-list", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCGridList () extends MDCComponent[MDCGridListAdapter, default]
  
  @js.native
  class MDCGridListFoundation () extends default
  
  /* static members */
  @js.native
  object MDCGridList extends js.Object {
    def attachTo(root: Element): MDCGridList = js.native
  }
  
  /* static members */
  @js.native
  object MDCGridListFoundation extends js.Object {
    val defaultAdapter: MDCGridListAdapter = js.native
    val strings: typingsJapgolly.materialGridList.constantsMod.strings = js.native
  }
  
}

