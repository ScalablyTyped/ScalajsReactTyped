package typingsJapgolly.tsJest

import typingsJapgolly.bsLogger.distLoggerMod.Logger
import typingsJapgolly.jestTypes.mod.InitialOptions
import typingsJapgolly.tsJest.anon.Prefix
import typingsJapgolly.tsJest.distConfigPathsToModuleNameMapperMod.JestPathMapping
import typingsJapgolly.tsJest.distTypesMod.ProjectConfigTsJest
import typingsJapgolly.tsJest.distTypesMod.StringMap
import typingsJapgolly.tsJest.distTypesMod.TsJestGlobalOptions
import typingsJapgolly.tsJest.distTypesMod.TsJestPresets
import typingsJapgolly.typescript.mod.MapLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ts-jest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("ts-jest", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def createTransformer(): typingsJapgolly.tsJest.distLegacyTsJestTransformerMod.TsJestTransformer = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")().asInstanceOf[typingsJapgolly.tsJest.distLegacyTsJestTransformerMod.TsJestTransformer]
    inline def createTransformer(tsJestConfig: TsJestGlobalOptions): typingsJapgolly.tsJest.distLegacyTsJestTransformerMod.TsJestTransformer = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")(tsJestConfig.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.tsJest.distLegacyTsJestTransformerMod.TsJestTransformer]
  }
  
  @JSImport("ts-jest", "ConfigSet")
  @js.native
  open class ConfigSet ()
    extends typingsJapgolly.tsJest.distLegacyConfigConfigSetMod.ConfigSet {
    def this(jestConfig: ProjectConfigTsJest) = this()
    def this(jestConfig: Unit, parentLogger: Logger) = this()
    def this(jestConfig: ProjectConfigTsJest, parentLogger: Logger) = this()
  }
  
  @JSImport("ts-jest", "DECLARATION_TYPE_EXT")
  @js.native
  val DECLARATION_TYPE_EXT: /* ".d.ts" */ String = js.native
  
  @JSImport("ts-jest", "JS_EXT_TO_TREAT_AS_ESM")
  @js.native
  val JS_EXT_TO_TREAT_AS_ESM: js.Array[String] = js.native
  
  @JSImport("ts-jest", "JS_JSX_EXTENSIONS")
  @js.native
  val JS_JSX_EXTENSIONS: js.Array[String] = js.native
  
  @JSImport("ts-jest", "JS_JSX_REGEX")
  @js.native
  val JS_JSX_REGEX: js.RegExp = js.native
  
  @JSImport("ts-jest", "JsonableValue")
  @js.native
  open class JsonableValue[V] protected ()
    extends typingsJapgolly.tsJest.distUtilsMod.JsonableValue[V] {
    def this(value: V) = this()
  }
  
  @JSImport("ts-jest", "LINE_FEED")
  @js.native
  val LINE_FEED: /* "\n" */ String = js.native
  
  @JSImport("ts-jest", "TS_EXT_TO_TREAT_AS_ESM")
  @js.native
  val TS_EXT_TO_TREAT_AS_ESM: js.Array[String] = js.native
  
  @JSImport("ts-jest", "TS_TSX_REGEX")
  @js.native
  val TS_TSX_REGEX: js.RegExp = js.native
  
  @JSImport("ts-jest", "TsCompiler")
  @js.native
  open class TsCompiler protected ()
    extends typingsJapgolly.tsJest.distLegacyCompilerMod.TsCompiler {
    def this(
      configSet: typingsJapgolly.tsJest.distLegacyConfigConfigSetMod.ConfigSet,
      runtimeCacheFS: StringMap
    ) = this()
  }
  
  @JSImport("ts-jest", "TsJestCompiler")
  @js.native
  open class TsJestCompiler protected ()
    extends typingsJapgolly.tsJest.distLegacyCompilerMod.TsJestCompiler {
    def this(
      configSet: typingsJapgolly.tsJest.distLegacyConfigConfigSetMod.ConfigSet,
      runtimeCacheFS: StringMap
    ) = this()
  }
  
  @JSImport("ts-jest", "TsJestTransformer")
  @js.native
  open class TsJestTransformer ()
    extends typingsJapgolly.tsJest.distLegacyTsJestTransformerMod.TsJestTransformer {
    def this(tsJestConfig: TsJestGlobalOptions) = this()
  }
  
  inline def createJestPreset(): TsJestPresets = ^.asInstanceOf[js.Dynamic].applyDynamic("createJestPreset")().asInstanceOf[TsJestPresets]
  inline def createJestPreset(legacy: Boolean): TsJestPresets = ^.asInstanceOf[js.Dynamic].applyDynamic("createJestPreset")(legacy.asInstanceOf[js.Any]).asInstanceOf[TsJestPresets]
  inline def createJestPreset(legacy: Boolean, allowJs: Boolean): TsJestPresets = (^.asInstanceOf[js.Dynamic].applyDynamic("createJestPreset")(legacy.asInstanceOf[js.Any], allowJs.asInstanceOf[js.Any])).asInstanceOf[TsJestPresets]
  inline def createJestPreset(legacy: Boolean, allowJs: Boolean, extraOptions: InitialOptions): TsJestPresets = (^.asInstanceOf[js.Dynamic].applyDynamic("createJestPreset")(legacy.asInstanceOf[js.Any], allowJs.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any])).asInstanceOf[TsJestPresets]
  inline def createJestPreset(legacy: Boolean, allowJs: Unit, extraOptions: InitialOptions): TsJestPresets = (^.asInstanceOf[js.Dynamic].applyDynamic("createJestPreset")(legacy.asInstanceOf[js.Any], allowJs.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any])).asInstanceOf[TsJestPresets]
  inline def createJestPreset(legacy: Unit, allowJs: Boolean): TsJestPresets = (^.asInstanceOf[js.Dynamic].applyDynamic("createJestPreset")(legacy.asInstanceOf[js.Any], allowJs.asInstanceOf[js.Any])).asInstanceOf[TsJestPresets]
  inline def createJestPreset(legacy: Unit, allowJs: Boolean, extraOptions: InitialOptions): TsJestPresets = (^.asInstanceOf[js.Dynamic].applyDynamic("createJestPreset")(legacy.asInstanceOf[js.Any], allowJs.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any])).asInstanceOf[TsJestPresets]
  inline def createJestPreset(legacy: Unit, allowJs: Unit, extraOptions: InitialOptions): TsJestPresets = (^.asInstanceOf[js.Dynamic].applyDynamic("createJestPreset")(legacy.asInstanceOf[js.Any], allowJs.asInstanceOf[js.Any], extraOptions.asInstanceOf[js.Any])).asInstanceOf[TsJestPresets]
  
  inline def parse(input: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def pathsToModuleNameMapper(mapping: MapLike[js.Array[String]]): JestPathMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("pathsToModuleNameMapper")(mapping.asInstanceOf[js.Any]).asInstanceOf[JestPathMapping]
  inline def pathsToModuleNameMapper(mapping: MapLike[js.Array[String]], hasPrefix: Prefix): JestPathMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("pathsToModuleNameMapper")(mapping.asInstanceOf[js.Any], hasPrefix.asInstanceOf[js.Any])).asInstanceOf[JestPathMapping]
  
  @JSImport("ts-jest", "rootLogger")
  @js.native
  def rootLogger: Logger = js.native
  inline def rootLogger_=(x: Logger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rootLogger")(x.asInstanceOf[js.Any])
  
  inline def stringify(input: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* augmented module */
  object jestTypesAugmentingMod {
    
    object Config {
      
      trait ConfigGlobals extends StObject {
        
        var `ts-jest`: TsJestGlobalOptions
      }
      object ConfigGlobals {
        
        inline def apply(`ts-jest`: TsJestGlobalOptions): ConfigGlobals = {
          val __obj = js.Dynamic.literal()
          __obj.updateDynamic("ts-jest")(`ts-jest`.asInstanceOf[js.Any])
          __obj.asInstanceOf[ConfigGlobals]
        }
        
        extension [Self <: ConfigGlobals](x: Self) {
          
          inline def `setTs-jest`(value: TsJestGlobalOptions): Self = StObject.set(x, "ts-jest", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
