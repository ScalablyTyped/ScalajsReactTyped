package typingsJapgolly.ionic

import typingsJapgolly.ionic.anon.NameString
import typingsJapgolly.ionic.definitionsMod.App
import typingsJapgolly.ionic.definitionsMod.CommandInstanceInfo
import typingsJapgolly.ionic.definitionsMod.INamespace
import typingsJapgolly.ionic.libCommandMod.Command
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineInputs
import typingsJapgolly.ionicCliFramework.definitionsMod.CommandLineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsLinkMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.ionicCliFramework.definitionsMod.ICommand because Already inherited
  - typingsJapgolly.ionic.definitionsMod.ICommand because Already inherited
  - typingsJapgolly.ionic.definitionsMod.CommandPreRun because var conflicts: env, namespace, project. Inlined preRun */ @JSImport("ionic/commands/link", "LinkCommand")
  @js.native
  open class LinkCommand protected () extends Command {
    def this(namespace: INamespace) = this()
    
    def chooseApp(apps: js.Array[App]): js.Promise[String] = js.native
    
    def confirmGithubRepoExists(): js.Promise[Unit] = js.native
    
    def connectGithub(app: App, repoId: Double, branches: js.Array[String]): js.Promise[js.UndefOr[String]] = js.native
    
    def createApp(hasName: NameString, runinfo: CommandInstanceInfo): js.Promise[String] = js.native
    
    def formatRepoName(fullName: String): String = js.native
    
    /* private */ var getAppClient: Any = js.native
    
    /* private */ var getUserClient: Any = js.native
    
    def linkApp(app: App, runinfo: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    def linkGithub(app: App): js.Promise[js.UndefOr[String]] = js.native
    
    def lookUpApp(id: String): js.Promise[App] = js.native
    
    def needsAssociation(app: App, userId: Double): js.Promise[Boolean] = js.native
    
    def oAuthProcess(userId: Double): js.Promise[Unit] = js.native
    
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions): js.Promise[Unit] = js.native
    def preRun(inputs: CommandLineInputs, options: CommandLineOptions, metadata: CommandInstanceInfo): js.Promise[Unit] = js.native
    
    def selectGithubBranches(repoId: Double): js.Promise[js.Array[String]] = js.native
    
    def selectGithubRepo(): js.Promise[Double] = js.native
  }
}
