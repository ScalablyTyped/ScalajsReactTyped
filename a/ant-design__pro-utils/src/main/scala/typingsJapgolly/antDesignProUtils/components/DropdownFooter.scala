package typingsJapgolly.antDesignProUtils.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignProUtils.antDesignProUtilsBooleans.`false`
import typingsJapgolly.antDesignProUtils.esComponentsDropdownFooterMod.DropdownFooterProps
import typingsJapgolly.antDesignProUtils.esComponentsDropdownFooterMod.LightFilterFooterRender
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropdownFooter {
  
  @JSImport("@ant-design/pro-utils", "DropdownFooter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def footerRender(value: LightFilterFooterRender): this.type = set("footerRender", value.asInstanceOf[js.Any])
    
    inline def footerRenderFunction2(
      value: (/* onConfirm */ js.UndefOr[js.Function1[/* e */ js.UndefOr[ReactMouseEventFrom[Element]], Unit]], /* onClear */ js.UndefOr[js.Function1[/* e */ js.UndefOr[ReactMouseEventFrom[Element]], Unit]]) => typingsJapgolly.react.mod.global.JSX.Element | `false`
    ): this.type = set("footerRender", js.Any.fromFunction2(value))
    
    inline def onClear(value: /* e */ js.UndefOr[ReactMouseEventFrom[Element]] => Callback): this.type = set("onClear", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactMouseEventFrom[Element]]) => value(t0).runNow()))
    
    inline def onConfirm(value: /* e */ js.UndefOr[ReactMouseEventFrom[Element]] => Callback): this.type = set("onConfirm", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactMouseEventFrom[Element]]) => value(t0).runNow()))
  }
  
  implicit def make(companion: DropdownFooter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DropdownFooterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
