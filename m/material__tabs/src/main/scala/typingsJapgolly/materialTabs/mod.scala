package typingsJapgolly.materialTabs

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialTabs.adapterMod.MDCTabBarScrollerAdapter
import typingsJapgolly.materialTabs.tabAdapterMod.MDCTabAdapter
import typingsJapgolly.materialTabs.tabBarAdapterMod.MDCTabBarAdapter
import typingsJapgolly.materialTabs.tabBarFoundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tabs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCTab ()
    extends typingsJapgolly.materialTabs.tabMod.MDCTab
  
  @js.native
  class MDCTabBar ()
    extends typingsJapgolly.materialTabs.tabBarMod.MDCTabBar
  
  @js.native
  class MDCTabBarFoundation () extends default
  
  @js.native
  class MDCTabBarScroller ()
    extends typingsJapgolly.materialTabs.tabBarScrollerMod.MDCTabBarScroller
  
  @js.native
  class MDCTabBarScrollerFoundation ()
    extends typingsJapgolly.materialTabs.foundationMod.default
  
  @js.native
  class MDCTabFoundation ()
    extends typingsJapgolly.materialTabs.tabFoundationMod.default
  
  /* static members */
  @js.native
  object MDCTab extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialTabs.tabMod.MDCTab = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabBar extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialTabs.tabBarMod.MDCTabBar = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabBarFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialTabs.tabBarConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabBarAdapter = js.native
    val strings: typingsJapgolly.materialTabs.tabBarConstantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabBarScroller extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialTabs.tabBarScrollerMod.MDCTabBarScroller = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabBarScrollerFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialTabs.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabBarScrollerAdapter = js.native
    val strings: typingsJapgolly.materialTabs.constantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCTabFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialTabs.tabConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabAdapter = js.native
    val strings: typingsJapgolly.materialTabs.tabConstantsMod.strings = js.native
  }
  
}

