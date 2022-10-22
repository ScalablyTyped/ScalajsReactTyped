package typingsJapgolly.reactstrap

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactstrap.typesLibUtilsMod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibListGroupItemHeadingMod {
  
  @JSImport("reactstrap/types/lib/ListGroupItemHeading", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ListGroupItemHeadingProps, js.Object, Any]
  
  type ListGroupItemHeading = japgolly.scalajs.react.facade.React.Component[ListGroupItemHeadingProps & js.Object, js.Object]
  
  trait ListGroupItemHeadingProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var tag: js.UndefOr[ElementType] = js.undefined
  }
  object ListGroupItemHeadingProps {
    
    inline def apply(): ListGroupItemHeadingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListGroupItemHeadingProps]
    }
    
    extension [Self <: ListGroupItemHeadingProps](x: Self) {
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setTag(value: ElementType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
