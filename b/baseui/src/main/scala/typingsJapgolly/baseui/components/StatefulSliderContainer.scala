package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.Params
import typingsJapgolly.baseui.sliderStatefulSliderContainerMod.default
import typingsJapgolly.baseui.sliderTypesMod.SliderOverrides
import typingsJapgolly.baseui.sliderTypesMod.SliderProps
import typingsJapgolly.baseui.sliderTypesMod.State
import typingsJapgolly.baseui.sliderTypesMod.StatefulContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulSliderContainer {
  
  inline def apply(
    children: SliderProps => Node,
    max: Double,
    min: Double,
    onChange: Params => Any,
    onFinalChange: Params => Any,
    stateReducer: (/* stateType */ String, /* nextState */ State, /* currentState */ State) => State,
    step: Double
  ): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), onFinalChange = js.Any.fromFunction1(onFinalChange), stateReducer = js.Any.fromFunction3(stateReducer), step = step.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StatefulContainerProps]))
  }
  
  @JSImport("baseui/slider/stateful-slider-container", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def initialState(value: State): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    inline def overrides(value: SliderOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StatefulContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
