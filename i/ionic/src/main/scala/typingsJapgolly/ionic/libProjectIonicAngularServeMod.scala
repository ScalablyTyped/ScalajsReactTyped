package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.IConfig
import typingsJapgolly.ionic.definitionsMod.ILogger
import typingsJapgolly.ionic.definitionsMod.IShell
import typingsJapgolly.ionic.definitionsMod.IonicAngularServeOptions
import typingsJapgolly.ionic.definitionsMod.IonicEnvironmentFlags
import typingsJapgolly.ionic.libProjectIonicAngularMod.IonicAngularProject
import typingsJapgolly.ionic.libServeMod.ServeRunner
import typingsJapgolly.ionic.libServeMod.ServeRunnerDeps
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectIonicAngularServeMod {
  
  @JSImport("ionic/lib/project/ionic-angular/serve", "DEFAULT_SERVE_SCRIPT_VALUE")
  @js.native
  val DEFAULT_SERVE_SCRIPT_VALUE: String = js.native
  
  @JSImport("ionic/lib/project/ionic-angular/serve", "IonicAngularServeRunner")
  @js.native
  open class IonicAngularServeRunner protected () extends ServeRunner[IonicAngularServeOptions] {
    def this(e: IonicAngularServeRunnerDeps) = this()
    
    /* protected */ @JSName("e")
    val e_IonicAngularServeRunner: IonicAngularServeRunnerDeps = js.native
  }
  
  trait IonicAngularServeRunnerDeps
    extends StObject
       with ServeRunnerDeps {
    
    @JSName("project")
    val project_IonicAngularServeRunnerDeps: IonicAngularProject
  }
  object IonicAngularServeRunnerDeps {
    
    inline def apply(
      config: IConfig,
      flags: IonicEnvironmentFlags,
      log: ILogger,
      project: IonicAngularProject,
      prompt: PromptModule,
      shell: IShell
    ): IonicAngularServeRunnerDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[IonicAngularServeRunnerDeps]
    }
    
    extension [Self <: IonicAngularServeRunnerDeps](x: Self) {
      
      inline def setProject(value: IonicAngularProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
}
