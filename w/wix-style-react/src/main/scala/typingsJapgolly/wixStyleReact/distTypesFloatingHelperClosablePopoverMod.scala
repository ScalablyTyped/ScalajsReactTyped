package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFloatingHelperClosablePopoverMod {
  
  @JSImport("wix-style-react/dist/types/FloatingHelper/ClosablePopover", JSImport.Default)
  @js.native
  open class default () extends ClosablePopover
  
  @js.native
  trait ClosablePopover
    extends PureComponent[ClosablePopoverProps, js.Object, Any] {
    
    def close(): Unit = js.native
    
    def open(): Unit = js.native
  }
  
  trait ClosablePopoverProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var closeOnMouseLeave: js.UndefOr[Boolean] = js.undefined
    
    var content: js.Function
    
    var initiallyOpened: js.UndefOr[Boolean] = js.undefined
    
    var onClose: js.UndefOr[js.Function] = js.undefined
    
    var onOpen: js.UndefOr[js.Function] = js.undefined
    
    var opened: js.UndefOr[Boolean] = js.undefined
    
    var target: Node
  }
  object ClosablePopoverProps {
    
    inline def apply(content: js.Function): ClosablePopoverProps = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], target = null)
      __obj.asInstanceOf[ClosablePopoverProps]
    }
    
    extension [Self <: ClosablePopoverProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCloseOnMouseLeave(value: Boolean): Self = StObject.set(x, "closeOnMouseLeave", value.asInstanceOf[js.Any])
      
      inline def setCloseOnMouseLeaveUndefined: Self = StObject.set(x, "closeOnMouseLeave", js.undefined)
      
      inline def setContent(value: js.Function): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setInitiallyOpened(value: Boolean): Self = StObject.set(x, "initiallyOpened", value.asInstanceOf[js.Any])
      
      inline def setInitiallyOpenedUndefined: Self = StObject.set(x, "initiallyOpened", js.undefined)
      
      inline def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnOpen(value: js.Function): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
      
      inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
      
      inline def setTarget(value: VdomNode): Self = StObject.set(x, "target", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "target", js.Array(value*))
      
      inline def setTargetVdomElement(value: VdomElement): Self = StObject.set(x, "target", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
