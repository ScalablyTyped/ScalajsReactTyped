package typingsJapgolly.reactDocumentTitle

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ReactChild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-document-title", JSImport.Default)
  @js.native
  open class default () extends Component[DocumentTitleProps, Any, Any]
  
  type DocumentTitle = japgolly.scalajs.react.facade.React.Component[DocumentTitleProps & js.Object, js.Object]
  
  trait DocumentTitleProps extends StObject {
    
    var children: js.UndefOr[ReactChild | Null] = js.undefined
    
    var title: String
  }
  object DocumentTitleProps {
    
    inline def apply(title: String): DocumentTitleProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentTitleProps]
    }
    
    extension [Self <: DocumentTitleProps](x: Self) {
      
      inline def setChildren(value: ReactChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
