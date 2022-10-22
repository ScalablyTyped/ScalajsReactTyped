package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsExtendedPickerBaseExtendedPickerDottypesMod.IBaseExtendedPickerProps
import typingsJapgolly.officeUiFabricReact.libComponentsExtendedPickerBaseExtendedPickerMod.BaseExtendedPicker
import typingsJapgolly.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersPickerItemDottypesMod.IPickerItemProps
import typingsJapgolly.officeUiFabricReact.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod.IExtendedPersonaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsExtendedPickerPeoplePickerExtendedPeoplePickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ExtendedPicker/PeoplePicker/ExtendedPeoplePicker", "BaseExtendedPeoplePicker")
  @js.native
  open class BaseExtendedPeoplePicker protected () extends BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps] {
    def this(basePickerProps: IExtendedPeoplePickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/ExtendedPicker/PeoplePicker/ExtendedPeoplePicker", "ExtendedPeoplePicker")
  @js.native
  open class ExtendedPeoplePicker protected () extends BaseExtendedPeoplePicker {
    def this(basePickerProps: IExtendedPeoplePickerProps) = this()
  }
  
  type IExtendedPeoplePickerProps = IBaseExtendedPickerProps[IPersonaProps]
  
  type IPeoplePickerItemProps = IPickerItemProps[IExtendedPersonaProps]
}
