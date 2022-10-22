package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPanelFooterMod {
  
  @JSImport("react-bootstrap/lib/PanelFooter", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PanelFooterProps, js.Object, Any]
  
  type PanelFooter = japgolly.scalajs.react.facade.React.Component[PanelFooterProps & js.Object, js.Object]
  
  trait PanelFooterProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[PanelFooterProps & js.Object, js.Object]
        ] {
    
    var bsClass: js.UndefOr[String] = js.undefined
  }
  object PanelFooterProps {
    
    inline def apply(): PanelFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelFooterProps]
    }
    
    extension [Self <: PanelFooterProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
    }
  }
}
