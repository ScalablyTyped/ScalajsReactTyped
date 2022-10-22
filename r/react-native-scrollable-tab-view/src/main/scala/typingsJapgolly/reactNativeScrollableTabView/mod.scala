package typingsJapgolly.reactNativeScrollableTabView

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.ScrollViewProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeScrollableTabView.anon.ActiveTab
import typingsJapgolly.reactNativeScrollableTabView.anon.TabBarPropsDefaultTabBarP
import typingsJapgolly.reactNativeScrollableTabView.anon.TabBarPropsScrollableTabB
import typingsJapgolly.reactNativeScrollableTabView.anon.TabLabel
import typingsJapgolly.reactNativeScrollableTabView.reactNativeScrollableTabViewBooleans.`false`
import typingsJapgolly.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.bottom
import typingsJapgolly.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.overlayBottom
import typingsJapgolly.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.overlayTop
import typingsJapgolly.reactNativeScrollableTabView.reactNativeScrollableTabViewStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-scrollable-tab-view", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ScrollableTabViewProperties, js.Object, Any]
  
  @JSImport("react-native-scrollable-tab-view", "DefaultTabBar")
  @js.native
  open class DefaultTabBar protected ()
    extends Component[TabBarPropsDefaultTabBarP, js.Object, Any] {
    def this(props: TabBarPropsDefaultTabBarP) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabBarPropsDefaultTabBarP, context: Any) = this()
  }
  
  @JSImport("react-native-scrollable-tab-view", "ScrollableTabBar")
  @js.native
  open class ScrollableTabBar protected ()
    extends Component[TabBarPropsScrollableTabB, js.Object, Any] {
    def this(props: TabBarPropsScrollableTabB) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabBarPropsScrollableTabB, context: Any) = this()
  }
  
  trait ChangeTabProperties extends StObject {
    
    // previousPage
    var from: Double
    
    // currentPage
    var i: Double
    
    // currentPage object
    var ref: Element
  }
  object ChangeTabProperties {
    
    inline def apply(from: Double, i: Double, ref: VdomElement): ChangeTabProperties = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], ref = ref.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeTabProperties]
    }
    
    extension [Self <: ChangeTabProperties](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setRef(value: VdomElement): Self = StObject.set(x, "ref", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultTabBarProps extends StObject {
    
    var activeTextColor: js.UndefOr[String] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var inactiveTextColor: js.UndefOr[String] = js.undefined
    
    var renderTab: js.UndefOr[RenderTabProperties] = js.undefined
    
    var style: js.UndefOr[ViewStyle] = js.undefined
    
    var tabStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var textStyle: js.UndefOr[TextStyle] = js.undefined
    
    var underlineStyle: js.UndefOr[ViewStyle] = js.undefined
  }
  object DefaultTabBarProps {
    
    inline def apply(): DefaultTabBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultTabBarProps]
    }
    
    extension [Self <: DefaultTabBarProps](x: Self) {
      
      inline def setActiveTextColor(value: String): Self = StObject.set(x, "activeTextColor", value.asInstanceOf[js.Any])
      
      inline def setActiveTextColorUndefined: Self = StObject.set(x, "activeTextColor", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setInactiveTextColor(value: String): Self = StObject.set(x, "inactiveTextColor", value.asInstanceOf[js.Any])
      
      inline def setInactiveTextColorUndefined: Self = StObject.set(x, "inactiveTextColor", js.undefined)
      
      inline def setRenderTab(
        value: (/* name */ String, /* pageIndex */ Double, /* isTabActive */ Boolean, /* onPressHandler */ js.Function1[/* pageNumber */ Double, Unit], /* onLayoutHandler */ js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]) => Element
      ): Self = StObject.set(x, "renderTab", js.Any.fromFunction5(value))
      
      inline def setRenderTabUndefined: Self = StObject.set(x, "renderTab", js.undefined)
      
      inline def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabStyle(value: ViewStyle): Self = StObject.set(x, "tabStyle", value.asInstanceOf[js.Any])
      
      inline def setTabStyleUndefined: Self = StObject.set(x, "tabStyle", js.undefined)
      
      inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setUnderlineStyle(value: ViewStyle): Self = StObject.set(x, "underlineStyle", value.asInstanceOf[js.Any])
      
      inline def setUnderlineStyleUndefined: Self = StObject.set(x, "underlineStyle", js.undefined)
    }
  }
  
  type RenderTabProperties = js.Function5[
    /* name */ String, 
    /* pageIndex */ Double, 
    /* isTabActive */ Boolean, 
    /* onPressHandler */ js.Function1[/* pageNumber */ Double, Unit], 
    /* onLayoutHandler */ js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]], 
    Element
  ]
  
  trait ScrollableTabBarProps
    extends StObject
       with DefaultTabBarProps {
    
    var scrollOffset: js.UndefOr[Double] = js.undefined
    
    var tabsContainerStyle: js.UndefOr[ViewStyle] = js.undefined
  }
  object ScrollableTabBarProps {
    
    inline def apply(): ScrollableTabBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollableTabBarProps]
    }
    
    extension [Self <: ScrollableTabBarProps](x: Self) {
      
      inline def setScrollOffset(value: Double): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
      
      inline def setScrollOffsetUndefined: Self = StObject.set(x, "scrollOffset", js.undefined)
      
      inline def setTabsContainerStyle(value: ViewStyle): Self = StObject.set(x, "tabsContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setTabsContainerStyleUndefined: Self = StObject.set(x, "tabsContainerStyle", js.undefined)
    }
  }
  
  type ScrollableTabView = japgolly.scalajs.react.facade.React.Component[ScrollableTabViewProperties & js.Object, js.Object]
  
  trait ScrollableTabViewProperties extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * props that are applied to root ScrollView/ViewPagerAndroid.
      * Note that overriding defaults set by the library may break functionality; see the source for details.
      */
    var contentProps: js.UndefOr[ScrollViewProps] = js.undefined
    
    /**
      * the index of the initially selected tab, defaults to 0 === first tab
      */
    var initialPage: js.UndefOr[Double] = js.undefined
    
    /**
      * disables horizontal dragging to scroll between tabs, default is false.
      */
    var locked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * function to call when tab changes, should accept 1 argument which is
      * an Object containing two keys: i: the index of the tab that is selected, ref: the ref of the
      * tab that is selected
      */
    var onChangeTab: js.UndefOr[js.Function1[/* value */ ChangeTabProperties, Unit]] = js.undefined
    
    /**
      * function to call when the pages are sliding,
      * should accept 1 argument which is an Float number representing the page position in the slide frame.
      */
    var onScroll: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    /**
      * set selected tab(can be buggy see
      * https://github.com/skv-headless/react-native-scrollable-tab-view/issues/126
      */
    var page: js.UndefOr[Double] = js.undefined
    
    /**
      * pre-render nearby # sibling, Infinity === render all
      * the siblings, default to 0 === render current page.
      */
    var prerenderingSiblingsNumber: js.UndefOr[Double] = js.undefined
    
    var ref: js.UndefOr[
        LegacyRef[
          japgolly.scalajs.react.facade.React.Component[ScrollableTabViewProperties & js.Object, js.Object]
        ]
      ] = js.undefined
    
    /**
      * accept 1 argument props and should return a component
      * to use as the tab bar. The component has goToPage, tabs, activeTab and ref added to the props,
      * and should implement setAnimationValue to be able to animate itself along with the tab content.
      * You can manually pass the props to the TabBar component.
      */
    var renderTabBar: js.UndefOr[
        (js.Function1[/* props */ typingsJapgolly.reactNativeScrollableTabView.anon.TabBarProps, Element]) | `false`
      ] = js.undefined
    
    /**
      * on tab press change tab without animation.
      */
    var scrollWithoutAnimation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * style (View.propTypes.style)
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * color of the default tab bar's text when active, defaults to navy
      */
    var tabBarActiveTextColor: js.UndefOr[String] = js.undefined
    
    /**
      * color of the default tab bar's background, defaults to white
      */
    var tabBarBackgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * color of the default tab bar's text when inactive, defaults to black
      */
    var tabBarInactiveTextColor: js.UndefOr[String] = js.undefined
    
    /**
      * Defaults to "top".
      * "bottom" to position the tab bar below content.
      * "overlayTop" or "overlayBottom" for a semitransparent tab bar that overlays content. Custom
      * tab bars must consume a style prop on their outer element to support this feature: style={this.props.style}.
      */
    var tabBarPosition: js.UndefOr[top | bottom | overlayTop | overlayBottom] = js.undefined
    
    /**
      * additional styles to the tab bar's text
      */
    var tabBarTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    /**
      * style of the default tab bar's underline
      */
    var tabBarUnderlineStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object ScrollableTabViewProperties {
    
    inline def apply(): ScrollableTabViewProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollableTabViewProperties]
    }
    
    extension [Self <: ScrollableTabViewProperties](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContentProps(value: ScrollViewProps): Self = StObject.set(x, "contentProps", value.asInstanceOf[js.Any])
      
      inline def setContentPropsUndefined: Self = StObject.set(x, "contentProps", js.undefined)
      
      inline def setInitialPage(value: Double): Self = StObject.set(x, "initialPage", value.asInstanceOf[js.Any])
      
      inline def setInitialPageUndefined: Self = StObject.set(x, "initialPage", js.undefined)
      
      inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
      
      inline def setOnChangeTab(value: /* value */ ChangeTabProperties => Callback): Self = StObject.set(x, "onChangeTab", js.Any.fromFunction1((t0: /* value */ ChangeTabProperties) => value(t0).runNow()))
      
      inline def setOnChangeTabUndefined: Self = StObject.set(x, "onChangeTab", js.undefined)
      
      inline def setOnScroll(value: /* value */ Double => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setPrerenderingSiblingsNumber(value: Double): Self = StObject.set(x, "prerenderingSiblingsNumber", value.asInstanceOf[js.Any])
      
      inline def setPrerenderingSiblingsNumberUndefined: Self = StObject.set(x, "prerenderingSiblingsNumber", js.undefined)
      
      inline def setRef(
        value: LegacyRef[
              japgolly.scalajs.react.facade.React.Component[ScrollableTabViewProperties & js.Object, js.Object]
            ]
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(
        value: (japgolly.scalajs.react.facade.React.Component[ScrollableTabViewProperties & js.Object, js.Object]) | Null => Callback
      ): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: (japgolly.scalajs.react.facade.React.Component[ScrollableTabViewProperties & js.Object, js.Object]) | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRenderTabBar(
        value: (js.Function1[/* props */ typingsJapgolly.reactNativeScrollableTabView.anon.TabBarProps, Element]) | `false`
      ): Self = StObject.set(x, "renderTabBar", value.asInstanceOf[js.Any])
      
      inline def setRenderTabBarFunction1(value: /* props */ typingsJapgolly.reactNativeScrollableTabView.anon.TabBarProps => Element): Self = StObject.set(x, "renderTabBar", js.Any.fromFunction1(value))
      
      inline def setRenderTabBarUndefined: Self = StObject.set(x, "renderTabBar", js.undefined)
      
      inline def setScrollWithoutAnimation(value: Boolean): Self = StObject.set(x, "scrollWithoutAnimation", value.asInstanceOf[js.Any])
      
      inline def setScrollWithoutAnimationUndefined: Self = StObject.set(x, "scrollWithoutAnimation", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabBarActiveTextColor(value: String): Self = StObject.set(x, "tabBarActiveTextColor", value.asInstanceOf[js.Any])
      
      inline def setTabBarActiveTextColorUndefined: Self = StObject.set(x, "tabBarActiveTextColor", js.undefined)
      
      inline def setTabBarBackgroundColor(value: String): Self = StObject.set(x, "tabBarBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setTabBarBackgroundColorUndefined: Self = StObject.set(x, "tabBarBackgroundColor", js.undefined)
      
      inline def setTabBarInactiveTextColor(value: String): Self = StObject.set(x, "tabBarInactiveTextColor", value.asInstanceOf[js.Any])
      
      inline def setTabBarInactiveTextColorUndefined: Self = StObject.set(x, "tabBarInactiveTextColor", js.undefined)
      
      inline def setTabBarPosition(value: top | bottom | overlayTop | overlayBottom): Self = StObject.set(x, "tabBarPosition", value.asInstanceOf[js.Any])
      
      inline def setTabBarPositionUndefined: Self = StObject.set(x, "tabBarPosition", js.undefined)
      
      inline def setTabBarTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "tabBarTextStyle", value.asInstanceOf[js.Any])
      
      inline def setTabBarTextStyleNull: Self = StObject.set(x, "tabBarTextStyle", null)
      
      inline def setTabBarTextStyleUndefined: Self = StObject.set(x, "tabBarTextStyle", js.undefined)
      
      inline def setTabBarUnderlineStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabBarUnderlineStyle", value.asInstanceOf[js.Any])
      
      inline def setTabBarUnderlineStyleNull: Self = StObject.set(x, "tabBarUnderlineStyle", null)
      
      inline def setTabBarUnderlineStyleUndefined: Self = StObject.set(x, "tabBarUnderlineStyle", js.undefined)
    }
  }
  
  type TabBarProps[T] = T & ActiveTab
  
  type TabProps[T] = T & TabLabel
}
