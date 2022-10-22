package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.AngularBuildOptions
import typingsJapgolly.ionic.definitionsMod.IConfig
import typingsJapgolly.ionic.definitionsMod.ILogger
import typingsJapgolly.ionic.definitionsMod.IShell
import typingsJapgolly.ionic.libBuildMod.BuildCLI
import typingsJapgolly.ionic.libBuildMod.BuildRunner
import typingsJapgolly.ionic.libBuildMod.BuildRunnerDeps
import typingsJapgolly.ionic.libProjectAngularMod.AngularProject
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectAngularBuildMod {
  
  @JSImport("ionic/lib/project/angular/build", "AngularBuildCLI")
  @js.native
  open class AngularBuildCLI protected () extends BuildCLI[AngularBuildOptions] {
    def this(e: BuildRunnerDeps) = this()
    
    /* protected */ def buildArchitectCommand(options: AngularBuildOptions): js.Array[String] = js.native
    
    /* protected */ def buildOptionsToNgArgs(options: AngularBuildOptions): js.Promise[js.Array[String]] = js.native
    
    val prefix: /* "ng" */ String = js.native
    
    @JSName("script")
    val script_AngularBuildCLI: /* "ionic:build" */ String = js.native
  }
  
  @JSImport("ionic/lib/project/angular/build", "AngularBuildRunner")
  @js.native
  open class AngularBuildRunner protected () extends BuildRunner[AngularBuildOptions] {
    def this(e: AngularBuildRunnerDeps) = this()
    
    /* protected */ @JSName("e")
    val e_AngularBuildRunner: AngularBuildRunnerDeps = js.native
  }
  
  trait AngularBuildRunnerDeps
    extends StObject
       with BuildRunnerDeps {
    
    @JSName("project")
    val project_AngularBuildRunnerDeps: AngularProject
  }
  object AngularBuildRunnerDeps {
    
    inline def apply(config: IConfig, log: ILogger, project: AngularProject, prompt: PromptModule, shell: IShell): AngularBuildRunnerDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[AngularBuildRunnerDeps]
    }
    
    extension [Self <: AngularBuildRunnerDeps](x: Self) {
      
      inline def setProject(value: AngularProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
}
