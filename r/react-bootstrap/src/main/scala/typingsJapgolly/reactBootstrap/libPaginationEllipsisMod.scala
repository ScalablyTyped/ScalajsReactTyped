package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaginationEllipsisMod {
  
  @JSImport("react-bootstrap/lib/PaginationEllipsis", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PaginationEllipsisProps, js.Object, Any]
  
  type PaginationEllipsis = japgolly.scalajs.react.facade.React.Component[PaginationEllipsisProps & js.Object, js.Object]
  
  trait PaginationEllipsisProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[PaginationEllipsisProps & js.Object, js.Object]
        ]
  object PaginationEllipsisProps {
    
    inline def apply(): PaginationEllipsisProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationEllipsisProps]
    }
  }
}
