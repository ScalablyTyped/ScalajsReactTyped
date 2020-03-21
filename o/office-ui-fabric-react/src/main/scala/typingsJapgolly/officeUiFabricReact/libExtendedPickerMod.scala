package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPickerProps
import typingsJapgolly.officeUiFabricReact.extendedPeoplePickerMod.IExtendedPeoplePickerProps
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/ExtendedPicker", JSImport.Namespace)
@js.native
object libExtendedPickerMod extends js.Object {
  @js.native
  class BaseExtendedPeoplePicker ()
    extends typingsJapgolly.officeUiFabricReact.baseExtendedPickerMod.BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps]
  
  @js.native
  class BaseExtendedPicker[T, P /* <: IBaseExtendedPickerProps[T] */] protected ()
    extends typingsJapgolly.officeUiFabricReact.extendedPickerMod.BaseExtendedPicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @js.native
  class ExtendedPeoplePicker ()
    extends typingsJapgolly.officeUiFabricReact.baseExtendedPickerMod.BaseExtendedPicker[IPersonaProps, IExtendedPeoplePickerProps]
  
}

