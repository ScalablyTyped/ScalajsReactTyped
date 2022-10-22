package typingsJapgolly.antDesignProUtils.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignProUtils.antDesignProUtilsBooleans.`false`
import typingsJapgolly.antDesignProUtils.esComponentsDropdownFooterMod.DropdownFooterProps
import typingsJapgolly.antDesignProUtils.esComponentsFilterDropdownMod.DropdownProps
import typingsJapgolly.antDesignProUtils.esComponentsFilterDropdownMod.FooterRender
import typingsJapgolly.antDesignProUtils.esComponentsFilterDropdownMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FilterDropdown {
  
  @JSImport("@ant-design/pro-utils", "FilterDropdown")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def footer(value: DropdownFooterProps): this.type = set("footer", value.asInstanceOf[js.Any])
    
    inline def footerRender(value: FooterRender): this.type = set("footerRender", value.asInstanceOf[js.Any])
    
    inline def footerRenderFunction2(
      value: (/* onConfirm */ js.UndefOr[js.Function1[/* e */ js.UndefOr[ReactMouseEventFrom[Element]], Unit]], /* onClear */ js.UndefOr[js.Function1[/* e */ js.UndefOr[ReactMouseEventFrom[Element]], Unit]]) => typingsJapgolly.react.mod.global.JSX.Element | `false`
    ): this.type = set("footerRender", js.Any.fromFunction2(value))
    
    inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def onOpenChange(value: /* visible */ Boolean => Callback): this.type = set("onOpenChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
    
    inline def onVisibleChange(value: /* visible */ Boolean => Callback): this.type = set("onVisibleChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def padding(value: Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FilterDropdown.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DropdownProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
