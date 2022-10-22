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

object typesLibListInlineItemMod {
  
  @JSImport("reactstrap/types/lib/ListInlineItem", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ListInlineItemProps, js.Object, Any]
  
  type ListInlineItem = japgolly.scalajs.react.facade.React.Component[ListInlineItemProps & js.Object, js.Object]
  
  trait ListInlineItemProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var tag: js.UndefOr[ElementType] = js.undefined
  }
  object ListInlineItemProps {
    
    inline def apply(): ListInlineItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListInlineItemProps]
    }
    
    extension [Self <: ListInlineItemProps](x: Self) {
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setTag(value: ElementType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
