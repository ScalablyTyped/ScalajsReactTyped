package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.anon.IsHandleTooltip
import typingsJapgolly.blueprintjsCore.libEsmCommonIntentMod.Intent
import typingsJapgolly.blueprintjsCore.libEsmComponentsSliderHandlePropsMod.HandleHtmlProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsSliderHandlePropsMod.HandleInteractionKind
import typingsJapgolly.blueprintjsCore.libEsmComponentsSliderHandlePropsMod.HandleType
import typingsJapgolly.blueprintjsCore.libEsmComponentsSliderHandlePropsMod.IHandleProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsSliderMultiSliderMod.IMultiSliderProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MultiSlider {
  
  object Handle {
    
    inline def apply(value: Double): typingsJapgolly.blueprintjsCore.components.MultiSlider.Handle.Builder = {
      val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      new typingsJapgolly.blueprintjsCore.components.MultiSlider.Handle.Builder(js.Array(this.component, __props.asInstanceOf[IHandleProps]))
    }
    
    @JSImport("@blueprintjs/core", "MultiSlider.Handle")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def htmlProps(value: HandleHtmlProps): this.type = set("htmlProps", value.asInstanceOf[js.Any])
      
      inline def intentAfter(value: Intent): this.type = set("intentAfter", value.asInstanceOf[js.Any])
      
      inline def intentBefore(value: Intent): this.type = set("intentBefore", value.asInstanceOf[js.Any])
      
      inline def interactionKind(value: HandleInteractionKind): this.type = set("interactionKind", value.asInstanceOf[js.Any])
      
      inline def onChange(value: /* newValue */ Double => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* newValue */ Double) => value(t0).runNow()))
      
      inline def onRelease(value: /* newValue */ Double => Callback): this.type = set("onRelease", js.Any.fromFunction1((t0: /* newValue */ Double) => value(t0).runNow()))
      
      inline def trackStyleAfter(value: CSSProperties): this.type = set("trackStyleAfter", value.asInstanceOf[js.Any])
      
      inline def trackStyleBefore(value: CSSProperties): this.type = set("trackStyleBefore", value.asInstanceOf[js.Any])
      
      inline def `type`(value: HandleType): this.type = set("type", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: IHandleProps): typingsJapgolly.blueprintjsCore.components.MultiSlider.Handle.Builder = new typingsJapgolly.blueprintjsCore.components.MultiSlider.Handle.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@blueprintjs/core", "MultiSlider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.MultiSlider] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultTrackIntent(value: Intent): this.type = set("defaultTrackIntent", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    
    inline def labelPrecision(value: Double): this.type = set("labelPrecision", value.asInstanceOf[js.Any])
    
    inline def labelRenderer(
      value: Boolean | (js.Function2[/* value */ Double, /* opts */ js.UndefOr[IsHandleTooltip], String | Element])
    ): this.type = set("labelRenderer", value.asInstanceOf[js.Any])
    
    inline def labelRendererFunction2(value: (/* value */ Double, /* opts */ js.UndefOr[IsHandleTooltip]) => String | Element): this.type = set("labelRenderer", js.Any.fromFunction2(value))
    
    inline def labelStepSize(value: Double): this.type = set("labelStepSize", value.asInstanceOf[js.Any])
    
    inline def labelValues(value: js.Array[Double]): this.type = set("labelValues", value.asInstanceOf[js.Any])
    
    inline def labelValuesVarargs(value: Double*): this.type = set("labelValues", js.Array(value*))
    
    inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* values */ js.Array[Double] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* values */ js.Array[Double]) => value(t0).runNow()))
    
    inline def onRelease(value: /* values */ js.Array[Double] => Callback): this.type = set("onRelease", js.Any.fromFunction1((t0: /* values */ js.Array[Double]) => value(t0).runNow()))
    
    inline def showTrackFill(value: Boolean): this.type = set("showTrackFill", value.asInstanceOf[js.Any])
    
    inline def stepSize(value: Double): this.type = set("stepSize", value.asInstanceOf[js.Any])
    
    inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MultiSlider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IMultiSliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
