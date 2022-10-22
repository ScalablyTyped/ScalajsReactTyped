package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.baseui.accordionTypesMod.OnChangeHandler
import typingsJapgolly.baseui.accordionTypesMod.PanelOverrides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  children :react.react.ReactNode,   disabled :boolean | undefined,   aria-controls :string | undefined,   key :react.react.Key | undefined,   onChange :baseui.baseui/accordion/types.OnChangeHandler | undefined,   onClick :(e : std.Event): unknown | undefined,   onKeyDown :(e : std.KeyboardEvent): unknown | undefined,   overrides :baseui.baseui/accordion/types.PanelOverrides | undefined,   title :react.react.ReactNode | undefined,   renderPanelContent :boolean | undefined,   renderAll :boolean | undefined,   expanded :boolean | undefined} & react.react.RefAttributes<std.HTMLElement> */
trait childrenReactNodedisabled extends StObject {
  
  var `aria-controls`: js.UndefOr[String] = js.undefined
  
  var children: Node
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[typingsJapgolly.react.mod.Key] & (js.UndefOr[typingsJapgolly.react.mod.Key | Null])
  
  var onChange: js.UndefOr[OnChangeHandler] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* e */ org.scalajs.dom.Event, Any]] = js.undefined
  
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, Any]] = js.undefined
  
  var overrides: js.UndefOr[PanelOverrides] = js.undefined
  
  var ref: js.UndefOr[typingsJapgolly.react.mod.Ref[HTMLElement]] = js.undefined
  
  var renderAll: js.UndefOr[Boolean] = js.undefined
  
  var renderPanelContent: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[Node] = js.undefined
}
object childrenReactNodedisabled {
  
  inline def apply(
    key: js.UndefOr[typingsJapgolly.react.mod.Key] & (js.UndefOr[typingsJapgolly.react.mod.Key | Null])
  ): childrenReactNodedisabled = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], children = null)
    __obj.asInstanceOf[childrenReactNodedisabled]
  }
  
  extension [Self <: childrenReactNodedisabled](x: Self) {
    
    inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
    
    inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setKey(
      value: js.UndefOr[typingsJapgolly.react.mod.Key] & (js.UndefOr[typingsJapgolly.react.mod.Key | Null])
    ): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: /* a */ ExpandedBoolean => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClick(value: /* e */ org.scalajs.dom.Event => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnKeyDown(value: /* e */ KeyboardEvent => Any): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOverrides(value: PanelOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setRef(value: typingsJapgolly.react.mod.Ref[HTMLElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: HTMLElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
    
    inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
    
    inline def setRenderPanelContent(value: Boolean): Self = StObject.set(x, "renderPanelContent", value.asInstanceOf[js.Any])
    
    inline def setRenderPanelContentUndefined: Self = StObject.set(x, "renderPanelContent", js.undefined)
    
    inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
  }
}
