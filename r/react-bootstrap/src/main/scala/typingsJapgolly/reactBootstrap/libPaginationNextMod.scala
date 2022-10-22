package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaginationNextMod {
  
  @JSImport("react-bootstrap/lib/PaginationNext", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[PaginationNextProps, js.Object, Any]
  
  type PaginationNext = japgolly.scalajs.react.facade.React.Component[PaginationNextProps & js.Object, js.Object]
  
  trait PaginationNextProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[PaginationNextProps & js.Object, js.Object]
        ]
  object PaginationNextProps {
    
    inline def apply(): PaginationNextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationNextProps]
    }
  }
}
