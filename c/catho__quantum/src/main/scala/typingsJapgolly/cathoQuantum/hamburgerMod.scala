package typingsJapgolly.cathoQuantum

import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hamburgerMod {
  
  @JSImport("@catho/quantum/Hamburger", JSImport.Default)
  @js.native
  open class default ()
    extends Component[HamburgerProps, js.Object, Any]
  
  type Hamburger = japgolly.scalajs.react.facade.React.Component[HamburgerProps & js.Object, js.Object]
  
  trait HamburgerProps extends StObject {
    
    var ariaLabelDescription: js.UndefOr[String] = js.undefined
    
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    var isOpened: js.UndefOr[Boolean] = js.undefined
    
    var showNotification: js.UndefOr[Boolean] = js.undefined
  }
  object HamburgerProps {
    
    inline def apply(): HamburgerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HamburgerProps]
    }
    
    extension [Self <: HamburgerProps](x: Self) {
      
      inline def setAriaLabelDescription(value: String): Self = StObject.set(x, "ariaLabelDescription", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelDescriptionUndefined: Self = StObject.set(x, "ariaLabelDescription", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setIsOpened(value: Boolean): Self = StObject.set(x, "isOpened", value.asInstanceOf[js.Any])
      
      inline def setIsOpenedUndefined: Self = StObject.set(x, "isOpened", js.undefined)
      
      inline def setShowNotification(value: Boolean): Self = StObject.set(x, "showNotification", value.asInstanceOf[js.Any])
      
      inline def setShowNotificationUndefined: Self = StObject.set(x, "showNotification", js.undefined)
    }
  }
}
