package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaginationItemMod {
  
  @JSImport("react-bootstrap/lib/PaginationItem", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PaginationItemProps, js.Object, Any]
  
  type PaginationItem = japgolly.scalajs.react.facade.React.Component[PaginationItemProps & js.Object, js.Object]
  
  trait PaginationItemProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[PaginationItemProps & js.Object, js.Object]
        ] {
    
    var active: js.UndefOr[Boolean] = js.undefined
  }
  object PaginationItemProps {
    
    inline def apply(): PaginationItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationItemProps]
    }
    
    extension [Self <: PaginationItemProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    }
  }
}
