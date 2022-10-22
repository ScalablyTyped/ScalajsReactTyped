package typingsJapgolly.grommet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDocument
import typingsJapgolly.grommet.anon.Bottom
import typingsJapgolly.grommet.es6ComponentsButtonMod.ButtonProps
import typingsJapgolly.grommet.es6ComponentsDropMod.DropProps
import typingsJapgolly.grommet.es6UtilsMod.Omit
import typingsJapgolly.grommet.grommetStrings.color
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsDropButtonMod {
  
  @JSImport("grommet/es6/components/DropButton", "DropButton")
  @js.native
  val DropButton: FC[DropButtonExtendedProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.ButtonHTMLAttributes<std.HTMLButtonElement>, std.HTMLButtonElement>, 'color'> ]: react.react.DetailedHTMLProps<react.react.ButtonHTMLAttributes<std.HTMLButtonElement>, std.HTMLButtonElement>[P]} */ trait DropButtonExtendedProps
    extends StObject
       with DropButtonProps
       with ButtonProps
  object DropButtonExtendedProps {
    
    inline def apply(dropContent: VdomElement): DropButtonExtendedProps = {
      val __obj = js.Dynamic.literal(dropContent = dropContent.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropButtonExtendedProps]
    }
  }
  
  trait DropButtonProps extends StObject {
    
    var dropAlign: js.UndefOr[Bottom] = js.undefined
    
    var dropContent: Element
    
    var dropProps: js.UndefOr[DropProps] = js.undefined
    
    var dropTarget: js.UndefOr[js.Object] = js.undefined
    
    var onClose: js.UndefOr[MouseEventHandler[HTMLDocument | HTMLButtonElement]] = js.undefined
    
    var onOpen: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
  }
  object DropButtonProps {
    
    inline def apply(dropContent: VdomElement): DropButtonProps = {
      val __obj = js.Dynamic.literal(dropContent = dropContent.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropButtonProps]
    }
    
    extension [Self <: DropButtonProps](x: Self) {
      
      inline def setDropAlign(value: Bottom): Self = StObject.set(x, "dropAlign", value.asInstanceOf[js.Any])
      
      inline def setDropAlignUndefined: Self = StObject.set(x, "dropAlign", js.undefined)
      
      inline def setDropContent(value: VdomElement): Self = StObject.set(x, "dropContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDropProps(value: DropProps): Self = StObject.set(x, "dropProps", value.asInstanceOf[js.Any])
      
      inline def setDropPropsUndefined: Self = StObject.set(x, "dropProps", js.undefined)
      
      inline def setDropTarget(value: js.Object): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
      
      inline def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
      
      inline def setOnClose(
        value: ReactMouseEventFrom[(HTMLDocument | HTMLButtonElement) & org.scalajs.dom.Element] => Callback
      ): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: ReactMouseEventFrom[(HTMLDocument | HTMLButtonElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnOpen(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onOpen", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    }
  }
  
  type buttonProps = ButtonProps & (Omit[
    DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
    color
  ])
}
