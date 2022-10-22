package typingsJapgolly.rcSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcSelect.libBaseSelectMod.Placement
import typingsJapgolly.rcSelect.libSelectTriggerMod.RefTriggerProps
import typingsJapgolly.rcSelect.libSelectTriggerMod.SelectTriggerProps
import typingsJapgolly.rcTrigger.esInterfaceMod.AlignType
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectTrigger {
  
  inline def apply(
    containerWidth: Double,
    direction: String,
    disabled: Boolean,
    dropdownAlign: AlignType,
    dropdownClassName: String,
    dropdownStyle: CSSProperties,
    empty: Boolean,
    getTriggerDOMNode: CallbackTo[HTMLElement],
    onPopupMouseEnter: Callback,
    popupElement: VdomElement,
    prefixCls: String,
    visible: Boolean
  ): Builder = {
    val __props = js.Dynamic.literal(containerWidth = containerWidth.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dropdownAlign = dropdownAlign.asInstanceOf[js.Any], dropdownClassName = dropdownClassName.asInstanceOf[js.Any], dropdownStyle = dropdownStyle.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], getTriggerDOMNode = getTriggerDOMNode.toJsFn, onPopupMouseEnter = onPopupMouseEnter.toJsFn, popupElement = popupElement.rawElement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SelectTriggerProps & RefAttributes[RefTriggerProps]]))
  }
  
  @JSImport("rc-select/lib/SelectTrigger", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[RefTriggerProps] {
    
    inline def animation(value: String): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def dropdownMatchSelectWidth(value: Boolean | Double): this.type = set("dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
    
    inline def dropdownRender(value: /* menu */ Element => Element): this.type = set("dropdownRender", js.Any.fromFunction1(value))
    
    inline def getPopupContainer(value: /* props */ Any => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    inline def onPopupVisibleChange(value: /* visible */ Boolean => Callback): this.type = set("onPopupVisibleChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
    
    inline def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SelectTriggerProps & RefAttributes[RefTriggerProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
