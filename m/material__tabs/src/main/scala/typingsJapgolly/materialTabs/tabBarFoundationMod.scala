package typingsJapgolly.materialTabs

import typingsJapgolly.materialTabs.tabBarAdapterMod.MDCTabBarAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/tabs/tab-bar/foundation", JSImport.Namespace)
@js.native
object tabBarFoundationMod extends js.Object {
  @js.native
  trait MDCTabBarFoundation
    extends typingsJapgolly.materialBase.foundationMod.default[MDCTabBarAdapter] {
    def getActiveTabIndex(): Double = js.native
    def layout(): Unit = js.native
    def switchToTabAtIndex(index: Double, shouldNotify: Boolean): Unit = js.native
  }
  
  @js.native
  class default () extends MDCTabBarFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typingsJapgolly.materialTabs.tabBarConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTabBarAdapter = js.native
    val strings: typingsJapgolly.materialTabs.tabBarConstantsMod.strings = js.native
  }
  
}

