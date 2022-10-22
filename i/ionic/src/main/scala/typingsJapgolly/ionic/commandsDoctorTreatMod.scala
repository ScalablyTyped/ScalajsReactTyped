package typingsJapgolly.ionic

import typingsJapgolly.ionic.commandsDoctorBaseMod.DoctorCommand
import typingsJapgolly.ionic.definitionsMod.INamespace
import typingsJapgolly.ionic.definitionsMod.TreatableAilment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDoctorTreatMod {
  
  @JSImport("ionic/commands/doctor/treat", "DoctorTreatCommand")
  @js.native
  open class DoctorTreatCommand protected () extends DoctorCommand {
    def this(namespace: INamespace) = this()
    
    def handleError(e: Any): Unit = js.native
    
    def treatAilment(ailment: TreatableAilment): js.Promise[Boolean] = js.native
    
    def treatAilments(ailments: js.Array[TreatableAilment]): js.Promise[Unit] = js.native
  }
}
