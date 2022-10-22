package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.AngularGenerateOptions
import typingsJapgolly.ionic.definitionsMod.IConfig
import typingsJapgolly.ionic.definitionsMod.ILogger
import typingsJapgolly.ionic.definitionsMod.IShell
import typingsJapgolly.ionic.definitionsMod.IonicContext
import typingsJapgolly.ionic.libGenerateMod.GenerateRunner
import typingsJapgolly.ionic.libGenerateMod.GenerateRunnerDeps
import typingsJapgolly.ionic.libProjectAngularMod.AngularProject
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProjectAngularGenerateMod {
  
  @JSImport("ionic/lib/project/angular/generate", "AngularGenerateRunner")
  @js.native
  open class AngularGenerateRunner protected () extends GenerateRunner[AngularGenerateOptions] {
    def this(e: AngularGenerateRunnerDeps) = this()
    
    /* protected */ @JSName("e")
    val e_AngularGenerateRunner: AngularGenerateRunnerDeps = js.native
    
    /* private */ var generateComponent: Any = js.native
    
    /* private */ var validateFeatureType: Any = js.native
  }
  
  trait AngularGenerateRunnerDeps
    extends StObject
       with GenerateRunnerDeps {
    
    @JSName("project")
    val project_AngularGenerateRunnerDeps: AngularProject
  }
  object AngularGenerateRunnerDeps {
    
    inline def apply(
      config: IConfig,
      ctx: IonicContext,
      log: ILogger,
      project: AngularProject,
      prompt: PromptModule,
      shell: IShell
    ): AngularGenerateRunnerDeps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[AngularGenerateRunnerDeps]
    }
    
    extension [Self <: AngularGenerateRunnerDeps](x: Self) {
      
      inline def setProject(value: AngularProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    }
  }
}
