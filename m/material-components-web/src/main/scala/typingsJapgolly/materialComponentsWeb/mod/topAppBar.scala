package typingsJapgolly.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialTopAppBar.adapterMod.MDCTopAppBarAdapter
import typingsJapgolly.materialTopAppBar.materialTopAppBarMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "topAppBar")
@js.native
object topAppBar extends js.Object {
  @js.native
  class MDCFixedTopAppBarFoundation () extends default
  
  @js.native
  class MDCShortTopAppBarFoundation () extends default
  
  @js.native
  class MDCTopAppBar ()
    extends typingsJapgolly.materialTopAppBar.mod.MDCTopAppBar
  
  @js.native
  class MDCTopAppBarBaseFoundation ()
    extends typingsJapgolly.materialTopAppBar.mod.MDCTopAppBarBaseFoundation
  
  @js.native
  class MDCTopAppBarFoundation () extends default
  
  /* static members */
  @js.native
  object MDCTopAppBar extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialTopAppBar.mod.MDCTopAppBar = js.native
  }
  
  /* static members */
  @js.native
  object MDCTopAppBarBaseFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialTopAppBar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTopAppBarAdapter = js.native
    val numbers: typingsJapgolly.materialTopAppBar.constantsMod.numbers = js.native
    val strings: typingsJapgolly.materialTopAppBar.constantsMod.strings = js.native
  }
  
}

