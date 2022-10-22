package typingsJapgolly.rcSelect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.rcSelect.libBaseSelectMod.RenderNode
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransBtnMod extends Shortcut {
  
  @JSImport("rc-select/lib/TransBtn", JSImport.Default)
  @js.native
  val default: FC[TransBtnProps] = js.native
  
  trait TransBtnProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: String
    
    var customizeIcon: RenderNode
    
    var customizeIconProps: js.UndefOr[Any] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  }
  object TransBtnProps {
    
    inline def apply(className: String): TransBtnProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], customizeIcon = null)
      __obj.asInstanceOf[TransBtnProps]
    }
    
    extension [Self <: TransBtnProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setCustomizeIcon(value: RenderNode): Self = StObject.set(x, "customizeIcon", value.asInstanceOf[js.Any])
      
      inline def setCustomizeIconFunction1(value: /* props */ Any => Node): Self = StObject.set(x, "customizeIcon", js.Any.fromFunction1(value))
      
      inline def setCustomizeIconNull: Self = StObject.set(x, "customizeIcon", null)
      
      inline def setCustomizeIconProps(value: Any): Self = StObject.set(x, "customizeIconProps", value.asInstanceOf[js.Any])
      
      inline def setCustomizeIconPropsUndefined: Self = StObject.set(x, "customizeIconProps", js.undefined)
      
      inline def setCustomizeIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "customizeIcon", js.Array(value*))
      
      inline def setCustomizeIconVdomElement(value: VdomElement): Self = StObject.set(x, "customizeIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLSpanElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLSpanElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseDown(value: ReactMouseEventFrom[HTMLSpanElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLSpanElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    }
  }
  
  type _To = FC[TransBtnProps]
  
  /* This means you don't have to write `default`, but can instead just say `libTransBtnMod.foo` */
  override def _to: FC[TransBtnProps] = default
}
