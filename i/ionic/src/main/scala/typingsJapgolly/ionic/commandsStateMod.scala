package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.INamespace
import typingsJapgolly.ionic.libCommandMod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsStateMod {
  
  @JSImport("ionic/commands/state", "StateCommand")
  @js.native
  open class StateCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def run(): js.Promise[Unit] = js.native
  }
}
