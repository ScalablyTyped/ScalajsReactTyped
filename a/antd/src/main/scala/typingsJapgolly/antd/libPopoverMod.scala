package typingsJapgolly.antd

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antd.libTooltipMod.AbstractTooltipProps
import typingsJapgolly.antd.libUtilGetRenderPropValueMod.RenderFunction
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPopoverMod extends Shortcut {
  
  @JSImport("antd/lib/popover", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PopoverProps & RefAttributes[Any]] = js.native
  
  trait PopoverProps
    extends StObject
       with AbstractTooltipProps {
    
    var content: js.UndefOr[Node | RenderFunction] = js.undefined
    
    var title: js.UndefOr[Node | RenderFunction] = js.undefined
  }
  object PopoverProps {
    
    inline def apply(): PopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverProps]
    }
    
    extension [Self <: PopoverProps](x: Self) {
      
      inline def setContent(value: Node | RenderFunction): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentCallbackTo(value: CallbackTo[Node]): Self = StObject.set(x, "content", value.toJsFn)
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: Node | RenderFunction): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleCallbackTo(value: CallbackTo[Node]): Self = StObject.set(x, "title", value.toJsFn)
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[PopoverProps & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPopoverMod.foo` */
  override def _to: ForwardRefExoticComponent[PopoverProps & RefAttributes[Any]] = default
}
