package typingsJapgolly.materialRipple

import typingsJapgolly.materialRipple.adapterMod.MDCRippleAdapter
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/ripple/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCRippleFoundation
    extends typingsJapgolly.materialBase.foundationMod.default[MDCRippleAdapter] {
    def activate(): Unit = js.native
    def activate(event: Event_): Unit = js.native
    def deactivate(): Unit = js.native
    def deactivate(event: Event_): Unit = js.native
    def layout(): Unit = js.native
    def setUnbounded(unbounded: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCRippleFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typingsJapgolly.materialRipple.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCRippleAdapter = js.native
    val numbers: typingsJapgolly.materialRipple.constantsMod.numbers = js.native
    val strings: typingsJapgolly.materialRipple.constantsMod.strings = js.native
  }
  
}

