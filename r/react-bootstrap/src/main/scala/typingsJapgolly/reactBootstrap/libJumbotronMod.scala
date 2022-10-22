package typingsJapgolly.reactBootstrap

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJumbotronMod {
  
  @JSImport("react-bootstrap/lib/Jumbotron", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[JumbotronProps, js.Object, Any]
  
  type Jumbotron = japgolly.scalajs.react.facade.React.Component[JumbotronProps & js.Object, js.Object]
  
  trait JumbotronProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[JumbotronProps & js.Object, js.Object]
        ] {
    
    var componentClass: js.UndefOr[ElementType] = js.undefined
  }
  object JumbotronProps {
    
    inline def apply(): JumbotronProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JumbotronProps]
    }
    
    extension [Self <: JumbotronProps](x: Self) {
      
      inline def setComponentClass(value: ElementType): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
