package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.baseExtendedPickerMod.BaseExtendedPicker
import typingsJapgolly.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPickerProps
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ExtendedPicker/PeoplePicker/ExtendedPeoplePicker", JSImport.Namespace)
@js.native
object extendedPeoplePickerMod extends js.Object {
  @js.native
  class BaseExtendedPeoplePicker () extends BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps]
  
  @js.native
  class ExtendedPeoplePicker () extends BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps]
  
  type IExtendedPeoplePickerProps = IBaseExtendedPickerProps[IPersonaProps]
  type IPeoplePickerItemProps = IPickerItemProps[IExtendedPersonaProps]
}

