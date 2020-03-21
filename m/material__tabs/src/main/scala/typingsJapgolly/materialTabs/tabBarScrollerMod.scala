package typingsJapgolly.materialTabs

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialTabs.adapterMod.MDCTabBarScrollerAdapter
import typingsJapgolly.materialTabs.foundationMod.default
import typingsJapgolly.materialTabs.tabBarMod.MDCTabBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tabs/tab-bar-scroller", JSImport.Namespace)
@js.native
object tabBarScrollerMod extends js.Object {
  @js.native
  class MDCTabBarScroller ()
    extends typingsJapgolly.materialBase.componentMod.default[MDCTabBarScrollerAdapter, default] {
    val tabBar: MDCTabBar = js.native
    def initialize(): Unit = js.native
    def initialize(tabBarFactory: js.Function1[/* root */ Element, MDCTabBar]): Unit = js.native
    def layout(): Unit = js.native
  }
  
  @js.native
  class MDCTabBarScrollerFoundation () extends default
  
  /* static members */
  @js.native
  object MDCTabBarScroller extends js.Object {
    def attachTo(root: Element): MDCTabBarScroller = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabBarScrollerFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialTabs.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabBarScrollerAdapter = js.native
    val strings: typingsJapgolly.materialTabs.constantsMod.strings = js.native
  }
  
}

