package typingsJapgolly.reactBootstrap

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libListGroupMod {
  
  @JSImport("react-bootstrap/lib/ListGroup", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[ListGroupProps, js.Object, Any]
  
  type ListGroup = japgolly.scalajs.react.facade.React.Component[ListGroupProps & js.Object, js.Object]
  
  trait ListGroupProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[ListGroupProps & js.Object, js.Object]
        ] {
    
    var bsClass: js.UndefOr[String] = js.undefined
    
    var componentClass: js.UndefOr[ElementType] = js.undefined
    
    // Added since v0.30.0
    // TODO: Add more specific type
    var fill: js.UndefOr[Boolean] = js.undefined
  }
  object ListGroupProps {
    
    inline def apply(): ListGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListGroupProps]
    }
    
    extension [Self <: ListGroupProps](x: Self) {
      
      inline def setBsClass(value: String): Self = StObject.set(x, "bsClass", value.asInstanceOf[js.Any])
      
      inline def setBsClassUndefined: Self = StObject.set(x, "bsClass", js.undefined)
      
      inline def setComponentClass(value: ElementType): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    }
  }
}
