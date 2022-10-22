package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.anon.Url
import typingsJapgolly.angularCompilerCli.ngccSrcPackagesConfigurationMod.NgccConfiguration
import typingsJapgolly.angularCompilerCli.ngccSrcUtilsMod.JsonObject
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typingsJapgolly.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typingsJapgolly.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcPackagesEntryPointMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/entry_point", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/entry_point", "IGNORED_ENTRY_POINT")
  @js.native
  val IGNORED_ENTRY_POINT: /* "ignored-entry-point" */ String = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/entry_point", "INCOMPATIBLE_ENTRY_POINT")
  @js.native
  val INCOMPATIBLE_ENTRY_POINT: /* "incompatible-entry-point" */ String = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/entry_point", "NO_ENTRY_POINT")
  @js.native
  val NO_ENTRY_POINT: /* "no-entry-point" */ String = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/entry_point", "SUPPORTED_FORMAT_PROPERTIES")
  @js.native
  val SUPPORTED_FORMAT_PROPERTIES: js.Array[EntryPointJsonProperty] = js.native
  
  inline def getEntryPointFormat(fs: ReadonlyFileSystem, entryPoint: EntryPoint, property: EntryPointJsonProperty): js.UndefOr[EntryPointFormat] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEntryPointFormat")(fs.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[EntryPointFormat]]
  
  inline def getEntryPointInfo(
    fs: ReadonlyFileSystem,
    config: NgccConfiguration,
    logger: Logger,
    packagePath: AbsoluteFsPath,
    entryPointPath: AbsoluteFsPath
  ): GetEntryPointResult = (^.asInstanceOf[js.Dynamic].applyDynamic("getEntryPointInfo")(fs.asInstanceOf[js.Any], config.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], packagePath.asInstanceOf[js.Any], entryPointPath.asInstanceOf[js.Any])).asInstanceOf[GetEntryPointResult]
  
  inline def isEntryPoint(result: GetEntryPointResult): /* is @angular/compiler-cli.@angular/compiler-cli/ngcc/src/packages/entry_point.EntryPoint */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEntryPoint")(result.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/ngcc/src/packages/entry_point.EntryPoint */ Boolean]
  
  trait EntryPoint
    extends StObject
       with JsonObject {
    
    /** Is this EntryPoint compiled with the Angular View Engine compiler? */
    var compiledByAngular: Boolean
    
    /** Should ngcc generate deep re-exports for this entrypoint? */
    var generateDeepReexports: Boolean
    
    /** Should ngcc ignore missing dependencies and process this entrypoint anyway? */
    var ignoreMissingDependencies: Boolean
    
    /** The name of the entry-point (e.g. `@angular/core` or `@angular/common/http`). */
    var name: String
    
    /** The parsed package.json file for this entry-point. */
    var packageJson: EntryPointPackageJson
    
    /**
      * The name of the package that contains this entry-point (e.g. `@angular/core` or
      * `@angular/common`).
      */
    var packageName: String
    
    /** The path to the package that contains this entry-point. */
    var packagePath: AbsoluteFsPath
    
    /** The path to this entry point. */
    var path: AbsoluteFsPath
    
    /** The URL of the repository. */
    var repositoryUrl: String
    
    /** The path to a typings (.d.ts) file for this entry-point. */
    var typings: AbsoluteFsPath
  }
  object EntryPoint {
    
    inline def apply(
      compiledByAngular: Boolean,
      generateDeepReexports: Boolean,
      ignoreMissingDependencies: Boolean,
      name: String,
      packageJson: EntryPointPackageJson,
      packageName: String,
      packagePath: AbsoluteFsPath,
      path: AbsoluteFsPath,
      repositoryUrl: String,
      typings: AbsoluteFsPath
    ): EntryPoint = {
      val __obj = js.Dynamic.literal(compiledByAngular = compiledByAngular.asInstanceOf[js.Any], generateDeepReexports = generateDeepReexports.asInstanceOf[js.Any], ignoreMissingDependencies = ignoreMissingDependencies.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], packageJson = packageJson.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], packagePath = packagePath.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], repositoryUrl = repositoryUrl.asInstanceOf[js.Any], typings = typings.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryPoint]
    }
    
    extension [Self <: EntryPoint](x: Self) {
      
      inline def setCompiledByAngular(value: Boolean): Self = StObject.set(x, "compiledByAngular", value.asInstanceOf[js.Any])
      
      inline def setGenerateDeepReexports(value: Boolean): Self = StObject.set(x, "generateDeepReexports", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMissingDependencies(value: Boolean): Self = StObject.set(x, "ignoreMissingDependencies", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPackageJson(value: EntryPointPackageJson): Self = StObject.set(x, "packageJson", value.asInstanceOf[js.Any])
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setPackagePath(value: AbsoluteFsPath): Self = StObject.set(x, "packagePath", value.asInstanceOf[js.Any])
      
      inline def setPath(value: AbsoluteFsPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRepositoryUrl(value: String): Self = StObject.set(x, "repositoryUrl", value.asInstanceOf[js.Any])
      
      inline def setTypings(value: AbsoluteFsPath): Self = StObject.set(x, "typings", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.esm5
    - typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.esm2015
    - typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.umd
    - typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.commonjs
  */
  trait EntryPointFormat extends StObject
  object EntryPointFormat {
    
    inline def commonjs: typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.commonjs = "commonjs".asInstanceOf[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.commonjs]
    
    inline def esm2015: typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.esm2015 = "esm2015".asInstanceOf[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.esm2015]
    
    inline def esm5: typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.esm5 = "esm5".asInstanceOf[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.esm5]
    
    inline def umd: typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.umd = "umd".asInstanceOf[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.umd]
  }
  
  /* Inlined std.Exclude<@angular/compiler-cli.@angular/compiler-cli/ngcc/src/packages/entry_point.PackageJsonFormatProperties, 'types' | 'typings'> */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.main
    - typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.module
    - typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.browser
    - typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.fesm2015
    - typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.esm5
    - typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.fesm5
    - typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.esm2015
    - typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.es2015
  */
  trait EntryPointJsonProperty extends StObject
  object EntryPointJsonProperty {
    
    inline def browser: typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.browser = "browser".asInstanceOf[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.browser]
    
    inline def es2015: typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.es2015 = "es2015".asInstanceOf[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.es2015]
    
    inline def esm2015: typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.esm2015 = "esm2015".asInstanceOf[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.esm2015]
    
    inline def esm5: typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.esm5 = "esm5".asInstanceOf[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.esm5]
    
    inline def fesm2015: typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.fesm2015 = "fesm2015".asInstanceOf[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.fesm2015]
    
    inline def fesm5: typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.fesm5 = "fesm5".asInstanceOf[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.fesm5]
    
    inline def main: typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.main = "main".asInstanceOf[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.main]
    
    inline def module: typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.module = "module".asInstanceOf[typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.module]
  }
  
  trait EntryPointPackageJson
    extends StObject
       with JsonObject
       with PackageJsonFormatPropertiesMap {
    
    var __processed_by_ivy_ngcc__ : js.UndefOr[Record[String, String]] = js.undefined
    
    var name: String
    
    var repository: js.UndefOr[String | Url] = js.undefined
    
    var scripts: js.UndefOr[Record[String, String]] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object EntryPointPackageJson {
    
    inline def apply(name: String): EntryPointPackageJson = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryPointPackageJson]
    }
    
    extension [Self <: EntryPointPackageJson](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRepository(value: String | Url): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      inline def setScripts(value: Record[String, String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def set__processed_by_ivy_ngcc__(value: Record[String, String]): Self = StObject.set(x, "__processed_by_ivy_ngcc__", value.asInstanceOf[js.Any])
      
      inline def set__processed_by_ivy_ngcc__Undefined: Self = StObject.set(x, "__processed_by_ivy_ngcc__", js.undefined)
    }
  }
  
  type GetEntryPointResult = EntryPoint | (/* "ignored-entry-point" */ String)
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.browser
    - typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.fesm2015
    - typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.fesm5
    - typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.es2015
    - typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.esm2015
    - typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.esm5
    - typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.main
    - typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.module
    - typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.types
    - typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.typings
  */
  trait PackageJsonFormatProperties extends StObject
  
  trait PackageJsonFormatPropertiesMap extends StObject {
    
    var browser: js.UndefOr[String] = js.undefined
    
    var es2015: js.UndefOr[String] = js.undefined
    
    var esm2015: js.UndefOr[String] = js.undefined
    
    var esm5: js.UndefOr[String] = js.undefined
    
    var fesm2015: js.UndefOr[String] = js.undefined
    
    var fesm5: js.UndefOr[String] = js.undefined
    
    var main: js.UndefOr[String] = js.undefined
    
    var module: js.UndefOr[String] = js.undefined
    
    var types: js.UndefOr[String] = js.undefined
    
    var typings: js.UndefOr[String] = js.undefined
  }
  object PackageJsonFormatPropertiesMap {
    
    inline def apply(): PackageJsonFormatPropertiesMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackageJsonFormatPropertiesMap]
    }
    
    extension [Self <: PackageJsonFormatPropertiesMap](x: Self) {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      inline def setEs2015(value: String): Self = StObject.set(x, "es2015", value.asInstanceOf[js.Any])
      
      inline def setEs2015Undefined: Self = StObject.set(x, "es2015", js.undefined)
      
      inline def setEsm2015(value: String): Self = StObject.set(x, "esm2015", value.asInstanceOf[js.Any])
      
      inline def setEsm2015Undefined: Self = StObject.set(x, "esm2015", js.undefined)
      
      inline def setEsm5(value: String): Self = StObject.set(x, "esm5", value.asInstanceOf[js.Any])
      
      inline def setEsm5Undefined: Self = StObject.set(x, "esm5", js.undefined)
      
      inline def setFesm2015(value: String): Self = StObject.set(x, "fesm2015", value.asInstanceOf[js.Any])
      
      inline def setFesm2015Undefined: Self = StObject.set(x, "fesm2015", js.undefined)
      
      inline def setFesm5(value: String): Self = StObject.set(x, "fesm5", value.asInstanceOf[js.Any])
      
      inline def setFesm5Undefined: Self = StObject.set(x, "fesm5", js.undefined)
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setTypings(value: String): Self = StObject.set(x, "typings", value.asInstanceOf[js.Any])
      
      inline def setTypingsUndefined: Self = StObject.set(x, "typings", js.undefined)
    }
  }
}
