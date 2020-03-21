package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaPresenceProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Persona/PersonaPresence", JSImport.Namespace)
@js.native
object personaPresenceMod extends js.Object {
  @js.native
  class PersonaPresenceBase protected ()
    extends typingsJapgolly.officeUiFabricReact.personaPresenceBaseMod.PersonaPresenceBase {
    def this(props: IPersonaPresenceProps) = this()
  }
  
  val PersonaPresence: FunctionComponent[IPersonaPresenceProps] = js.native
}

