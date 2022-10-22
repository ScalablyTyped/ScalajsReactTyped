package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsExtendedPickerBaseExtendedPickerDottypesMod.IBaseExtendedPickerProps
import typingsJapgolly.officeUiFabricReact.libComponentsExtendedPickerPeoplePickerExtendedPeoplePickerMod.IExtendedPeoplePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsExtendedPickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ExtendedPicker", "BaseExtendedPeoplePicker")
  @js.native
  open class BaseExtendedPeoplePicker protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsExtendedPickerPeoplePickerExtendedPeoplePickerMod.BaseExtendedPeoplePicker {
    def this(basePickerProps: IExtendedPeoplePickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/ExtendedPicker", "BaseExtendedPicker")
  @js.native
  open class BaseExtendedPicker[T, P /* <: IBaseExtendedPickerProps[T] */] protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsExtendedPickerBaseExtendedPickerMod.BaseExtendedPicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/ExtendedPicker", "ExtendedPeoplePicker")
  @js.native
  open class ExtendedPeoplePicker protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsExtendedPickerPeoplePickerExtendedPeoplePickerMod.ExtendedPeoplePicker {
    def this(basePickerProps: IExtendedPeoplePickerProps) = this()
  }
}
