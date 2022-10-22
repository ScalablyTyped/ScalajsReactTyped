package typingsJapgolly.reactBootstrap

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMediaHeadingMod {
  
  @JSImport("react-bootstrap/lib/MediaHeading", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[MediaHeadingProps, js.Object, Any]
  
  type MediaHeading = japgolly.scalajs.react.facade.React.Component[MediaHeadingProps & js.Object, js.Object]
  
  trait MediaHeadingProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[MediaHeadingProps & js.Object, js.Object]
        ] {
    
    var componentClass: js.UndefOr[ElementType] = js.undefined
  }
  object MediaHeadingProps {
    
    inline def apply(): MediaHeadingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaHeadingProps]
    }
    
    extension [Self <: MediaHeadingProps](x: Self) {
      
      inline def setComponentClass(value: ElementType): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
