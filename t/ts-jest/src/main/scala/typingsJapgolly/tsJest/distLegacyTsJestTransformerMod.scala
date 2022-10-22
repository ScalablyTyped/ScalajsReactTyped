package typingsJapgolly.tsJest

import typingsJapgolly.jestTransform.mod.SyncTransformer
import typingsJapgolly.jestTransform.mod.TransformOptions
import typingsJapgolly.jestTransform.mod.TransformedSource
import typingsJapgolly.std.Map
import typingsJapgolly.tsJest.distLegacyConfigConfigSetMod.ConfigSet
import typingsJapgolly.tsJest.distTypesMod.CompilerInstance
import typingsJapgolly.tsJest.distTypesMod.ProjectConfigTsJest
import typingsJapgolly.tsJest.distTypesMod.TransformOptionsTsJest
import typingsJapgolly.tsJest.distTypesMod.TsJestGlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLegacyTsJestTransformerMod {
  
  @JSImport("ts-jest/dist/legacy/ts-jest-transformer", "TsJestTransformer")
  @js.native
  open class TsJestTransformer ()
    extends StObject
       with SyncTransformer[Any] {
    def this(tsJestConfig: TsJestGlobalOptions) = this()
    
    /* protected */ var _compiler: CompilerInstance = js.native
    
    /* private */ var _configsFor: Any = js.native
    
    /* protected */ def _createCompiler(configSet: ConfigSet, cacheFS: Map[String, String]): Unit = js.native
    
    /* protected */ def _createConfigSet(): ConfigSet = js.native
    /* protected */ def _createConfigSet(config: ProjectConfigTsJest): ConfigSet = js.native
    
    /* private */ var _depGraphs: Any = js.native
    
    /* private */ var _getFsCachedResolvedModules: Any = js.native
    
    /* private */ val _logger: Any = js.native
    
    /* private */ var _transformCfgStr: Any = js.native
    
    /* private */ var _tsResolvedModulesCachePath: Any = js.native
    
    /* private */ var _watchMode: Any = js.native
    
    @JSName("getCacheKeyAsync")
    def getCacheKeyAsync_MTsJestTransformer(sourceText: String, sourcePath: String, transformOptions: TransformOptionsTsJest): js.Promise[String] = js.native
    
    @JSName("getCacheKey")
    def getCacheKey_MTsJestTransformer(fileContent: String, filePath: String, transformOptions: TransformOptionsTsJest): String = js.native
    
    /* CompleteClass */
    override def process(sourceText: String, sourcePath: String, options: TransformOptions[Any]): TransformedSource = js.native
    def process(sourceText: String, sourcePath: String, transformOptions: TransformOptionsTsJest): TransformedSource = js.native
    
    @JSName("processAsync")
    def processAsync_MTsJestTransformer(sourceText: String, sourcePath: String, transformOptions: TransformOptionsTsJest): js.Promise[TransformedSource] = js.native
    
    /* private */ var processWithTs: Any = js.native
    
    /* private */ var runTsJestHook: Any = js.native
    
    /* private */ val tsJestConfig: Any = js.native
  }
}
