package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMediaListMod {
  
  @JSImport("react-bootstrap/lib/MediaList", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[MediaListProps, js.Object, Any]
  
  type MediaList = japgolly.scalajs.react.facade.React.Component[MediaListProps & js.Object, js.Object]
  
  trait MediaListProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[MediaListProps & js.Object, js.Object]
        ]
  object MediaListProps {
    
    inline def apply(): MediaListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaListProps]
    }
  }
}
