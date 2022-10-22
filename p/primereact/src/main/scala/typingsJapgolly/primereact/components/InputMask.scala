package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.primereact.inputmaskInputmaskMod.InputMaskChangeParams
import typingsJapgolly.primereact.inputmaskInputmaskMod.InputMaskCompleteParams
import typingsJapgolly.primereact.inputmaskInputmaskMod.InputMaskProps
import typingsJapgolly.primereact.tooltipTooltipoptionsMod.TooltipOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InputMask {
  
  @JSImport("primereact", "InputMask")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.primereact.mod.InputMask] {
    
    inline def autoClear(value: Boolean): this.type = set("autoClear", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def mask(value: String): this.type = set("mask", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* event */ ReactFocusEventFrom[HTMLInputElement] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* event */ ReactFocusEventFrom[HTMLInputElement]) => value(t0).runNow()))
    
    inline def onChange(value: /* e */ InputMaskChangeParams => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* e */ InputMaskChangeParams) => value(t0).runNow()))
    
    inline def onComplete(value: /* e */ InputMaskCompleteParams => Callback): this.type = set("onComplete", js.Any.fromFunction1((t0: /* e */ InputMaskCompleteParams) => value(t0).runNow()))
    
    inline def onFocus(value: /* event */ ReactFocusEventFrom[HTMLInputElement] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* event */ ReactFocusEventFrom[HTMLInputElement]) => value(t0).runNow()))
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def slotChar(value: String): this.type = set("slotChar", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: String): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    inline def tooltipOptions(value: TooltipOptions): this.type = set("tooltipOptions", value.asInstanceOf[js.Any])
    
    inline def unmask(value: Boolean): this.type = set("unmask", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InputMask.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InputMaskProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
