package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWebpackPluginsServiceWorkerPluginMod {
  
  @JSImport("@angular-devkit/build-angular/src/webpack/plugins/service-worker-plugin", "ServiceWorkerPlugin")
  @js.native
  open class ServiceWorkerPlugin protected () extends StObject {
    def this(options: ServiceWorkerPluginOptions) = this()
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    /* private */ val options: Any = js.native
  }
  
  trait ServiceWorkerPluginOptions extends StObject {
    
    var baseHref: js.UndefOr[String] = js.undefined
    
    var ngswConfigPath: js.UndefOr[String] = js.undefined
    
    var projectRoot: String
    
    var root: String
  }
  object ServiceWorkerPluginOptions {
    
    inline def apply(projectRoot: String, root: String): ServiceWorkerPluginOptions = {
      val __obj = js.Dynamic.literal(projectRoot = projectRoot.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceWorkerPluginOptions]
    }
    
    extension [Self <: ServiceWorkerPluginOptions](x: Self) {
      
      inline def setBaseHref(value: String): Self = StObject.set(x, "baseHref", value.asInstanceOf[js.Any])
      
      inline def setBaseHrefUndefined: Self = StObject.set(x, "baseHref", js.undefined)
      
      inline def setNgswConfigPath(value: String): Self = StObject.set(x, "ngswConfigPath", value.asInstanceOf[js.Any])
      
      inline def setNgswConfigPathUndefined: Self = StObject.set(x, "ngswConfigPath", js.undefined)
      
      inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
