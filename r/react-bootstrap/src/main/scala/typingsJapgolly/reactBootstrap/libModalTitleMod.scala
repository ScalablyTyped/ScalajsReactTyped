package typingsJapgolly.reactBootstrap

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalTitleMod {
  
  @JSImport("react-bootstrap/lib/ModalTitle", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[ModalTitleProps, js.Object, Any]
  
  type ModalTitle = japgolly.scalajs.react.facade.React.Component[ModalTitleProps & js.Object, js.Object]
  
  trait ModalTitleProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[ModalTitleProps & js.Object, js.Object]
        ] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var componentClass: js.UndefOr[ElementType] = js.undefined
  }
  object ModalTitleProps {
    
    inline def apply(): ModalTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalTitleProps]
    }
    
    extension [Self <: ModalTitleProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setComponentClass(value: ElementType): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
