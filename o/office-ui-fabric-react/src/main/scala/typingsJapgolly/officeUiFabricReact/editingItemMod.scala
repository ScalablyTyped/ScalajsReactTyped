package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.editingItemTypesMod.IEditingSelectedPeopleItemProps
import typingsJapgolly.officeUiFabricReact.extendedSelectedItemMod.IPeoplePickerItemState
import typingsJapgolly.officeUiFabricReact.utilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/Items/EditingItem", JSImport.Namespace)
@js.native
object editingItemMod extends js.Object {
  @js.native
  class EditingItem protected () extends BaseComponent[IEditingSelectedPeopleItemProps, IPeoplePickerItemState] {
    def this(props: IEditingSelectedPeopleItemProps) = this()
    var _editingFloatingPicker: js.Any = js.native
    var _editingInput: js.Any = js.native
    var _onInputBlur: js.Any = js.native
    var _onInputChange: js.Any = js.native
    var _onInputClick: js.Any = js.native
    var _onInputKeyDown: js.Any = js.native
    var _onSuggestionSelected: js.Any = js.native
    var _renderEditingSuggestions: js.Any = js.native
    var _resolveInputRef: js.Any = js.native
    @JSName("componentDidMount")
    def componentDidMount_MEditingItem(): Unit = js.native
  }
  
}

