package typingsJapgolly.rcSlider.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcSlider.libHandlesHandleMod.RenderProps
import typingsJapgolly.rcSlider.libHandlesMod.HandlesProps
import typingsJapgolly.rcSlider.libHandlesMod.HandlesRef
import typingsJapgolly.rcSlider.rcSliderStrings.max
import typingsJapgolly.rcSlider.rcSliderStrings.min
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Handles {
  
  inline def apply(
    draggingIndex: Double,
    onOffsetChange: (Double | max | min, Double) => Callback,
    onStartMove: (/* e */ ReactMouseEventFrom[Element] | ReactTouchEventFrom[Element], /* valueIndex */ Double) => Callback,
    prefixCls: String,
    values: js.Array[Double]
  ): Builder = {
    val __props = js.Dynamic.literal(draggingIndex = draggingIndex.asInstanceOf[js.Any], onOffsetChange = js.Any.fromFunction2((t0: Double | max | min, t1: Double) => (onOffsetChange(t0, t1)).runNow()), onStartMove = js.Any.fromFunction2((t0: /* e */ ReactMouseEventFrom[Element] | ReactTouchEventFrom[Element], t1: /* valueIndex */ Double) => (onStartMove(t0, t1)).runNow()), prefixCls = prefixCls.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HandlesProps & RefAttributes[HandlesRef]]))
  }
  
  @JSImport("rc-slider/lib/Handles", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HandlesRef] {
    
    inline def handleRender(
      value: (/* origin */ japgolly.scalajs.react.facade.React.Element, /* props */ RenderProps) => japgolly.scalajs.react.facade.React.Element
    ): this.type = set("handleRender", js.Any.fromFunction2(value))
    
    inline def onBlur(value: /* e */ ReactFocusEventFrom[HTMLDivElement] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* e */ ReactFocusEventFrom[HTMLDivElement]) => value(t0).runNow()))
    
    inline def onFocus(value: /* e */ ReactFocusEventFrom[HTMLDivElement] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* e */ ReactFocusEventFrom[HTMLDivElement]) => value(t0).runNow()))
    
    inline def style(value: CSSProperties | js.Array[CSSProperties]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleVarargs(value: CSSProperties*): this.type = set("style", js.Array(value*))
  }
  
  def withProps(p: HandlesProps & RefAttributes[HandlesRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
