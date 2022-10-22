package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.anon.IsHandleTooltip
import typingsJapgolly.blueprintjsCore.libEsmCommonIntentMod.Intent
import typingsJapgolly.blueprintjsCore.libEsmComponentsSliderHandlePropsMod.HandleHtmlProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsSliderSliderMod.ISliderProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slider {
  
  @JSImport("@blueprintjs/core", "Slider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.Slider] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def handleHtmlProps(value: HandleHtmlProps): this.type = set("handleHtmlProps", value.asInstanceOf[js.Any])
    
    inline def initialValue(value: Double): this.type = set("initialValue", value.asInstanceOf[js.Any])
    
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
    
    inline def onChange(value: /* value */ Double => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def onRelease(value: /* value */ Double => Callback): this.type = set("onRelease", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def showTrackFill(value: Boolean): this.type = set("showTrackFill", value.asInstanceOf[js.Any])
    
    inline def stepSize(value: Double): this.type = set("stepSize", value.asInstanceOf[js.Any])
    
    inline def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Slider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ISliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
