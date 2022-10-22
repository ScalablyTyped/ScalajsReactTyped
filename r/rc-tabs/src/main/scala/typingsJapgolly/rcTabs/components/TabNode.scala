package typingsJapgolly.rcTabs.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcTabs.esInterfaceMod.EditableConfig
import typingsJapgolly.rcTabs.esInterfaceMod.Tab
import typingsJapgolly.rcTabs.esTabNavListTabNodeMod.TabNodeProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabNode {
  
  inline def apply(
    active: Boolean,
    id: String,
    onFocus: ReactFocusEventFrom[Element & Element] => Callback,
    onRemove: Callback,
    prefixCls: String,
    tab: Tab
  ): Builder = {
    val __props = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onFocus = js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => onFocus(t0).runNow()), onRemove = onRemove.toJsFn, prefixCls = prefixCls.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabNodeProps & RefAttributes[HTMLDivElement]]))
  }
  
  @JSImport("rc-tabs/es/TabNavList/TabNode", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLDivElement] {
    
    inline def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
    
    inline def editable(value: EditableConfig): this.type = set("editable", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* e */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[Element] | ReactKeyboardEventFrom[Element]) => value(t0).runNow()))
    
    inline def onResize(value: (/* width */ Double, /* height */ Double, /* left */ Double, /* top */ Double) => Callback): this.type = set("onResize", js.Any.fromFunction4((t0: /* width */ Double, t1: /* height */ Double, t2: /* left */ Double, t3: /* top */ Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def removeAriaLabel(value: String): this.type = set("removeAriaLabel", value.asInstanceOf[js.Any])
    
    inline def removeIcon(value: VdomNode): this.type = set("removeIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def removeIconNull: this.type = set("removeIcon", null)
    
    inline def removeIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("removeIcon", js.Array(value*))
    
    inline def removeIconVdomElement(value: VdomElement): this.type = set("removeIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def renderWrapper(
      value: /* node */ japgolly.scalajs.react.facade.React.Element => japgolly.scalajs.react.facade.React.Element
    ): this.type = set("renderWrapper", js.Any.fromFunction1(value))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabNodeProps & RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
