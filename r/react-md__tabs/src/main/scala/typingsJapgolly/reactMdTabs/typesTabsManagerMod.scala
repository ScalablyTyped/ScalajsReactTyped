package typingsJapgolly.reactMdTabs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactMdTabs.typesTypesMod.TabConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTabsManagerMod {
  
  @JSImport("@react-md/tabs/types/TabsManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TabsManager(
    hasTabsIdDefaultActiveIndexPropActiveIndexOnActiveIndexChangeTabsStackedIconAfterChildren: TabsManagerProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TabsManager")(hasTabsIdDefaultActiveIndexPropActiveIndexOnActiveIndexChangeTabsStackedIconAfterChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useTabs(): InitializedTabsManagerContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useTabs")().asInstanceOf[InitializedTabsManagerContext]
  
  /* Inlined @react-md/tabs.@react-md/tabs/types/types.TabConfig & std.Required<std.Pick<@react-md/tabs.@react-md/tabs/types/types.TabConfig, 'id'>> */
  trait InitializedTabConfig extends StObject {
    
    /**
      * The children to display in the tab. This is required and should normally
      * just be text or an icon.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * An optional className to apply to the tab.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * An optional className to apply to the `<span>` surrounding the `children`
      * of the `Tab`. You _probably_ won't need to use this.
      */
    var contentClassName: js.UndefOr[String] = js.undefined
    
    /**
      * An optional style to apply to the `<span>` surrounding the `children` of
      * the `Tab`. You _probably_ won't need to use this.
      */
    var contentStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Boolean if the tab should be disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional icon to render in the `Tab` along with the normal text. If you
      * want to have an icon only tab, you should not use this prop and instead
      * just provide the icon as the tab's children.
      */
    var icon: js.UndefOr[Node] = js.undefined
    
    /**
      * Boolean if the icon should appear after the text instead of before. When
      * the `stacked` prop is also enabled, it will cause the icon to appear below
      * the text instead of above.
      */
    var iconAfter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional id to use for the tab if the default generated ids are not to
      * your liking.
      */
    var id: js.UndefOr[String] & String
    
    /**
      * Boolean if the icon and text should be stacked instead of rendered inline.
      * This is only valid when the `icon` prop has been provided.
      */
    var stacked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional style to apply to the tab.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object InitializedTabConfig {
    
    inline def apply(id: js.UndefOr[String] & String): InitializedTabConfig = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitializedTabConfig]
    }
    
    extension [Self <: InitializedTabConfig](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconAfter(value: Boolean): Self = StObject.set(x, "iconAfter", value.asInstanceOf[js.Any])
      
      inline def setIconAfterUndefined: Self = StObject.set(x, "iconAfter", js.undefined)
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: js.UndefOr[String] & String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      inline def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined std.Required<@react-md/tabs.@react-md/tabs/types/TabsManager.TabsManagerContext> */
  trait InitializedTabsManagerContext extends StObject {
    
    var activeIndex: Double
    
    var onActiveIndexChange: js.Function1[/* activeIndex */ Double, Unit]
    
    var tabs: js.Array[InitializedTabConfig]
    
    var tabsId: String
  }
  object InitializedTabsManagerContext {
    
    inline def apply(
      activeIndex: Double,
      onActiveIndexChange: /* activeIndex */ Double => Callback,
      tabs: js.Array[InitializedTabConfig],
      tabsId: String
    ): InitializedTabsManagerContext = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], onActiveIndexChange = js.Any.fromFunction1((t0: /* activeIndex */ Double) => onActiveIndexChange(t0).runNow()), tabs = tabs.asInstanceOf[js.Any], tabsId = tabsId.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitializedTabsManagerContext]
    }
    
    extension [Self <: InitializedTabsManagerContext](x: Self) {
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setOnActiveIndexChange(value: /* activeIndex */ Double => Callback): Self = StObject.set(x, "onActiveIndexChange", js.Any.fromFunction1((t0: /* activeIndex */ Double) => value(t0).runNow()))
      
      inline def setTabs(value: js.Array[InitializedTabConfig]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsId(value: String): Self = StObject.set(x, "tabsId", value.asInstanceOf[js.Any])
      
      inline def setTabsVarargs(value: InitializedTabConfig*): Self = StObject.set(x, "tabs", js.Array(value*))
    }
  }
  
  trait TabsManagerContext extends StObject {
    
    /**
      * The current active tab index to determine which tabs to animate in and out
      * of view.
      */
    var activeIndex: Double
    
    /**
      * A function to call when the `activeIndex` should change due to keyboard
      * movement or clicking on a tab.
      */
    def onActiveIndexChange(activeIndex: Double): Unit
    
    /**
      * The list of tabs that should be controlled by the tabs manager.
      */
    var tabs: js.Array[InitializedTabConfig]
    
    /**
      * This is an id prefix to use for all the child Tab, TabList, and TabPanel
      * components.
      *
      * @example
      * id behavior
      * ```
      * - `Tabs` -> id={id}
      * - `Tab` ->
      *    - id={`${id}-tab-${index + 1}`}
      *    - panelId={active && `${id}-panel-${index + 1}`}
      * - `TabPanel` -> id={`${id}-panel-${index + 1}`}
      * ```
      */
    var tabsId: String
  }
  object TabsManagerContext {
    
    inline def apply(
      activeIndex: Double,
      onActiveIndexChange: Double => Callback,
      tabs: js.Array[InitializedTabConfig],
      tabsId: String
    ): TabsManagerContext = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], onActiveIndexChange = js.Any.fromFunction1((t0: Double) => onActiveIndexChange(t0).runNow()), tabs = tabs.asInstanceOf[js.Any], tabsId = tabsId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsManagerContext]
    }
    
    extension [Self <: TabsManagerContext](x: Self) {
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setOnActiveIndexChange(value: Double => Callback): Self = StObject.set(x, "onActiveIndexChange", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setTabs(value: js.Array[InitializedTabConfig]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsId(value: String): Self = StObject.set(x, "tabsId", value.asInstanceOf[js.Any])
      
      inline def setTabsVarargs(value: InitializedTabConfig*): Self = StObject.set(x, "tabs", js.Array(value*))
    }
  }
  
  /* Inlined parent std.Omit<@react-md/tabs.@react-md/tabs/types/TabsManager.TabsManagerContext, 'activeIndex' | 'onActiveIndexChange' | 'tabs'> */
  trait TabsManagerProps extends StObject {
    
    /**
      * If you want to control the current active index instead of relying on the
      * built in behavior, you can provide an `activeIndex` prop which will be used
      * instead.  If this prop is defined, you **must** also provide the
      * `onActiveIndexChange` so that keyboard functionality and tab changing
      * behavior can still be used.
      */
    var activeIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * The children to render that should eventually have the `Tabs` component and
      * the `TabContent` for matching specific tabs.
      */
    var children: Node
    
    /**
      * The index of the tab that should be active by default. This is ignored if
      * the `activeIndex` prop is defined.
      *
      * @defaultValue `0`
      */
    var defaultActiveIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Boolean if the icon should appear after the text instead of before for all
      * the `tabs` that have an icon. When the `stacked` prop is also enabled, it
      * will cause the icon to appear below the text instead of above.
      *
      * This is mostly a convenience prop so that you don't manually need to enable
      * it for each tab in the `tabs` list and if a `tab` in the `tabs` list has
      * the `stacked` attribute enabled defined, it will be used instead of this
      * value.
      *
      * @defaultValue `false`
      */
    var iconAfter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional function to call when the active index changes when the
      * `activeIndex` prop is not provided. If the `activeIndex` prop is provided,
      * this is **required** for keyboard accessibility.
      */
    var onActiveIndexChange: js.UndefOr[js.Function1[/* activeIndex */ Double, Unit]] = js.undefined
    
    /**
      * Boolean if all the `tabs` that have icons should be stacked instead of
      * rendered inline.
      *
      * This is mostly a convenience prop so that you don't manually need to enable
      * it for each tab in the `tabs` list and if a `tab` in the `tabs` list has
      * the `stacked` attribute enabled defined, it will be used instead of this
      * value.
      *
      * @defaultValue `false`
      */
    var stacked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The list of tabs that should be controlled by the tabs manager.
      */
    var tabs: js.Array[TabConfig | Element | String]
    
    var tabsId: String
  }
  object TabsManagerProps {
    
    inline def apply(tabs: js.Array[TabConfig | Element | String], tabsId: String): TabsManagerProps = {
      val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any], tabsId = tabsId.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[TabsManagerProps]
    }
    
    extension [Self <: TabsManagerProps](x: Self) {
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefaultActiveIndex(value: Double): Self = StObject.set(x, "defaultActiveIndex", value.asInstanceOf[js.Any])
      
      inline def setDefaultActiveIndexUndefined: Self = StObject.set(x, "defaultActiveIndex", js.undefined)
      
      inline def setIconAfter(value: Boolean): Self = StObject.set(x, "iconAfter", value.asInstanceOf[js.Any])
      
      inline def setIconAfterUndefined: Self = StObject.set(x, "iconAfter", js.undefined)
      
      inline def setOnActiveIndexChange(value: /* activeIndex */ Double => Callback): Self = StObject.set(x, "onActiveIndexChange", js.Any.fromFunction1((t0: /* activeIndex */ Double) => value(t0).runNow()))
      
      inline def setOnActiveIndexChangeUndefined: Self = StObject.set(x, "onActiveIndexChange", js.undefined)
      
      inline def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      inline def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
      
      inline def setTabs(value: js.Array[TabConfig | Element | String]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsId(value: String): Self = StObject.set(x, "tabsId", value.asInstanceOf[js.Any])
      
      inline def setTabsVarargs(value: (TabConfig | Element | String)*): Self = StObject.set(x, "tabs", js.Array(value*))
    }
  }
}
