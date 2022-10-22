package typingsJapgolly.tsJest.distTypesMod

import typingsJapgolly.tsJest.anon.Exclude
import typingsJapgolly.tsJest.distRawCompilerOptionsMod.RawCompilerOptions
import typingsJapgolly.tsJest.tsJestStrings.ttypescript
import typingsJapgolly.tsJest.tsJestStrings.typescript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsJestGlobalOptions extends StObject {
  
  var astTransformers: js.UndefOr[ConfigCustomTransformer] = js.undefined
  
  var babelConfig: js.UndefOr[Boolean | String | BabelConfig] = js.undefined
  
  var compiler: js.UndefOr[typescript | ttypescript | String] = js.undefined
  
  var diagnostics: js.UndefOr[Boolean | Exclude] = js.undefined
  
  var isolatedModules: js.UndefOr[Boolean] = js.undefined
  
  var stringifyContentPathRegex: js.UndefOr[String | js.RegExp] = js.undefined
  
  var tsconfig: js.UndefOr[Boolean | String | RawCompilerOptions] = js.undefined
  
  var useESM: js.UndefOr[Boolean] = js.undefined
}
object TsJestGlobalOptions {
  
  inline def apply(): TsJestGlobalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TsJestGlobalOptions]
  }
  
  extension [Self <: TsJestGlobalOptions](x: Self) {
    
    inline def setAstTransformers(value: ConfigCustomTransformer): Self = StObject.set(x, "astTransformers", value.asInstanceOf[js.Any])
    
    inline def setAstTransformersUndefined: Self = StObject.set(x, "astTransformers", js.undefined)
    
    inline def setBabelConfig(value: Boolean | String | BabelConfig): Self = StObject.set(x, "babelConfig", value.asInstanceOf[js.Any])
    
    inline def setBabelConfigUndefined: Self = StObject.set(x, "babelConfig", js.undefined)
    
    inline def setCompiler(value: typescript | ttypescript | String): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
    
    inline def setDiagnostics(value: Boolean | Exclude): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    inline def setIsolatedModules(value: Boolean): Self = StObject.set(x, "isolatedModules", value.asInstanceOf[js.Any])
    
    inline def setIsolatedModulesUndefined: Self = StObject.set(x, "isolatedModules", js.undefined)
    
    inline def setStringifyContentPathRegex(value: String | js.RegExp): Self = StObject.set(x, "stringifyContentPathRegex", value.asInstanceOf[js.Any])
    
    inline def setStringifyContentPathRegexUndefined: Self = StObject.set(x, "stringifyContentPathRegex", js.undefined)
    
    inline def setTsconfig(value: Boolean | String | RawCompilerOptions): Self = StObject.set(x, "tsconfig", value.asInstanceOf[js.Any])
    
    inline def setTsconfigUndefined: Self = StObject.set(x, "tsconfig", js.undefined)
    
    inline def setUseESM(value: Boolean): Self = StObject.set(x, "useESM", value.asInstanceOf[js.Any])
    
    inline def setUseESMUndefined: Self = StObject.set(x, "useESM", js.undefined)
  }
}
