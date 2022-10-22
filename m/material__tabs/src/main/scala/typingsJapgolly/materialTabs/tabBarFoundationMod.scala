package typingsJapgolly.materialTabs

import typingsJapgolly.materialBase.foundationMod.MDCFoundation
import typingsJapgolly.materialTabs.anon.CHANGEEVENT
import typingsJapgolly.materialTabs.anon.PartialMDCTabBarAdapter
import typingsJapgolly.materialTabs.anon.UPGRADED
import typingsJapgolly.materialTabs.tabBarAdapterMod.MDCTabBarAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarFoundationMod {
  
  @JSImport("@material/tabs/tab-bar/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCTabBarFoundation {
    def this(adapter: PartialMDCTabBarAdapter) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@material/tabs/tab-bar/foundation", "default.cssClasses")
    @js.native
    val cssClasses: UPGRADED = js.native
    
    @JSImport("@material/tabs/tab-bar/foundation", "default.defaultAdapter")
    @js.native
    val defaultAdapter: MDCTabBarAdapter = js.native
    
    @JSImport("@material/tabs/tab-bar/foundation", "default.strings")
    @js.native
    val strings: CHANGEEVENT = js.native
  }
  
  @JSImport("@material/tabs/tab-bar/foundation", "MDCTabBarFoundation")
  @js.native
  open class MDCTabBarFoundation () extends MDCFoundation[MDCTabBarAdapter] {
    def this(adapter: PartialMDCTabBarAdapter) = this()
    
    def getActiveTabIndex(): Double = js.native
    
    def layout(): Unit = js.native
    
    def switchToTabAtIndex(index: Double, shouldNotify: Boolean): Unit = js.native
  }
  /* static members */
  object MDCTabBarFoundation {
    
    @JSImport("@material/tabs/tab-bar/foundation", "MDCTabBarFoundation.cssClasses")
    @js.native
    val cssClasses: UPGRADED = js.native
    
    @JSImport("@material/tabs/tab-bar/foundation", "MDCTabBarFoundation.defaultAdapter")
    @js.native
    val defaultAdapter: MDCTabBarAdapter = js.native
    
    @JSImport("@material/tabs/tab-bar/foundation", "MDCTabBarFoundation.strings")
    @js.native
    val strings: CHANGEEVENT = js.native
  }
}
