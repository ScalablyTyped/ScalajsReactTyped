package typingsJapgolly.reactFloater

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactFloater.libTypesMod.HandlerFunction
import typingsJapgolly.reactFloater.libTypesMod.Statuses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsWrapperMod extends Shortcut {
  
  @JSImport("react-floater/lib/components/Wrapper", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[js.Function1[/* props */ Props, Element | Null]] = js.native
  
  trait Props extends StObject {
    
    var childRef: RefHandle[HTMLElement]
    
    var children: Node
    
    var id: String
    
    var isControlled: Boolean
    
    var onClick: HandlerFunction[HTMLSpanElement]
    
    var onMouseEnter: HandlerFunction[HTMLSpanElement]
    
    var onMouseLeave: HandlerFunction[HTMLSpanElement]
    
    var status: Statuses
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var styles: CSSProperties
    
    var wrapperRef: RefHandle[HTMLElement]
  }
  object Props {
    
    inline def apply(
      childRef: RefHandle[HTMLElement],
      id: String,
      isControlled: Boolean,
      onClick: /* event */ ReactEventFrom[HTMLSpanElement & org.scalajs.dom.Element] => Callback,
      onMouseEnter: /* event */ ReactEventFrom[HTMLSpanElement & org.scalajs.dom.Element] => Callback,
      onMouseLeave: /* event */ ReactEventFrom[HTMLSpanElement & org.scalajs.dom.Element] => Callback,
      status: Statuses,
      styles: CSSProperties,
      wrapperRef: RefHandle[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal(childRef = childRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isControlled = isControlled.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLSpanElement & org.scalajs.dom.Element]) => onClick(t0).runNow()), onMouseEnter = js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLSpanElement & org.scalajs.dom.Element]) => onMouseEnter(t0).runNow()), onMouseLeave = js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLSpanElement & org.scalajs.dom.Element]) => onMouseLeave(t0).runNow()), status = status.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], wrapperRef = wrapperRef.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildRef(value: RefHandle[HTMLElement]): Self = StObject.set(x, "childRef", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsControlled(value: Boolean): Self = StObject.set(x, "isControlled", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: /* event */ ReactEventFrom[HTMLSpanElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLSpanElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnter(value: /* event */ ReactEventFrom[HTMLSpanElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLSpanElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeave(value: /* event */ ReactEventFrom[HTMLSpanElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLSpanElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setStatus(value: Statuses): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: CSSProperties): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setWrapperRef(value: RefHandle[HTMLElement]): Self = StObject.set(x, "wrapperRef", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = MemoExoticComponent[js.Function1[/* props */ Props, Element | Null]]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsWrapperMod.foo` */
  override def _to: MemoExoticComponent[js.Function1[/* props */ Props, Element | Null]] = default
}
