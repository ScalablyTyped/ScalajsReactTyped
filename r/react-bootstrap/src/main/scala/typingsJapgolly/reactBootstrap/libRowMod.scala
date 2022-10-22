package typingsJapgolly.reactBootstrap

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRowMod {
  
  @JSImport("react-bootstrap/lib/Row", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[RowProps, js.Object, Any]
  
  type Row = japgolly.scalajs.react.facade.React.Component[RowProps & js.Object, js.Object]
  
  trait RowProps
    extends StObject
       with HTMLProps[japgolly.scalajs.react.facade.React.Component[RowProps & js.Object, js.Object]] {
    
    var componentClass: js.UndefOr[ElementType] = js.undefined
  }
  object RowProps {
    
    inline def apply(): RowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowProps]
    }
    
    extension [Self <: RowProps](x: Self) {
      
      inline def setComponentClass(value: ElementType): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
