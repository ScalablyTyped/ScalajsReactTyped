package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaginationLastMod {
  
  @JSImport("react-bootstrap/lib/PaginationLast", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PaginationLastProps, js.Object, Any]
  
  type PaginationLast = japgolly.scalajs.react.facade.React.Component[PaginationLastProps & js.Object, js.Object]
  
  trait PaginationLastProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[PaginationLastProps & js.Object, js.Object]
        ]
  object PaginationLastProps {
    
    inline def apply(): PaginationLastProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationLastProps]
    }
  }
}
