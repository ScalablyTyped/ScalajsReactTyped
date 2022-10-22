package typingsJapgolly.materialTabs

import org.scalajs.dom.HTMLElement
import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialBase.componentMod.MDCComponent
import typingsJapgolly.materialTabs.tabBarFoundationMod.MDCTabBarFoundation
import typingsJapgolly.materialTabs.tabComponentMod.MDCTab
import typingsJapgolly.materialTabs.tabComponentMod.MDCTabFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarComponentMod {
  
  @JSImport("@material/tabs/tab-bar/component", "MDCTabBar")
  @js.native
  open class MDCTabBar protected () extends MDCComponent[MDCTabBarFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCTabBarFoundation, args: Any*) = this()
    
    var activeTab: MDCTab = js.native
    
    var activeTabIndex: Double = js.native
    
    def initialize(): Unit = js.native
    def initialize(tabFactory: MDCTabFactory): Unit = js.native
    
    def layout(): Unit = js.native
    
    /* protected */ var root_ : HTMLElement = js.native
    
    val tabs: js.Array[MDCTab] = js.native
  }
  /* static members */
  object MDCTabBar {
    
    @JSImport("@material/tabs/tab-bar/component", "MDCTabBar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): MDCTabBar = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCTabBar]
  }
  
  type MDCTabBarFactory = js.Function2[
    /* el */ org.scalajs.dom.Element, 
    /* foundation */ js.UndefOr[MDCTabBarFoundation], 
    MDCTabBar
  ]
}
