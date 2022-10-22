package typingsJapgolly.rcVirtualList

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esFillerMod extends Shortcut {
  
  /**
    * Fill component to provided the scroll content real height.
    */
  @JSImport("rc-virtual-list/es/Filler", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[FillerProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait FillerProps extends StObject {
    
    var children: Node
    
    /** Virtual filler height. Should be `count * itemMinHeight` */
    var height: Double
    
    /** Set offset of visible items. Should be the top of start item position */
    var offset: js.UndefOr[Double] = js.undefined
    
    var onInnerResize: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object FillerProps {
    
    inline def apply(height: Double): FillerProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[FillerProps]
    }
    
    extension [Self <: FillerProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnInnerResize(value: Callback): Self = StObject.set(x, "onInnerResize", value.toJsFn)
      
      inline def setOnInnerResizeUndefined: Self = StObject.set(x, "onInnerResize", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[FillerProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esFillerMod.foo` */
  override def _to: ForwardRefExoticComponent[FillerProps & RefAttributes[HTMLDivElement]] = default
}
