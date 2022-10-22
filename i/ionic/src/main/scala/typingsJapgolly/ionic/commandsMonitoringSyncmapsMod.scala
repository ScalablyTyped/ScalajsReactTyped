package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.APIResponseSuccess
import typingsJapgolly.ionic.definitionsMod.INamespace
import typingsJapgolly.ionic.libCommandMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsMonitoringSyncmapsMod {
  
  @JSImport("ionic/commands/monitoring/syncmaps", "MonitoringSyncSourcemapsCommand")
  @js.native
  open class MonitoringSyncSourcemapsCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def syncSourcemap(
      file: String,
      snapshotId: String,
      appVersion: String,
      commitHash: String,
      appflowId: String,
      token: String
    ): js.Promise[Unit] = js.native
    
    def uploadSourcemap(sourcemap: APIResponseSuccess, file: String): js.Promise[Unit] = js.native
  }
}
