package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelpBlockMod {
  
  @JSImport("react-bootstrap/lib/HelpBlock", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[HelpBlockProps, js.Object, Any]
  
  type HelpBlock = japgolly.scalajs.react.facade.React.Component[HelpBlockProps & js.Object, js.Object]
  
  trait HelpBlockProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[HelpBlockProps & js.Object, js.Object]
        ] {
    
    var bsClass: js.UndefOr[String] = js.undefined
  }
  object HelpBlockProps {
    
    inline def apply(): HelpBlockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelpBlockProps]
    }
    
    extension [Self <: HelpBlockProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
    }
  }
}
