package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.officeUiFabricReact.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod.ISelectedPeopleItemProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSelectedItemsListSelectedPeopleListItemsExtendedSelectedItemMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/Items/ExtendedSelectedItem", "ExtendedSelectedItem")
  @js.native
  open class ExtendedSelectedItem protected () extends Component[ISelectedPeopleItemProps, IPeoplePickerItemState, Any] {
    def this(props: ISelectedPeopleItemProps) = this()
    
    /* private */ var _onClickIconButton: Any = js.native
    
    /* protected */ var persona: RefHandle[HTMLDivElement] = js.native
  }
  
  trait IPeoplePickerItemState extends StObject {
    
    var contextualMenuVisible: Boolean
  }
  object IPeoplePickerItemState {
    
    inline def apply(contextualMenuVisible: Boolean): IPeoplePickerItemState = {
      val __obj = js.Dynamic.literal(contextualMenuVisible = contextualMenuVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPeoplePickerItemState]
    }
    
    extension [Self <: IPeoplePickerItemState](x: Self) {
      
      inline def setContextualMenuVisible(value: Boolean): Self = StObject.set(x, "contextualMenuVisible", value.asInstanceOf[js.Any])
    }
  }
}
