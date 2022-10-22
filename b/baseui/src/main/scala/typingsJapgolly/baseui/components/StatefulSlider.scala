package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.sliderTypesMod.Params
import typingsJapgolly.baseui.sliderTypesMod.SliderOverrides
import typingsJapgolly.baseui.sliderTypesMod.State
import typingsJapgolly.baseui.sliderTypesMod.StatefulSliderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulSlider {
  
  @JSImport("baseui/slider", "StatefulSlider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def initialState(value: State): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    inline def marks(value: Boolean): this.type = set("marks", value.asInstanceOf[js.Any])
    
    inline def max(value: Double): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def min(value: Double): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* a */ Params => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def onFinalChange(value: /* a */ Params => Any): this.type = set("onFinalChange", js.Any.fromFunction1(value))
    
    inline def overrides(value: SliderOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def persistentThumb(value: Boolean): this.type = set("persistentThumb", value.asInstanceOf[js.Any])
    
    inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def valueToLabel(value: /* value */ Double => Node): this.type = set("valueToLabel", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: StatefulSlider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StatefulSliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
