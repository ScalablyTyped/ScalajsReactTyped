package typingsJapgolly.antDesignReactNative.tabsTabsMod

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.antDesignReactNative.AnonAnimated
import typingsJapgolly.antDesignReactNative.AnonComponent
import typingsJapgolly.antDesignReactNative.TypeofDefaultTabBar
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.horizontal
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.vertical
import typingsJapgolly.antDesignReactNative.tabsPropsTypeMod.PropsType
import typingsJapgolly.antDesignReactNative.tabsPropsTypeMod.TabData
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNativeCommunityViewpager.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/tabs/Tabs", "Tabs")
@js.native
class Tabs protected ()
  extends Component[TabsProps, StateType, js.Any] {
  def this(props: PropsType) = this()
  var instanceId: Double = js.native
  /** compatible for different between react and preact in `setState`. */
  var nextCurrentTab: js.Any = js.native
  var prevCurrentTab: Double = js.native
  var scrollView: AnonComponent = js.native
  var tabCache: NumberDictionary[Node] = js.native
  var viewPager: default | Null = js.native
  @JSName("componentDidMount")
  def componentDidMount_MTabs(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTabs(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MTabs(nextProps: PropsType): Unit = js.native
  def getOffsetIndex(current: Double, width: Double): Double = js.native
  def getOffsetIndex(current: Double, width: Double, threshold: Double): Double = js.native
  def getSubElement(
    tab: TabData,
    index: Double,
    subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[_]]
  ): js.Any = js.native
  def getSubElement(
    tab: TabData,
    index: Double,
    subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[_]],
    defaultPrefix: String
  ): js.Any = js.native
  def getSubElement(
    tab: TabData,
    index: Double,
    subElements: js.Function2[/* defaultPrefix */ String, /* allPrefix */ String, StringDictionary[_]],
    defaultPrefix: String,
    allPrefix: String
  ): js.Any = js.native
  def getSubElements(): js.Function2[
    /* defaultPrefix */ js.UndefOr[String], 
    /* allPrefix */ js.UndefOr[String], 
    StringDictionary[Node]
  ] = js.native
  def getTabBarBaseProps(): AnonAnimated = js.native
  def getTabIndex(props: PropsType): Double = js.native
  def goToTab(index: Double): Boolean = js.native
  def goToTab(index: Double, force: Boolean): Boolean = js.native
  def goToTab(index: Double, force: Boolean, newState: js.Any): Boolean = js.native
  def handleLayout(e: LayoutChangeEvent): Unit = js.native
  def isTabVertical(): Boolean = js.native
  @JSName("isTabVertical")
  def isTabVertical_horizontal(direction: horizontal): Boolean = js.native
  @JSName("isTabVertical")
  def isTabVertical_vertical(direction: vertical): Boolean = js.native
  def onMomentumScrollEnd(e: ReactEventFrom[NodeHandle with Element]): Unit = js.native
  def renderContent(): japgolly.scalajs.react.raw.React.Element = js.native
  def renderContent(
    getSubElements: js.Function2[
      /* defaultPrefix */ js.UndefOr[String], 
      /* allPrefix */ js.UndefOr[String], 
      StringDictionary[Node]
    ]
  ): japgolly.scalajs.react.raw.React.Element = js.native
  def renderTabBar(tabBarProps: js.Any, DefaultTabBar: ComponentClassP[js.Object]): js.UndefOr[js.Object | Null] = js.native
  def scrollTo(index: Double): Unit = js.native
  def scrollTo(index: Double, animated: Boolean): Unit = js.native
  def setScrollView(sv: js.Any): Unit = js.native
  def shouldRenderTab(idx: Double): Boolean = js.native
  def tabClickGoToTab(index: Double): Unit = js.native
}

/* static members */
@JSImport("@ant-design/react-native/lib/tabs/Tabs", "Tabs")
@js.native
object Tabs extends js.Object {
  var DefaultTabBar: TypeofDefaultTabBar = js.native
  var defaultProps: PropsType = js.native
}

