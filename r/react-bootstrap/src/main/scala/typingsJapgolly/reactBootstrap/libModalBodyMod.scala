package typingsJapgolly.reactBootstrap

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalBodyMod {
  
  @JSImport("react-bootstrap/lib/ModalBody", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[ModalBodyProps, js.Object, Any]
  
  type ModalBody = japgolly.scalajs.react.facade.React.Component[ModalBodyProps & js.Object, js.Object]
  
  trait ModalBodyProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[ModalBodyProps & js.Object, js.Object]
        ] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var componentClass: js.UndefOr[ElementType] = js.undefined
  }
  object ModalBodyProps {
    
    inline def apply(): ModalBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalBodyProps]
    }
    
    extension [Self <: ModalBodyProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setComponentClass(value: ElementType): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
