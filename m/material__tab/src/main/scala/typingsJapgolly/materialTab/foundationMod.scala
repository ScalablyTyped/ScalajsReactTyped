package typingsJapgolly.materialTab

import typingsJapgolly.materialTab.adapterMod.MDCTabAdapter
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tab/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCTabFoundation
    extends typingsJapgolly.materialBase.foundationMod.default[MDCTabAdapter] {
    /**
      * Activates the Tab
      */
    def activate(): Unit = js.native
    /**
      * Deactivates the Tab
      */
    def deactivate(): Unit = js.native
    def handleTransitionEnd(evt: Event_): Unit = js.native
    /**
      * Returns the Tab's active state
      */
    def isActive(): Boolean = js.native
  }
  
  @js.native
  class default () extends MDCTabFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typingsJapgolly.materialTab.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabAdapter = js.native
    val strings: typingsJapgolly.materialTab.constantsMod.strings = js.native
  }
  
}

