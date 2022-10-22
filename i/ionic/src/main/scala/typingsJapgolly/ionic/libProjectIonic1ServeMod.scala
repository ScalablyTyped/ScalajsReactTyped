package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.IConfig
import typingsJapgolly.ionic.definitionsMod.ILogger
import typingsJapgolly.ionic.definitionsMod.IShell
import typingsJapgolly.ionic.definitionsMod.Ionic1ServeOptions
import typingsJapgolly.ionic.definitionsMod.IonicEnvironmentFlags
import typingsJapgolly.ionic.libProjectIonic1Mod.Ionic1Project
import typingsJapgolly.ionic.libServeMod.ServeRunner
import typingsJapgolly.ionic.libServeMod.ServeRunnerDeps
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectIonic1ServeMod {
  
  @JSImport("ionic/lib/project/ionic1/serve", "Ionic1ServeRunner")
  @js.native
  open class Ionic1ServeRunner protected () extends ServeRunner[Ionic1ServeOptions] {
    def this(e: Ionic1ServeRunnerDeps) = this()
    
    /* protected */ @JSName("e")
    val e_Ionic1ServeRunner: Ionic1ServeRunnerDeps = js.native
  }
  
  trait Ionic1ServeRunnerDeps
    extends StObject
       with ServeRunnerDeps {
    
    @JSName("project")
    val project_Ionic1ServeRunnerDeps: Ionic1Project
  }
  object Ionic1ServeRunnerDeps {
    
    inline def apply(
      config: IConfig,
      flags: IonicEnvironmentFlags,
      log: ILogger,
      project: Ionic1Project,
      prompt: PromptModule,
      shell: IShell
    ): Ionic1ServeRunnerDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ionic1ServeRunnerDeps]
    }
    
    extension [Self <: Ionic1ServeRunnerDeps](x: Self) {
      
      inline def setProject(value: Ionic1Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
}
