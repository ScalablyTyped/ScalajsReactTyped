package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.IConfig
import typingsJapgolly.ionic.definitionsMod.ILogger
import typingsJapgolly.ionic.definitionsMod.IShell
import typingsJapgolly.ionic.definitionsMod.ReactBuildOptions
import typingsJapgolly.ionic.libBuildMod.BuildCLI
import typingsJapgolly.ionic.libBuildMod.BuildRunner
import typingsJapgolly.ionic.libBuildMod.BuildRunnerDeps
import typingsJapgolly.ionic.libProjectReactMod.ReactProject
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectReactBuildMod {
  
  @JSImport("ionic/lib/project/react/build", "ReactBuildCLI")
  @js.native
  open class ReactBuildCLI protected () extends BuildCLI[ReactBuildOptions] {
    def this(e: BuildRunnerDeps) = this()
    
    val prefix: /* "react-scripts" */ String = js.native
    
    @JSName("script")
    val script_ReactBuildCLI: /* "ionic:build" */ String = js.native
  }
  
  @JSImport("ionic/lib/project/react/build", "ReactBuildRunner")
  @js.native
  open class ReactBuildRunner protected () extends BuildRunner[ReactBuildOptions] {
    def this(e: ReactBuildRunnerDeps) = this()
    
    /* protected */ @JSName("e")
    val e_ReactBuildRunner: ReactBuildRunnerDeps = js.native
  }
  
  trait ReactBuildRunnerDeps
    extends StObject
       with BuildRunnerDeps {
    
    @JSName("project")
    val project_ReactBuildRunnerDeps: ReactProject
  }
  object ReactBuildRunnerDeps {
    
    inline def apply(config: IConfig, log: ILogger, project: ReactProject, prompt: PromptModule, shell: IShell): ReactBuildRunnerDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactBuildRunnerDeps]
    }
    
    extension [Self <: ReactBuildRunnerDeps](x: Self) {
      
      inline def setProject(value: ReactProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
}
