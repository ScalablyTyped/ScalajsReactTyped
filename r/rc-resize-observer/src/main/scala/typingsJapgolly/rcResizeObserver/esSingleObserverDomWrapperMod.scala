package typingsJapgolly.rcResizeObserver

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSingleObserverDomWrapperMod {
  
  @JSImport("rc-resize-observer/es/SingleObserver/DomWrapper", JSImport.Default)
  @js.native
  open class default () extends DomWrapper
  
  @js.native
  trait DomWrapper
    extends Component[DomWrapperProps, js.Object, Any]
  
  trait DomWrapperProps extends StObject {
    
    var children: Element
  }
  object DomWrapperProps {
    
    inline def apply(children: VdomElement): DomWrapperProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomWrapperProps]
    }
    
    extension [Self <: DomWrapperProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
