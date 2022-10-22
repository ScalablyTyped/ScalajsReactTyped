package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMediaRightMod {
  
  @JSImport("react-bootstrap/lib/MediaRight", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[MediaRightProps, js.Object, Any]
  
  type MediaRight = japgolly.scalajs.react.facade.React.Component[MediaRightProps & js.Object, js.Object]
  
  trait MediaRightProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[MediaRightProps & js.Object, js.Object]
        ] {
    
    var align: js.UndefOr[String] = js.undefined
  }
  object MediaRightProps {
    
    inline def apply(): MediaRightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaRightProps]
    }
    
    extension [Self <: MediaRightProps](x: Self) {
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    }
  }
}
