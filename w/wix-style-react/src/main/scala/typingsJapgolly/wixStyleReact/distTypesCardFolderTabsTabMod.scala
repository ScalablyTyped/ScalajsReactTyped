package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCardFolderTabsTabMod {
  
  @JSImport("wix-style-react/dist/types/CardFolderTabs/Tab", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[CardFolderTabProps, js.Object, Any]
  
  type CardFolderTab = PureComponent[CardFolderTabProps, js.Object, Any]
  
  trait CardFolderTabProps extends StObject {
    
    var children: Node
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var name: Node
  }
  object CardFolderTabProps {
    
    inline def apply(id: String): CardFolderTabProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], children = null, name = null)
      __obj.asInstanceOf[CardFolderTabProps]
    }
    
    extension [Self <: CardFolderTabProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: VdomNode): Self = StObject.set(x, "name", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "name", js.Array(value*))
      
      inline def setNameVdomElement(value: VdomElement): Self = StObject.set(x, "name", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
