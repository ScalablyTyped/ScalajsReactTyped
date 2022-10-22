package typingsJapgolly.reactstrap

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactstrap.typesLibUtilsMod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibNavbarTogglerMod {
  
  @JSImport("reactstrap/types/lib/NavbarToggler", JSImport.Default)
  @js.native
  open class default ()
    extends Component[NavbarTogglerProps, js.Object, Any]
  
  type NavbarToggler = japgolly.scalajs.react.facade.React.Component[NavbarTogglerProps & js.Object, js.Object]
  
  trait NavbarTogglerProps
    extends StObject
       with ButtonHTMLAttributes[HTMLButtonElement]
       with /* key */ StringDictionary[Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var tag: js.UndefOr[ElementType] = js.undefined
  }
  object NavbarTogglerProps {
    
    inline def apply(): NavbarTogglerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarTogglerProps]
    }
    
    extension [Self <: NavbarTogglerProps](x: Self) {
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setTag(value: ElementType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
