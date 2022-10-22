package typingsJapgolly.reactstrap

import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactstrap.reactstrapStrings.black
import typingsJapgolly.reactstrap.reactstrapStrings.white
import typingsJapgolly.reactstrap.typesLibUtilsMod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibCloseButtonMod {
  
  @JSImport("reactstrap/types/lib/CloseButton", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CloseButtonProps, js.Object, Any]
  
  type CloseButton = japgolly.scalajs.react.facade.React.Component[CloseButtonProps & js.Object, js.Object]
  
  trait CloseButtonProps
    extends StObject
       with ButtonHTMLAttributes[HTMLButtonElement] {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var variant: js.UndefOr[white | black] = js.undefined
  }
  object CloseButtonProps {
    
    inline def apply(): CloseButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseButtonProps]
    }
    
    extension [Self <: CloseButtonProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setVariant(value: white | black): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
