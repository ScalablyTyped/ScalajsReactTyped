package typingsJapgolly.materialTopAppBar

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialRipple.mod.MDCRipple
import typingsJapgolly.materialTopAppBar.adapterMod.MDCTopAppBarAdapter
import typingsJapgolly.materialTopAppBar.materialTopAppBarMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/top-app-bar", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCFixedTopAppBarFoundation () extends default
  
  @js.native
  class MDCShortTopAppBarFoundation () extends default
  
  @js.native
  class MDCTopAppBar ()
    extends typingsJapgolly.materialBase.componentMod.default[
          MDCTopAppBarAdapter, 
          typingsJapgolly.materialTopAppBar.standardFoundationMod.default
        ] {
    def initialize(): Unit = js.native
    def initialize(rippleFactory: js.Function1[/* el */ Element, MDCRipple]): Unit = js.native
  }
  
  @js.native
  class MDCTopAppBarBaseFoundation () extends default
  
  @js.native
  class MDCTopAppBarFoundation () extends default
  
  /* static members */
  @js.native
  object MDCTopAppBar extends js.Object {
    def attachTo(root: Element): MDCTopAppBar = js.native
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

