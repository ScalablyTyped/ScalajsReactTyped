package typingsJapgolly.officeUiFabricReact.peoplePickerItemTypesMod

import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaCoinStyleProps
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaStyleProps
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPeoplePickerItemSelectedSubComponentStyles extends js.Object {
  /** Refers to the Persona rendered within the PeoplePickerItemSelected */
  var persona: IStyleFunctionOrObject[IPersonaStyleProps, _]
  /** Refers to the PersonaCoin in the Persona rendered within the PeoplePickerItemSelected */
  var personaCoin: js.UndefOr[IStyleFunctionOrObject[IPersonaCoinStyleProps, _]] = js.undefined
}

object IPeoplePickerItemSelectedSubComponentStyles {
  @scala.inline
  def apply(
    persona: IStyleFunctionOrObject[IPersonaStyleProps, _],
    personaCoin: IStyleFunctionOrObject[IPersonaCoinStyleProps, _] = null
  ): IPeoplePickerItemSelectedSubComponentStyles = {
    val __obj = js.Dynamic.literal(persona = persona.asInstanceOf[js.Any])
    if (personaCoin != null) __obj.updateDynamic("personaCoin")(personaCoin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerItemSelectedSubComponentStyles]
  }
}

