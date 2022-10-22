package typingsJapgolly.rcSlider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.rcSlider.libHandlesHandleMod.RenderProps
import typingsJapgolly.rcSlider.libInterfaceMod.OnStartMove
import typingsJapgolly.rcSlider.rcSliderStrings.max
import typingsJapgolly.rcSlider.rcSliderStrings.min
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandlesMod extends Shortcut {
  
  @JSImport("rc-slider/lib/Handles", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[HandlesProps & RefAttributes[HandlesRef]] = js.native
  
  @js.native
  trait HandlesProps extends StObject {
    
    var draggingIndex: Double = js.native
    
    var handleRender: js.UndefOr[js.Function2[/* origin */ Element, /* props */ RenderProps, Element]] = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[HTMLDivElement], Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[HTMLDivElement], Unit]] = js.native
    
    def onOffsetChange(value: min | max, valueIndex: Double): Unit = js.native
    def onOffsetChange(value: Double, valueIndex: Double): Unit = js.native
    
    var onStartMove: OnStartMove = js.native
    
    var prefixCls: String = js.native
    
    var style: js.UndefOr[CSSProperties | js.Array[CSSProperties]] = js.native
    
    var values: js.Array[Double] = js.native
  }
  
  trait HandlesRef extends StObject {
    
    def focus(index: Double): Unit
  }
  object HandlesRef {
    
    inline def apply(focus: Double => Callback): HandlesRef = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction1((t0: Double) => focus(t0).runNow()))
      __obj.asInstanceOf[HandlesRef]
    }
    
    extension [Self <: HandlesRef](x: Self) {
      
      inline def setFocus(value: Double => Callback): Self = StObject.set(x, "focus", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
  
  type _To = ForwardRefExoticComponent[HandlesProps & RefAttributes[HandlesRef]]
  
  /* This means you don't have to write `default`, but can instead just say `libHandlesMod.foo` */
  override def _to: ForwardRefExoticComponent[HandlesProps & RefAttributes[HandlesRef]] = default
}
