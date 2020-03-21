package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsListProps
import typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleItemProps
import typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/SelectedItemsList", JSImport.Namespace)
@js.native
object libSelectedItemsListMod extends js.Object {
  @js.native
  class BasePeopleSelectedItemsList ()
    extends typingsJapgolly.officeUiFabricReact.baseSelectedItemsListMod.BaseSelectedItemsList[IExtendedPersonaProps, ISelectedPeopleProps]
  
  @js.native
  class BaseSelectedItemsList[T, P /* <: IBaseSelectedItemsListProps[T] */] protected ()
    extends typingsJapgolly.officeUiFabricReact.selectedItemsListMod.BaseSelectedItemsList[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @js.native
  class ExtendedSelectedItem protected ()
    extends typingsJapgolly.officeUiFabricReact.selectedItemsListMod.ExtendedSelectedItem {
    def this(props: ISelectedPeopleItemProps) = this()
  }
  
  @js.native
  class SelectedPeopleList ()
    extends typingsJapgolly.officeUiFabricReact.selectedItemsListMod.SelectedPeopleList
  
  /* static members */
  @js.native
  object SelectedPeopleList extends js.Object {
    var defaultProps: js.Any = js.native
  }
  
}

