package typingsJapgolly.cathoQuantum

import typingsJapgolly.cathoQuantum.buttonMod.ButtonProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socialButtonMod {
  
  @JSImport("@catho/quantum/SocialButton", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SocialButtonProps, js.Object, Any]
  
  type SocialButton = japgolly.scalajs.react.facade.React.Component[SocialButtonProps & js.Object, js.Object]
  
  trait SocialButtonProps
    extends StObject
       with ButtonProps {
    
    var provider: String
  }
  object SocialButtonProps {
    
    inline def apply(provider: String): SocialButtonProps = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocialButtonProps]
    }
    
    extension [Self <: SocialButtonProps](x: Self) {
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
}
