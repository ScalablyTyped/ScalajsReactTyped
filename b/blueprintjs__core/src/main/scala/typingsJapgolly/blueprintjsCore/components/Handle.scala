package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmCommonIntentMod.Intent
import typingsJapgolly.blueprintjsCore.libEsmComponentsSliderHandleMod.IInternalHandleProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsSliderHandlePropsMod.HandleHtmlProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsSliderHandlePropsMod.HandleInteractionKind
import typingsJapgolly.blueprintjsCore.libEsmComponentsSliderHandlePropsMod.HandleType
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Handle {
  
  inline def apply(
    max: Double,
    min: Double,
    stepSize: Double,
    tickSize: Double,
    tickSizeRatio: Double,
    value: Double,
    vertical: Boolean
  ): Builder = {
    val __props = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], stepSize = stepSize.asInstanceOf[js.Any], tickSize = tickSize.asInstanceOf[js.Any], tickSizeRatio = tickSizeRatio.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IInternalHandleProps]))
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/slider/handle", "Handle")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.libEsmComponentsSliderHandleMod.Handle] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def htmlProps(value: HandleHtmlProps): this.type = set("htmlProps", value.asInstanceOf[js.Any])
    
    inline def intentAfter(value: Intent): this.type = set("intentAfter", value.asInstanceOf[js.Any])
    
    inline def intentBefore(value: Intent): this.type = set("intentBefore", value.asInstanceOf[js.Any])
    
    inline def interactionKind(value: HandleInteractionKind): this.type = set("interactionKind", value.asInstanceOf[js.Any])
    
    inline def label(value: Element | String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def onChange(value: /* newValue */ Double => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* newValue */ Double) => value(t0).runNow()))
    
    inline def onRelease(value: /* newValue */ Double => Callback): this.type = set("onRelease", js.Any.fromFunction1((t0: /* newValue */ Double) => value(t0).runNow()))
    
    inline def trackStyleAfter(value: CSSProperties): this.type = set("trackStyleAfter", value.asInstanceOf[js.Any])
    
    inline def trackStyleBefore(value: CSSProperties): this.type = set("trackStyleBefore", value.asInstanceOf[js.Any])
    
    inline def `type`(value: HandleType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IInternalHandleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
