package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.IAilment
import typingsJapgolly.ionic.definitionsMod.IAilmentRegistry
import typingsJapgolly.ionic.definitionsMod.INamespace
import typingsJapgolly.ionic.definitionsMod.TreatableAilment
import typingsJapgolly.ionic.libCommandMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDoctorBaseMod {
  
  /* note: abstract class */ @JSImport("ionic/commands/doctor/base", "DoctorCommand")
  @js.native
  open class DoctorCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def detectAilments(): js.Promise[js.Array[IAilment]] = js.native
    
    def detectTreatableAilments(): js.Promise[js.Array[TreatableAilment]] = js.native
    
    def getRegistry(): js.Promise[IAilmentRegistry] = js.native
  }
}
