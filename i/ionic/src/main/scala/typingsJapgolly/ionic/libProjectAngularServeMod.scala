package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.AngularServeOptions
import typingsJapgolly.ionic.definitionsMod.IConfig
import typingsJapgolly.ionic.definitionsMod.ILogger
import typingsJapgolly.ionic.definitionsMod.IShell
import typingsJapgolly.ionic.definitionsMod.IonicEnvironmentFlags
import typingsJapgolly.ionic.libProjectAngularMod.AngularProject
import typingsJapgolly.ionic.libServeMod.ServeCLI
import typingsJapgolly.ionic.libServeMod.ServeRunner
import typingsJapgolly.ionic.libServeMod.ServeRunnerDeps
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectAngularServeMod {
  
  @JSImport("ionic/lib/project/angular/serve", "AngularServeCLI")
  @js.native
  open class AngularServeCLI protected () extends ServeCLI[AngularServeOptions] {
    def this(e: ServeRunnerDeps) = this()
    
    /* protected */ def buildArchitectCommand(options: AngularServeOptions): js.Array[String] = js.native
    
    /* protected */ var chunks: Double = js.native
    
    @JSName("script")
    val script_AngularServeCLI: /* "ionic:serve" */ String = js.native
    
    /* protected */ def serveOptionsToNgArgs(options: AngularServeOptions): js.Promise[js.Array[String]] = js.native
  }
  
  @JSImport("ionic/lib/project/angular/serve", "AngularServeRunner")
  @js.native
  open class AngularServeRunner protected () extends ServeRunner[AngularServeOptions] {
    def this(e: AngularServeRunnerDeps) = this()
    
    /* protected */ @JSName("e")
    val e_AngularServeRunner: AngularServeRunnerDeps = js.native
    
    def platformToMode(platform: String): String = js.native
  }
  
  trait AngularServeRunnerDeps
    extends StObject
       with ServeRunnerDeps {
    
    @JSName("project")
    val project_AngularServeRunnerDeps: AngularProject
  }
  object AngularServeRunnerDeps {
    
    inline def apply(
      config: IConfig,
      flags: IonicEnvironmentFlags,
      log: ILogger,
      project: AngularProject,
      prompt: PromptModule,
      shell: IShell
    ): AngularServeRunnerDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[AngularServeRunnerDeps]
    }
    
    extension [Self <: AngularServeRunnerDeps](x: Self) {
      
      inline def setProject(value: AngularProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
}
