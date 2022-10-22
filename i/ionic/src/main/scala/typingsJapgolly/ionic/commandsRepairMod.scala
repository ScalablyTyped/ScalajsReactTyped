package typingsJapgolly.ionic

import typingsJapgolly.ionic.anon.RequiredProjectIntegratio
import typingsJapgolly.ionic.definitionsMod.CommandInstanceInfo
import typingsJapgolly.ionic.definitionsMod.INamespace
import typingsJapgolly.ionic.definitionsMod.IProject
import typingsJapgolly.ionic.libCommandMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsRepairMod {
  
  @JSImport("ionic/commands/repair", "RepairCommand")
  @js.native
  open class RepairCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def cordovaRepair(cordova: RequiredProjectIntegratio, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    def npmRepair(project: IProject): js.Promise[Unit] = js.native
  }
}
