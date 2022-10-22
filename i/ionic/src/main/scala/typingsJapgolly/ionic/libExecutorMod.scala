package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.CommandInstanceInfo
import typingsJapgolly.ionic.definitionsMod.CommandMetadata
import typingsJapgolly.ionic.definitionsMod.CommandMetadataOption
import typingsJapgolly.ionic.definitionsMod.ICommand
import typingsJapgolly.ionic.definitionsMod.INamespace
import typingsJapgolly.ionic.definitionsMod.NamespaceLocateResult
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandMetadataInput
import typingsJapgolly.ionicCliFramework.libExecutorMod.BaseExecutorDeps
import typingsJapgolly.ionicCliFramework.mod.BaseExecutor
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libExecutorMod {
  
  @JSImport("ionic/lib/executor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/executor", "Executor")
  @js.native
  open class Executor protected () extends BaseExecutor[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
    def this(hasNamespaceStdoutStderrColors: BaseExecutorDeps[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]) = this()
  }
  
  @JSImport("ionic/lib/executor", "HELP_FLAGS")
  @js.native
  val HELP_FLAGS: js.Array[String] = js.native
  
  @JSImport("ionic/lib/executor", "VERSION_FLAGS")
  @js.native
  val VERSION_FLAGS: js.Array[String] = js.native
  
  inline def getFullCommandParts(location: NamespaceLocateResult): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullCommandParts")(location.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def metadataToCmdOptsEnv(metadata: CommandMetadata, cmdNameParts: js.Array[String]): Map[CommandMetadataOption, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("metadataToCmdOptsEnv")(metadata.asInstanceOf[js.Any], cmdNameParts.asInstanceOf[js.Any])).asInstanceOf[Map[CommandMetadataOption, String]]
  
  inline def runCommand(runinfo: CommandInstanceInfo, argv: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("runCommand")(runinfo.asInstanceOf[js.Any], argv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait ExecutorDeps extends StObject {
    
    val namespace: INamespace
  }
  object ExecutorDeps {
    
    inline def apply(namespace: INamespace): ExecutorDeps = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutorDeps]
    }
    
    extension [Self <: ExecutorDeps](x: Self) {
      
      inline def setNamespace(value: INamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
}
