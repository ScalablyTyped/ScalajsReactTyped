package typingsJapgolly.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialList.adapterMod.MDCListAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "list")
@js.native
object list extends js.Object {
  @js.native
  class MDCList protected ()
    extends typingsJapgolly.materialList.mod.MDCList {
    def this(args: js.Any*) = this()
  }
  
  @js.native
  class MDCListFoundation protected ()
    extends typingsJapgolly.materialList.mod.MDCListFoundation {
    def this(adapter: MDCListAdapter) = this()
  }
  
  /* static members */
  @js.native
  object MDCList extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialList.mod.MDCList = js.native
  }
  
  /* static members */
  @js.native
  object MDCListFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialList.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCListAdapter = js.native
    val strings: typingsJapgolly.materialList.constantsMod.strings = js.native
  }
  
}

