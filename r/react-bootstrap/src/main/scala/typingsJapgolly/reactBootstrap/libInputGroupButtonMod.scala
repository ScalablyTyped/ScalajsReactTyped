package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputGroupButtonMod {
  
  @JSImport("react-bootstrap/lib/InputGroupButton", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[InputGroupButtonProps, js.Object, Any]
  
  type InputGroupButton = japgolly.scalajs.react.facade.React.Component[InputGroupButtonProps & js.Object, js.Object]
  
  trait InputGroupButtonProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[InputGroupButtonProps & js.Object, js.Object]
        ] {
    
    var bsClass: js.UndefOr[String] = js.undefined
  }
  object InputGroupButtonProps {
    
    inline def apply(): InputGroupButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputGroupButtonProps]
    }
    
    extension [Self <: InputGroupButtonProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
    }
  }
}
