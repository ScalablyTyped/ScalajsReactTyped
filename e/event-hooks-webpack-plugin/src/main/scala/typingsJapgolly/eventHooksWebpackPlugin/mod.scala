package typingsJapgolly.eventHooksWebpackPlugin

import japgolly.scalajs.react.Callback
import typingsJapgolly.webpack.mod.Compiler
import typingsJapgolly.webpack.mod.WebpackPluginInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This webpack plugin is similar to `webpack-shell-plugin`
    * but this allows you to execute arbitrary JavaScriptinstead of commands on any event hook that is exposed by the Webpack compile
    */
  @JSImport("event-hooks-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with EventHooksPlugin {
    def this(options: Options) = this()
    
    /**
    	 * The run point of the plugin, required method.
    	 */
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  
  /**
    * This webpack plugin is similar to `webpack-shell-plugin`
    * but this allows you to execute arbitrary JavaScriptinstead of commands on any event hook that is exposed by the Webpack compile
    */
  trait EventHooksPlugin
    extends StObject
       with WebpackPluginInstance
  object EventHooksPlugin {
    
    inline def apply(apply: Compiler => Callback): EventHooksPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Compiler) => apply(t0).runNow()))
      __obj.asInstanceOf[EventHooksPlugin]
    }
  }
  
  trait Options extends StObject {
    
    var additionalPass: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterCompile: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterEmit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterEnvironment: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterPlugins: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterResolvers: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var beforeCompile: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var beforeRun: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var compilation: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var compile: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var contextModuleFactory: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var done: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var emit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var entryOption: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var environment: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var failed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var invalid: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var make: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var normalModuleFactory: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var run: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var shouldEmit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var thisCompilation: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var watchClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var watchRun: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAdditionalPass(value: Callback): Self = StObject.set(x, "additionalPass", value.toJsFn)
      
      inline def setAdditionalPassUndefined: Self = StObject.set(x, "additionalPass", js.undefined)
      
      inline def setAfterCompile(value: Callback): Self = StObject.set(x, "afterCompile", value.toJsFn)
      
      inline def setAfterCompileUndefined: Self = StObject.set(x, "afterCompile", js.undefined)
      
      inline def setAfterEmit(value: Callback): Self = StObject.set(x, "afterEmit", value.toJsFn)
      
      inline def setAfterEmitUndefined: Self = StObject.set(x, "afterEmit", js.undefined)
      
      inline def setAfterEnvironment(value: Callback): Self = StObject.set(x, "afterEnvironment", value.toJsFn)
      
      inline def setAfterEnvironmentUndefined: Self = StObject.set(x, "afterEnvironment", js.undefined)
      
      inline def setAfterPlugins(value: Callback): Self = StObject.set(x, "afterPlugins", value.toJsFn)
      
      inline def setAfterPluginsUndefined: Self = StObject.set(x, "afterPlugins", js.undefined)
      
      inline def setAfterResolvers(value: Callback): Self = StObject.set(x, "afterResolvers", value.toJsFn)
      
      inline def setAfterResolversUndefined: Self = StObject.set(x, "afterResolvers", js.undefined)
      
      inline def setBeforeCompile(value: Callback): Self = StObject.set(x, "beforeCompile", value.toJsFn)
      
      inline def setBeforeCompileUndefined: Self = StObject.set(x, "beforeCompile", js.undefined)
      
      inline def setBeforeRun(value: Callback): Self = StObject.set(x, "beforeRun", value.toJsFn)
      
      inline def setBeforeRunUndefined: Self = StObject.set(x, "beforeRun", js.undefined)
      
      inline def setCompilation(value: Callback): Self = StObject.set(x, "compilation", value.toJsFn)
      
      inline def setCompilationUndefined: Self = StObject.set(x, "compilation", js.undefined)
      
      inline def setCompile(value: Callback): Self = StObject.set(x, "compile", value.toJsFn)
      
      inline def setCompileUndefined: Self = StObject.set(x, "compile", js.undefined)
      
      inline def setContextModuleFactory(value: Callback): Self = StObject.set(x, "contextModuleFactory", value.toJsFn)
      
      inline def setContextModuleFactoryUndefined: Self = StObject.set(x, "contextModuleFactory", js.undefined)
      
      inline def setDone(value: Callback): Self = StObject.set(x, "done", value.toJsFn)
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setEmit(value: Callback): Self = StObject.set(x, "emit", value.toJsFn)
      
      inline def setEmitUndefined: Self = StObject.set(x, "emit", js.undefined)
      
      inline def setEntryOption(value: Callback): Self = StObject.set(x, "entryOption", value.toJsFn)
      
      inline def setEntryOptionUndefined: Self = StObject.set(x, "entryOption", js.undefined)
      
      inline def setEnvironment(value: Callback): Self = StObject.set(x, "environment", value.toJsFn)
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setFailed(value: Callback): Self = StObject.set(x, "failed", value.toJsFn)
      
      inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
      
      inline def setInvalid(value: Callback): Self = StObject.set(x, "invalid", value.toJsFn)
      
      inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      inline def setMake(value: Callback): Self = StObject.set(x, "make", value.toJsFn)
      
      inline def setMakeUndefined: Self = StObject.set(x, "make", js.undefined)
      
      inline def setNormalModuleFactory(value: Callback): Self = StObject.set(x, "normalModuleFactory", value.toJsFn)
      
      inline def setNormalModuleFactoryUndefined: Self = StObject.set(x, "normalModuleFactory", js.undefined)
      
      inline def setRun(value: Callback): Self = StObject.set(x, "run", value.toJsFn)
      
      inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
      
      inline def setShouldEmit(value: Callback): Self = StObject.set(x, "shouldEmit", value.toJsFn)
      
      inline def setShouldEmitUndefined: Self = StObject.set(x, "shouldEmit", js.undefined)
      
      inline def setThisCompilation(value: Callback): Self = StObject.set(x, "thisCompilation", value.toJsFn)
      
      inline def setThisCompilationUndefined: Self = StObject.set(x, "thisCompilation", js.undefined)
      
      inline def setWatchClose(value: Callback): Self = StObject.set(x, "watchClose", value.toJsFn)
      
      inline def setWatchCloseUndefined: Self = StObject.set(x, "watchClose", js.undefined)
      
      inline def setWatchRun(value: Callback): Self = StObject.set(x, "watchRun", value.toJsFn)
      
      inline def setWatchRunUndefined: Self = StObject.set(x, "watchRun", js.undefined)
    }
  }
}
