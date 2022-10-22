package typingsJapgolly.licenseWebpackPlugin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.licenseWebpackPlugin.anon.Basename
import typingsJapgolly.licenseWebpackPlugin.anon.OptimizeChunkAssets
import typingsJapgolly.licenseWebpackPlugin.anon.ToJson
import typingsJapgolly.licenseWebpackPlugin.distChunkGraphMod.ChunkGraph
import typingsJapgolly.licenseWebpackPlugin.distWebpackChunkMod.WebpackChunk
import typingsJapgolly.licenseWebpackPlugin.distWebpackCompilerMod.WebpackCompiler
import typingsJapgolly.std.IterableIterator
import typingsJapgolly.webpackSources.mod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWebpackCompilationMod {
  
  trait WebpackCompilation extends StObject {
    
    var assets: StringDictionary[Source]
    
    var chunkGraph: js.UndefOr[ChunkGraph] = js.undefined
    
    var chunks: IterableIterator[WebpackChunk]
    
    var compiler: WebpackCompiler
    
    var errors: js.Array[Any]
    
    def getPath(filename: String, data: Basename): String
    
    def getStats(): ToJson
    
    var hash: String
    
    var hooks: OptimizeChunkAssets
    
    var plugin: js.UndefOr[js.Function2[/* phase */ String, /* callback */ js.Function, Unit]] = js.undefined
    
    var warnings: js.Array[Any]
  }
  object WebpackCompilation {
    
    inline def apply(
      assets: StringDictionary[Source],
      chunks: IterableIterator[WebpackChunk],
      compiler: WebpackCompiler,
      errors: js.Array[Any],
      getPath: (String, Basename) => String,
      getStats: CallbackTo[ToJson],
      hash: String,
      hooks: OptimizeChunkAssets,
      warnings: js.Array[Any]
    ): WebpackCompilation = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], chunks = chunks.asInstanceOf[js.Any], compiler = compiler.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], getPath = js.Any.fromFunction2(getPath), getStats = getStats.toJsFn, hash = hash.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebpackCompilation]
    }
    
    extension [Self <: WebpackCompilation](x: Self) {
      
      inline def setAssets(value: StringDictionary[Source]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setChunkGraph(value: ChunkGraph): Self = StObject.set(x, "chunkGraph", value.asInstanceOf[js.Any])
      
      inline def setChunkGraphUndefined: Self = StObject.set(x, "chunkGraph", js.undefined)
      
      inline def setChunks(value: IterableIterator[WebpackChunk]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      inline def setCompiler(value: WebpackCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[Any]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: Any*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setGetPath(value: (String, Basename) => String): Self = StObject.set(x, "getPath", js.Any.fromFunction2(value))
      
      inline def setGetStats(value: CallbackTo[ToJson]): Self = StObject.set(x, "getStats", value.toJsFn)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHooks(value: OptimizeChunkAssets): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setPlugin(value: (/* phase */ String, /* callback */ js.Function) => Callback): Self = StObject.set(x, "plugin", js.Any.fromFunction2((t0: /* phase */ String, t1: /* callback */ js.Function) => (value(t0, t1)).runNow()))
      
      inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      inline def setWarnings(value: js.Array[Any]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: Any*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  trait WebpackStatsOptions extends StObject {
    
    var all: js.UndefOr[Boolean] = js.undefined
    
    var cachedModules: js.UndefOr[Boolean] = js.undefined
    
    var chunkModules: js.UndefOr[Boolean] = js.undefined
    
    var chunks: js.UndefOr[Boolean] = js.undefined
    
    var dependentModules: js.UndefOr[Boolean] = js.undefined
    
    var nestedModules: js.UndefOr[Boolean] = js.undefined
  }
  object WebpackStatsOptions {
    
    inline def apply(): WebpackStatsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebpackStatsOptions]
    }
    
    extension [Self <: WebpackStatsOptions](x: Self) {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setCachedModules(value: Boolean): Self = StObject.set(x, "cachedModules", value.asInstanceOf[js.Any])
      
      inline def setCachedModulesUndefined: Self = StObject.set(x, "cachedModules", js.undefined)
      
      inline def setChunkModules(value: Boolean): Self = StObject.set(x, "chunkModules", value.asInstanceOf[js.Any])
      
      inline def setChunkModulesUndefined: Self = StObject.set(x, "chunkModules", js.undefined)
      
      inline def setChunks(value: Boolean): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      inline def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
      
      inline def setDependentModules(value: Boolean): Self = StObject.set(x, "dependentModules", value.asInstanceOf[js.Any])
      
      inline def setDependentModulesUndefined: Self = StObject.set(x, "dependentModules", js.undefined)
      
      inline def setNestedModules(value: Boolean): Self = StObject.set(x, "nestedModules", value.asInstanceOf[js.Any])
      
      inline def setNestedModulesUndefined: Self = StObject.set(x, "nestedModules", js.undefined)
    }
  }
}
