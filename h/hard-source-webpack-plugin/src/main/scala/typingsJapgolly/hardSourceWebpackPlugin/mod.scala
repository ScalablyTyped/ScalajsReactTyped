package typingsJapgolly.hardSourceWebpackPlugin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.hardSourceWebpackPlugin.anon.Directories
import typingsJapgolly.hardSourceWebpackPlugin.anon.Level
import typingsJapgolly.hardSourceWebpackPlugin.anon.MaxAge
import typingsJapgolly.hardSourceWebpackPlugin.mod.ExcludeModulePlugin.Option
import typingsJapgolly.node.childProcessMod.ChildProcess
import typingsJapgolly.node.childProcessMod.ForkOptions
import typingsJapgolly.webpack.mod.Compiler
import typingsJapgolly.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hard-source-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with typingsJapgolly.hardSourceWebpackPlugin.mod.hardSourceWebpackPlugin {
    def this(options: Options) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(args: Any*): Unit = js.native
  }
  
  @JSImport("hard-source-webpack-plugin", "ExcludeModulePlugin")
  @js.native
  open class ExcludeModulePlugin protected () extends StObject {
    def this(options: js.Array[Option]) = this()
    def this(options: Option) = this()
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
  }
  object ExcludeModulePlugin {
    
    trait Option extends StObject {
      
      var exclude: js.UndefOr[TestElement] = js.undefined
      
      var include: js.UndefOr[TestElement] = js.undefined
      
      var test: TestElement
    }
    object Option {
      
      inline def apply(test: TestElement): Option = {
        val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
        __obj.asInstanceOf[Option]
      }
      
      extension [Self <: Option](x: Self) {
        
        inline def setExclude(value: TestElement): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
        
        inline def setExcludeFunction1(value: /* source */ String => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
        
        inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
        
        inline def setExcludeVarargs(value: Option*): Self = StObject.set(x, "exclude", js.Array(value*))
        
        inline def setInclude(value: TestElement): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
        
        inline def setIncludeFunction1(value: /* source */ String => Boolean): Self = StObject.set(x, "include", js.Any.fromFunction1(value))
        
        inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
        
        inline def setIncludeVarargs(value: Option*): Self = StObject.set(x, "include", js.Array(value*))
        
        inline def setTest(value: TestElement): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
        
        inline def setTestFunction1(value: /* source */ String => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
        
        inline def setTestVarargs(value: Option*): Self = StObject.set(x, "test", js.Array(value*))
      }
    }
    
    type TestElement = js.RegExp | String | (js.Function1[/* source */ String, Boolean]) | js.Array[Option]
  }
  
  @JSImport("hard-source-webpack-plugin", "HardSourceLevelDbSerializerPlugin")
  @js.native
  open class HardSourceLevelDbSerializerPlugin () extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
  }
  
  @JSImport("hard-source-webpack-plugin", "LevelDbSerializerPlugin")
  @js.native
  open class LevelDbSerializerPlugin () extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
  }
  
  @JSImport("hard-source-webpack-plugin", "ParallelModulePlugin")
  @js.native
  open class ParallelModulePlugin protected () extends StObject {
    def this(options: typingsJapgolly.hardSourceWebpackPlugin.mod.ParallelModulePlugin.Options) = this()
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
  }
  object ParallelModulePlugin {
    
    trait Options extends StObject {
      
      var fork: js.UndefOr[
            js.Function3[/* fork */ forkFn, /* compiler */ Compiler, /* webpackBin */ String, Unit]
          ] = js.undefined
      
      var minModules: js.UndefOr[Double] = js.undefined
      
      var numWorkers: js.UndefOr[Double | js.Function0[Double]] = js.undefined
    }
    object Options {
      
      inline def apply(): typingsJapgolly.hardSourceWebpackPlugin.mod.ParallelModulePlugin.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.hardSourceWebpackPlugin.mod.ParallelModulePlugin.Options]
      }
      
      extension [Self <: typingsJapgolly.hardSourceWebpackPlugin.mod.ParallelModulePlugin.Options](x: Self) {
        
        inline def setFork(value: (/* fork */ forkFn, /* compiler */ Compiler, /* webpackBin */ String) => Callback): Self = StObject.set(x, "fork", js.Any.fromFunction3((t0: /* fork */ forkFn, t1: /* compiler */ Compiler, t2: /* webpackBin */ String) => (value(t0, t1, t2)).runNow()))
        
        inline def setForkUndefined: Self = StObject.set(x, "fork", js.undefined)
        
        inline def setMinModules(value: Double): Self = StObject.set(x, "minModules", value.asInstanceOf[js.Any])
        
        inline def setMinModulesUndefined: Self = StObject.set(x, "minModules", js.undefined)
        
        inline def setNumWorkers(value: Double | js.Function0[Double]): Self = StObject.set(x, "numWorkers", value.asInstanceOf[js.Any])
        
        inline def setNumWorkersCallbackTo(value: CallbackTo[Double]): Self = StObject.set(x, "numWorkers", value.toJsFn)
        
        inline def setNumWorkersUndefined: Self = StObject.set(x, "numWorkers", js.undefined)
      }
    }
    
    // NOTE: not using `Parameters` and `ReturnType` on purpose to compatibility. better of code this below.
    //     type forkFn = (...args: Parameters<typeof fork>) => ReturnType<typeof fork>
    // this code working on supported versions of `infer` keyword (version 2.8 higher.
    type forkFn = js.Function3[
        /* modulePath */ String, 
        /* args */ js.UndefOr[js.Array[String]], 
        /* options */ js.UndefOr[ForkOptions], 
        ChildProcess
      ]
  }
  
  @JSImport("hard-source-webpack-plugin", "SerializerAppend2Plugin")
  @js.native
  open class SerializerAppend2Plugin () extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
  }
  
  @JSImport("hard-source-webpack-plugin", "SerializerAppendPlugin")
  @js.native
  open class SerializerAppendPlugin () extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
  }
  
  @JSImport("hard-source-webpack-plugin", "SerializerCacachePlugin")
  @js.native
  open class SerializerCacachePlugin () extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
  }
  
  @JSImport("hard-source-webpack-plugin", "SerializerJsonPlugin")
  @js.native
  open class SerializerJsonPlugin () extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var cacheDirectory: js.UndefOr[String] = js.undefined
    
    var cachePrune: js.UndefOr[MaxAge] = js.undefined
    
    var configHash: js.UndefOr[String | (js.Function1[/* webpackConfig */ js.UndefOr[Configuration], String])] = js.undefined
    
    var environmentHash: js.UndefOr[Directories] = js.undefined
    
    var info: js.UndefOr[Level] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCacheDirectory(value: String): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
      
      inline def setCacheDirectoryUndefined: Self = StObject.set(x, "cacheDirectory", js.undefined)
      
      inline def setCachePrune(value: MaxAge): Self = StObject.set(x, "cachePrune", value.asInstanceOf[js.Any])
      
      inline def setCachePruneUndefined: Self = StObject.set(x, "cachePrune", js.undefined)
      
      inline def setConfigHash(value: String | (js.Function1[/* webpackConfig */ js.UndefOr[Configuration], String])): Self = StObject.set(x, "configHash", value.asInstanceOf[js.Any])
      
      inline def setConfigHashFunction1(value: /* webpackConfig */ js.UndefOr[Configuration] => String): Self = StObject.set(x, "configHash", js.Any.fromFunction1(value))
      
      inline def setConfigHashUndefined: Self = StObject.set(x, "configHash", js.undefined)
      
      inline def setEnvironmentHash(value: Directories): Self = StObject.set(x, "environmentHash", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentHashUndefined: Self = StObject.set(x, "environmentHash", js.undefined)
      
      inline def setInfo(value: Level): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    }
  }
  
  trait hardSourceWebpackPlugin extends StObject {
    
    @JSName("apply")
    def apply(args: Any*): Unit
  }
  object hardSourceWebpackPlugin {
    
    inline def apply(apply: /* repeated */ Any => Callback): typingsJapgolly.hardSourceWebpackPlugin.mod.hardSourceWebpackPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: /* repeated */ Any) => apply(t0).runNow()))
      __obj.asInstanceOf[typingsJapgolly.hardSourceWebpackPlugin.mod.hardSourceWebpackPlugin]
    }
    
    extension [Self <: typingsJapgolly.hardSourceWebpackPlugin.mod.hardSourceWebpackPlugin](x: Self) {
      
      inline def setApply(value: /* repeated */ Any => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    }
  }
}
