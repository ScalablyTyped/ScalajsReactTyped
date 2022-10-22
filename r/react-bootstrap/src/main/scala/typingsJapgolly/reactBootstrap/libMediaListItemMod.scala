package typingsJapgolly.reactBootstrap

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMediaListItemMod {
  
  @JSImport("react-bootstrap/lib/MediaListItem", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[MediaListItemProps, js.Object, Any]
  
  type MediaListItem = japgolly.scalajs.react.facade.React.Component[MediaListItemProps & js.Object, js.Object]
  
  trait MediaListItemProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[MediaListItemProps & js.Object, js.Object]
        ] {
    
    var componentClass: js.UndefOr[ElementType] = js.undefined
  }
  object MediaListItemProps {
    
    inline def apply(): MediaListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaListItemProps]
    }
    
    extension [Self <: MediaListItemProps](x: Self) {
      
      inline def setComponentClass(value: ElementType): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
