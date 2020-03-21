package typingsJapgolly.materialTabs

import typingsJapgolly.materialTabs.adapterMod.MDCTabBarScrollerAdapter
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tabs/tab-bar-scroller/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCTabBarScrollerFoundation
    extends typingsJapgolly.materialBase.foundationMod.default[MDCTabBarScrollerAdapter] {
    def layout(): Unit = js.native
    def scrollBack(): Unit = js.native
    def scrollBack(evt: Event_): Unit = js.native
    def scrollForward(): Unit = js.native
    def scrollForward(evt: Event_): Unit = js.native
    def scrollToTabAtIndex(index: Double): Unit = js.native
  }
  
  @js.native
  class default () extends MDCTabBarScrollerFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typingsJapgolly.materialTabs.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabBarScrollerAdapter = js.native
    val strings: typingsJapgolly.materialTabs.constantsMod.strings = js.native
  }
  
}

