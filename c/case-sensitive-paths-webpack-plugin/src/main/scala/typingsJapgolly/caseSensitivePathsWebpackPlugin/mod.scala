package typingsJapgolly.caseSensitivePathsWebpackPlugin

import japgolly.scalajs.react.Callback
import typingsJapgolly.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("case-sensitive-paths-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with CaseSensitivePathsWebpackPlugin {
    def this(options: Options) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ trait CaseSensitivePathsWebpackPlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
  }
  object CaseSensitivePathsWebpackPlugin {
    
    inline def apply(apply: Compiler => Callback): CaseSensitivePathsWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Compiler) => apply(t0).runNow()))
      __obj.asInstanceOf[CaseSensitivePathsWebpackPlugin]
    }
    
    extension [Self <: CaseSensitivePathsWebpackPlugin](x: Self) {
      
      inline def setApply(value: Compiler => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Compiler) => value(t0).runNow()))
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Show more information
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Run before emit instead of after resolve for individual files
      */
    var useBeforeEmitHook: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setUseBeforeEmitHook(value: Boolean): Self = StObject.set(x, "useBeforeEmitHook", value.asInstanceOf[js.Any])
      
      inline def setUseBeforeEmitHookUndefined: Self = StObject.set(x, "useBeforeEmitHook", js.undefined)
    }
  }
}
