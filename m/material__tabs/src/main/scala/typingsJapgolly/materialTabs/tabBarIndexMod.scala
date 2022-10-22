package typingsJapgolly.materialTabs

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialTabs.anon.CHANGEEVENT
import typingsJapgolly.materialTabs.anon.PartialMDCTabBarAdapter
import typingsJapgolly.materialTabs.anon.UPGRADED
import typingsJapgolly.materialTabs.tabBarAdapterMod.MDCTabBarAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarIndexMod {
  
  @JSImport("@material/tabs/tab-bar/index", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.materialTabs.tabBarFoundationMod.default {
    def this(adapter: PartialMDCTabBarAdapter) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@material/tabs/tab-bar/index", "default.cssClasses")
    @js.native
    val cssClasses: UPGRADED = js.native
    
    @JSImport("@material/tabs/tab-bar/index", "default.defaultAdapter")
    @js.native
    val defaultAdapter: MDCTabBarAdapter = js.native
    
    @JSImport("@material/tabs/tab-bar/index", "default.strings")
    @js.native
    val strings: CHANGEEVENT = js.native
  }
  
  @JSImport("@material/tabs/tab-bar/index", "MDCTabBar")
  @js.native
  open class MDCTabBar protected ()
    extends typingsJapgolly.materialTabs.tabBarComponentMod.MDCTabBar {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typingsJapgolly.materialTabs.tabBarFoundationMod.MDCTabBarFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCTabBar {
    
    @JSImport("@material/tabs/tab-bar/index", "MDCTabBar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialTabs.tabBarComponentMod.MDCTabBar = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialTabs.tabBarComponentMod.MDCTabBar]
  }
  
  @JSImport("@material/tabs/tab-bar/index", "MDCTabBarFoundation")
  @js.native
  open class MDCTabBarFoundation ()
    extends typingsJapgolly.materialTabs.tabBarFoundationMod.MDCTabBarFoundation {
    def this(adapter: PartialMDCTabBarAdapter) = this()
  }
  /* static members */
  object MDCTabBarFoundation {
    
    @JSImport("@material/tabs/tab-bar/index", "MDCTabBarFoundation.cssClasses")
    @js.native
    val cssClasses: UPGRADED = js.native
    
    @JSImport("@material/tabs/tab-bar/index", "MDCTabBarFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCTabBarAdapter = js.native
    
    @JSImport("@material/tabs/tab-bar/index", "MDCTabBarFoundation.strings")
    @js.native
    val strings: CHANGEEVENT = js.native
  }
  
  object tabBarCssClasses {
    
    @JSImport("@material/tabs/tab-bar/index", "tabBarCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs/tab-bar/index", "tabBarCssClasses.UPGRADED")
    @js.native
    def UPGRADED: String = js.native
    inline def UPGRADED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPGRADED")(x.asInstanceOf[js.Any])
  }
  
  object tabBarStrings {
    
    @JSImport("@material/tabs/tab-bar/index", "tabBarStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/tabs/tab-bar/index", "tabBarStrings.CHANGE_EVENT")
    @js.native
    def CHANGE_EVENT: String = js.native
    inline def CHANGE_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHANGE_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs/tab-bar/index", "tabBarStrings.INDICATOR_SELECTOR")
    @js.native
    def INDICATOR_SELECTOR: String = js.native
    inline def INDICATOR_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDICATOR_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/tabs/tab-bar/index", "tabBarStrings.TAB_SELECTOR")
    @js.native
    def TAB_SELECTOR: String = js.native
    inline def TAB_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
