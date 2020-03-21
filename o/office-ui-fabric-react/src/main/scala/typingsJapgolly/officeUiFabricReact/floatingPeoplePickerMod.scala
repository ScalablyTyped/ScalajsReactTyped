package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.baseFloatingPickerMod.BaseFloatingPicker
import typingsJapgolly.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/FloatingPicker/PeoplePicker/FloatingPeoplePicker", JSImport.Namespace)
@js.native
object floatingPeoplePickerMod extends js.Object {
  @js.native
  class BaseFloatingPeoplePicker () extends BaseFloatingPicker[IPersonaProps, IPeopleFloatingPickerProps]
  
  @js.native
  class FloatingPeoplePicker () extends BaseFloatingPicker[IPersonaProps, IPeopleFloatingPickerProps]
  
  def createItem(name: String, isValid: Boolean): ISuggestionModel[IPersonaProps] = js.native
  /* static members */
  @js.native
  object FloatingPeoplePicker extends js.Object {
    var defaultProps: js.Any = js.native
  }
  
  type IPeopleFloatingPickerProps = IBaseFloatingPickerProps[IPersonaProps]
}

