package typingsJapgolly.ionic

import typingsJapgolly.ionic.definitionsMod.IProject
import typingsJapgolly.ionic.definitionsMod.IonicEnvironment
import typingsJapgolly.ionic.libNamespaceMod.Namespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsMod {
  
  @JSImport("ionic/commands", "IonicNamespace")
  @js.native
  open class IonicNamespace protected () extends Namespace {
    def this(hasEnvProject: IonicEnvironmentDeps) = this()
    
    /* protected */ var _env: IonicEnvironment = js.native
    
    /* protected */ var _project: js.UndefOr[IProject] = js.native
    
    @JSName("env")
    def env_MIonicNamespace: IonicEnvironment = js.native
    
    @JSName("project")
    def project_MIonicNamespace: js.UndefOr[IProject] = js.native
  }
  
  trait IonicEnvironmentDeps extends StObject {
    
    val env: IonicEnvironment
    
    val project: js.UndefOr[IProject] = js.undefined
  }
  object IonicEnvironmentDeps {
    
    inline def apply(env: IonicEnvironment): IonicEnvironmentDeps = {
      val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any])
      __obj.asInstanceOf[IonicEnvironmentDeps]
    }
    
    extension [Self <: IonicEnvironmentDeps](x: Self) {
      
      inline def setEnv(value: IonicEnvironment): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setProject(value: IProject): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    }
  }
}
