package typingsJapgolly.ionic

import typingsJapgolly.ionic.commandsSslBaseMod.SSLBaseCommand
import typingsJapgolly.ionic.definitionsMod.CommandInstanceInfo
import typingsJapgolly.ionic.definitionsMod.INamespace
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsSslGenerateMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.ionicCliFramework.definitionsMod.ICommand because Already inherited
  - typingsJapgolly.ionic.definitionsMod.ICommand because Already inherited
  - typingsJapgolly.ionic.definitionsMod.CommandPreRun because var conflicts: env, namespace, project. Inlined preRun */ @JSImport("ionic/commands/ssl/generate", "SSLGenerateCommand")
  @js.native
  open class SSLGenerateCommand protected () extends SSLBaseCommand {
    def this(namespace: INamespace) = this()
    
    /* private */ var checkExistingFile: Any = js.native
    
    /* private */ var ensureDirectory: Any = js.native
    
    /* private */ var formatSubj: Any = js.native
    
    def getDefaultCertPath(): String = js.native
    
    def getDefaultKeyPath(): String = js.native
    
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions, metadata: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    /* private */ var writeConfig: Any = js.native
  }
}
