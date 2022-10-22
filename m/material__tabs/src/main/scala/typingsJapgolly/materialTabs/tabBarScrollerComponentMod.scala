package typingsJapgolly.materialTabs

import org.scalajs.dom.HTMLElement
import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialBase.componentMod.MDCComponent
import typingsJapgolly.materialTabs.tabBarComponentMod.MDCTabBar
import typingsJapgolly.materialTabs.tabBarComponentMod.MDCTabBarFactory
import typingsJapgolly.materialTabs.tabBarScrollerFoundationMod.MDCTabBarScrollerFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarScrollerComponentMod {
  
  @JSImport("@material/tabs/tab-bar-scroller/component", "MDCTabBarScroller")
  @js.native
  open class MDCTabBarScroller protected () extends MDCComponent[MDCTabBarScrollerFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCTabBarScrollerFoundation, args: Any*) = this()
    
    def initialize(): Unit = js.native
    def initialize(tabBarFactory: MDCTabBarFactory): Unit = js.native
    
    def layout(): Unit = js.native
    
    /* protected */ var root_ : HTMLElement = js.native
    
    val tabBar: MDCTabBar = js.native
  }
  /* static members */
  object MDCTabBarScroller {
    
    @JSImport("@material/tabs/tab-bar-scroller/component", "MDCTabBarScroller")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): MDCTabBarScroller = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCTabBarScroller]
  }
}
