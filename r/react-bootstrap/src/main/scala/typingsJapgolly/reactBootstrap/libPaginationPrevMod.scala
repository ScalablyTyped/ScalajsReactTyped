package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaginationPrevMod {
  
  @JSImport("react-bootstrap/lib/PaginationPrev", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PaginationPrevProps, js.Object, Any]
  
  type PaginationPrev = japgolly.scalajs.react.facade.React.Component[PaginationPrevProps & js.Object, js.Object]
  
  trait PaginationPrevProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[PaginationPrevProps & js.Object, js.Object]
        ]
  object PaginationPrevProps {
    
    inline def apply(): PaginationPrevProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationPrevProps]
    }
  }
}
