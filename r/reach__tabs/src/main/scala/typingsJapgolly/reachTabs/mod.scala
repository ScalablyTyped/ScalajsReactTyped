package typingsJapgolly.reachTabs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reachPolymorphic.mod.ForwardRefComponent
import typingsJapgolly.reachPolymorphic.mod.MemoComponent
import typingsJapgolly.reachTabs.reachTabsStrings.auto
import typingsJapgolly.reachTabs.reachTabsStrings.button
import typingsJapgolly.reachTabs.reachTabsStrings.div
import typingsJapgolly.reachTabs.reachTabsStrings.horizontal
import typingsJapgolly.reachTabs.reachTabsStrings.manual
import typingsJapgolly.reachTabs.reachTabsStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/tabs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Tab
    *
    * The interactive element that changes the selected panel.
    *
    * @see Docs https://reach.tech/tabs#tab
    */
  @JSImport("@reach/tabs", "Tab")
  @js.native
  val Tab: ForwardRefComponent[button, TabProps] = js.native
  
  @JSImport("@reach/tabs", "TabList")
  @js.native
  val TabList: MemoComponent[div, TabListProps] = js.native
  
  /**
    * TabPanel
    *
    * The panel that displays when it's corresponding tab is active.
    *
    * @see Docs https://reach.tech/tabs#tabpanel
    */
  @JSImport("@reach/tabs", "TabPanel")
  @js.native
  val TabPanel: ForwardRefComponent[div, TabPanelProps] = js.native
  
  @JSImport("@reach/tabs", "TabPanels")
  @js.native
  val TabPanels: MemoComponent[div, TabPanelsProps] = js.native
  
  /**
    * Tabs
    *
    * The parent component of the tab interface.
    *
    * @see Docs https://reach.tech/tabs#tabs
    */
  @JSImport("@reach/tabs", "Tabs")
  @js.native
  val Tabs: ForwardRefComponent[div, TabsProps] = js.native
  
  @js.native
  sealed trait TabsKeyboardActivation extends StObject
  /**
    * Welcome to @reach/tabs!
    *
    * An accessible tabs component.
    *
    * The `Tab` and `TabPanel` elements are associated by their order in the tree.
    * None of the components are empty wrappers, each is associated with a real DOM
    * element in the document, giving you maximum control over styling and composition.
    *
    * You can render any other elements you want inside of `Tabs`, but `TabList`
    * should only render `Tab` elements, and `TabPanels` should only render
    * `TabPanel` elements.
    *
    * @see Docs     https://reach.tech/tabs
    * @see Source   https://github.com/reach/reach-ui/tree/main/packages/tabs
    * @see WAI-ARIA https://www.w3.org/TR/wai-aria-practices-1.2/#tabpanel
    */
  @JSImport("@reach/tabs", "TabsKeyboardActivation")
  @js.native
  object TabsKeyboardActivation extends StObject {
    
    @js.native
    sealed trait Auto
      extends StObject
         with TabsKeyboardActivation
    
    @js.native
    sealed trait Manual
      extends StObject
         with TabsKeyboardActivation
  }
  
  @js.native
  sealed trait TabsOrientation extends StObject
  @JSImport("@reach/tabs", "TabsOrientation")
  @js.native
  object TabsOrientation extends StObject {
    
    @js.native
    sealed trait Horizontal
      extends StObject
         with TabsOrientation
    
    @js.native
    sealed trait Vertical
      extends StObject
         with TabsOrientation
  }
  
  /**
    * A hook that exposes data for a given `Tabs` component to its descendants.
    *
    * @see Docs https://reach.tech/tabs#usetabscontext
    */
  inline def useTabsContext(): TabsContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useTabsContext")().asInstanceOf[TabsContextValue]
  
  /**
    * @see Docs https://reach.tech/tabs#tablist-props
    */
  trait TabListProps extends StObject {
    
    /**
      * `TabList` expects multiple `Tab` elements as children.
      *
      * `TabPanels` expects multiple `TabPanel` elements as children.
      *
      * @see Docs https://reach.tech/tabs#tablist-children
      */
    var children: js.UndefOr[Node] = js.undefined
  }
  object TabListProps {
    
    inline def apply(): TabListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabListProps]
    }
    
    extension [Self <: TabListProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @see Docs https://reach.tech/tabs#tabpanel-props
    */
  trait TabPanelProps extends StObject {
    
    /**
      * `TabPanel` can receive any type of children.
      *
      * @see Docs https://reach.tech/tabs#tabpanel-children
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * If an explicit index is passed to a `Tab` component, the same index value
      * should be passed to its corresponding `TabPanel`.
      *
      * @see Docs https://reach.tech/tabs#tabpanel-index
      */
    var index: js.UndefOr[Double] = js.undefined
  }
  object TabPanelProps {
    
    inline def apply(): TabPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabPanelProps]
    }
    
    extension [Self <: TabPanelProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    }
  }
  
  /**
    * @see Docs https://reach.tech/tabs#tabpanels-props
    */
  type TabPanelsProps = TabListProps
  
  /**
    * @see Docs https://reach.tech/tabs#tab-props
    */
  trait TabProps extends StObject {
    
    /**
      * `Tab` can receive any type of children.
      *
      * @see Docs https://reach.tech/tabs#tab-children
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * Disables a tab when true. Clicking will not work and keyboard navigation
      * will skip over it.
      *
      * @see Docs https://reach.tech/tabs#tab-disabled
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
  }
  object TabProps {
    
    inline def apply(): TabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabProps]
    }
    
    extension [Self <: TabProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    }
  }
  
  trait TabsContextValue extends StObject {
    
    var focusedIndex: Double
    
    var id: String
    
    var selectedIndex: Double
  }
  object TabsContextValue {
    
    inline def apply(focusedIndex: Double, id: String, selectedIndex: Double): TabsContextValue = {
      val __obj = js.Dynamic.literal(focusedIndex = focusedIndex.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsContextValue]
    }
    
    extension [Self <: TabsContextValue](x: Self) {
      
      inline def setFocusedIndex(value: Double): Self = StObject.set(x, "focusedIndex", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @see Docs https://reach.tech/tabs#tabs-props
    */
  trait TabsProps extends StObject {
    
    /**
      * Tabs expects `<TabList>` and `<TabPanels>` as children. The order doesn't
      * matter, you can have tabs on the top or the bottom. In fact, you could have
      * tabs on both the bottom and the top at the same time. You can have random
      * elements inside as well.
      *
      * You can also pass a render function to access data relevant to nested
      * components.
      *
      * @see Docs https://reach.tech/tabs#tabs-children
      */
    var children: Node | (js.Function1[/* props */ TabsContextValue, Node])
    
    /**
      * Starts the tabs at a specific index.
      *
      * @see Docs https://reach.tech/tabs#tabs-defaultindex
      */
    var defaultIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Like form inputs, a tab's state can be controlled by the owner. Make sure
      * to include an `onChange` as well, or else the tabs will not be interactive.
      *
      * @see Docs https://reach.tech/tabs#tabs-index
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /**
      * Describes the activation mode when navigating a tablist with a keyboard.
      * When set to `"auto"`, a tab panel is activated automatically when a tab is
      * highlighted using arrow keys. When set to `"manual"`, the user must
      * activate the tab panel with either the `Spacebar` or `Enter` keys. Defaults
      * to `"auto"`.
      *
      * @see Docs https://reach.tech/tabs#tabs-keyboardactivation
      */
    var keyboardActivation: js.UndefOr[TabsKeyboardActivation | auto | manual] = js.undefined
    
    /**
      * Calls back with the tab index whenever the user changes tabs, allowing your
      * app to synchronize with it.
      *
      * @see Docs https://reach.tech/tabs#tabs-onchange
      */
    var onChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    /**
      * Allows you to switch the orientation of the tabs relative to their tab
      * panels. This value can either be `"horizontal"`
      * (`TabsOrientation.Horizontal`) or `"vertical"`
      * (`TabsOrientation.Vertical`). Defaults to `"horizontal"`.
      *
      * @see Docs https://reach.tech/tabs#tabs-orientation
      * @see MDN  https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Logical_Properties
      */
    var orientation: js.UndefOr[TabsOrientation | horizontal | vertical] = js.undefined
    
    /**
      * @see Docs https://reach.tech/tabs#tabs-readonly
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
  }
  object TabsProps {
    
    inline def apply(): TabsProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[TabsProps]
    }
    
    extension [Self <: TabsProps](x: Self) {
      
      inline def setChildren(value: Node | (js.Function1[/* props */ TabsContextValue, Node])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* props */ TabsContextValue => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefaultIndex(value: Double): Self = StObject.set(x, "defaultIndex", value.asInstanceOf[js.Any])
      
      inline def setDefaultIndexUndefined: Self = StObject.set(x, "defaultIndex", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setKeyboardActivation(value: TabsKeyboardActivation | auto | manual): Self = StObject.set(x, "keyboardActivation", value.asInstanceOf[js.Any])
      
      inline def setKeyboardActivationUndefined: Self = StObject.set(x, "keyboardActivation", js.undefined)
      
      inline def setOnChange(value: /* index */ Double => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOrientation(value: TabsOrientation | horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    }
  }
}
