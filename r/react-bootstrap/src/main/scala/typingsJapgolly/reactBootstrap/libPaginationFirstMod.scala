package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaginationFirstMod {
  
  @JSImport("react-bootstrap/lib/PaginationFirst", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PaginationFirstProps, js.Object, Any]
  
  type PaginationFirst = japgolly.scalajs.react.facade.React.Component[PaginationFirstProps & js.Object, js.Object]
  
  trait PaginationFirstProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[PaginationFirstProps & js.Object, js.Object]
        ]
  object PaginationFirstProps {
    
    inline def apply(): PaginationFirstProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationFirstProps]
    }
  }
}
