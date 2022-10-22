package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.anon.Animated
import typingsJapgolly.antDesignReactNative.anon.TypeofDefaultTabBar
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.horizontal
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.vertical
import typingsJapgolly.antDesignReactNative.libCarouselMod.default
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.antDesignReactNative.libTabsPropsTypeMod.PropsType
import typingsJapgolly.antDesignReactNative.libTabsPropsTypeMod.TabData
import typingsJapgolly.antDesignReactNative.libTabsStyleTabsMod.TabsStyle
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTabsTabsMod {
  
  @JSImport("@ant-design/react-native/lib/tabs/Tabs", "Tabs")
  @js.native
  open class Tabs protected () extends PureComponent[TabsProps, StateType, Any] {
    def this(props: PropsType) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MTabs(nextProps: PropsType): Unit = js.native
    
    var carousel: default | Null = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MTabs(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTabs(): Unit = js.native
    
    def getOffsetIndex(current: Double, width: Double): Double = js.native
    def getOffsetIndex(current: Double, width: Double, threshold: Double): Double = js.native
    
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[Any]]
    ): Any = js.native
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[Any]],
      defaultPrefix: String
    ): Any = js.native
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[Any]],
      defaultPrefix: String,
      allPrefix: String
    ): Any = js.native
    def getSubElement(
      tab: TabData,
      index: Double,
      subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[Any]],
      defaultPrefix: Unit,
      allPrefix: String
    ): Any = js.native
    
    def getSubElements(): js.Function1[/* defaultPrefix */ js.UndefOr[String], StringDictionary[Node]] = js.native
    
    def getTabBarBaseProps(): Animated = js.native
    
    def getTabIndex(props: PropsType): Double = js.native
    
    def goToTab(index: Double): Unit = js.native
    
    def handleLayout1(e: LayoutChangeEvent): Unit = js.native
    
    def handleLayout2(e: LayoutChangeEvent): Unit = js.native
    
    /* protected */ var instanceId: Double = js.native
    
    def isTabVertical(): Boolean = js.native
    def isTabVertical(direction: vertical | horizontal): Boolean = js.native
    
    /* protected */ var prevCurrentTab: Double = js.native
    
    def renderContent(): Element = js.native
    def renderContent(getSubElements: js.Function1[/* defaultPrefix */ js.UndefOr[String], StringDictionary[Node]]): Element = js.native
    
    def renderTabBar(tabBarProps: Any, DefaultTabBar: ComponentClassP[js.Object]): Node = js.native
    
    def scrollTo(index: Double): Unit = js.native
    def scrollTo(index: Double, animated: Boolean): Unit = js.native
    
    def shouldRenderTab(idx: Double): Boolean = js.native
    
    /* protected */ var tabCache: NumberDictionary[Node] = js.native
    
    def tabClickGoToTab(index: Double): Unit = js.native
  }
  /* static members */
  object Tabs {
    
    @JSImport("@ant-design/react-native/lib/tabs/Tabs", "Tabs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/tabs/Tabs", "Tabs.DefaultTabBar")
    @js.native
    def DefaultTabBar: TypeofDefaultTabBar = js.native
    inline def DefaultTabBar_=(x: TypeofDefaultTabBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTabBar")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/tabs/Tabs", "Tabs.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    inline def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait StateType extends StObject {
    
    var containerHeight: Double
    
    var containerWidth: Double
    
    var currentTab: Double
    
    var scrollValue: Value
    
    var scrollX: Value
    
    var selectedIndex: Double
  }
  object StateType {
    
    inline def apply(
      containerHeight: Double,
      containerWidth: Double,
      currentTab: Double,
      scrollValue: Value,
      scrollX: Value,
      selectedIndex: Double
    ): StateType = {
      val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], currentTab = currentTab.asInstanceOf[js.Any], scrollValue = scrollValue.asInstanceOf[js.Any], scrollX = scrollX.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateType]
    }
    
    extension [Self <: StateType](x: Self) {
      
      inline def setContainerHeight(value: Double): Self = StObject.set(x, "containerHeight", value.asInstanceOf[js.Any])
      
      inline def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      inline def setCurrentTab(value: Double): Self = StObject.set(x, "currentTab", value.asInstanceOf[js.Any])
      
      inline def setScrollValue(value: Value): Self = StObject.set(x, "scrollValue", value.asInstanceOf[js.Any])
      
      inline def setScrollX(value: Value): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabsProps
    extends StObject
       with PropsType
       with WithThemeStyles[TabsStyle]
  object TabsProps {
    
    inline def apply(tabs: js.Array[TabData]): TabsProps = {
      val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsProps]
    }
  }
}
