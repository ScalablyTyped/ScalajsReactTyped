package typingsJapgolly.devextremeRuntime

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmInfernoPortalMod {
  
  @JSImport("@devextreme/runtime/esm/inferno/portal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Portal(hasContainerChildren: PortalProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Portal")(hasContainerChildren.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait PortalProps extends StObject {
    
    var children: Any
    
    var container: js.UndefOr[HTMLElement | Null] = js.undefined
  }
  object PortalProps {
    
    inline def apply(children: Any): PortalProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[PortalProps]
    }
    
    extension [Self <: PortalProps](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    }
  }
}
