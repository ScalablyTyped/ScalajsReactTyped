package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.blueprintjsCore.anon.PartialTabsProps
import typingsJapgolly.blueprintjsCore.anon.SelectedTabId
import typingsJapgolly.blueprintjsCore.anon.TypeofTab
import typingsJapgolly.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.IProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsTabsTabMod.TabId
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsTabsTabsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/tabs/tabs", "Expander")
  @js.native
  val Expander: FC[js.Object] = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/tabs/tabs", "Tabs")
  @js.native
  open class Tabs protected ()
    extends AbstractPureComponent2[TabsProps, ITabsState, js.Object] {
    def this(props: TabsProps) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MTabs(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MTabs(prevProps: TabsProps, prevState: ITabsState): Unit = js.native
    
    /* private */ var getInitialSelectedTabId: Any = js.native
    
    /* private */ var getKeyCodeDirection: Any = js.native
    
    /** Filters children to only `<Tab>`s */
    /* private */ var getTabChildren: Any = js.native
    
    /* private */ var getTabChildrenProps: Any = js.native
    
    /** Queries root HTML element for all tabs with optional filter selector */
    /* private */ var getTabElements: Any = js.native
    
    /* private */ var handleKeyDown: Any = js.native
    
    /* private */ var handleKeyPress: Any = js.native
    
    /* private */ var handleTabClick: Any = js.native
    
    /**
      * Calculate the new height, width, and position of the tab indicator.
      * Store the CSS values so the transition animation can start.
      */
    /* private */ var moveSelectionIndicator: Any = js.native
    
    /* private */ var refHandlers: Any = js.native
    
    /* private */ var renderTabPanel: Any = js.native
    
    /* private */ var renderTabTitle: Any = js.native
    
    /* private */ var tablistElement: Any = js.native
  }
  /* static members */
  object Tabs {
    
    @JSImport("@blueprintjs/core/lib/esm/components/tabs/tabs", "Tabs")
    @js.native
    val ^ : js.Any = js.native
    
    /** Insert a `Tabs.Expander` between any two children to right-align all subsequent children. */
    @JSImport("@blueprintjs/core/lib/esm/components/tabs/tabs", "Tabs.Expander")
    @js.native
    def Expander: FC[js.Object] = js.native
    inline def Expander_=(x: FC[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Expander")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/tabs/tabs", "Tabs.Tab")
    @js.native
    def Tab: TypeofTab = js.native
    inline def Tab_=(x: TypeofTab): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tab")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/tabs/tabs", "Tabs.defaultProps")
    @js.native
    def defaultProps: PartialTabsProps = js.native
    inline def defaultProps_=(x: PartialTabsProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/tabs/tabs", "Tabs.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(hasSelectedTabId: TabsProps): SelectedTabId | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(hasSelectedTabId.asInstanceOf[js.Any]).asInstanceOf[SelectedTabId | Null]
  }
  
  trait ITabsProps
    extends StObject
       with IProps {
    
    /**
      * Whether the selected tab indicator should animate its movement.
      *
      * @default true
      */
    var animate: js.UndefOr[Boolean] = js.undefined
    
    /** Tab elements. */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Initial selected tab `id`, for uncontrolled usage.
      * Note that this prop refers only to `<Tab>` children; other types of elements are ignored.
      *
      * @default first tab
      */
    var defaultSelectedTabId: js.UndefOr[TabId] = js.undefined
    
    /**
      * Unique identifier for this `Tabs` container. This will be combined with the `id` of each
      * `Tab` child to generate ARIA accessibility attributes. IDs are required and should be
      * unique on the page to support server-side rendering.
      */
    var id: TabId
    
    /**
      * If set to `true`, the tab titles will display with larger styling.
      * This will apply large styles only to the tabs at this level, not to nested tabs.
      *
      * @default false
      */
    var large: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A callback function that is invoked when a tab in the tab list is clicked.
      */
    var onChange: js.UndefOr[
        js.Function3[
          /* newTabId */ TabId, 
          /* prevTabId */ js.UndefOr[TabId], 
          /* event */ ReactMouseEventFrom[HTMLElement], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Whether inactive tab panels should be removed from the DOM and unmounted in React.
      * This can be a performance enhancement when rendering many complex panels, but requires
      * careful support for unmounting and remounting.
      *
      * @default false
      */
    var renderActiveTabPanelOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Selected tab `id`, for controlled usage.
      * Providing this prop will put the component in controlled mode.
      * Unknown ids will result in empty selection (no errors).
      */
    var selectedTabId: js.UndefOr[TabId] = js.undefined
    
    /**
      * Whether to show tabs stacked vertically on the left side.
      *
      * @default false
      */
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object ITabsProps {
    
    inline def apply(id: TabId): ITabsProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITabsProps]
    }
    
    extension [Self <: ITabsProps](x: Self) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedTabId(value: TabId): Self = StObject.set(x, "defaultSelectedTabId", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedTabIdUndefined: Self = StObject.set(x, "defaultSelectedTabId", js.undefined)
      
      inline def setId(value: TabId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      inline def setOnChange(
        value: (/* newTabId */ TabId, /* prevTabId */ js.UndefOr[TabId], /* event */ ReactMouseEventFrom[HTMLElement]) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3((t0: /* newTabId */ TabId, t1: /* prevTabId */ js.UndefOr[TabId], t2: /* event */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setRenderActiveTabPanelOnly(value: Boolean): Self = StObject.set(x, "renderActiveTabPanelOnly", value.asInstanceOf[js.Any])
      
      inline def setRenderActiveTabPanelOnlyUndefined: Self = StObject.set(x, "renderActiveTabPanelOnly", js.undefined)
      
      inline def setSelectedTabId(value: TabId): Self = StObject.set(x, "selectedTabId", value.asInstanceOf[js.Any])
      
      inline def setSelectedTabIdUndefined: Self = StObject.set(x, "selectedTabId", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  trait ITabsState extends StObject {
    
    var indicatorWrapperStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var selectedTabId: js.UndefOr[TabId] = js.undefined
  }
  object ITabsState {
    
    inline def apply(): ITabsState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITabsState]
    }
    
    extension [Self <: ITabsState](x: Self) {
      
      inline def setIndicatorWrapperStyle(value: CSSProperties): Self = StObject.set(x, "indicatorWrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setIndicatorWrapperStyleUndefined: Self = StObject.set(x, "indicatorWrapperStyle", js.undefined)
      
      inline def setSelectedTabId(value: TabId): Self = StObject.set(x, "selectedTabId", value.asInstanceOf[js.Any])
      
      inline def setSelectedTabIdUndefined: Self = StObject.set(x, "selectedTabId", js.undefined)
    }
  }
  
  type TabsProps = ITabsProps
}
