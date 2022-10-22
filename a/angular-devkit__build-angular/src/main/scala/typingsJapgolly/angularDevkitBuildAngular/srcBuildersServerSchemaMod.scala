package typingsJapgolly.angularDevkitBuildAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersServerSchemaMod {
  
  @js.native
  sealed trait BundleDependenciesEnum extends StObject
  @JSImport("@angular-devkit/build-angular/src/builders/server/schema", "BundleDependenciesEnum")
  @js.native
  object BundleDependenciesEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BundleDependenciesEnum & String] = js.native
    
    @js.native
    sealed trait All
      extends StObject
         with BundleDependenciesEnum
    /* "all" */ val All: typingsJapgolly.angularDevkitBuildAngular.srcBuildersServerSchemaMod.BundleDependenciesEnum.All & String = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with BundleDependenciesEnum
    /* "none" */ val None: typingsJapgolly.angularDevkitBuildAngular.srcBuildersServerSchemaMod.BundleDependenciesEnum.None & String = js.native
  }
  
  @js.native
  sealed trait I18NTranslation extends StObject
  @JSImport("@angular-devkit/build-angular/src/builders/server/schema", "I18NTranslation")
  @js.native
  object I18NTranslation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[I18NTranslation & String] = js.native
    
    @js.native
    sealed trait Error
      extends StObject
         with I18NTranslation
    /* "error" */ val Error: typingsJapgolly.angularDevkitBuildAngular.srcBuildersServerSchemaMod.I18NTranslation.Error & String = js.native
    
    @js.native
    sealed trait Ignore
      extends StObject
         with I18NTranslation
    /* "ignore" */ val Ignore: typingsJapgolly.angularDevkitBuildAngular.srcBuildersServerSchemaMod.I18NTranslation.Ignore & String = js.native
    
    @js.native
    sealed trait Warning
      extends StObject
         with I18NTranslation
    /* "warning" */ val Warning: typingsJapgolly.angularDevkitBuildAngular.srcBuildersServerSchemaMod.I18NTranslation.Warning & String = js.native
  }
  
  @js.native
  sealed trait InlineStyleLanguage extends StObject
  @JSImport("@angular-devkit/build-angular/src/builders/server/schema", "InlineStyleLanguage")
  @js.native
  object InlineStyleLanguage extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[InlineStyleLanguage & String] = js.native
    
    @js.native
    sealed trait Css
      extends StObject
         with InlineStyleLanguage
    /* "css" */ val Css: typingsJapgolly.angularDevkitBuildAngular.srcBuildersServerSchemaMod.InlineStyleLanguage.Css & String = js.native
    
    @js.native
    sealed trait Less
      extends StObject
         with InlineStyleLanguage
    /* "less" */ val Less: typingsJapgolly.angularDevkitBuildAngular.srcBuildersServerSchemaMod.InlineStyleLanguage.Less & String = js.native
    
    @js.native
    sealed trait Sass
      extends StObject
         with InlineStyleLanguage
    /* "sass" */ val Sass: typingsJapgolly.angularDevkitBuildAngular.srcBuildersServerSchemaMod.InlineStyleLanguage.Sass & String = js.native
    
    @js.native
    sealed trait Scss
      extends StObject
         with InlineStyleLanguage
    /* "scss" */ val Scss: typingsJapgolly.angularDevkitBuildAngular.srcBuildersServerSchemaMod.InlineStyleLanguage.Scss & String = js.native
  }
  
  @js.native
  sealed trait OutputHashing extends StObject
  @JSImport("@angular-devkit/build-angular/src/builders/server/schema", "OutputHashing")
  @js.native
  object OutputHashing extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[OutputHashing & String] = js.native
    
    @js.native
    sealed trait All
      extends StObject
         with OutputHashing
    /* "all" */ val All: typingsJapgolly.angularDevkitBuildAngular.srcBuildersServerSchemaMod.OutputHashing.All & String = js.native
    
    @js.native
    sealed trait Bundles
      extends StObject
         with OutputHashing
    /* "bundles" */ val Bundles: typingsJapgolly.angularDevkitBuildAngular.srcBuildersServerSchemaMod.OutputHashing.Bundles & String = js.native
    
    @js.native
    sealed trait Media
      extends StObject
         with OutputHashing
    /* "media" */ val Media: typingsJapgolly.angularDevkitBuildAngular.srcBuildersServerSchemaMod.OutputHashing.Media & String = js.native
    
    @js.native
    sealed trait None
      extends StObject
         with OutputHashing
    /* "none" */ val None: typingsJapgolly.angularDevkitBuildAngular.srcBuildersServerSchemaMod.OutputHashing.None & String = js.native
  }
  
  type BundleDependenciesUnion = Boolean | BundleDependenciesEnum
  
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
  
  type Localize = js.Array[String] | Boolean
  
  trait OptimizationClass extends StObject {
    
    /**
      * Enables optimization of the scripts output.
      */
    var scripts: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables optimization of the styles output.
      */
    var styles: js.UndefOr[Boolean] = js.undefined
  }
  object OptimizationClass {
    
    inline def apply(): OptimizationClass = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptimizationClass]
    }
    
    extension [Self <: OptimizationClass](x: Self) {
      
      inline def setScripts(value: Boolean): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      inline def setStyles(value: Boolean): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  type OptimizationUnion = Boolean | OptimizationClass
  
  trait Schema extends StObject {
    
    /**
      * Which external dependencies to bundle into the bundle. By default, all of node_modules
      * will be bundled.
      */
    var bundleDependencies: js.UndefOr[BundleDependenciesUnion] = js.undefined
    
    /**
      * Delete the output path before building.
      */
    var deleteOutputPath: js.UndefOr[Boolean] = js.undefined
    
    /**
      * URL where files will be deployed.
      * @deprecated Use "baseHref" browser builder option, "APP_BASE_HREF" DI token or a
      * combination of both instead. For more information, see
      * https://angular.io/guide/deployment#the-deploy-url.
      */
    var deployUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Exclude the listed external dependencies from being bundled into the bundle. Instead, the
      * created bundle relies on these dependencies to be available during runtime.
      */
    var externalDependencies: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Extract all licenses in a separate file, in the case of production builds only.
      */
    var extractLicenses: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Replace compilation source files with other compilation source files in the build.
      */
    var fileReplacements: js.UndefOr[js.Array[FileReplacement]] = js.undefined
    
    /**
      * How to handle duplicate translations for i18n.
      */
    var i18nDuplicateTranslation: js.UndefOr[I18NTranslation] = js.undefined
    
    /**
      * How to handle missing translations for i18n.
      */
    var i18nMissingTranslation: js.UndefOr[I18NTranslation] = js.undefined
    
    /**
      * The stylesheet language to use for the application's inline component styles.
      */
    var inlineStyleLanguage: js.UndefOr[InlineStyleLanguage] = js.undefined
    
    /**
      * Translate the bundles in one or more locales.
      */
    var localize: js.UndefOr[Localize] = js.undefined
    
    /**
      * The name of the main entry-point file.
      */
    var main: String
    
    /**
      * Use file name for lazy loaded chunks.
      */
    var namedChunks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables optimization of the build output. Including minification of scripts and styles,
      * tree-shaking and dead-code elimination. For more information, see
      * https://angular.io/guide/workspace-config#optimization-configuration.
      */
    var optimization: js.UndefOr[OptimizationUnion] = js.undefined
    
    /**
      * Define the output filename cache-busting hashing mode.
      */
    var outputHashing: js.UndefOr[OutputHashing] = js.undefined
    
    /**
      * Path where output will be placed.
      */
    var outputPath: String
    
    /**
      * Enable and define the file watching poll time period in milliseconds.
      */
    var poll: js.UndefOr[Double] = js.undefined
    
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
      * The path where style resources will be placed, relative to outputPath.
      */
    var resourcesOutputPath: js.UndefOr[String] = js.undefined
    
    /**
      * Output source maps for scripts and styles. For more information, see
      * https://angular.io/guide/workspace-config#source-map-configuration.
      */
    var sourceMap: js.UndefOr[SourceMapUnion] = js.undefined
    
    /**
      * Generates a 'stats.json' file which can be analyzed using tools such as
      * 'webpack-bundle-analyzer'.
      */
    var statsJson: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Options to pass to style preprocessors
      */
    var stylePreprocessorOptions: js.UndefOr[StylePreprocessorOptions] = js.undefined
    
    /**
      * The name of the TypeScript configuration file.
      */
    var tsConfig: String
    
    /**
      * Adds more details to output logging.
      */
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Run build when files change.
      */
    var watch: js.UndefOr[Boolean] = js.undefined
  }
  object Schema {
    
    inline def apply(main: String, outputPath: String, tsConfig: String): Schema = {
      val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any], tsConfig = tsConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setBundleDependencies(value: BundleDependenciesUnion): Self = StObject.set(x, "bundleDependencies", value.asInstanceOf[js.Any])
      
      inline def setBundleDependenciesUndefined: Self = StObject.set(x, "bundleDependencies", js.undefined)
      
      inline def setDeleteOutputPath(value: Boolean): Self = StObject.set(x, "deleteOutputPath", value.asInstanceOf[js.Any])
      
      inline def setDeleteOutputPathUndefined: Self = StObject.set(x, "deleteOutputPath", js.undefined)
      
      inline def setDeployUrl(value: String): Self = StObject.set(x, "deployUrl", value.asInstanceOf[js.Any])
      
      inline def setDeployUrlUndefined: Self = StObject.set(x, "deployUrl", js.undefined)
      
      inline def setExternalDependencies(value: js.Array[String]): Self = StObject.set(x, "externalDependencies", value.asInstanceOf[js.Any])
      
      inline def setExternalDependenciesUndefined: Self = StObject.set(x, "externalDependencies", js.undefined)
      
      inline def setExternalDependenciesVarargs(value: String*): Self = StObject.set(x, "externalDependencies", js.Array(value*))
      
      inline def setExtractLicenses(value: Boolean): Self = StObject.set(x, "extractLicenses", value.asInstanceOf[js.Any])
      
      inline def setExtractLicensesUndefined: Self = StObject.set(x, "extractLicenses", js.undefined)
      
      inline def setFileReplacements(value: js.Array[FileReplacement]): Self = StObject.set(x, "fileReplacements", value.asInstanceOf[js.Any])
      
      inline def setFileReplacementsUndefined: Self = StObject.set(x, "fileReplacements", js.undefined)
      
      inline def setFileReplacementsVarargs(value: FileReplacement*): Self = StObject.set(x, "fileReplacements", js.Array(value*))
      
      inline def setI18nDuplicateTranslation(value: I18NTranslation): Self = StObject.set(x, "i18nDuplicateTranslation", value.asInstanceOf[js.Any])
      
      inline def setI18nDuplicateTranslationUndefined: Self = StObject.set(x, "i18nDuplicateTranslation", js.undefined)
      
      inline def setI18nMissingTranslation(value: I18NTranslation): Self = StObject.set(x, "i18nMissingTranslation", value.asInstanceOf[js.Any])
      
      inline def setI18nMissingTranslationUndefined: Self = StObject.set(x, "i18nMissingTranslation", js.undefined)
      
      inline def setInlineStyleLanguage(value: InlineStyleLanguage): Self = StObject.set(x, "inlineStyleLanguage", value.asInstanceOf[js.Any])
      
      inline def setInlineStyleLanguageUndefined: Self = StObject.set(x, "inlineStyleLanguage", js.undefined)
      
      inline def setLocalize(value: Localize): Self = StObject.set(x, "localize", value.asInstanceOf[js.Any])
      
      inline def setLocalizeUndefined: Self = StObject.set(x, "localize", js.undefined)
      
      inline def setLocalizeVarargs(value: String*): Self = StObject.set(x, "localize", js.Array(value*))
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setNamedChunks(value: Boolean): Self = StObject.set(x, "namedChunks", value.asInstanceOf[js.Any])
      
      inline def setNamedChunksUndefined: Self = StObject.set(x, "namedChunks", js.undefined)
      
      inline def setOptimization(value: OptimizationUnion): Self = StObject.set(x, "optimization", value.asInstanceOf[js.Any])
      
      inline def setOptimizationUndefined: Self = StObject.set(x, "optimization", js.undefined)
      
      inline def setOutputHashing(value: OutputHashing): Self = StObject.set(x, "outputHashing", value.asInstanceOf[js.Any])
      
      inline def setOutputHashingUndefined: Self = StObject.set(x, "outputHashing", js.undefined)
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setPoll(value: Double): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
      
      inline def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
      
      inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
      
      inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
      
      inline def setProgress(value: Boolean): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setResourcesOutputPath(value: String): Self = StObject.set(x, "resourcesOutputPath", value.asInstanceOf[js.Any])
      
      inline def setResourcesOutputPathUndefined: Self = StObject.set(x, "resourcesOutputPath", js.undefined)
      
      inline def setSourceMap(value: SourceMapUnion): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setStatsJson(value: Boolean): Self = StObject.set(x, "statsJson", value.asInstanceOf[js.Any])
      
      inline def setStatsJsonUndefined: Self = StObject.set(x, "statsJson", js.undefined)
      
      inline def setStylePreprocessorOptions(value: StylePreprocessorOptions): Self = StObject.set(x, "stylePreprocessorOptions", value.asInstanceOf[js.Any])
      
      inline def setStylePreprocessorOptionsUndefined: Self = StObject.set(x, "stylePreprocessorOptions", js.undefined)
      
      inline def setTsConfig(value: String): Self = StObject.set(x, "tsConfig", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  trait SourceMapClass extends StObject {
    
    /**
      * Output source maps used for error reporting tools.
      */
    var hidden: js.UndefOr[Boolean] = js.undefined
    
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
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setScripts(value: Boolean): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      inline def setStyles(value: Boolean): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setVendor(value: Boolean): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
    }
  }
  
  type SourceMapUnion = Boolean | SourceMapClass
  
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
