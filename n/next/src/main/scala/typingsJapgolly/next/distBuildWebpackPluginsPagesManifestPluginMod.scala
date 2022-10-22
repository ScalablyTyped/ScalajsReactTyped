package typingsJapgolly.next

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.next.anon.IsEdgeRuntime
import typingsJapgolly.next.distCompiledWebpackWebpackMod.webpack.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsPagesManifestPluginMod {
  
  @JSImport("next/dist/build/webpack/plugins/pages-manifest-plugin", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PagesManifestPlugin {
    def this(hasServerlessDevIsEdgeRuntimeAppDirEnabled: IsEdgeRuntime) = this()
    
    /* CompleteClass */
    var appDirEnabled: Boolean = js.native
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
    
    /* CompleteClass */
    override def createAssets(compilation: Any, assets: Any): Unit = js.native
    
    /* CompleteClass */
    var dev: Boolean = js.native
    
    /* CompleteClass */
    var isEdgeRuntime: Boolean = js.native
    
    /* CompleteClass */
    var serverless: Boolean = js.native
  }
  
  type PagesManifest = StringDictionary[String]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait PagesManifestPlugin extends StObject {
    
    var appDirEnabled: Boolean
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
    
    def createAssets(compilation: Any, assets: Any): Unit
    
    var dev: Boolean
    
    var isEdgeRuntime: Boolean
    
    var serverless: Boolean
  }
  object PagesManifestPlugin {
    
    inline def apply(
      appDirEnabled: Boolean,
      apply: Compiler => Callback,
      createAssets: (Any, Any) => Callback,
      dev: Boolean,
      isEdgeRuntime: Boolean,
      serverless: Boolean
    ): PagesManifestPlugin = {
      val __obj = js.Dynamic.literal(appDirEnabled = appDirEnabled.asInstanceOf[js.Any], apply = js.Any.fromFunction1((t0: Compiler) => apply(t0).runNow()), createAssets = js.Any.fromFunction2((t0: Any, t1: Any) => (createAssets(t0, t1)).runNow()), dev = dev.asInstanceOf[js.Any], isEdgeRuntime = isEdgeRuntime.asInstanceOf[js.Any], serverless = serverless.asInstanceOf[js.Any])
      __obj.asInstanceOf[PagesManifestPlugin]
    }
    
    extension [Self <: PagesManifestPlugin](x: Self) {
      
      inline def setAppDirEnabled(value: Boolean): Self = StObject.set(x, "appDirEnabled", value.asInstanceOf[js.Any])
      
      inline def setApply(value: Compiler => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Compiler) => value(t0).runNow()))
      
      inline def setCreateAssets(value: (Any, Any) => Callback): Self = StObject.set(x, "createAssets", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setIsEdgeRuntime(value: Boolean): Self = StObject.set(x, "isEdgeRuntime", value.asInstanceOf[js.Any])
      
      inline def setServerless(value: Boolean): Self = StObject.set(x, "serverless", value.asInstanceOf[js.Any])
    }
  }
}
