package typingsJapgolly.materialGridList

import typingsJapgolly.materialBase.mod.MDCFoundation
import typingsJapgolly.materialGridList.adapterMod.MDCGridListAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/grid-list/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCGridListFoundation extends MDCFoundation[MDCGridListAdapter] {
    def alignCenter(): Unit = js.native
  }
  
  @js.native
  class default () extends MDCGridListFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val defaultAdapter: MDCGridListAdapter = js.native
    val strings: typingsJapgolly.materialGridList.constantsMod.strings = js.native
  }
  
}

