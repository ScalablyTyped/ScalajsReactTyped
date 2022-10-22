package typingsJapgolly.ionic

import typingsJapgolly.ionic.commandsDoctorBaseMod.DoctorCommand
import typingsJapgolly.ionic.definitionsMod.IAilment
import typingsJapgolly.ionic.definitionsMod.INamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDoctorCheckMod {
  
  @JSImport("ionic/commands/doctor/check", "DoctorCheckCommand")
  @js.native
  open class DoctorCheckCommand protected () extends DoctorCommand {
    def this(namespace: INamespace) = this()
    
    def checkAilment(ailment: IAilment): js.Promise[Unit] = js.native
    
    def checkAilments(ailments: js.Array[IAilment]): js.Promise[Unit] = js.native
  }
}
