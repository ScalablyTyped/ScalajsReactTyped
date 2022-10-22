package typingsJapgolly.rcTabs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.rcTabs.esInterfaceMod.EditableConfig
import typingsJapgolly.rcTabs.esInterfaceMod.Tab
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTabNavListTabNodeMod extends Shortcut {
  
  @JSImport("rc-tabs/es/TabNavList/TabNode", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TabNodeProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait TabNodeProps extends StObject {
    
    var active: Boolean
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var editable: js.UndefOr[EditableConfig] = js.undefined
    
    var id: String
    
    var onClick: js.UndefOr[
        js.Function1[/* e */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element], Unit]
      ] = js.undefined
    
    var onFocus: FocusEventHandler[Element]
    
    def onRemove(): Unit
    
    var onResize: js.UndefOr[
        js.Function4[/* width */ Double, /* height */ Double, /* left */ Double, /* top */ Double, Unit]
      ] = js.undefined
    
    var prefixCls: String
    
    var removeAriaLabel: js.UndefOr[String] = js.undefined
    
    var removeIcon: js.UndefOr[Node] = js.undefined
    
    var renderWrapper: js.UndefOr[
        js.Function1[
          /* node */ japgolly.scalajs.react.facade.React.Element, 
          japgolly.scalajs.react.facade.React.Element
        ]
      ] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tab: Tab
  }
  object TabNodeProps {
    
    inline def apply(
      active: Boolean,
      id: String,
      onFocus: ReactFocusEventFrom[Element & Element] => Callback,
      onRemove: Callback,
      prefixCls: String,
      tab: Tab
    ): TabNodeProps = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onFocus = js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => onFocus(t0).runNow()), onRemove = onRemove.toJsFn, prefixCls = prefixCls.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabNodeProps]
    }
    
    extension [Self <: TabNodeProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setEditable(value: EditableConfig): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: /* e */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnRemove(value: Callback): Self = StObject.set(x, "onRemove", value.toJsFn)
      
      inline def setOnResize(value: (/* width */ Double, /* height */ Double, /* left */ Double, /* top */ Double) => Callback): Self = StObject.set(x, "onResize", js.Any.fromFunction4((t0: /* width */ Double, t1: /* height */ Double, t2: /* left */ Double, t3: /* top */ Double) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setRemoveAriaLabel(value: String): Self = StObject.set(x, "removeAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setRemoveAriaLabelUndefined: Self = StObject.set(x, "removeAriaLabel", js.undefined)
      
      inline def setRemoveIcon(value: VdomNode): Self = StObject.set(x, "removeIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setRemoveIconNull: Self = StObject.set(x, "removeIcon", null)
      
      inline def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      inline def setRemoveIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "removeIcon", js.Array(value*))
      
      inline def setRemoveIconVdomElement(value: VdomElement): Self = StObject.set(x, "removeIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRenderWrapper(
        value: /* node */ japgolly.scalajs.react.facade.React.Element => japgolly.scalajs.react.facade.React.Element
      ): Self = StObject.set(x, "renderWrapper", js.Any.fromFunction1(value))
      
      inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTab(value: Tab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[TabNodeProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esTabNavListTabNodeMod.foo` */
  override def _to: ForwardRefExoticComponent[TabNodeProps & RefAttributes[HTMLDivElement]] = default
}
