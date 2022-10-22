package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputGroupAddonMod {
  
  @JSImport("react-bootstrap/lib/InputGroupAddon", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[InputGroupAddonProps, js.Object, Any]
  
  type InputGroupAddon = japgolly.scalajs.react.facade.React.Component[InputGroupAddonProps & js.Object, js.Object]
  
  trait InputGroupAddonProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[InputGroupAddonProps & js.Object, js.Object]
        ] {
    
    var bsClass: js.UndefOr[String] = js.undefined
  }
  object InputGroupAddonProps {
    
    inline def apply(): InputGroupAddonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputGroupAddonProps]
    }
    
    extension [Self <: InputGroupAddonProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
    }
  }
}
