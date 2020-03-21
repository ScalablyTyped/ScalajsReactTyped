package typingsJapgolly.officeUiFabricReact.personaTypesMod

import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Persona/Persona.types.IPersonaSharedProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Persona/Persona.types.IPersonaSharedProps, 'presence' | 'isOutOfOffice' | 'size'> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Persona/Persona.types.IPersonaProps, 'className'> */
trait IPersonaPresenceStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var isOutOfOffice: js.UndefOr[Boolean] = js.undefined
  var presence: js.UndefOr[PersonaPresence] = js.undefined
  var size: js.UndefOr[PersonaSize] = js.undefined
  var theme: ITheme
}

object IPersonaPresenceStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    isOutOfOffice: js.UndefOr[Boolean] = js.undefined,
    presence: PersonaPresence = null,
    size: PersonaSize = null
  ): IPersonaPresenceStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isOutOfOffice)) __obj.updateDynamic("isOutOfOffice")(isOutOfOffice.asInstanceOf[js.Any])
    if (presence != null) __obj.updateDynamic("presence")(presence.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonaPresenceStyleProps]
  }
}

