package typingsJapgolly.rcTabs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.rcMotion.esCssmotionMod.CSSMotionProps
import typingsJapgolly.rcTabs.anon.Direction
import typingsJapgolly.rcTabs.anon.Event
import typingsJapgolly.rcTabs.anon.Height
import typingsJapgolly.rcTabs.esTabNavListMod.TabNavListProps
import typingsJapgolly.rcTabs.rcTabsStrings.add
import typingsJapgolly.rcTabs.rcTabsStrings.remove
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Key
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esInterfaceMod {
  
  trait AnimatedConfig extends StObject {
    
    var inkBar: js.UndefOr[Boolean] = js.undefined
    
    var tabPane: js.UndefOr[Boolean] = js.undefined
    
    var tabPaneMotion: js.UndefOr[CSSMotionProps] = js.undefined
  }
  object AnimatedConfig {
    
    inline def apply(): AnimatedConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimatedConfig]
    }
    
    extension [Self <: AnimatedConfig](x: Self) {
      
      inline def setInkBar(value: Boolean): Self = StObject.set(x, "inkBar", value.asInstanceOf[js.Any])
      
      inline def setInkBarUndefined: Self = StObject.set(x, "inkBar", js.undefined)
      
      inline def setTabPane(value: Boolean): Self = StObject.set(x, "tabPane", value.asInstanceOf[js.Any])
      
      inline def setTabPaneMotion(value: CSSMotionProps): Self = StObject.set(x, "tabPaneMotion", value.asInstanceOf[js.Any])
      
      inline def setTabPaneMotionUndefined: Self = StObject.set(x, "tabPaneMotion", js.undefined)
      
      inline def setTabPaneUndefined: Self = StObject.set(x, "tabPane", js.undefined)
    }
  }
  
  trait EditableConfig extends StObject {
    
    var addIcon: js.UndefOr[Node] = js.undefined
    
    def onEdit(`type`: add | remove, info: Event): Unit
    
    var removeIcon: js.UndefOr[Node] = js.undefined
    
    var showAdd: js.UndefOr[Boolean] = js.undefined
  }
  object EditableConfig {
    
    inline def apply(onEdit: (add | remove, Event) => Callback): EditableConfig = {
      val __obj = js.Dynamic.literal(onEdit = js.Any.fromFunction2((t0: add | remove, t1: Event) => (onEdit(t0, t1)).runNow()))
      __obj.asInstanceOf[EditableConfig]
    }
    
    extension [Self <: EditableConfig](x: Self) {
      
      inline def setAddIcon(value: VdomNode): Self = StObject.set(x, "addIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setAddIconNull: Self = StObject.set(x, "addIcon", null)
      
      inline def setAddIconUndefined: Self = StObject.set(x, "addIcon", js.undefined)
      
      inline def setAddIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "addIcon", js.Array(value*))
      
      inline def setAddIconVdomElement(value: VdomElement): Self = StObject.set(x, "addIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnEdit(value: (add | remove, Event) => Callback): Self = StObject.set(x, "onEdit", js.Any.fromFunction2((t0: add | remove, t1: Event) => (value(t0, t1)).runNow()))
      
      inline def setRemoveIcon(value: VdomNode): Self = StObject.set(x, "removeIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setRemoveIconNull: Self = StObject.set(x, "removeIcon", null)
      
      inline def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      inline def setRemoveIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "removeIcon", js.Array(value*))
      
      inline def setRemoveIconVdomElement(value: VdomElement): Self = StObject.set(x, "removeIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setShowAdd(value: Boolean): Self = StObject.set(x, "showAdd", value.asInstanceOf[js.Any])
      
      inline def setShowAddUndefined: Self = StObject.set(x, "showAdd", js.undefined)
    }
  }
  
  type OnTabScroll = js.Function1[/* info */ Direction, Unit]
  
  type RenderTabBar = js.Function2[
    /* props */ RenderTabBarProps, 
    /* DefaultTabBar */ ComponentType[TabNavListProps], 
    Element
  ]
  
  @js.native
  trait RenderTabBarProps extends StObject {
    
    var activeKey: String = js.native
    
    var animated: AnimatedConfig = js.native
    
    var editable: EditableConfig = js.native
    
    var extra: TabBarExtraContent = js.native
    
    var id: String = js.native
    
    var locale: TabsLocale = js.native
    
    var mobile: Boolean = js.native
    
    var moreIcon: Node = js.native
    
    var moreTransitionName: String = js.native
    
    def onTabClick(key: String, e: ReactKeyboardEventFrom[org.scalajs.dom.Element]): Unit = js.native
    def onTabClick(key: String, e: ReactMouseEventFrom[org.scalajs.dom.Element]): Unit = js.native
    
    var onTabScroll: OnTabScroll = js.native
    
    /** @deprecated It do not pass real TabPane node. Only for compatible usage.  */
    var panes: Node = js.native
    
    var rtl: Boolean = js.native
    
    var style: CSSProperties = js.native
    
    var tabBarGutter: Double = js.native
    
    var tabPosition: TabPosition = js.native
  }
  
  type SizeInfo = js.Tuple2[/* width */ Double, /* height */ Double]
  
  /* Inlined parent std.Omit<rc-tabs.rc-tabs/es/TabPanelList/TabPane.TabPaneProps, 'tab'> */
  trait Tab extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var closeIcon: js.UndefOr[Node] = js.undefined
    
    var destroyInactiveTabPane: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var forceRender: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var key: String
    
    var label: Node
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabKey: js.UndefOr[String] = js.undefined
  }
  object Tab {
    
    inline def apply(key: String): Tab = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], label = null)
      __obj.asInstanceOf[Tab]
    }
    
    extension [Self <: Tab](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setCloseIcon(value: VdomNode): Self = StObject.set(x, "closeIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCloseIconNull: Self = StObject.set(x, "closeIcon", null)
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setCloseIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "closeIcon", js.Array(value*))
      
      inline def setCloseIconVdomElement(value: VdomElement): Self = StObject.set(x, "closeIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDestroyInactiveTabPane(value: Boolean): Self = StObject.set(x, "destroyInactiveTabPane", value.asInstanceOf[js.Any])
      
      inline def setDestroyInactiveTabPaneUndefined: Self = StObject.set(x, "destroyInactiveTabPane", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      inline def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabKey(value: String): Self = StObject.set(x, "tabKey", value.asInstanceOf[js.Any])
      
      inline def setTabKeyUndefined: Self = StObject.set(x, "tabKey", js.undefined)
    }
  }
  
  type TabBarExtraContent = Node | TabBarExtraMap
  
  /* Inlined std.Partial<std.Record<rc-tabs.rc-tabs/es/interface.TabBarExtraPosition, react.react.ReactNode>> */
  trait TabBarExtraMap extends StObject {
    
    var left: js.UndefOr[Node] = js.undefined
    
    var right: js.UndefOr[Node] = js.undefined
  }
  object TabBarExtraMap {
    
    inline def apply(): TabBarExtraMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabBarExtraMap]
    }
    
    extension [Self <: TabBarExtraMap](x: Self) {
      
      inline def setLeft(value: VdomNode): Self = StObject.set(x, "left", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLeftNull: Self = StObject.set(x, "left", null)
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setLeftVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "left", js.Array(value*))
      
      inline def setLeftVdomElement(value: VdomElement): Self = StObject.set(x, "left", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRight(value: VdomNode): Self = StObject.set(x, "right", value.rawNode.asInstanceOf[js.Any])
      
      inline def setRightNull: Self = StObject.set(x, "right", null)
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setRightVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "right", js.Array(value*))
      
      inline def setRightVdomElement(value: VdomElement): Self = StObject.set(x, "right", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcTabs.rcTabsStrings.left
    - typingsJapgolly.rcTabs.rcTabsStrings.right
  */
  trait TabBarExtraPosition extends StObject
  object TabBarExtraPosition {
    
    inline def left: typingsJapgolly.rcTabs.rcTabsStrings.left = "left".asInstanceOf[typingsJapgolly.rcTabs.rcTabsStrings.left]
    
    inline def right: typingsJapgolly.rcTabs.rcTabsStrings.right = "right".asInstanceOf[typingsJapgolly.rcTabs.rcTabsStrings.right]
  }
  
  trait TabOffset extends StObject {
    
    var height: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
    
    var width: Double
  }
  object TabOffset {
    
    inline def apply(height: Double, left: Double, right: Double, top: Double, width: Double): TabOffset = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabOffset]
    }
    
    extension [Self <: TabOffset](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type TabOffsetMap = Map[Key, TabOffset]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcTabs.rcTabsStrings.left
    - typingsJapgolly.rcTabs.rcTabsStrings.right
    - typingsJapgolly.rcTabs.rcTabsStrings.top
    - typingsJapgolly.rcTabs.rcTabsStrings.bottom
  */
  trait TabPosition extends StObject
  object TabPosition {
    
    inline def bottom: typingsJapgolly.rcTabs.rcTabsStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.rcTabs.rcTabsStrings.bottom]
    
    inline def left: typingsJapgolly.rcTabs.rcTabsStrings.left = "left".asInstanceOf[typingsJapgolly.rcTabs.rcTabsStrings.left]
    
    inline def right: typingsJapgolly.rcTabs.rcTabsStrings.right = "right".asInstanceOf[typingsJapgolly.rcTabs.rcTabsStrings.right]
    
    inline def top: typingsJapgolly.rcTabs.rcTabsStrings.top = "top".asInstanceOf[typingsJapgolly.rcTabs.rcTabsStrings.top]
  }
  
  type TabSizeMap = Map[Key, Height]
  
  trait TabsLocale extends StObject {
    
    var addAriaLabel: js.UndefOr[String] = js.undefined
    
    var dropdownAriaLabel: js.UndefOr[String] = js.undefined
    
    var removeAriaLabel: js.UndefOr[String] = js.undefined
  }
  object TabsLocale {
    
    inline def apply(): TabsLocale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsLocale]
    }
    
    extension [Self <: TabsLocale](x: Self) {
      
      inline def setAddAriaLabel(value: String): Self = StObject.set(x, "addAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setAddAriaLabelUndefined: Self = StObject.set(x, "addAriaLabel", js.undefined)
      
      inline def setDropdownAriaLabel(value: String): Self = StObject.set(x, "dropdownAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setDropdownAriaLabelUndefined: Self = StObject.set(x, "dropdownAriaLabel", js.undefined)
      
      inline def setRemoveAriaLabel(value: String): Self = StObject.set(x, "removeAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setRemoveAriaLabelUndefined: Self = StObject.set(x, "removeAriaLabel", js.undefined)
    }
  }
}
