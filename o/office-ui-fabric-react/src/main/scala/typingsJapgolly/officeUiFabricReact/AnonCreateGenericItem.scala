package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.officeUiFabricReact.basePickerTypesMod.IBasePickerSuggestionsProps
import typingsJapgolly.officeUiFabricReact.basePickerTypesMod.ValidationState
import typingsJapgolly.officeUiFabricReact.peoplePickerItemTypesMod.IPeoplePickerItemSelectedProps
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreateGenericItem extends js.Object {
  var createGenericItem: js.Function2[/* name */ String, /* currentValidationState */ ValidationState, IGenericItemkeyKey] = js.native
  def onRenderItem(props: IPeoplePickerItemSelectedProps): Element = js.native
  def onRenderSuggestionsItem(personaProps: IPersonaProps): Element = js.native
  def onRenderSuggestionsItem(personaProps: IPersonaProps, suggestionsProps: IBasePickerSuggestionsProps[_]): Element = js.native
}

