package typingsJapgolly.angularDevkitBuildAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersKarmaSchemaMod {
  
  @js.native
  sealed trait InlineStyleLanguage extends StObject
  @JSImport("@angular-devkit/build-angular/src/builders/karma/schema", "InlineStyleLanguage")
  @js.native
  object InlineStyleLanguage extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[InlineStyleLanguage & String] = js.native
    
    @js.native
    sealed trait Css
      extends StObject
         with InlineStyleLanguage
    /* "css" */ val Css: typingsJapgolly.angularDevkitBuildAngular.srcBuildersKarmaSchemaMod.InlineStyleLanguage.Css & String = js.native
    
    @js.native
    sealed trait Less
      extends StObject
         with InlineStyleLanguage
    /* "less" */ val Less: typingsJapgolly.angularDevkitBuildAngular.srcBuildersKarmaSchemaMod.InlineStyleLanguage.Less & String = js.native
    
    @js.native
    sealed trait Sass
      extends StObject
         with InlineStyleLanguage
    /* "sass" */ val Sass: typingsJapgolly.angularDevkitBuildAngular.srcBuildersKarmaSchemaMod.InlineStyleLanguage.Sass & String = js.native
    
    @js.native
    sealed trait Scss
      extends StObject
         with InlineStyleLanguage
    /* "scss" */ val Scss: typingsJapgolly.angularDevkitBuildAngular.srcBuildersKarmaSchemaMod.InlineStyleLanguage.Scss & String = js.native
  }
  
  type AssetPattern = AssetPatternClass | String
  
  trait AssetPatternClass extends StObject {
    
    /**
      * The pattern to match.
      */
    var glob: String
    
    /**
      * An array of globs to ignore.
      */
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The input directory path in which to apply 'glob'. Defaults to the project root.
      */
    var input: String
    
    /**
      * Absolute path within the output.
      */
    var output: String
  }
  object AssetPatternClass {
    
    inline def apply(glob: String, input: String, output: String): AssetPatternClass = {
      val __obj = js.Dynamic.literal(glob = glob.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetPatternClass]
    }
    
    extension [Self <: AssetPatternClass](x: Self) {
      
      inline def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileReplacement extends StObject {
    
    var replace: js.UndefOr[String] = js.undefined
    
    var replaceWith: js.UndefOr[String] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var `with`: js.UndefOr[String] = js.undefined
  }
  object FileReplacement {
    
    inline def apply(): FileReplacement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileReplacement]
    }
    
    extension [Self <: FileReplacement](x: Self) {
      
      inline def setReplace(value: String): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setReplaceWith(value: String): Self = StObject.set(x, "replaceWith", value.asInstanceOf[js.Any])
      
      inline def setReplaceWithUndefined: Self = StObject.set(x, "replaceWith", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setWith(value: String): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
      
      inline def setWithUndefined: Self = StObject.set(x, "with", js.undefined)
    }
  }
  
  trait Schema extends StObject {
    
    /**
      * List of static application assets.
      */
    var assets: js.UndefOr[js.Array[AssetPattern]] = js.undefined
    
    /**
      * Override which browsers tests are run against.
      */
    var browsers: js.UndefOr[String] = js.undefined
    
    /**
      * Output a code coverage report.
      */
    var codeCoverage: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Globs to exclude from code coverage.
      */
    var codeCoverageExclude: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Replace compilation source files with other compilation source files in the build.
      */
    var fileReplacements: js.UndefOr[js.Array[FileReplacement]] = js.undefined
    
    /**
      * Globs of files to include, relative to workspace or project root.
      * There are 2 special cases:
      * - when a path to directory is provided, all spec files ending ".spec.@(ts|tsx)" will be
      * included
      * - when a path to a file is provided, and a matching spec file exists it will be included
      * instead.
      */
    var include: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The stylesheet language to use for the application's inline component styles.
      */
    var inlineStyleLanguage: js.UndefOr[InlineStyleLanguage] = js.undefined
    
    /**
      * The name of the Karma configuration file.
      */
    var karmaConfig: String
    
    /**
      * The name of the main entry-point file.
      */
    var main: String
    
    /**
      * Enable and define the file watching poll time period in milliseconds.
      */
    var poll: js.UndefOr[Double] = js.undefined
    
    /**
      * The name of the polyfills file.
      */
    var polyfills: js.UndefOr[String] = js.undefined
    
    /**
      * Do not use the real path when resolving modules. If unset then will default to `true` if
      * NodeJS option --preserve-symlinks is set.
      */
    var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Log progress to the console while building.
      */
    var progress: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Karma reporters to use. Directly passed to the karma runner.
      */
    var reporters: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Global scripts to be included in the build.
      */
    var scripts: js.UndefOr[js.Array[ScriptElement]] = js.undefined
    
    /**
      * Output source maps for scripts and styles. For more information, see
      * https://angular.io/guide/workspace-config#source-map-configuration.
      */
    var sourceMap: js.UndefOr[SourceMapUnion] = js.undefined
    
    /**
      * Options to pass to style preprocessors
      */
    var stylePreprocessorOptions: js.UndefOr[StylePreprocessorOptions] = js.undefined
    
    /**
      * Global styles to be included in the build.
      */
    var styles: js.UndefOr[js.Array[StyleElement]] = js.undefined
    
    /**
      * The name of the TypeScript configuration file.
      */
    var tsConfig: String
    
    /**
      * Run build when files change.
      */
    var watch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * TypeScript configuration for Web Worker modules.
      */
    var webWorkerTsConfig: js.UndefOr[String] = js.undefined
  }
  object Schema {
    
    inline def apply(karmaConfig: String, main: String, tsConfig: String): Schema = {
      val __obj = js.Dynamic.literal(karmaConfig = karmaConfig.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], tsConfig = tsConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setAssets(value: js.Array[AssetPattern]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
      
      inline def setAssetsVarargs(value: AssetPattern*): Self = StObject.set(x, "assets", js.Array(value*))
      
      inline def setBrowsers(value: String): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
      
      inline def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
      
      inline def setCodeCoverage(value: Boolean): Self = StObject.set(x, "codeCoverage", value.asInstanceOf[js.Any])
      
      inline def setCodeCoverageExclude(value: js.Array[String]): Self = StObject.set(x, "codeCoverageExclude", value.asInstanceOf[js.Any])
      
      inline def setCodeCoverageExcludeUndefined: Self = StObject.set(x, "codeCoverageExclude", js.undefined)
      
      inline def setCodeCoverageExcludeVarargs(value: String*): Self = StObject.set(x, "codeCoverageExclude", js.Array(value*))
      
      inline def setCodeCoverageUndefined: Self = StObject.set(x, "codeCoverage", js.undefined)
      
      inline def setFileReplacements(value: js.Array[FileReplacement]): Self = StObject.set(x, "fileReplacements", value.asInstanceOf[js.Any])
      
      inline def setFileReplacementsUndefined: Self = StObject.set(x, "fileReplacements", js.undefined)
      
      inline def setFileReplacementsVarargs(value: FileReplacement*): Self = StObject.set(x, "fileReplacements", js.Array(value*))
      
      inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setInlineStyleLanguage(value: InlineStyleLanguage): Self = StObject.set(x, "inlineStyleLanguage", value.asInstanceOf[js.Any])
      
      inline def setInlineStyleLanguageUndefined: Self = StObject.set(x, "inlineStyleLanguage", js.undefined)
      
      inline def setKarmaConfig(value: String): Self = StObject.set(x, "karmaConfig", value.asInstanceOf[js.Any])
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setPoll(value: Double): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
      
      inline def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
      
      inline def setPolyfills(value: String): Self = StObject.set(x, "polyfills", value.asInstanceOf[js.Any])
      
      inline def setPolyfillsUndefined: Self = StObject.set(x, "polyfills", js.undefined)
      
      inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
      
      inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
      
      inline def setProgress(value: Boolean): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setReporters(value: js.Array[String]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      inline def setReportersVarargs(value: String*): Self = StObject.set(x, "reporters", js.Array(value*))
      
      inline def setScripts(value: js.Array[ScriptElement]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      inline def setScriptsVarargs(value: ScriptElement*): Self = StObject.set(x, "scripts", js.Array(value*))
      
      inline def setSourceMap(value: SourceMapUnion): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setStylePreprocessorOptions(value: StylePreprocessorOptions): Self = StObject.set(x, "stylePreprocessorOptions", value.asInstanceOf[js.Any])
      
      inline def setStylePreprocessorOptionsUndefined: Self = StObject.set(x, "stylePreprocessorOptions", js.undefined)
      
      inline def setStyles(value: js.Array[StyleElement]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setStylesVarargs(value: StyleElement*): Self = StObject.set(x, "styles", js.Array(value*))
      
      inline def setTsConfig(value: String): Self = StObject.set(x, "tsConfig", value.asInstanceOf[js.Any])
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
      
      inline def setWebWorkerTsConfig(value: String): Self = StObject.set(x, "webWorkerTsConfig", value.asInstanceOf[js.Any])
      
      inline def setWebWorkerTsConfigUndefined: Self = StObject.set(x, "webWorkerTsConfig", js.undefined)
    }
  }
  
  trait ScriptClass extends StObject {
    
    /**
      * The bundle name for this extra entry point.
      */
    var bundleName: js.UndefOr[String] = js.undefined
    
    /**
      * If the bundle will be referenced in the HTML file.
      */
    var inject: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The file to include.
      */
    var input: String
  }
  object ScriptClass {
    
    inline def apply(input: String): ScriptClass = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptClass]
    }
    
    extension [Self <: ScriptClass](x: Self) {
      
      inline def setBundleName(value: String): Self = StObject.set(x, "bundleName", value.asInstanceOf[js.Any])
      
      inline def setBundleNameUndefined: Self = StObject.set(x, "bundleName", js.undefined)
      
      inline def setInject(value: Boolean): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    }
  }
  
  type ScriptElement = ScriptClass | String
  
  trait SourceMapClass extends StObject {
    
    /**
      * Output source maps for all scripts.
      */
    var scripts: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Output source maps for all styles.
      */
    var styles: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Resolve vendor packages source maps.
      */
    var vendor: js.UndefOr[Boolean] = js.undefined
  }
  object SourceMapClass {
    
    inline def apply(): SourceMapClass = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SourceMapClass]
    }
    
    extension [Self <: SourceMapClass](x: Self) {
      
      inline def setScripts(value: Boolean): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      inline def setStyles(value: Boolean): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setVendor(value: Boolean): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
    }
  }
  
  type SourceMapUnion = Boolean | SourceMapClass
  
  trait StyleClass extends StObject {
    
    /**
      * The bundle name for this extra entry point.
      */
    var bundleName: js.UndefOr[String] = js.undefined
    
    /**
      * If the bundle will be referenced in the HTML file.
      */
    var inject: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The file to include.
      */
    var input: String
  }
  object StyleClass {
    
    inline def apply(input: String): StyleClass = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleClass]
    }
    
    extension [Self <: StyleClass](x: Self) {
      
      inline def setBundleName(value: String): Self = StObject.set(x, "bundleName", value.asInstanceOf[js.Any])
      
      inline def setBundleNameUndefined: Self = StObject.set(x, "bundleName", js.undefined)
      
      inline def setInject(value: Boolean): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    }
  }
  
  type StyleElement = StyleClass | String
  
  trait StylePreprocessorOptions extends StObject {
    
    /**
      * Paths to include. Paths will be resolved to workspace root.
      */
    var includePaths: js.UndefOr[js.Array[String]] = js.undefined
  }
  object StylePreprocessorOptions {
    
    inline def apply(): StylePreprocessorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StylePreprocessorOptions]
    }
    
    extension [Self <: StylePreprocessorOptions](x: Self) {
      
      inline def setIncludePaths(value: js.Array[String]): Self = StObject.set(x, "includePaths", value.asInstanceOf[js.Any])
      
      inline def setIncludePathsUndefined: Self = StObject.set(x, "includePaths", js.undefined)
      
      inline def setIncludePathsVarargs(value: String*): Self = StObject.set(x, "includePaths", js.Array(value*))
    }
  }
}
