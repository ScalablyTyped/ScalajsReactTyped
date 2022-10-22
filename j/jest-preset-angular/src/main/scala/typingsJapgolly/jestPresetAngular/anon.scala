package typingsJapgolly.jestPresetAngular

import typingsJapgolly.tsJest.distRawCompilerOptionsMod.RawCompilerOptions
import typingsJapgolly.tsJest.distTypesMod.ConfigCustomTransformer
import typingsJapgolly.tsJest.distTypesMod.GlobalConfigTsJest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AstTransformers extends StObject {
    
    var astTransformers: js.UndefOr[ConfigCustomTransformer] = js.undefined
    
    var babelConfig: js.UndefOr[
        String | Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_core.TransformOptions */ Any)
      ] = js.undefined
    
    var compiler: js.UndefOr[String] = js.undefined
    
    var diagnostics: js.UndefOr[Boolean | Exclude] = js.undefined
    
    var isolatedModules: js.UndefOr[Boolean] = js.undefined
    
    var stringifyContentPathRegex: js.UndefOr[String | js.RegExp] = js.undefined
    
    var tsconfig: js.UndefOr[String | Boolean | RawCompilerOptions] = js.undefined
    
    var useESM: Boolean
  }
  object AstTransformers {
    
    inline def apply(useESM: Boolean): AstTransformers = {
      val __obj = js.Dynamic.literal(useESM = useESM.asInstanceOf[js.Any])
      __obj.asInstanceOf[AstTransformers]
    }
    
    extension [Self <: AstTransformers](x: Self) {
      
      inline def setAstTransformers(value: ConfigCustomTransformer): Self = StObject.set(x, "astTransformers", value.asInstanceOf[js.Any])
      
      inline def setAstTransformersUndefined: Self = StObject.set(x, "astTransformers", js.undefined)
      
      inline def setBabelConfig(
        value: String | Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_core.TransformOptions */ Any)
      ): Self = StObject.set(x, "babelConfig", value.asInstanceOf[js.Any])
      
      inline def setBabelConfigUndefined: Self = StObject.set(x, "babelConfig", js.undefined)
      
      inline def setCompiler(value: String): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
      
      inline def setDiagnostics(value: Boolean | Exclude): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
      
      inline def setIsolatedModules(value: Boolean): Self = StObject.set(x, "isolatedModules", value.asInstanceOf[js.Any])
      
      inline def setIsolatedModulesUndefined: Self = StObject.set(x, "isolatedModules", js.undefined)
      
      inline def setStringifyContentPathRegex(value: String | js.RegExp): Self = StObject.set(x, "stringifyContentPathRegex", value.asInstanceOf[js.Any])
      
      inline def setStringifyContentPathRegexUndefined: Self = StObject.set(x, "stringifyContentPathRegex", js.undefined)
      
      inline def setTsconfig(value: String | Boolean | RawCompilerOptions): Self = StObject.set(x, "tsconfig", value.asInstanceOf[js.Any])
      
      inline def setTsconfigUndefined: Self = StObject.set(x, "tsconfig", js.undefined)
      
      inline def setUseESM(value: Boolean): Self = StObject.set(x, "useESM", value.asInstanceOf[js.Any])
    }
  }
  
  trait Exclude extends StObject {
    
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignoreCodes: js.UndefOr[String | Double | (js.Array[String | Double])] = js.undefined
    
    var pretty: js.UndefOr[Boolean] = js.undefined
    
    var warnOnly: js.UndefOr[Boolean] = js.undefined
  }
  object Exclude {
    
    inline def apply(): Exclude = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Exclude]
    }
    
    extension [Self <: Exclude](x: Self) {
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setIgnoreCodes(value: String | Double | (js.Array[String | Double])): Self = StObject.set(x, "ignoreCodes", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCodesUndefined: Self = StObject.set(x, "ignoreCodes", js.undefined)
      
      inline def setIgnoreCodesVarargs(value: (String | Double)*): Self = StObject.set(x, "ignoreCodes", js.Array(value*))
      
      inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      inline def setWarnOnly(value: Boolean): Self = StObject.set(x, "warnOnly", value.asInstanceOf[js.Any])
      
      inline def setWarnOnlyUndefined: Self = StObject.set(x, "warnOnly", js.undefined)
    }
  }
  
  trait ExtensionsToTreatAsEsm extends StObject {
    
    var extensionsToTreatAsEsm: js.Array[String]
    
    var globals: Tsjest
    
    var moduleFileExtensions: js.Array[String]
    
    var moduleNameMapper: Tslib
    
    var snapshotSerializers: js.Array[String]
    
    var testEnvironment: String
    
    var transform: Tsjshtmlsvg
    
    var transformIgnorePatterns: js.Array[String]
  }
  object ExtensionsToTreatAsEsm {
    
    inline def apply(
      extensionsToTreatAsEsm: js.Array[String],
      globals: Tsjest,
      moduleFileExtensions: js.Array[String],
      moduleNameMapper: Tslib,
      snapshotSerializers: js.Array[String],
      testEnvironment: String,
      transform: Tsjshtmlsvg,
      transformIgnorePatterns: js.Array[String]
    ): ExtensionsToTreatAsEsm = {
      val __obj = js.Dynamic.literal(extensionsToTreatAsEsm = extensionsToTreatAsEsm.asInstanceOf[js.Any], globals = globals.asInstanceOf[js.Any], moduleFileExtensions = moduleFileExtensions.asInstanceOf[js.Any], moduleNameMapper = moduleNameMapper.asInstanceOf[js.Any], snapshotSerializers = snapshotSerializers.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transformIgnorePatterns = transformIgnorePatterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtensionsToTreatAsEsm]
    }
    
    extension [Self <: ExtensionsToTreatAsEsm](x: Self) {
      
      inline def setExtensionsToTreatAsEsm(value: js.Array[String]): Self = StObject.set(x, "extensionsToTreatAsEsm", value.asInstanceOf[js.Any])
      
      inline def setExtensionsToTreatAsEsmVarargs(value: String*): Self = StObject.set(x, "extensionsToTreatAsEsm", js.Array(value*))
      
      inline def setGlobals(value: Tsjest): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setModuleFileExtensions(value: js.Array[String]): Self = StObject.set(x, "moduleFileExtensions", value.asInstanceOf[js.Any])
      
      inline def setModuleFileExtensionsVarargs(value: String*): Self = StObject.set(x, "moduleFileExtensions", js.Array(value*))
      
      inline def setModuleNameMapper(value: Tslib): Self = StObject.set(x, "moduleNameMapper", value.asInstanceOf[js.Any])
      
      inline def setSnapshotSerializers(value: js.Array[String]): Self = StObject.set(x, "snapshotSerializers", value.asInstanceOf[js.Any])
      
      inline def setSnapshotSerializersVarargs(value: String*): Self = StObject.set(x, "snapshotSerializers", js.Array(value*))
      
      inline def setTestEnvironment(value: String): Self = StObject.set(x, "testEnvironment", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: Tsjshtmlsvg): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "transformIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setTransformIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "transformIgnorePatterns", js.Array(value*))
    }
  }
  
  trait Globals extends StObject {
    
    var globals: GlobalConfigTsJest
    
    var moduleFileExtensions: js.Array[String]
    
    var snapshotSerializers: js.Array[String]
    
    var testEnvironment: String
    
    var transform: Tsjsmjshtmlsvg
    
    var transformIgnorePatterns: js.Array[String]
  }
  object Globals {
    
    inline def apply(
      globals: GlobalConfigTsJest,
      moduleFileExtensions: js.Array[String],
      snapshotSerializers: js.Array[String],
      testEnvironment: String,
      transform: Tsjsmjshtmlsvg,
      transformIgnorePatterns: js.Array[String]
    ): Globals = {
      val __obj = js.Dynamic.literal(globals = globals.asInstanceOf[js.Any], moduleFileExtensions = moduleFileExtensions.asInstanceOf[js.Any], snapshotSerializers = snapshotSerializers.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transformIgnorePatterns = transformIgnorePatterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[Globals]
    }
    
    extension [Self <: Globals](x: Self) {
      
      inline def setGlobals(value: GlobalConfigTsJest): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setModuleFileExtensions(value: js.Array[String]): Self = StObject.set(x, "moduleFileExtensions", value.asInstanceOf[js.Any])
      
      inline def setModuleFileExtensionsVarargs(value: String*): Self = StObject.set(x, "moduleFileExtensions", js.Array(value*))
      
      inline def setSnapshotSerializers(value: js.Array[String]): Self = StObject.set(x, "snapshotSerializers", value.asInstanceOf[js.Any])
      
      inline def setSnapshotSerializersVarargs(value: String*): Self = StObject.set(x, "snapshotSerializers", js.Array(value*))
      
      inline def setTestEnvironment(value: String): Self = StObject.set(x, "testEnvironment", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: Tsjsmjshtmlsvg): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "transformIgnorePatterns", value.asInstanceOf[js.Any])
      
      inline def setTransformIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "transformIgnorePatterns", js.Array(value*))
    }
  }
  
  trait Tsjest extends StObject {
    
    var `ts-jest`: AstTransformers
  }
  object Tsjest {
    
    inline def apply(`ts-jest`: AstTransformers): Tsjest = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("ts-jest")(`ts-jest`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tsjest]
    }
    
    extension [Self <: Tsjest](x: Self) {
      
      inline def `setTs-jest`(value: AstTransformers): Self = StObject.set(x, "ts-jest", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tsjshtmlsvg extends StObject {
    
    @JSName("^.+\\.(ts|js|html|svg)$")
    var `^DotPlussignBackslashDotLeftparenthesistsVerticallinejsVerticallinehtmlVerticallinesvgRightparenthesis$`: String
  }
  object Tsjshtmlsvg {
    
    inline def apply(
      `^DotPlussignBackslashDotLeftparenthesistsVerticallinejsVerticallinehtmlVerticallinesvgRightparenthesis$`: String
    ): Tsjshtmlsvg = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("^.+\\.(ts|js|html|svg)$")(`^DotPlussignBackslashDotLeftparenthesistsVerticallinejsVerticallinehtmlVerticallinesvgRightparenthesis$`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tsjshtmlsvg]
    }
    
    extension [Self <: Tsjshtmlsvg](x: Self) {
      
      inline def `set^DotPlussignBackslashDotLeftparenthesistsVerticallinejsVerticallinehtmlVerticallinesvgRightparenthesis$`(value: String): Self = StObject.set(x, "^.+\\.(ts|js|html|svg)$", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tsjsmjshtmlsvg extends StObject {
    
    @JSName("^.+\\.(ts|js|mjs|html|svg)$")
    var `^DotPlussignBackslashDotLeftparenthesistsVerticallinejsVerticallinemjsVerticallinehtmlVerticallinesvgRightparenthesis$`: String
  }
  object Tsjsmjshtmlsvg {
    
    inline def apply(
      `^DotPlussignBackslashDotLeftparenthesistsVerticallinejsVerticallinemjsVerticallinehtmlVerticallinesvgRightparenthesis$`: String
    ): Tsjsmjshtmlsvg = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("^.+\\.(ts|js|mjs|html|svg)$")(`^DotPlussignBackslashDotLeftparenthesistsVerticallinejsVerticallinemjsVerticallinehtmlVerticallinesvgRightparenthesis$`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tsjsmjshtmlsvg]
    }
    
    extension [Self <: Tsjsmjshtmlsvg](x: Self) {
      
      inline def `set^DotPlussignBackslashDotLeftparenthesistsVerticallinejsVerticallinemjsVerticallinehtmlVerticallinesvgRightparenthesis$`(value: String): Self = StObject.set(x, "^.+\\.(ts|js|mjs|html|svg)$", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tslib extends StObject {
    
    var tslib: String
  }
  object Tslib {
    
    inline def apply(tslib: String): Tslib = {
      val __obj = js.Dynamic.literal(tslib = tslib.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tslib]
    }
    
    extension [Self <: Tslib](x: Self) {
      
      inline def setTslib(value: String): Self = StObject.set(x, "tslib", value.asInstanceOf[js.Any])
    }
  }
}
