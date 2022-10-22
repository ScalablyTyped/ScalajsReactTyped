package typingsJapgolly.rmcTabs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.rmcTabs.anon.OnPanEnd
import typingsJapgolly.rmcTabs.anon.ShowNext
import typingsJapgolly.rmcTabs.libModelsMod.Models.TabData
import typingsJapgolly.rmcTabs.libPropsTypeMod.TabBarPropsType
import typingsJapgolly.rmcTabs.rmcTabsStrings.bottom
import typingsJapgolly.rmcTabs.rmcTabsStrings.left
import typingsJapgolly.rmcTabs.rmcTabsStrings.right
import typingsJapgolly.rmcTabs.rmcTabsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDefaultTabBarMod {
  
  @JSImport("rmc-tabs/lib/DefaultTabBar", "DefaultTabBar")
  @js.native
  open class DefaultTabBar protected () extends PureComponent[PropsType, StateType, Any] {
    def this(props: PropsType) = this()
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MDefaultTabBar(nextProps: PropsType): Unit = js.native
    
    def getTabSize(page: Double, tabLength: Double): Double = js.native
    
    def getTransformByIndex(props: PropsType): ShowNext = js.native
    
    def isTabBarVertical(): Boolean = js.native
    def isTabBarVertical(position: left | right | top | bottom): Boolean = js.native
    
    var layout: HTMLDivElement = js.native
    
    var onPan: OnPanEnd = js.native
    
    def onPress(index: Double): Unit = js.native
    
    def renderTab(t: TabData, i: Double, size: Double, isTabBarVertical: Boolean): Element = js.native
    
    def setContentLayout(div: HTMLDivElement): Unit = js.native
  }
  /* static members */
  object DefaultTabBar {
    
    @JSImport("rmc-tabs/lib/DefaultTabBar", "DefaultTabBar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs/lib/DefaultTabBar", "DefaultTabBar.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    inline def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rmc-tabs/lib/DefaultTabBar", "StateType")
  @js.native
  open class StateType () extends StObject {
    
    var isMoving: js.UndefOr[Boolean] = js.native
    
    var showNext: js.UndefOr[Boolean] = js.native
    
    var showPrev: js.UndefOr[Boolean] = js.native
    
    var transform: js.UndefOr[String] = js.native
  }
  
  trait PropsType
    extends StObject
       with TabBarPropsType {
    
    /** default: rmc-tabs-tab-bar */
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object PropsType {
    
    inline def apply(
      activeTab: Double,
      animated: Boolean,
      goToTab: Double => Callback,
      instanceId: Double,
      tabs: js.Array[TabData]
    ): PropsType = {
      val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], goToTab = js.Any.fromFunction1((t0: Double) => goToTab(t0).runNow()), instanceId = instanceId.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    extension [Self <: PropsType](x: Self) {
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
}
