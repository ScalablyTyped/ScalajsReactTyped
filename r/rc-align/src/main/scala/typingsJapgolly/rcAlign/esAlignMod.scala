package typingsJapgolly.rcAlign

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import typingsJapgolly.rcAlign.esInterfaceMod.AlignResult
import typingsJapgolly.rcAlign.esInterfaceMod.AlignType
import typingsJapgolly.rcAlign.esInterfaceMod.TargetType
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAlignMod extends Shortcut {
  
  @JSImport("rc-align/es/Align", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[AlignProps & RefAttributes[RefAlign]] = js.native
  
  trait AlignProps extends StObject {
    
    var align: AlignType
    
    var children: Element
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var monitorBufferTime: js.UndefOr[Double] = js.undefined
    
    var monitorWindowResize: js.UndefOr[Boolean] = js.undefined
    
    var onAlign: js.UndefOr[OnAlign] = js.undefined
    
    var target: TargetType
  }
  object AlignProps {
    
    inline def apply(align: AlignType, children: VdomElement, target: TargetType): AlignProps = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], children = children.rawElement.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlignProps]
    }
    
    extension [Self <: AlignProps](x: Self) {
      
      inline def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setMonitorBufferTime(value: Double): Self = StObject.set(x, "monitorBufferTime", value.asInstanceOf[js.Any])
      
      inline def setMonitorBufferTimeUndefined: Self = StObject.set(x, "monitorBufferTime", js.undefined)
      
      inline def setMonitorWindowResize(value: Boolean): Self = StObject.set(x, "monitorWindowResize", value.asInstanceOf[js.Any])
      
      inline def setMonitorWindowResizeUndefined: Self = StObject.set(x, "monitorWindowResize", js.undefined)
      
      inline def setOnAlign(value: (/* source */ HTMLElement, /* result */ AlignResult) => Callback): Self = StObject.set(x, "onAlign", js.Any.fromFunction2((t0: /* source */ HTMLElement, t1: /* result */ AlignResult) => (value(t0, t1)).runNow()))
      
      inline def setOnAlignUndefined: Self = StObject.set(x, "onAlign", js.undefined)
      
      inline def setTarget(value: TargetType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetCallbackTo(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "target", value.toJsFn)
    }
  }
  
  type OnAlign = js.Function2[/* source */ HTMLElement, /* result */ AlignResult, Unit]
  
  trait RefAlign extends StObject {
    
    def forceAlign(): Unit
  }
  object RefAlign {
    
    inline def apply(forceAlign: Callback): RefAlign = {
      val __obj = js.Dynamic.literal(forceAlign = forceAlign.toJsFn)
      __obj.asInstanceOf[RefAlign]
    }
    
    extension [Self <: RefAlign](x: Self) {
      
      inline def setForceAlign(value: Callback): Self = StObject.set(x, "forceAlign", value.toJsFn)
    }
  }
  
  type _To = ForwardRefExoticComponent[AlignProps & RefAttributes[RefAlign]]
  
  /* This means you don't have to write `default`, but can instead just say `esAlignMod.foo` */
  override def _to: ForwardRefExoticComponent[AlignProps & RefAttributes[RefAlign]] = default
}
