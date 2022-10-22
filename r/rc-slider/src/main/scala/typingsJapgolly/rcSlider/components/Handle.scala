package typingsJapgolly.rcSlider.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcSlider.libHandlesHandleMod.HandleProps
import typingsJapgolly.rcSlider.libHandlesHandleMod.RenderProps
import typingsJapgolly.rcSlider.rcSliderStrings.max
import typingsJapgolly.rcSlider.rcSliderStrings.min
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Handle {
  
  inline def apply(
    dragging: Boolean,
    onOffsetChange: (Double | max | min, Double) => Callback,
    onStartMove: (/* e */ ReactMouseEventFrom[Element] | ReactTouchEventFrom[Element], /* valueIndex */ Double) => Callback,
    prefixCls: String,
    value: Double,
    valueIndex: Double
  ): Builder = {
    val __props = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], onOffsetChange = js.Any.fromFunction2((t0: Double | max | min, t1: Double) => (onOffsetChange(t0, t1)).runNow()), onStartMove = js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[Element] | ReactTouchEventFrom[Element], t1: /* valueIndex */ Double) => (onStartMove(t0, t1)).runNow()), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueIndex = valueIndex.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HandleProps & RefAttributes[HTMLDivElement]]))
  }
  
  @JSImport("rc-slider/lib/Handles/Handle", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLDivElement] {
    
    inline def onBlur(value: /* e */ ReactFocusEventFrom[HTMLDivElement] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* e */ ReactFocusEventFrom[HTMLDivElement]) => value(t0).runNow()))
    
    inline def onFocus(value: /* e */ ReactFocusEventFrom[HTMLDivElement] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* e */ ReactFocusEventFrom[HTMLDivElement]) => value(t0).runNow()))
    
    inline def render(
      value: (/* origin */ japgolly.scalajs.react.facade.React.Element, /* props */ RenderProps) => japgolly.scalajs.react.facade.React.Element
    ): this.type = set("render", js.Any.fromFunction2(value))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HandleProps & RefAttributes[HTMLDivElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
