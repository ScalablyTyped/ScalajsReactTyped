package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactBootstrap.mod.SelectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDropdownMenuMod {
  
  @JSImport("react-bootstrap/lib/DropdownMenu", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[DropdownMenuProps, js.Object, Any]
  
  type DropdownMenu = japgolly.scalajs.react.facade.React.Component[DropdownMenuProps & js.Object, js.Object]
  
  trait DropdownMenuProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[DropdownMenuProps & js.Object, js.Object]
        ] {
    
    var labelledBy: js.UndefOr[String | Double] = js.undefined
    
    var onClose: js.UndefOr[js.Function] = js.undefined
    
    @JSName("onSelect")
    var onSelect_DropdownMenuProps: js.UndefOr[SelectCallback] = js.undefined
    
    var pullRight: js.UndefOr[Boolean] = js.undefined
  }
  object DropdownMenuProps {
    
    inline def apply(): DropdownMenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownMenuProps]
    }
    
    extension [Self <: DropdownMenuProps](x: Self) {
      
      inline def setLabelledBy(value: String | Double): Self = StObject.set(x, "labelledBy", value.asInstanceOf[js.Any])
      
      inline def setLabelledByUndefined: Self = StObject.set(x, "labelledBy", js.undefined)
      
      inline def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnSelect(value: SelectCallback): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setPullRight(value: Boolean): Self = StObject.set(x, "pullRight", value.asInstanceOf[js.Any])
      
      inline def setPullRightUndefined: Self = StObject.set(x, "pullRight", js.undefined)
    }
  }
}
