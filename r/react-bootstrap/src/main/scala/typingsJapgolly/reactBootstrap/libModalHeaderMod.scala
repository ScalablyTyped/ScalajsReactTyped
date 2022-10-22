package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalHeaderMod {
  
  @JSImport("react-bootstrap/lib/ModalHeader", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[ModalHeaderProps, js.Object, Any]
  
  type ModalHeader = japgolly.scalajs.react.facade.React.Component[ModalHeaderProps & js.Object, js.Object]
  
  trait ModalHeaderProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[ModalHeaderProps & js.Object, js.Object]
        ] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var closeButton: js.UndefOr[Boolean] = js.undefined
    
    var closeLabel: js.UndefOr[String] = js.undefined
    
    var onHide: js.UndefOr[js.Function] = js.undefined
  }
  object ModalHeaderProps {
    
    inline def apply(): ModalHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalHeaderProps]
    }
    
    extension [Self <: ModalHeaderProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
      
      inline def setCloseLabel(value: String): Self = StObject.set(x, "closeLabel", value.asInstanceOf[js.Any])
      
      inline def setCloseLabelUndefined: Self = StObject.set(x, "closeLabel", js.undefined)
      
      inline def setOnHide(value: js.Function): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    }
  }
}
