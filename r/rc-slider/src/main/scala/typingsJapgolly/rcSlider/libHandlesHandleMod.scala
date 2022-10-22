package typingsJapgolly.rcSlider

import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.rcSlider.libInterfaceMod.OnStartMove
import typingsJapgolly.rcSlider.rcSliderStrings.max
import typingsJapgolly.rcSlider.rcSliderStrings.min
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandlesHandleMod extends Shortcut {
  
  @JSImport("rc-slider/lib/Handles/Handle", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[HandleProps & RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait HandleProps extends StObject {
    
    var dragging: Boolean = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[HTMLDivElement], Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* e */ ReactFocusEventFrom[HTMLDivElement], Unit]] = js.native
    
    def onOffsetChange(value: min | max, valueIndex: Double): Unit = js.native
    def onOffsetChange(value: Double, valueIndex: Double): Unit = js.native
    
    var onStartMove: OnStartMove = js.native
    
    var prefixCls: String = js.native
    
    var render: js.UndefOr[js.Function2[/* origin */ Element, /* props */ RenderProps, Element]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var value: Double = js.native
    
    var valueIndex: Double = js.native
  }
  
  trait RenderProps extends StObject {
    
    var dragging: Boolean
    
    var index: Double
    
    var prefixCls: String
    
    var value: Double
  }
  object RenderProps {
    
    inline def apply(dragging: Boolean, index: Double, prefixCls: String, value: Double): RenderProps = {
      val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderProps]
    }
    
    extension [Self <: RenderProps](x: Self) {
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[HandleProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `libHandlesHandleMod.foo` */
  override def _to: ForwardRefExoticComponent[HandleProps & RefAttributes[HTMLDivElement]] = default
}
