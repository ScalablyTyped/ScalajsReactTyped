package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMediaLeftMod {
  
  @JSImport("react-bootstrap/lib/MediaLeft", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[MediaLeftProps, js.Object, Any]
  
  type MediaLeft = japgolly.scalajs.react.facade.React.Component[MediaLeftProps & js.Object, js.Object]
  
  trait MediaLeftProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[MediaLeftProps & js.Object, js.Object]
        ] {
    
    var align: js.UndefOr[String] = js.undefined
  }
  object MediaLeftProps {
    
    inline def apply(): MediaLeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaLeftProps]
    }
    
    extension [Self <: MediaLeftProps](x: Self) {
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    }
  }
}
