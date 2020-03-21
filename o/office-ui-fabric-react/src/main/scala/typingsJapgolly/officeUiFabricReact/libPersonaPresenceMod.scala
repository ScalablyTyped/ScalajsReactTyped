package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaPresenceProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/PersonaPresence", JSImport.Namespace)
@js.native
object libPersonaPresenceMod extends js.Object {
  @js.native
  class PersonaPresenceBase protected ()
    extends typingsJapgolly.officeUiFabricReact.personaPresenceMod.PersonaPresenceBase {
    def this(props: IPersonaPresenceProps) = this()
  }
  
  val PersonaPresence: FunctionComponent[IPersonaPresenceProps] = js.native
}

