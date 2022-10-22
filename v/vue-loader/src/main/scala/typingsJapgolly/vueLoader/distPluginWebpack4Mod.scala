package typingsJapgolly.vueLoader

import japgolly.scalajs.react.Callback
import typingsJapgolly.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginWebpack4Mod {
  
  @JSImport("vue-loader/dist/pluginWebpack4", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with VueLoaderPlugin {
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  object default {
    
    @JSImport("vue-loader/dist/pluginWebpack4", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("vue-loader/dist/pluginWebpack4", "default.NS")
    @js.native
    def NS: String = js.native
    inline def NS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NS")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ trait VueLoaderPlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
  }
  object VueLoaderPlugin {
    
    inline def apply(apply: Compiler => Callback): VueLoaderPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Compiler) => apply(t0).runNow()))
      __obj.asInstanceOf[VueLoaderPlugin]
    }
    
    extension [Self <: VueLoaderPlugin](x: Self) {
      
      inline def setApply(value: Compiler => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Compiler) => value(t0).runNow()))
    }
  }
}
