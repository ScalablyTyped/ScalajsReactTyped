package typingsJapgolly.typesEslintrc

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.typesEslintrc.anon.ExperimentalObjectRestSpread
import typingsJapgolly.typesEslintrc.buildEnvironmentMod.ESLintEnvironment
import typingsJapgolly.typesEslintrc.typesEslintrcStrings.`@babelSlasheslint-parser`
import typingsJapgolly.typesEslintrc.typesEslintrcStrings.`@typescript-eslintSlashparser`
import typingsJapgolly.typesEslintrc.typesEslintrcStrings.esprima
import typingsJapgolly.typesEslintrc.typesEslintrcStrings.module
import typingsJapgolly.typesEslintrc.typesEslintrcStrings.script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("types-eslintrc/build", "fileName")
  @js.native
  val fileName: /* ".eslintrc.json" */ String = js.native
  
  trait ESLintConfig extends StObject {
    
    @JSName("$schema")
    var $schema: js.UndefOr[String] = js.undefined
    
    /**
      * An environment defines global variables that are predefined.
      */
    var env: js.UndefOr[ESLintEnvironment] = js.undefined
    
    /**
      * A configuration file can extend the set of enabled rules from base configurations.
      */
    var `extends`: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * The additional global variables your script accesses during execution.
      */
    var globals: js.UndefOr[StringDictionary[ESLintGlobalPermission]] = js.undefined
    
    /**
      * You can tell ESLint to ignore specific files and directories by using ignorePatterns.
      */
    var ignorePatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * To disable all inline config comments
      */
    var noInlineConfig: js.UndefOr[Boolean] = js.undefined
    
    /**
      * To disable rules inside of a configuration file for a group of files, use the overrides key along with a files key.
      */
    var overrides: js.UndefOr[js.Array[ESLintOverride]] = js.undefined
    
    /**
      * @default "esprisma"
      */
    var parser: js.UndefOr[esprima | `@babelSlasheslint-parser` | `@typescript-eslintSlashparser` | String] = js.undefined
    
    /**
      * The JavaScript language options you want to support.
      */
    var parserOptions: js.UndefOr[ESLintParserOptions] = js.undefined
    
    /**
      * To configure plugins inside of a configuration file, use the plugins key, which contains a list of plugin names.
      */
    var plugins: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Processors can extract JavaScript code from another kind of files, then lets ESLint lint the JavaScript code.
      * Or processors can convert JavaScript code in preprocessing for some purpose.
      */
    var processor: js.UndefOr[String] = js.undefined
    
    /**
      * To report unused eslint-disable comments
      */
    var reportUnusedDisableDirectives: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Which rules are enabled and at what error level.
      */
    var rules: js.UndefOr[ESLintRules] = js.undefined
    
    /**
      * You can add settings object to ESLint configuration file and it will be supplied to every rule that will be executed.
      * This may be useful if you are adding custom rules and want them to have access to the same information and be easily configurable.
      */
    var settings: js.UndefOr[
        StringDictionary[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONValue */ Any
        ]
      ] = js.undefined
  }
  object ESLintConfig {
    
    inline def apply(): ESLintConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ESLintConfig]
    }
    
    extension [Self <: ESLintConfig](x: Self) {
      
      inline def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
      
      inline def setEnv(value: ESLintEnvironment): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setExtends(value: String | js.Array[String]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
      
      inline def setExtendsVarargs(value: String*): Self = StObject.set(x, "extends", js.Array(value*))
      
      inline def setGlobals(value: StringDictionary[ESLintGlobalPermission]): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
      
      inline def setIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "ignorePatterns", value.asInstanceOf[js.Any])
      
      inline def setIgnorePatternsUndefined: Self = StObject.set(x, "ignorePatterns", js.undefined)
      
      inline def setIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "ignorePatterns", js.Array(value*))
      
      inline def setNoInlineConfig(value: Boolean): Self = StObject.set(x, "noInlineConfig", value.asInstanceOf[js.Any])
      
      inline def setNoInlineConfigUndefined: Self = StObject.set(x, "noInlineConfig", js.undefined)
      
      inline def setOverrides(value: js.Array[ESLintOverride]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setOverridesVarargs(value: ESLintOverride*): Self = StObject.set(x, "overrides", js.Array(value*))
      
      inline def setParser(value: esprima | `@babelSlasheslint-parser` | `@typescript-eslintSlashparser` | String): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserOptions(value: ESLintParserOptions): Self = StObject.set(x, "parserOptions", value.asInstanceOf[js.Any])
      
      inline def setParserOptionsUndefined: Self = StObject.set(x, "parserOptions", js.undefined)
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setProcessor(value: String): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
      
      inline def setProcessorUndefined: Self = StObject.set(x, "processor", js.undefined)
      
      inline def setReportUnusedDisableDirectives(value: Boolean): Self = StObject.set(x, "reportUnusedDisableDirectives", value.asInstanceOf[js.Any])
      
      inline def setReportUnusedDisableDirectivesUndefined: Self = StObject.set(x, "reportUnusedDisableDirectives", js.undefined)
      
      inline def setRules(value: ESLintRules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setSettings(
        value: StringDictionary[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONValue */ Any
            ]
      ): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typesEslintrc.typesEslintrcInts.`3`
    - typingsJapgolly.typesEslintrc.typesEslintrcInts.`5`
    - typingsJapgolly.typesEslintrc.typesEslintrcInts.`6`
    - typingsJapgolly.typesEslintrc.typesEslintrcInts.`7`
    - typingsJapgolly.typesEslintrc.typesEslintrcInts.`8`
    - typingsJapgolly.typesEslintrc.typesEslintrcInts.`9`
    - typingsJapgolly.typesEslintrc.typesEslintrcInts.`10`
    - typingsJapgolly.typesEslintrc.typesEslintrcInts.`11`
    - typingsJapgolly.typesEslintrc.typesEslintrcInts.`12`
    - typingsJapgolly.typesEslintrc.typesEslintrcInts.`2015`
    - typingsJapgolly.typesEslintrc.typesEslintrcInts.`2016`
    - typingsJapgolly.typesEslintrc.typesEslintrcInts.`2017`
    - typingsJapgolly.typesEslintrc.typesEslintrcInts.`2018`
    - typingsJapgolly.typesEslintrc.typesEslintrcInts.`2019`
    - typingsJapgolly.typesEslintrc.typesEslintrcInts.`2020`
    - typingsJapgolly.typesEslintrc.typesEslintrcInts.`2021`
  */
  trait ESLintECMAVersion extends StObject
  object ESLintECMAVersion {
    
    inline def `10`: typingsJapgolly.typesEslintrc.typesEslintrcInts.`10` = 10.asInstanceOf[typingsJapgolly.typesEslintrc.typesEslintrcInts.`10`]
    
    inline def `11`: typingsJapgolly.typesEslintrc.typesEslintrcInts.`11` = 11.asInstanceOf[typingsJapgolly.typesEslintrc.typesEslintrcInts.`11`]
    
    inline def `12`: typingsJapgolly.typesEslintrc.typesEslintrcInts.`12` = 12.asInstanceOf[typingsJapgolly.typesEslintrc.typesEslintrcInts.`12`]
    
    inline def `2015`: typingsJapgolly.typesEslintrc.typesEslintrcInts.`2015` = 2015.asInstanceOf[typingsJapgolly.typesEslintrc.typesEslintrcInts.`2015`]
    
    inline def `2016`: typingsJapgolly.typesEslintrc.typesEslintrcInts.`2016` = 2016.asInstanceOf[typingsJapgolly.typesEslintrc.typesEslintrcInts.`2016`]
    
    inline def `2017`: typingsJapgolly.typesEslintrc.typesEslintrcInts.`2017` = 2017.asInstanceOf[typingsJapgolly.typesEslintrc.typesEslintrcInts.`2017`]
    
    inline def `2018`: typingsJapgolly.typesEslintrc.typesEslintrcInts.`2018` = 2018.asInstanceOf[typingsJapgolly.typesEslintrc.typesEslintrcInts.`2018`]
    
    inline def `2019`: typingsJapgolly.typesEslintrc.typesEslintrcInts.`2019` = 2019.asInstanceOf[typingsJapgolly.typesEslintrc.typesEslintrcInts.`2019`]
    
    inline def `2020`: typingsJapgolly.typesEslintrc.typesEslintrcInts.`2020` = 2020.asInstanceOf[typingsJapgolly.typesEslintrc.typesEslintrcInts.`2020`]
    
    inline def `2021`: typingsJapgolly.typesEslintrc.typesEslintrcInts.`2021` = 2021.asInstanceOf[typingsJapgolly.typesEslintrc.typesEslintrcInts.`2021`]
    
    inline def `3`: typingsJapgolly.typesEslintrc.typesEslintrcInts.`3` = 3.asInstanceOf[typingsJapgolly.typesEslintrc.typesEslintrcInts.`3`]
    
    inline def `5`: typingsJapgolly.typesEslintrc.typesEslintrcInts.`5` = 5.asInstanceOf[typingsJapgolly.typesEslintrc.typesEslintrcInts.`5`]
    
    inline def `6`: typingsJapgolly.typesEslintrc.typesEslintrcInts.`6` = 6.asInstanceOf[typingsJapgolly.typesEslintrc.typesEslintrcInts.`6`]
    
    inline def `7`: typingsJapgolly.typesEslintrc.typesEslintrcInts.`7` = 7.asInstanceOf[typingsJapgolly.typesEslintrc.typesEslintrcInts.`7`]
    
    inline def `8`: typingsJapgolly.typesEslintrc.typesEslintrcInts.`8` = 8.asInstanceOf[typingsJapgolly.typesEslintrc.typesEslintrcInts.`8`]
    
    inline def `9`: typingsJapgolly.typesEslintrc.typesEslintrcInts.`9` = 9.asInstanceOf[typingsJapgolly.typesEslintrc.typesEslintrcInts.`9`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typesEslintrc.typesEslintrcStrings.readonly
    - typingsJapgolly.typesEslintrc.typesEslintrcStrings.writable
    - typingsJapgolly.typesEslintrc.typesEslintrcStrings.off
    - typingsJapgolly.typesEslintrc.typesEslintrcStrings.readable
    - scala.Boolean
  */
  type ESLintGlobalPermission = _ESLintGlobalPermission | Boolean
  
  trait ESLintOverride
    extends StObject
       with ESLintConfig {
    
    var excludedFiles: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var files: String | js.Array[String]
  }
  object ESLintOverride {
    
    inline def apply(files: String | js.Array[String]): ESLintOverride = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[ESLintOverride]
    }
    
    extension [Self <: ESLintOverride](x: Self) {
      
      inline def setExcludedFiles(value: String | js.Array[String]): Self = StObject.set(x, "excludedFiles", value.asInstanceOf[js.Any])
      
      inline def setExcludedFilesUndefined: Self = StObject.set(x, "excludedFiles", js.undefined)
      
      inline def setExcludedFilesVarargs(value: String*): Self = StObject.set(x, "excludedFiles", js.Array(value*))
      
      inline def setFiles(value: String | js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    }
  }
  
  trait ESLintParserOptions extends StObject {
    
    /**
      * An object indicating which additional language features you'd like to use.
      */
    var ecmaFeatures: js.UndefOr[ExperimentalObjectRestSpread] = js.undefined
    
    /**
      * Set to 3, 5 (default), 6, 7, 8, 9, 10, 11, or 12 to specify the version of ECMAScript syntax you want to use.
      * You can also set to 2015 (same as 6), 2016 (same as 7), 2017 (same as 8), 2018 (same as 9), 2019 (same as 10),
      * 2020 (same as 11), or 2021 (same as 12) to use the year-based naming.
      */
    var ecmaVersion: js.UndefOr[ESLintECMAVersion] = js.undefined
    
    /**
      * Set to "script" (default) or "module" if your code is in ECMAScript modules.
      */
    var sourceType: js.UndefOr[script | module] = js.undefined
  }
  object ESLintParserOptions {
    
    inline def apply(): ESLintParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ESLintParserOptions]
    }
    
    extension [Self <: ESLintParserOptions](x: Self) {
      
      inline def setEcmaFeatures(value: ExperimentalObjectRestSpread): Self = StObject.set(x, "ecmaFeatures", value.asInstanceOf[js.Any])
      
      inline def setEcmaFeaturesUndefined: Self = StObject.set(x, "ecmaFeatures", js.undefined)
      
      inline def setEcmaVersion(value: ESLintECMAVersion): Self = StObject.set(x, "ecmaVersion", value.asInstanceOf[js.Any])
      
      inline def setEcmaVersionUndefined: Self = StObject.set(x, "ecmaVersion", js.undefined)
      
      inline def setSourceType(value: script | module): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    }
  }
  
  type ESLintRule = ESLintSeverity | (/* options */ Array[
    ESLintSeverity | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSONValue */ Any)
  ])
  
  type ESLintRules = StringDictionary[ESLintRule]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typesEslintrc.typesEslintrcInts.`0`
    - typingsJapgolly.typesEslintrc.typesEslintrcInts.`1`
    - typingsJapgolly.typesEslintrc.typesEslintrcInts.`2`
    - typingsJapgolly.typesEslintrc.typesEslintrcStrings.off
    - typingsJapgolly.typesEslintrc.typesEslintrcStrings.warn
    - typingsJapgolly.typesEslintrc.typesEslintrcStrings.error
  */
  trait ESLintSeverity extends StObject
  object ESLintSeverity {
    
    inline def `0`: typingsJapgolly.typesEslintrc.typesEslintrcInts.`0` = 0.asInstanceOf[typingsJapgolly.typesEslintrc.typesEslintrcInts.`0`]
    
    inline def `1`: typingsJapgolly.typesEslintrc.typesEslintrcInts.`1` = 1.asInstanceOf[typingsJapgolly.typesEslintrc.typesEslintrcInts.`1`]
    
    inline def `2`: typingsJapgolly.typesEslintrc.typesEslintrcInts.`2` = 2.asInstanceOf[typingsJapgolly.typesEslintrc.typesEslintrcInts.`2`]
    
    inline def error: typingsJapgolly.typesEslintrc.typesEslintrcStrings.error = "error".asInstanceOf[typingsJapgolly.typesEslintrc.typesEslintrcStrings.error]
    
    inline def off: typingsJapgolly.typesEslintrc.typesEslintrcStrings.off = "off".asInstanceOf[typingsJapgolly.typesEslintrc.typesEslintrcStrings.off]
    
    inline def warn: typingsJapgolly.typesEslintrc.typesEslintrcStrings.warn = "warn".asInstanceOf[typingsJapgolly.typesEslintrc.typesEslintrcStrings.warn]
  }
  
  trait _ESLintGlobalPermission extends StObject
}
