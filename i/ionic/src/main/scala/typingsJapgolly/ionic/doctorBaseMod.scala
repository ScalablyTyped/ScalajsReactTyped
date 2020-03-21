package typingsJapgolly.ionic

import typingsJapgolly.ionic.commandMod.Command
import typingsJapgolly.ionic.definitionsMod.IAilment
import typingsJapgolly.ionic.definitionsMod.IAilmentRegistry
import typingsJapgolly.ionic.definitionsMod.TreatableAilment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/doctor/base", JSImport.Namespace)
@js.native
object doctorBaseMod extends js.Object {
  @js.native
  abstract class DoctorCommand () extends Command {
    def detectAilments(): js.Promise[js.Array[IAilment]] = js.native
    def detectTreatableAilments(): js.Promise[js.Array[TreatableAilment]] = js.native
    def getRegistry(): js.Promise[IAilmentRegistry] = js.native
  }
  
}

