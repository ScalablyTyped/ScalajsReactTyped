package typingsJapgolly.baseui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.baseui.anon.ActiveKey
import typingsJapgolly.baseui.anon.sizeIconPropssizecolorIco
import typingsJapgolly.baseui.baseuiStrings.change_
import typingsJapgolly.baseui.helpersOverridesMod.Override
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMotionTypesMod {
  
  /* Inlined { readonly fixed :'fixed',  readonly intrinsic :'intrinsic'}[keyof { readonly fixed :'fixed',  readonly intrinsic :'intrinsic'}] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.fixed
    - typingsJapgolly.baseui.baseuiStrings.intrinsic
  */
  trait Fill extends StObject
  object Fill {
    
    inline def fixed: typingsJapgolly.baseui.baseuiStrings.fixed = "fixed".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.fixed]
    
    inline def intrinsic: typingsJapgolly.baseui.baseuiStrings.intrinsic = "intrinsic".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.intrinsic]
  }
  
  /* Inlined { readonly vertical :'vertical',  readonly horizontal :'horizontal'}[keyof { readonly vertical :'vertical',  readonly horizontal :'horizontal'}] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.vertical
    - typingsJapgolly.baseui.baseuiStrings.horizontal
  */
  trait Orientation extends StObject
  object Orientation {
    
    inline def horizontal: typingsJapgolly.baseui.baseuiStrings.horizontal = "horizontal".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.horizontal]
    
    inline def vertical: typingsJapgolly.baseui.baseuiStrings.vertical = "vertical".asInstanceOf[typingsJapgolly.baseui.baseuiStrings.vertical]
  }
  
  /* Inlined { readonly change :'change'}[keyof { readonly change :'change'}] */
  type StateChange = change_
  
  trait StatefulTabsAction extends StObject {
    
    var payload: Key
    
    var `type`: StateChange
  }
  object StatefulTabsAction {
    
    inline def apply(payload: Key, `type`: StateChange): StatefulTabsAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulTabsAction]
    }
    
    extension [Self <: StatefulTabsAction](x: Self) {
      
      inline def setPayload(value: Key): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: StateChange): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait StatefulTabsProps
    extends StObject
       with TabsProps {
    
    var initialState: js.UndefOr[StatefulTabsState] = js.undefined
    
    var stateReducer: js.UndefOr[StatefulTabsReducer] = js.undefined
  }
  object StatefulTabsProps {
    
    inline def apply(): StatefulTabsProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[StatefulTabsProps]
    }
    
    extension [Self <: StatefulTabsProps](x: Self) {
      
      inline def setInitialState(value: StatefulTabsState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setStateReducer(value: (/* state */ StatefulTabsState, /* action */ StatefulTabsAction) => StatefulTabsState): Self = StObject.set(x, "stateReducer", js.Any.fromFunction2(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  type StatefulTabsReducer = js.Function2[/* state */ StatefulTabsState, /* action */ StatefulTabsAction, StatefulTabsState]
  
  trait StatefulTabsState extends StObject {
    
    var activeKey: Key
  }
  object StatefulTabsState {
    
    inline def apply(activeKey: Key): StatefulTabsState = {
      val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulTabsState]
    }
    
    extension [Self <: StatefulTabsState](x: Self) {
      
      inline def setActiveKey(value: Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabOverrides extends StObject {
    
    var ArtworkContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var Tab: js.UndefOr[Override[Any]] = js.undefined
    
    var TabPanel: js.UndefOr[Override[Any]] = js.undefined
  }
  object TabOverrides {
    
    inline def apply(): TabOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabOverrides]
    }
    
    extension [Self <: TabOverrides](x: Self) {
      
      inline def setArtworkContainer(value: Override[Any]): Self = StObject.set(x, "ArtworkContainer", value.asInstanceOf[js.Any])
      
      inline def setArtworkContainerUndefined: Self = StObject.set(x, "ArtworkContainer", js.undefined)
      
      inline def setTab(value: Override[Any]): Self = StObject.set(x, "Tab", value.asInstanceOf[js.Any])
      
      inline def setTabPanel(value: Override[Any]): Self = StObject.set(x, "TabPanel", value.asInstanceOf[js.Any])
      
      inline def setTabPanelUndefined: Self = StObject.set(x, "TabPanel", js.undefined)
      
      inline def setTabUndefined: Self = StObject.set(x, "Tab", js.undefined)
    }
  }
  
  trait TabProps extends StObject {
    
    var artwork: js.UndefOr[ComponentType[sizeIconPropssizecolorIco]] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    var overrides: js.UndefOr[TabOverrides] = js.undefined
    
    var tabRef: js.UndefOr[Ref[HTMLButtonElement]] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
  }
  object TabProps {
    
    inline def apply(): TabProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabProps]
    }
    
    extension [Self <: TabProps](x: Self) {
      
      inline def setArtwork(value: ComponentType[sizeIconPropssizecolorIco]): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
      
      inline def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOverrides(value: TabOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setTabRef(value: Ref[HTMLButtonElement]): Self = StObject.set(x, "tabRef", value.asInstanceOf[js.Any])
      
      inline def setTabRefFunction1(value: HTMLButtonElement | Null => Callback): Self = StObject.set(x, "tabRef", js.Any.fromFunction1((t0: HTMLButtonElement | Null) => value(t0).runNow()))
      
      inline def setTabRefNull: Self = StObject.set(x, "tabRef", null)
      
      inline def setTabRefUndefined: Self = StObject.set(x, "tabRef", js.undefined)
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait TabsOverrides extends StObject {
    
    var EndEnhancerContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var StyledTabBar: js.UndefOr[Override[Any]] = js.undefined
    
    var TabBorder: js.UndefOr[Override[Any]] = js.undefined
    
    var TabHighlight: js.UndefOr[Override[Any]] = js.undefined
    
    var TabList: js.UndefOr[Override[Any]] = js.undefined
  }
  object TabsOverrides {
    
    inline def apply(): TabsOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabsOverrides]
    }
    
    extension [Self <: TabsOverrides](x: Self) {
      
      inline def setEndEnhancerContainer(value: Override[Any]): Self = StObject.set(x, "EndEnhancerContainer", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerContainerUndefined: Self = StObject.set(x, "EndEnhancerContainer", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setStyledTabBar(value: Override[Any]): Self = StObject.set(x, "StyledTabBar", value.asInstanceOf[js.Any])
      
      inline def setStyledTabBarUndefined: Self = StObject.set(x, "StyledTabBar", js.undefined)
      
      inline def setTabBorder(value: Override[Any]): Self = StObject.set(x, "TabBorder", value.asInstanceOf[js.Any])
      
      inline def setTabBorderUndefined: Self = StObject.set(x, "TabBorder", js.undefined)
      
      inline def setTabHighlight(value: Override[Any]): Self = StObject.set(x, "TabHighlight", value.asInstanceOf[js.Any])
      
      inline def setTabHighlightUndefined: Self = StObject.set(x, "TabHighlight", js.undefined)
      
      inline def setTabList(value: Override[Any]): Self = StObject.set(x, "TabList", value.asInstanceOf[js.Any])
      
      inline def setTabListUndefined: Self = StObject.set(x, "TabList", js.undefined)
    }
  }
  
  trait TabsProps extends StObject {
    
    var activateOnFocus: js.UndefOr[Boolean] = js.undefined
    
    var activeKey: js.UndefOr[Key] = js.undefined
    
    var children: Node
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var endEnhancer: js.UndefOr[Node] = js.undefined
    
    var fill: js.UndefOr[Fill] = js.undefined
    
    var onChange: js.UndefOr[typingsJapgolly.baseui.tabsMotionTypesMod.onChange] = js.undefined
    
    var orientation: js.UndefOr[Orientation] = js.undefined
    
    var overrides: js.UndefOr[TabsOverrides] = js.undefined
    
    var renderAll: js.UndefOr[Boolean] = js.undefined
    
    var uid: js.UndefOr[String] = js.undefined
  }
  object TabsProps {
    
    inline def apply(): TabsProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[TabsProps]
    }
    
    extension [Self <: TabsProps](x: Self) {
      
      inline def setActivateOnFocus(value: Boolean): Self = StObject.set(x, "activateOnFocus", value.asInstanceOf[js.Any])
      
      inline def setActivateOnFocusUndefined: Self = StObject.set(x, "activateOnFocus", js.undefined)
      
      inline def setActiveKey(value: Key): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEndEnhancer(value: VdomNode): Self = StObject.set(x, "endEnhancer", value.rawNode.asInstanceOf[js.Any])
      
      inline def setEndEnhancerNull: Self = StObject.set(x, "endEnhancer", null)
      
      inline def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
      
      inline def setEndEnhancerVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "endEnhancer", js.Array(value*))
      
      inline def setEndEnhancerVdomElement(value: VdomElement): Self = StObject.set(x, "endEnhancer", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFill(value: Fill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setOnChange(value: /* params */ ActiveKey => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* params */ ActiveKey) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setOverrides(value: TabsOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
  
  type onChange = js.Function1[/* params */ ActiveKey, Unit]
}
