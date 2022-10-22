package typingsJapgolly.typeFest.sourceTsconfigJsonMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Lowercase
import typingsJapgolly.std.Record
import typingsJapgolly.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions
import typingsJapgolly.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.FallbackPolling
import typingsJapgolly.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.ImportsNotUsedAsValues
import typingsJapgolly.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.JSX
import typingsJapgolly.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.Lib
import typingsJapgolly.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.Module
import typingsJapgolly.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.NewLine
import typingsJapgolly.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.Plugin
import typingsJapgolly.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.Target
import typingsJapgolly.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.WatchDirectory
import typingsJapgolly.typeFest.sourceTsconfigJsonMod.TsConfigJson.CompilerOptions.WatchFile
import typingsJapgolly.typeFest.sourceTsconfigJsonMod.TsConfigJson.References
import typingsJapgolly.typeFest.sourceTsconfigJsonMod.TsConfigJson.TypeAcquisition
import typingsJapgolly.typeFest.sourceTsconfigJsonMod.TsConfigJson.WatchOptions
import typingsJapgolly.typeFest.sourceTsconfigJsonMod.TsConfigJson.WatchOptions.PollingWatchKind
import typingsJapgolly.typeFest.sourceTsconfigJsonMod.TsConfigJson.WatchOptions.WatchDirectoryKind
import typingsJapgolly.typeFest.sourceTsconfigJsonMod.TsConfigJson.WatchOptions.WatchFileKind
import typingsJapgolly.typeFest.typeFestStrings.amd_
import typingsJapgolly.typeFest.typeFestStrings.classic
import typingsJapgolly.typeFest.typeFestStrings.commonjs_
import typingsJapgolly.typeFest.typeFestStrings.crlf_
import typingsJapgolly.typeFest.typeFestStrings.dom_
import typingsJapgolly.typeFest.typeFestStrings.dynamicPriorityPolling_
import typingsJapgolly.typeFest.typeFestStrings.dynamicPriority_
import typingsJapgolly.typeFest.typeFestStrings.es2015_
import typingsJapgolly.typeFest.typeFestStrings.es2016_
import typingsJapgolly.typeFest.typeFestStrings.es2017_
import typingsJapgolly.typeFest.typeFestStrings.es2018_
import typingsJapgolly.typeFest.typeFestStrings.es2019_
import typingsJapgolly.typeFest.typeFestStrings.es2020_
import typingsJapgolly.typeFest.typeFestStrings.es2021_
import typingsJapgolly.typeFest.typeFestStrings.es2022_
import typingsJapgolly.typeFest.typeFestStrings.es3_
import typingsJapgolly.typeFest.typeFestStrings.es5_
import typingsJapgolly.typeFest.typeFestStrings.es6_
import typingsJapgolly.typeFest.typeFestStrings.es7_
import typingsJapgolly.typeFest.typeFestStrings.esnext_
import typingsJapgolly.typeFest.typeFestStrings.fixedChunkSizePolling_
import typingsJapgolly.typeFest.typeFestStrings.fixedChunkSize_
import typingsJapgolly.typeFest.typeFestStrings.fixedInterval_
import typingsJapgolly.typeFest.typeFestStrings.fixedPollingInterval_
import typingsJapgolly.typeFest.typeFestStrings.lf_
import typingsJapgolly.typeFest.typeFestStrings.node
import typingsJapgolly.typeFest.typeFestStrings.node16_
import typingsJapgolly.typeFest.typeFestStrings.nodenext_
import typingsJapgolly.typeFest.typeFestStrings.none_
import typingsJapgolly.typeFest.typeFestStrings.priorityInterval_
import typingsJapgolly.typeFest.typeFestStrings.priorityPollingInterval_
import typingsJapgolly.typeFest.typeFestStrings.scripthost_
import typingsJapgolly.typeFest.typeFestStrings.system_
import typingsJapgolly.typeFest.typeFestStrings.umd_
import typingsJapgolly.typeFest.typeFestStrings.useFsEventsOnParentDirectory_
import typingsJapgolly.typeFest.typeFestStrings.useFsEvents_
import typingsJapgolly.typeFest.typeFestStrings.webworker_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsConfigJson extends StObject {
  
  /**
  	Enable Compile-on-Save for this project.
  	*/
  var compileOnSave: js.UndefOr[Boolean] = js.undefined
  
  /**
  	Instructs the TypeScript compiler how to compile `.ts` files.
  	*/
  var compilerOptions: js.UndefOr[CompilerOptions] = js.undefined
  
  /**
  	Specifies a list of files to be excluded from compilation. The `exclude` property only affects the files included via the `include` property and not the `files` property.
  	Glob patterns require TypeScript version 2.0 or later.
  	*/
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  	Path to base configuration file to inherit from.
  	Requires TypeScript version 2.1 or later.
  	*/
  var `extends`: js.UndefOr[String] = js.undefined
  
  /**
  	If no `files` or `include` property is present in a `tsconfig.json`, the compiler defaults to including all files in the containing directory and subdirectories except those specified by `exclude`. When a `files` property is specified, only those files and those specified by `include` are included.
  	*/
  var files: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  	Specifies a list of glob patterns that match files to be included in compilation.
  	If no `files` or `include` property is present in a `tsconfig.json`, the compiler defaults to including all files in the containing directory and subdirectories except those specified by `exclude`.
  	Requires TypeScript version 2.0 or later.
  	*/
  var include: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  	Referenced projects.
  	Requires TypeScript version 3.0 or later.
  	*/
  var references: js.UndefOr[js.Array[References]] = js.undefined
  
  /**
  	Auto type (.d.ts) acquisition options for this project.
  	Requires TypeScript version 2.1 or later.
  	*/
  var typeAcquisition: js.UndefOr[TypeAcquisition] = js.undefined
  
  /**
  	Instructs the TypeScript compiler how to watch files.
  	*/
  var watchOptions: js.UndefOr[WatchOptions] = js.undefined
}
object TsConfigJson {
  
  inline def apply(): TsConfigJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TsConfigJson]
  }
  
  trait CompilerOptions extends StObject {
    
    /**
    		Allow javascript files to be compiled.
    		@default false
    		*/
    var allowJs: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Allow default imports from modules with no default export. This does not affect code emit, just typechecking.
    		@default module === 'system' || esModuleInterop
    		*/
    var allowSyntheticDefaultImports: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Allow accessing UMD globals from modules.
    		@default false
    		*/
    var allowUmdGlobalAccess: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Do not report errors on unreachable code.
    		@default false
    		*/
    var allowUnreachableCode: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Do not report errors on unused labels.
    		@default false
    		*/
    var allowUnusedLabels: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Parse in strict mode and emit `'use strict'` for each source file.
    		Requires TypeScript version 2.1 or later.
    		@default false
    		*/
    var alwaysStrict: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Have recompiles in '--incremental' and '--watch' assume that changes within a file will only affect files directly depending on it.
    		Requires TypeScript version 3.8 or later.
    		@default false
    		*/
    var assumeChangesOnlyAffectDirectDependencies: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Base directory to resolve non-relative module names.
    		*/
    var baseUrl: js.UndefOr[String] = js.undefined
    
    /**
    		The character set of the input files.
    		@default 'utf8'
    		*/
    var charset: js.UndefOr[String] = js.undefined
    
    /**
    		Report errors in `.js` files.
    		Requires TypeScript version 2.3 or later.
    		@default false
    		*/
    var checkJs: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Enables building for project references.
    		@default true
    		*/
    var composite: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Generates corresponding d.ts files.
    		@default false
    		*/
    var declaration: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specify output directory for generated declaration files.
    		Requires TypeScript version 2.0 or later.
    		*/
    var declarationDir: js.UndefOr[String] = js.undefined
    
    /**
    		Generates a sourcemap for each corresponding `.d.ts` file.
    		Requires TypeScript version 2.9 or later.
    		@default false
    		*/
    var declarationMap: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Show diagnostic information.
    		@default false
    		*/
    var diagnostics: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Reduce the number of projects loaded automatically by TypeScript.
    		Requires TypeScript version 4.0 or later.
    		@default false
    		*/
    var disableReferencedProjectLoad: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Disable size limit for JavaScript project.
    		Requires TypeScript version 2.0 or later.
    		@default false
    		*/
    var disableSizeLimit: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Opt a project out of multi-project reference checking when editing.
    		Requires TypeScript version 3.8 or later.
    		@default false
    		*/
    var disableSolutionSearching: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Disable preferring source files instead of declaration files when referencing composite projects.
    		@default true if composite, false otherwise
    		*/
    var disableSourceOfProjectReferenceRedirect: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Provide full support for iterables in `for-of`, spread, and destructuring when targeting `ES5` or `ES3`.
    		Requires TypeScript version 2.3 or later.
    		@default false
    		*/
    var downlevelIteration: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Emit a UTF-8 Byte Order Mark (BOM) in the beginning of output files.
    		@default false
    		*/
    var emitBOM: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Only emit `.d.ts` declaration files.
    		@default false
    		*/
    var emitDeclarationOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Emit design-type metadata for decorated declarations in source.
    		@default false
    		*/
    var emitDecoratorMetadata: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Emit `__importStar` and `__importDefault` helpers for runtime Babel ecosystem compatibility and enable `--allowSyntheticDefaultImports` for typesystem compatibility.
    		Requires TypeScript version 2.7 or later.
    		@default false
    		*/
    var esModuleInterop: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Differentiate between undefined and not present when type checking.
    		Requires TypeScript version 4.4 or later.
    		@default false
    		*/
    var exactOptionalPropertyTypes: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Enables experimental support for ES7 decorators.
    		@default false
    		*/
    var experimentalDecorators: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Print names of files which TypeScript sees as a part of your project and the reason they are part of the compilation.
    		Requires TypeScript version 4.2 or later.
    		@default false
    		*/
    var explainFiles: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Output more detailed compiler performance information after building.
    		@default false
    		*/
    var extendedDiagnostics: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specify the polling strategy to use when the system runs out of or doesn't support native file watchers.
    		Requires TypeScript version 3.8 or later.
    		@deprecated Use watchOptions.fallbackPolling instead.
    		*/
    var fallbackPolling: js.UndefOr[FallbackPolling] = js.undefined
    
    /**
    		Disallow inconsistently-cased references to the same file.
    		@default false
    		*/
    var forceConsistentCasingInFileNames: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Emit a v8 CPU profile of the compiler run for debugging.
    		Requires TypeScript version 3.7 or later.
    		@default 'profile.cpuprofile'
    		*/
    var generateCpuProfile: js.UndefOr[String] = js.undefined
    
    /**
    		Import emit helpers (e.g. `__extends`, `__rest`, etc..) from tslib.
    		Requires TypeScript version 2.1 or later.
    		@default false
    		*/
    var importHelpers: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specify emit/checking behavior for imports that are only used for types.
    		@default 'remove'
    		*/
    var importsNotUsedAsValues: js.UndefOr[ImportsNotUsedAsValues] = js.undefined
    
    /**
    		Enable incremental compilation.
    		@default `composite`
    		*/
    var incremental: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Emit a single file with source maps instead of having a separate file.
    		@default false
    		*/
    var inlineSourceMap: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Emit the source alongside the sourcemaps within a single file.
    		Requires `--inlineSourceMap` to be set.
    		@default false
    		*/
    var inlineSources: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Unconditionally emit imports for unresolved files.
    		@default false
    		*/
    var isolatedModules: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specify what JSX code is generated.
    		@default 'preserve'
    		*/
    var jsx: js.UndefOr[JSX] = js.undefined
    
    /**
    		Specify the JSX factory function to use when targeting React JSX emit, e.g. `React.createElement` or `h`.
    		Requires TypeScript version 2.1 or later.
    		@default 'React.createElement'
    		*/
    var jsxFactory: js.UndefOr[String] = js.undefined
    
    /**
    		Specify the JSX Fragment reference used for fragments when targeting React JSX emit e.g. 'React.Fragment' or 'Fragment'.
    		Requires TypeScript version 4.0 or later.
    		@default 'React.Fragment'
    		*/
    var jsxFragmentFactory: js.UndefOr[String] = js.undefined
    
    /**
    		Specify module specifier used to import the JSX factory functions when using `jsx: react-jsx*`.
    		Requires TypeScript version 4.1 or later.
    		@default 'react'
    		*/
    var jsxImportSource: js.UndefOr[String] = js.undefined
    
    /**
    		Resolve `keyof` to string valued property names only (no numbers or symbols).
    		Requires TypeScript version 2.9 or later.
    		@default false
    		*/
    var keyofStringsOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
    		List of library files to be included in the compilation.
    		Requires TypeScript version 2.0 or later.
    		*/
    var lib: js.UndefOr[js.Array[Lib]] = js.undefined
    
    /**
    		Enable to list all emitted files.
    		Requires TypeScript version 2.0 or later.
    		@default false
    		*/
    var listEmittedFiles: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Print names of files part of the compilation.
    		@default false
    		*/
    var listFiles: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Print names of files that are part of the compilation and then stop processing.
    		@default false
    		*/
    var listFilesOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specifies the location where debugger should locate map files instead of generated locations.
    		*/
    var mapRoot: js.UndefOr[String] = js.undefined
    
    /**
    		The maximum dependency depth to search under `node_modules` and load JavaScript files. Only applicable with `--allowJs`.
    		@default 0
    		*/
    var maxNodeModuleJsDepth: js.UndefOr[Double] = js.undefined
    
    /**
    		Specify module code generation: 'None', 'CommonJS', 'AMD', 'System', 'UMD', 'ES6', 'ES2015' or 'ESNext'. Only 'AMD' and 'System' can be used in conjunction with `--outFile`. 'ES6' and 'ES2015' values may be used when targeting 'ES5' or lower.
    		@default ['ES3', 'ES5'].includes(target) ? 'CommonJS' : 'ES6'
    		*/
    var module: js.UndefOr[Module] = js.undefined
    
    /**
    		Specifies module resolution strategy: 'node' (Node) or 'classic' (TypeScript pre 1.6).
    		@default ['AMD', 'System', 'ES6'].includes(module) ? 'classic' : 'node'
    		*/
    var moduleResolution: js.UndefOr[classic | node] = js.undefined
    
    /**
    		Specifies the end of line sequence to be used when emitting files: 'crlf' (Windows) or 'lf' (Unix).
    		Default: Platform specific
    		*/
    var newLine: js.UndefOr[NewLine] = js.undefined
    
    /**
    		Do not emit output.
    		@default false
    		*/
    var noEmit: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Do not generate custom helper functions like `__extends` in compiled output.
    		@default false
    		*/
    var noEmitHelpers: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Do not emit outputs if any type checking errors were reported.
    		@default false
    		*/
    var noEmitOnError: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Do not truncate error messages.
    		@default false
    		*/
    var noErrorTruncation: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Report errors for fallthrough cases in switch statement.
    		@default false
    		*/
    var noFallthroughCasesInSwitch: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Warn on expressions and declarations with an implied 'any' type.
    		@default false
    		*/
    var noImplicitAny: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Ensure overriding members in derived classes are marked with an override modifier.
    		@default false
    		*/
    var noImplicitOverride: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Report error when not all code paths in function return a value.
    		@default false
    		*/
    var noImplicitReturns: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Raise error on 'this' expressions with an implied any type.
    		@default false
    		*/
    var noImplicitThis: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Do not emit `'use strict'` directives in module output.
    		@default false
    		*/
    var noImplicitUseStrict: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Do not include the default library file (lib.d.ts).
    		@default false
    		*/
    var noLib: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Enforces using indexed accessors for keys declared using an indexed type.
    		Requires TypeScript version 4.2 or later.
    		@default false
    		*/
    var noPropertyAccessFromIndexSignature: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Do not add triple-slash references or module import targets to the list of compiled files.
    		@default false
    		*/
    var noResolve: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Disable strict checking of generic signatures in function types.
    		@default false
    		*/
    var noStrictGenericChecks: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Add `undefined` to a type when accessed using an index.
    		Requires TypeScript version 4.1 or later.
    		@default false
    		*/
    var noUncheckedIndexedAccess: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Report errors on unused locals.
    		Requires TypeScript version 2.0 or later.
    		@default false
    		*/
    var noUnusedLocals: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Report errors on unused parameters.
    		Requires TypeScript version 2.0 or later.
    		@default false
    		*/
    var noUnusedParameters: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Redirect output structure to the directory.
    		*/
    var outDir: js.UndefOr[String] = js.undefined
    
    /**
    		Concatenate and emit output to single file.
    		*/
    var outFile: js.UndefOr[String] = js.undefined
    
    /**
    		Specify path mapping to be computed relative to baseUrl option.
    		*/
    var paths: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
    
    /**
    		List of TypeScript language server plugins to load.
    		Requires TypeScript version 2.3 or later.
    		*/
    var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
    
    /**
    		Do not erase const enum declarations in generated code.
    		@default false
    		*/
    var preserveConstEnums: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Do not resolve symlinks to their real path; treat a symlinked file like a real one.
    		@default false
    		*/
    var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Keep outdated console output in watch mode instead of clearing the screen.
    		@default false
    		*/
    var preserveWatchOutput: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Stylize errors and messages using color and context (experimental).
    		@default true // Unless piping to another program or redirecting output to a file.
    		*/
    var pretty: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specifies the object invoked for `createElement` and `__spread` when targeting `'react'` JSX emit.
    		@default 'React'
    		*/
    var reactNamespace: js.UndefOr[String] = js.undefined
    
    /**
    		Do not emit comments to output.
    		@default false
    		*/
    var removeComments: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Include modules imported with `.json` extension.
    		Requires TypeScript version 2.9 or later.
    		@default false
    		*/
    var resolveJsonModule: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specifies the root directory of input files.
    		Use to control the output directory structure with `--outDir`.
    		*/
    var rootDir: js.UndefOr[String] = js.undefined
    
    /**
    		Specify list of root directories to be used when resolving modules.
    		*/
    var rootDirs: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    		@deprecated use `skipLibCheck` instead.
    		*/
    var skipDefaultLibCheck: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Skip type checking of declaration files.
    		Requires TypeScript version 2.0 or later.
    		@default false
    		*/
    var skipLibCheck: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Generates corresponding '.map' file.
    		@default false
    		*/
    var sourceMap: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specifies the location where debugger should locate TypeScript files instead of source locations.
    		*/
    var sourceRoot: js.UndefOr[String] = js.undefined
    
    /**
    		Enable all strict type checking options.
    		Requires TypeScript version 2.3 or later.
    		@default false
    		*/
    var strict: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Enable stricter checking of of the `bind`, `call`, and `apply` methods on functions.
    		@default false
    		*/
    var strictBindCallApply: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Disable bivariant parameter checking for function types.
    		Requires TypeScript version 2.6 or later.
    		@default false
    		*/
    var strictFunctionTypes: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Enable strict null checks.
    		Requires TypeScript version 2.0 or later.
    		@default false
    		*/
    var strictNullChecks: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Ensure non-undefined class properties are initialized in the constructor.
    		Requires TypeScript version 2.7 or later.
    		@default false
    		*/
    var strictPropertyInitialization: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Do not emit declarations for code that has an `@internal` annotation.
    		*/
    var stripInternal: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Suppress excess property checks for object literals.
    		@default false
    		*/
    var suppressExcessPropertyErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Suppress noImplicitAny errors for indexing objects lacking index signatures.
    		@default false
    		*/
    var suppressImplicitAnyIndexErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specify ECMAScript target version.
    		@default 'es3'
    		*/
    var target: js.UndefOr[Target] = js.undefined
    
    /**
    		Enable tracing of the name resolution process.
    		@default false
    		*/
    var traceResolution: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specify file to store incremental compilation information.
    		@default '.tsbuildinfo'
    		*/
    var tsBuildInfoFile: js.UndefOr[String] = js.undefined
    
    /**
    		Specify list of directories for type definition files to be included.
    		Requires TypeScript version 2.0 or later.
    		*/
    var typeRoots: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    		Type declaration files to be included in compilation.
    		Requires TypeScript version 2.0 or later.
    		*/
    var types: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    		Emit ECMAScript standard class fields.
    		Requires TypeScript version 3.7 or later.
    		@default false
    		*/
    var useDefineForClassFields: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Default catch clause variables as `unknown` instead of `any`.
    		Requires TypeScript version 4.4 or later.
    		@default false
    		*/
    var useUnknownInCatchVariables: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Watch input files.
    		@default false
    		@deprecated Use watchOptions instead.
    		*/
    var watch: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specify the strategy for watching directories under systems that lack recursive file-watching functionality.
    		Requires TypeScript version 3.8 or later.
    		@default 'useFsEvents'
    		@deprecated Use watchOptions.watchDirectory instead.
    		*/
    var watchDirectory: js.UndefOr[WatchDirectory] = js.undefined
    
    /**
    		Specify the strategy for watching individual files.
    		Requires TypeScript version 3.8 or later.
    		@default 'useFsEvents'
    		@deprecated Use watchOptions.watchFile instead.
    		*/
    var watchFile: js.UndefOr[WatchFile] = js.undefined
  }
  object CompilerOptions {
    
    inline def apply(): CompilerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompilerOptions]
    }
    
    extension [Self <: CompilerOptions](x: Self) {
      
      inline def setAllowJs(value: Boolean): Self = StObject.set(x, "allowJs", value.asInstanceOf[js.Any])
      
      inline def setAllowJsUndefined: Self = StObject.set(x, "allowJs", js.undefined)
      
      inline def setAllowSyntheticDefaultImports(value: Boolean): Self = StObject.set(x, "allowSyntheticDefaultImports", value.asInstanceOf[js.Any])
      
      inline def setAllowSyntheticDefaultImportsUndefined: Self = StObject.set(x, "allowSyntheticDefaultImports", js.undefined)
      
      inline def setAllowUmdGlobalAccess(value: Boolean): Self = StObject.set(x, "allowUmdGlobalAccess", value.asInstanceOf[js.Any])
      
      inline def setAllowUmdGlobalAccessUndefined: Self = StObject.set(x, "allowUmdGlobalAccess", js.undefined)
      
      inline def setAllowUnreachableCode(value: Boolean): Self = StObject.set(x, "allowUnreachableCode", value.asInstanceOf[js.Any])
      
      inline def setAllowUnreachableCodeUndefined: Self = StObject.set(x, "allowUnreachableCode", js.undefined)
      
      inline def setAllowUnusedLabels(value: Boolean): Self = StObject.set(x, "allowUnusedLabels", value.asInstanceOf[js.Any])
      
      inline def setAllowUnusedLabelsUndefined: Self = StObject.set(x, "allowUnusedLabels", js.undefined)
      
      inline def setAlwaysStrict(value: Boolean): Self = StObject.set(x, "alwaysStrict", value.asInstanceOf[js.Any])
      
      inline def setAlwaysStrictUndefined: Self = StObject.set(x, "alwaysStrict", js.undefined)
      
      inline def setAssumeChangesOnlyAffectDirectDependencies(value: Boolean): Self = StObject.set(x, "assumeChangesOnlyAffectDirectDependencies", value.asInstanceOf[js.Any])
      
      inline def setAssumeChangesOnlyAffectDirectDependenciesUndefined: Self = StObject.set(x, "assumeChangesOnlyAffectDirectDependencies", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setCheckJs(value: Boolean): Self = StObject.set(x, "checkJs", value.asInstanceOf[js.Any])
      
      inline def setCheckJsUndefined: Self = StObject.set(x, "checkJs", js.undefined)
      
      inline def setComposite(value: Boolean): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
      
      inline def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
      
      inline def setDeclaration(value: Boolean): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      inline def setDeclarationDir(value: String): Self = StObject.set(x, "declarationDir", value.asInstanceOf[js.Any])
      
      inline def setDeclarationDirUndefined: Self = StObject.set(x, "declarationDir", js.undefined)
      
      inline def setDeclarationMap(value: Boolean): Self = StObject.set(x, "declarationMap", value.asInstanceOf[js.Any])
      
      inline def setDeclarationMapUndefined: Self = StObject.set(x, "declarationMap", js.undefined)
      
      inline def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
      
      inline def setDiagnostics(value: Boolean): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
      
      inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
      
      inline def setDisableReferencedProjectLoad(value: Boolean): Self = StObject.set(x, "disableReferencedProjectLoad", value.asInstanceOf[js.Any])
      
      inline def setDisableReferencedProjectLoadUndefined: Self = StObject.set(x, "disableReferencedProjectLoad", js.undefined)
      
      inline def setDisableSizeLimit(value: Boolean): Self = StObject.set(x, "disableSizeLimit", value.asInstanceOf[js.Any])
      
      inline def setDisableSizeLimitUndefined: Self = StObject.set(x, "disableSizeLimit", js.undefined)
      
      inline def setDisableSolutionSearching(value: Boolean): Self = StObject.set(x, "disableSolutionSearching", value.asInstanceOf[js.Any])
      
      inline def setDisableSolutionSearchingUndefined: Self = StObject.set(x, "disableSolutionSearching", js.undefined)
      
      inline def setDisableSourceOfProjectReferenceRedirect(value: Boolean): Self = StObject.set(x, "disableSourceOfProjectReferenceRedirect", value.asInstanceOf[js.Any])
      
      inline def setDisableSourceOfProjectReferenceRedirectUndefined: Self = StObject.set(x, "disableSourceOfProjectReferenceRedirect", js.undefined)
      
      inline def setDownlevelIteration(value: Boolean): Self = StObject.set(x, "downlevelIteration", value.asInstanceOf[js.Any])
      
      inline def setDownlevelIterationUndefined: Self = StObject.set(x, "downlevelIteration", js.undefined)
      
      inline def setEmitBOM(value: Boolean): Self = StObject.set(x, "emitBOM", value.asInstanceOf[js.Any])
      
      inline def setEmitBOMUndefined: Self = StObject.set(x, "emitBOM", js.undefined)
      
      inline def setEmitDeclarationOnly(value: Boolean): Self = StObject.set(x, "emitDeclarationOnly", value.asInstanceOf[js.Any])
      
      inline def setEmitDeclarationOnlyUndefined: Self = StObject.set(x, "emitDeclarationOnly", js.undefined)
      
      inline def setEmitDecoratorMetadata(value: Boolean): Self = StObject.set(x, "emitDecoratorMetadata", value.asInstanceOf[js.Any])
      
      inline def setEmitDecoratorMetadataUndefined: Self = StObject.set(x, "emitDecoratorMetadata", js.undefined)
      
      inline def setEsModuleInterop(value: Boolean): Self = StObject.set(x, "esModuleInterop", value.asInstanceOf[js.Any])
      
      inline def setEsModuleInteropUndefined: Self = StObject.set(x, "esModuleInterop", js.undefined)
      
      inline def setExactOptionalPropertyTypes(value: Boolean): Self = StObject.set(x, "exactOptionalPropertyTypes", value.asInstanceOf[js.Any])
      
      inline def setExactOptionalPropertyTypesUndefined: Self = StObject.set(x, "exactOptionalPropertyTypes", js.undefined)
      
      inline def setExperimentalDecorators(value: Boolean): Self = StObject.set(x, "experimentalDecorators", value.asInstanceOf[js.Any])
      
      inline def setExperimentalDecoratorsUndefined: Self = StObject.set(x, "experimentalDecorators", js.undefined)
      
      inline def setExplainFiles(value: Boolean): Self = StObject.set(x, "explainFiles", value.asInstanceOf[js.Any])
      
      inline def setExplainFilesUndefined: Self = StObject.set(x, "explainFiles", js.undefined)
      
      inline def setExtendedDiagnostics(value: Boolean): Self = StObject.set(x, "extendedDiagnostics", value.asInstanceOf[js.Any])
      
      inline def setExtendedDiagnosticsUndefined: Self = StObject.set(x, "extendedDiagnostics", js.undefined)
      
      inline def setFallbackPolling(value: FallbackPolling): Self = StObject.set(x, "fallbackPolling", value.asInstanceOf[js.Any])
      
      inline def setFallbackPollingUndefined: Self = StObject.set(x, "fallbackPolling", js.undefined)
      
      inline def setForceConsistentCasingInFileNames(value: Boolean): Self = StObject.set(x, "forceConsistentCasingInFileNames", value.asInstanceOf[js.Any])
      
      inline def setForceConsistentCasingInFileNamesUndefined: Self = StObject.set(x, "forceConsistentCasingInFileNames", js.undefined)
      
      inline def setGenerateCpuProfile(value: String): Self = StObject.set(x, "generateCpuProfile", value.asInstanceOf[js.Any])
      
      inline def setGenerateCpuProfileUndefined: Self = StObject.set(x, "generateCpuProfile", js.undefined)
      
      inline def setImportHelpers(value: Boolean): Self = StObject.set(x, "importHelpers", value.asInstanceOf[js.Any])
      
      inline def setImportHelpersUndefined: Self = StObject.set(x, "importHelpers", js.undefined)
      
      inline def setImportsNotUsedAsValues(value: ImportsNotUsedAsValues): Self = StObject.set(x, "importsNotUsedAsValues", value.asInstanceOf[js.Any])
      
      inline def setImportsNotUsedAsValuesUndefined: Self = StObject.set(x, "importsNotUsedAsValues", js.undefined)
      
      inline def setIncremental(value: Boolean): Self = StObject.set(x, "incremental", value.asInstanceOf[js.Any])
      
      inline def setIncrementalUndefined: Self = StObject.set(x, "incremental", js.undefined)
      
      inline def setInlineSourceMap(value: Boolean): Self = StObject.set(x, "inlineSourceMap", value.asInstanceOf[js.Any])
      
      inline def setInlineSourceMapUndefined: Self = StObject.set(x, "inlineSourceMap", js.undefined)
      
      inline def setInlineSources(value: Boolean): Self = StObject.set(x, "inlineSources", value.asInstanceOf[js.Any])
      
      inline def setInlineSourcesUndefined: Self = StObject.set(x, "inlineSources", js.undefined)
      
      inline def setIsolatedModules(value: Boolean): Self = StObject.set(x, "isolatedModules", value.asInstanceOf[js.Any])
      
      inline def setIsolatedModulesUndefined: Self = StObject.set(x, "isolatedModules", js.undefined)
      
      inline def setJsx(value: JSX): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      inline def setJsxFactory(value: String): Self = StObject.set(x, "jsxFactory", value.asInstanceOf[js.Any])
      
      inline def setJsxFactoryUndefined: Self = StObject.set(x, "jsxFactory", js.undefined)
      
      inline def setJsxFragmentFactory(value: String): Self = StObject.set(x, "jsxFragmentFactory", value.asInstanceOf[js.Any])
      
      inline def setJsxFragmentFactoryUndefined: Self = StObject.set(x, "jsxFragmentFactory", js.undefined)
      
      inline def setJsxImportSource(value: String): Self = StObject.set(x, "jsxImportSource", value.asInstanceOf[js.Any])
      
      inline def setJsxImportSourceUndefined: Self = StObject.set(x, "jsxImportSource", js.undefined)
      
      inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
      
      inline def setKeyofStringsOnly(value: Boolean): Self = StObject.set(x, "keyofStringsOnly", value.asInstanceOf[js.Any])
      
      inline def setKeyofStringsOnlyUndefined: Self = StObject.set(x, "keyofStringsOnly", js.undefined)
      
      inline def setLib(value: js.Array[Lib]): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
      
      inline def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
      
      inline def setLibVarargs(value: Lib*): Self = StObject.set(x, "lib", js.Array(value*))
      
      inline def setListEmittedFiles(value: Boolean): Self = StObject.set(x, "listEmittedFiles", value.asInstanceOf[js.Any])
      
      inline def setListEmittedFilesUndefined: Self = StObject.set(x, "listEmittedFiles", js.undefined)
      
      inline def setListFiles(value: Boolean): Self = StObject.set(x, "listFiles", value.asInstanceOf[js.Any])
      
      inline def setListFilesOnly(value: Boolean): Self = StObject.set(x, "listFilesOnly", value.asInstanceOf[js.Any])
      
      inline def setListFilesOnlyUndefined: Self = StObject.set(x, "listFilesOnly", js.undefined)
      
      inline def setListFilesUndefined: Self = StObject.set(x, "listFiles", js.undefined)
      
      inline def setMapRoot(value: String): Self = StObject.set(x, "mapRoot", value.asInstanceOf[js.Any])
      
      inline def setMapRootUndefined: Self = StObject.set(x, "mapRoot", js.undefined)
      
      inline def setMaxNodeModuleJsDepth(value: Double): Self = StObject.set(x, "maxNodeModuleJsDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxNodeModuleJsDepthUndefined: Self = StObject.set(x, "maxNodeModuleJsDepth", js.undefined)
      
      inline def setModule(value: Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleResolution(value: classic | node): Self = StObject.set(x, "moduleResolution", value.asInstanceOf[js.Any])
      
      inline def setModuleResolutionUndefined: Self = StObject.set(x, "moduleResolution", js.undefined)
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setNewLine(value: NewLine): Self = StObject.set(x, "newLine", value.asInstanceOf[js.Any])
      
      inline def setNewLineUndefined: Self = StObject.set(x, "newLine", js.undefined)
      
      inline def setNoEmit(value: Boolean): Self = StObject.set(x, "noEmit", value.asInstanceOf[js.Any])
      
      inline def setNoEmitHelpers(value: Boolean): Self = StObject.set(x, "noEmitHelpers", value.asInstanceOf[js.Any])
      
      inline def setNoEmitHelpersUndefined: Self = StObject.set(x, "noEmitHelpers", js.undefined)
      
      inline def setNoEmitOnError(value: Boolean): Self = StObject.set(x, "noEmitOnError", value.asInstanceOf[js.Any])
      
      inline def setNoEmitOnErrorUndefined: Self = StObject.set(x, "noEmitOnError", js.undefined)
      
      inline def setNoEmitUndefined: Self = StObject.set(x, "noEmit", js.undefined)
      
      inline def setNoErrorTruncation(value: Boolean): Self = StObject.set(x, "noErrorTruncation", value.asInstanceOf[js.Any])
      
      inline def setNoErrorTruncationUndefined: Self = StObject.set(x, "noErrorTruncation", js.undefined)
      
      inline def setNoFallthroughCasesInSwitch(value: Boolean): Self = StObject.set(x, "noFallthroughCasesInSwitch", value.asInstanceOf[js.Any])
      
      inline def setNoFallthroughCasesInSwitchUndefined: Self = StObject.set(x, "noFallthroughCasesInSwitch", js.undefined)
      
      inline def setNoImplicitAny(value: Boolean): Self = StObject.set(x, "noImplicitAny", value.asInstanceOf[js.Any])
      
      inline def setNoImplicitAnyUndefined: Self = StObject.set(x, "noImplicitAny", js.undefined)
      
      inline def setNoImplicitOverride(value: Boolean): Self = StObject.set(x, "noImplicitOverride", value.asInstanceOf[js.Any])
      
      inline def setNoImplicitOverrideUndefined: Self = StObject.set(x, "noImplicitOverride", js.undefined)
      
      inline def setNoImplicitReturns(value: Boolean): Self = StObject.set(x, "noImplicitReturns", value.asInstanceOf[js.Any])
      
      inline def setNoImplicitReturnsUndefined: Self = StObject.set(x, "noImplicitReturns", js.undefined)
      
      inline def setNoImplicitThis(value: Boolean): Self = StObject.set(x, "noImplicitThis", value.asInstanceOf[js.Any])
      
      inline def setNoImplicitThisUndefined: Self = StObject.set(x, "noImplicitThis", js.undefined)
      
      inline def setNoImplicitUseStrict(value: Boolean): Self = StObject.set(x, "noImplicitUseStrict", value.asInstanceOf[js.Any])
      
      inline def setNoImplicitUseStrictUndefined: Self = StObject.set(x, "noImplicitUseStrict", js.undefined)
      
      inline def setNoLib(value: Boolean): Self = StObject.set(x, "noLib", value.asInstanceOf[js.Any])
      
      inline def setNoLibUndefined: Self = StObject.set(x, "noLib", js.undefined)
      
      inline def setNoPropertyAccessFromIndexSignature(value: Boolean): Self = StObject.set(x, "noPropertyAccessFromIndexSignature", value.asInstanceOf[js.Any])
      
      inline def setNoPropertyAccessFromIndexSignatureUndefined: Self = StObject.set(x, "noPropertyAccessFromIndexSignature", js.undefined)
      
      inline def setNoResolve(value: Boolean): Self = StObject.set(x, "noResolve", value.asInstanceOf[js.Any])
      
      inline def setNoResolveUndefined: Self = StObject.set(x, "noResolve", js.undefined)
      
      inline def setNoStrictGenericChecks(value: Boolean): Self = StObject.set(x, "noStrictGenericChecks", value.asInstanceOf[js.Any])
      
      inline def setNoStrictGenericChecksUndefined: Self = StObject.set(x, "noStrictGenericChecks", js.undefined)
      
      inline def setNoUncheckedIndexedAccess(value: Boolean): Self = StObject.set(x, "noUncheckedIndexedAccess", value.asInstanceOf[js.Any])
      
      inline def setNoUncheckedIndexedAccessUndefined: Self = StObject.set(x, "noUncheckedIndexedAccess", js.undefined)
      
      inline def setNoUnusedLocals(value: Boolean): Self = StObject.set(x, "noUnusedLocals", value.asInstanceOf[js.Any])
      
      inline def setNoUnusedLocalsUndefined: Self = StObject.set(x, "noUnusedLocals", js.undefined)
      
      inline def setNoUnusedParameters(value: Boolean): Self = StObject.set(x, "noUnusedParameters", value.asInstanceOf[js.Any])
      
      inline def setNoUnusedParametersUndefined: Self = StObject.set(x, "noUnusedParameters", js.undefined)
      
      inline def setOutDir(value: String): Self = StObject.set(x, "outDir", value.asInstanceOf[js.Any])
      
      inline def setOutDirUndefined: Self = StObject.set(x, "outDir", js.undefined)
      
      inline def setOutFile(value: String): Self = StObject.set(x, "outFile", value.asInstanceOf[js.Any])
      
      inline def setOutFileUndefined: Self = StObject.set(x, "outFile", js.undefined)
      
      inline def setPaths(value: Record[String, js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setPreserveConstEnums(value: Boolean): Self = StObject.set(x, "preserveConstEnums", value.asInstanceOf[js.Any])
      
      inline def setPreserveConstEnumsUndefined: Self = StObject.set(x, "preserveConstEnums", js.undefined)
      
      inline def setPreserveSymlinks(value: Boolean): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
      
      inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
      
      inline def setPreserveWatchOutput(value: Boolean): Self = StObject.set(x, "preserveWatchOutput", value.asInstanceOf[js.Any])
      
      inline def setPreserveWatchOutputUndefined: Self = StObject.set(x, "preserveWatchOutput", js.undefined)
      
      inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      inline def setReactNamespace(value: String): Self = StObject.set(x, "reactNamespace", value.asInstanceOf[js.Any])
      
      inline def setReactNamespaceUndefined: Self = StObject.set(x, "reactNamespace", js.undefined)
      
      inline def setRemoveComments(value: Boolean): Self = StObject.set(x, "removeComments", value.asInstanceOf[js.Any])
      
      inline def setRemoveCommentsUndefined: Self = StObject.set(x, "removeComments", js.undefined)
      
      inline def setResolveJsonModule(value: Boolean): Self = StObject.set(x, "resolveJsonModule", value.asInstanceOf[js.Any])
      
      inline def setResolveJsonModuleUndefined: Self = StObject.set(x, "resolveJsonModule", js.undefined)
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
      
      inline def setRootDirs(value: js.Array[String]): Self = StObject.set(x, "rootDirs", value.asInstanceOf[js.Any])
      
      inline def setRootDirsUndefined: Self = StObject.set(x, "rootDirs", js.undefined)
      
      inline def setRootDirsVarargs(value: String*): Self = StObject.set(x, "rootDirs", js.Array(value*))
      
      inline def setSkipDefaultLibCheck(value: Boolean): Self = StObject.set(x, "skipDefaultLibCheck", value.asInstanceOf[js.Any])
      
      inline def setSkipDefaultLibCheckUndefined: Self = StObject.set(x, "skipDefaultLibCheck", js.undefined)
      
      inline def setSkipLibCheck(value: Boolean): Self = StObject.set(x, "skipLibCheck", value.asInstanceOf[js.Any])
      
      inline def setSkipLibCheckUndefined: Self = StObject.set(x, "skipLibCheck", js.undefined)
      
      inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictBindCallApply(value: Boolean): Self = StObject.set(x, "strictBindCallApply", value.asInstanceOf[js.Any])
      
      inline def setStrictBindCallApplyUndefined: Self = StObject.set(x, "strictBindCallApply", js.undefined)
      
      inline def setStrictFunctionTypes(value: Boolean): Self = StObject.set(x, "strictFunctionTypes", value.asInstanceOf[js.Any])
      
      inline def setStrictFunctionTypesUndefined: Self = StObject.set(x, "strictFunctionTypes", js.undefined)
      
      inline def setStrictNullChecks(value: Boolean): Self = StObject.set(x, "strictNullChecks", value.asInstanceOf[js.Any])
      
      inline def setStrictNullChecksUndefined: Self = StObject.set(x, "strictNullChecks", js.undefined)
      
      inline def setStrictPropertyInitialization(value: Boolean): Self = StObject.set(x, "strictPropertyInitialization", value.asInstanceOf[js.Any])
      
      inline def setStrictPropertyInitializationUndefined: Self = StObject.set(x, "strictPropertyInitialization", js.undefined)
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setStripInternal(value: Boolean): Self = StObject.set(x, "stripInternal", value.asInstanceOf[js.Any])
      
      inline def setStripInternalUndefined: Self = StObject.set(x, "stripInternal", js.undefined)
      
      inline def setSuppressExcessPropertyErrors(value: Boolean): Self = StObject.set(x, "suppressExcessPropertyErrors", value.asInstanceOf[js.Any])
      
      inline def setSuppressExcessPropertyErrorsUndefined: Self = StObject.set(x, "suppressExcessPropertyErrors", js.undefined)
      
      inline def setSuppressImplicitAnyIndexErrors(value: Boolean): Self = StObject.set(x, "suppressImplicitAnyIndexErrors", value.asInstanceOf[js.Any])
      
      inline def setSuppressImplicitAnyIndexErrorsUndefined: Self = StObject.set(x, "suppressImplicitAnyIndexErrors", js.undefined)
      
      inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTraceResolution(value: Boolean): Self = StObject.set(x, "traceResolution", value.asInstanceOf[js.Any])
      
      inline def setTraceResolutionUndefined: Self = StObject.set(x, "traceResolution", js.undefined)
      
      inline def setTsBuildInfoFile(value: String): Self = StObject.set(x, "tsBuildInfoFile", value.asInstanceOf[js.Any])
      
      inline def setTsBuildInfoFileUndefined: Self = StObject.set(x, "tsBuildInfoFile", js.undefined)
      
      inline def setTypeRoots(value: js.Array[String]): Self = StObject.set(x, "typeRoots", value.asInstanceOf[js.Any])
      
      inline def setTypeRootsUndefined: Self = StObject.set(x, "typeRoots", js.undefined)
      
      inline def setTypeRootsVarargs(value: String*): Self = StObject.set(x, "typeRoots", js.Array(value*))
      
      inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
      
      inline def setUseDefineForClassFields(value: Boolean): Self = StObject.set(x, "useDefineForClassFields", value.asInstanceOf[js.Any])
      
      inline def setUseDefineForClassFieldsUndefined: Self = StObject.set(x, "useDefineForClassFields", js.undefined)
      
      inline def setUseUnknownInCatchVariables(value: Boolean): Self = StObject.set(x, "useUnknownInCatchVariables", value.asInstanceOf[js.Any])
      
      inline def setUseUnknownInCatchVariablesUndefined: Self = StObject.set(x, "useUnknownInCatchVariables", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchDirectory(value: WatchDirectory): Self = StObject.set(x, "watchDirectory", value.asInstanceOf[js.Any])
      
      inline def setWatchDirectoryUndefined: Self = StObject.set(x, "watchDirectory", js.undefined)
      
      inline def setWatchFile(value: WatchFile): Self = StObject.set(x, "watchFile", value.asInstanceOf[js.Any])
      
      inline def setWatchFileUndefined: Self = StObject.set(x, "watchFile", js.undefined)
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.typeFest.typeFestStrings.fixedPollingInterval_
      - typingsJapgolly.typeFest.typeFestStrings.priorityPollingInterval_
      - typingsJapgolly.typeFest.typeFestStrings.dynamicPriorityPolling_
      - typingsJapgolly.typeFest.typeFestStrings.fixedInterval_
      - typingsJapgolly.typeFest.typeFestStrings.priorityInterval_
      - typingsJapgolly.typeFest.typeFestStrings.dynamicPriority_
      - typingsJapgolly.typeFest.typeFestStrings.fixedChunkSize_
    */
    trait FallbackPolling extends StObject
    object FallbackPolling {
      
      inline def dynamicPriority: dynamicPriority_ = "dynamicPriority".asInstanceOf[dynamicPriority_]
      
      inline def dynamicPriorityPolling: dynamicPriorityPolling_ = "dynamicPriorityPolling".asInstanceOf[dynamicPriorityPolling_]
      
      inline def fixedChunkSize: fixedChunkSize_ = "fixedChunkSize".asInstanceOf[fixedChunkSize_]
      
      inline def fixedInterval: fixedInterval_ = "fixedInterval".asInstanceOf[fixedInterval_]
      
      inline def fixedPollingInterval: fixedPollingInterval_ = "fixedPollingInterval".asInstanceOf[fixedPollingInterval_]
      
      inline def priorityInterval: priorityInterval_ = "priorityInterval".asInstanceOf[priorityInterval_]
      
      inline def priorityPollingInterval: priorityPollingInterval_ = "priorityPollingInterval".asInstanceOf[priorityPollingInterval_]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.typeFest.typeFestStrings.remove
      - typingsJapgolly.typeFest.typeFestStrings.preserve
      - typingsJapgolly.typeFest.typeFestStrings.error
    */
    trait ImportsNotUsedAsValues extends StObject
    object ImportsNotUsedAsValues {
      
      inline def error: typingsJapgolly.typeFest.typeFestStrings.error = "error".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.error]
      
      inline def preserve: typingsJapgolly.typeFest.typeFestStrings.preserve = "preserve".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.preserve]
      
      inline def remove: typingsJapgolly.typeFest.typeFestStrings.remove = "remove".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.remove]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.typeFest.typeFestStrings.preserve
      - typingsJapgolly.typeFest.typeFestStrings.react
      - typingsJapgolly.typeFest.typeFestStrings.`react-jsx`
      - typingsJapgolly.typeFest.typeFestStrings.`react-jsxdev`
      - typingsJapgolly.typeFest.typeFestStrings.`react-native`
    */
    trait JSX extends StObject
    object JSX {
      
      inline def preserve: typingsJapgolly.typeFest.typeFestStrings.preserve = "preserve".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.preserve]
      
      inline def react: typingsJapgolly.typeFest.typeFestStrings.react = "react".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.react]
      
      inline def `react-jsx`: typingsJapgolly.typeFest.typeFestStrings.`react-jsx` = "react-jsx".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.`react-jsx`]
      
      inline def `react-jsxdev`: typingsJapgolly.typeFest.typeFestStrings.`react-jsxdev` = "react-jsxdev".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.`react-jsxdev`]
      
      inline def `react-native`: typingsJapgolly.typeFest.typeFestStrings.`react-native` = "react-native".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.`react-native`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.typeFest.typeFestStrings.ES5
      - typingsJapgolly.typeFest.typeFestStrings.ES6
      - typingsJapgolly.typeFest.typeFestStrings.ES7
      - typingsJapgolly.typeFest.typeFestStrings.ES2015
      - typingsJapgolly.typeFest.typeFestStrings.ES2015DotCollection
      - typingsJapgolly.typeFest.typeFestStrings.ES2015DotCore
      - typingsJapgolly.typeFest.typeFestStrings.ES2015DotGenerator
      - typingsJapgolly.typeFest.typeFestStrings.ES2015DotIterable
      - typingsJapgolly.typeFest.typeFestStrings.ES2015DotPromise
      - typingsJapgolly.typeFest.typeFestStrings.ES2015DotProxy
      - typingsJapgolly.typeFest.typeFestStrings.ES2015DotReflect
      - typingsJapgolly.typeFest.typeFestStrings.ES2015DotSymbolDotWellKnown
      - typingsJapgolly.typeFest.typeFestStrings.ES2015DotSymbol
      - typingsJapgolly.typeFest.typeFestStrings.ES2016
      - typingsJapgolly.typeFest.typeFestStrings.ES2016DotArrayDotInclude
      - typingsJapgolly.typeFest.typeFestStrings.ES2017
      - typingsJapgolly.typeFest.typeFestStrings.ES2017DotIntl
      - typingsJapgolly.typeFest.typeFestStrings.ES2017DotObject
      - typingsJapgolly.typeFest.typeFestStrings.ES2017DotSharedMemory
      - typingsJapgolly.typeFest.typeFestStrings.ES2017DotString
      - typingsJapgolly.typeFest.typeFestStrings.ES2017DotTypedArrays
      - typingsJapgolly.typeFest.typeFestStrings.ES2018
      - typingsJapgolly.typeFest.typeFestStrings.ES2018DotAsyncGenerator
      - typingsJapgolly.typeFest.typeFestStrings.ES2018DotAsyncIterable
      - typingsJapgolly.typeFest.typeFestStrings.ES2018DotIntl
      - typingsJapgolly.typeFest.typeFestStrings.ES2018DotPromise
      - typingsJapgolly.typeFest.typeFestStrings.ES2018DotRegexp
      - typingsJapgolly.typeFest.typeFestStrings.ES2019
      - typingsJapgolly.typeFest.typeFestStrings.ES2019DotArray
      - typingsJapgolly.typeFest.typeFestStrings.ES2019DotObject
      - typingsJapgolly.typeFest.typeFestStrings.ES2019DotString
      - typingsJapgolly.typeFest.typeFestStrings.ES2019DotSymbol
      - typingsJapgolly.typeFest.typeFestStrings.ES2020
      - typingsJapgolly.typeFest.typeFestStrings.ES2020DotBigInt
      - typingsJapgolly.typeFest.typeFestStrings.ES2020DotPromise
      - typingsJapgolly.typeFest.typeFestStrings.ES2020DotString
      - typingsJapgolly.typeFest.typeFestStrings.ES2020DotSymbolDotWellKnown
      - typingsJapgolly.typeFest.typeFestStrings.ES2020DotSharedMemory
      - typingsJapgolly.typeFest.typeFestStrings.ES2020DotIntl
      - typingsJapgolly.typeFest.typeFestStrings.ES2021
      - typingsJapgolly.typeFest.typeFestStrings.ES2021DotPromise
      - typingsJapgolly.typeFest.typeFestStrings.ES2021DotString
      - typingsJapgolly.typeFest.typeFestStrings.ES2021DotWeakRef
      - typingsJapgolly.typeFest.typeFestStrings.ESNext
      - typingsJapgolly.typeFest.typeFestStrings.ESNextDotArray
      - typingsJapgolly.typeFest.typeFestStrings.ESNextDotAsyncIterable
      - typingsJapgolly.typeFest.typeFestStrings.ESNextDotBigInt
      - typingsJapgolly.typeFest.typeFestStrings.ESNextDotIntl
      - typingsJapgolly.typeFest.typeFestStrings.ESNextDotPromise
      - typingsJapgolly.typeFest.typeFestStrings.ESNextDotString
      - typingsJapgolly.typeFest.typeFestStrings.ESNextDotSymbol
      - typingsJapgolly.typeFest.typeFestStrings.ESNextDotWeakRef
      - typingsJapgolly.typeFest.typeFestStrings.DOM
      - typingsJapgolly.typeFest.typeFestStrings.DOMDotIterable
      - typingsJapgolly.typeFest.typeFestStrings.ScriptHost
      - typingsJapgolly.typeFest.typeFestStrings.WebWorker
      - typingsJapgolly.typeFest.typeFestStrings.WebWorkerDotImportScripts
      - typingsJapgolly.typeFest.typeFestStrings.WebWorkerDotIterable
      - typingsJapgolly.typeFest.typeFestStrings.es5_
      - typingsJapgolly.typeFest.typeFestStrings.es6_
      - typingsJapgolly.typeFest.typeFestStrings.es7_
      - typingsJapgolly.typeFest.typeFestStrings.es2015_
      - typingsJapgolly.typeFest.typeFestStrings.es2015Dotcollection
      - typingsJapgolly.typeFest.typeFestStrings.es2015Dotcore
      - typingsJapgolly.typeFest.typeFestStrings.es2015Dotgenerator
      - typingsJapgolly.typeFest.typeFestStrings.es2015Dotiterable
      - typingsJapgolly.typeFest.typeFestStrings.es2015Dotpromise
      - typingsJapgolly.typeFest.typeFestStrings.es2015Dotproxy
      - typingsJapgolly.typeFest.typeFestStrings.es2015Dotreflect
      - typingsJapgolly.typeFest.typeFestStrings.es2015DotsymbolDotwellknown
      - typingsJapgolly.typeFest.typeFestStrings.es2015Dotsymbol
      - typingsJapgolly.typeFest.typeFestStrings.es2016_
      - typingsJapgolly.typeFest.typeFestStrings.es2016DotarrayDotinclude
      - typingsJapgolly.typeFest.typeFestStrings.es2017_
      - typingsJapgolly.typeFest.typeFestStrings.es2017Dotintl
      - typingsJapgolly.typeFest.typeFestStrings.es2017Dotobject
      - typingsJapgolly.typeFest.typeFestStrings.es2017Dotsharedmemory
      - typingsJapgolly.typeFest.typeFestStrings.es2017Dotstring
      - typingsJapgolly.typeFest.typeFestStrings.es2017Dottypedarrays
      - typingsJapgolly.typeFest.typeFestStrings.es2018_
      - typingsJapgolly.typeFest.typeFestStrings.es2018Dotasyncgenerator
      - typingsJapgolly.typeFest.typeFestStrings.es2018Dotasynciterable
      - typingsJapgolly.typeFest.typeFestStrings.es2018Dotintl
      - typingsJapgolly.typeFest.typeFestStrings.es2018Dotpromise
      - typingsJapgolly.typeFest.typeFestStrings.es2018Dotregexp
      - typingsJapgolly.typeFest.typeFestStrings.es2019_
      - typingsJapgolly.typeFest.typeFestStrings.es2019Dotarray
      - typingsJapgolly.typeFest.typeFestStrings.es2019Dotobject
      - typingsJapgolly.typeFest.typeFestStrings.es2019Dotstring
      - typingsJapgolly.typeFest.typeFestStrings.es2019Dotsymbol
      - typingsJapgolly.typeFest.typeFestStrings.es2020_
      - typingsJapgolly.typeFest.typeFestStrings.es2020Dotbigint
      - typingsJapgolly.typeFest.typeFestStrings.es2020Dotpromise
      - typingsJapgolly.typeFest.typeFestStrings.es2020Dotstring
      - typingsJapgolly.typeFest.typeFestStrings.es2020DotsymbolDotwellknown
      - typingsJapgolly.typeFest.typeFestStrings.es2020Dotsharedmemory
      - typingsJapgolly.typeFest.typeFestStrings.es2020Dotintl
      - typingsJapgolly.typeFest.typeFestStrings.es2021_
      - typingsJapgolly.typeFest.typeFestStrings.es2021Dotpromise
      - typingsJapgolly.typeFest.typeFestStrings.es2021Dotstring
      - typingsJapgolly.typeFest.typeFestStrings.es2021Dotweakref
      - typingsJapgolly.typeFest.typeFestStrings.esnext_
      - typingsJapgolly.typeFest.typeFestStrings.esnextDotarray
      - typingsJapgolly.typeFest.typeFestStrings.esnextDotasynciterable
      - typingsJapgolly.typeFest.typeFestStrings.esnextDotbigint
      - typingsJapgolly.typeFest.typeFestStrings.esnextDotintl
      - typingsJapgolly.typeFest.typeFestStrings.esnextDotpromise
      - typingsJapgolly.typeFest.typeFestStrings.esnextDotstring
      - typingsJapgolly.typeFest.typeFestStrings.esnextDotsymbol
      - typingsJapgolly.typeFest.typeFestStrings.esnextDotweakref
      - typingsJapgolly.typeFest.typeFestStrings.dom_
      - typingsJapgolly.typeFest.typeFestStrings.domDotiterable
      - typingsJapgolly.typeFest.typeFestStrings.scripthost_
      - typingsJapgolly.typeFest.typeFestStrings.webworker_
      - typingsJapgolly.typeFest.typeFestStrings.webworkerDotimportscripts
      - typingsJapgolly.typeFest.typeFestStrings.webworkerDotiterable
    */
    trait Lib extends StObject
    object Lib {
      
      inline def DOM: typingsJapgolly.typeFest.typeFestStrings.DOM = "DOM".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.DOM]
      
      inline def DOMDotIterable: typingsJapgolly.typeFest.typeFestStrings.DOMDotIterable = "DOM.Iterable".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.DOMDotIterable]
      
      inline def ES2015: typingsJapgolly.typeFest.typeFestStrings.ES2015 = "ES2015".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2015]
      
      inline def ES2015DotCollection: typingsJapgolly.typeFest.typeFestStrings.ES2015DotCollection = "ES2015.Collection".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2015DotCollection]
      
      inline def ES2015DotCore: typingsJapgolly.typeFest.typeFestStrings.ES2015DotCore = "ES2015.Core".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2015DotCore]
      
      inline def ES2015DotGenerator: typingsJapgolly.typeFest.typeFestStrings.ES2015DotGenerator = "ES2015.Generator".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2015DotGenerator]
      
      inline def ES2015DotIterable: typingsJapgolly.typeFest.typeFestStrings.ES2015DotIterable = "ES2015.Iterable".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2015DotIterable]
      
      inline def ES2015DotPromise: typingsJapgolly.typeFest.typeFestStrings.ES2015DotPromise = "ES2015.Promise".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2015DotPromise]
      
      inline def ES2015DotProxy: typingsJapgolly.typeFest.typeFestStrings.ES2015DotProxy = "ES2015.Proxy".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2015DotProxy]
      
      inline def ES2015DotReflect: typingsJapgolly.typeFest.typeFestStrings.ES2015DotReflect = "ES2015.Reflect".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2015DotReflect]
      
      inline def ES2015DotSymbol: typingsJapgolly.typeFest.typeFestStrings.ES2015DotSymbol = "ES2015.Symbol".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2015DotSymbol]
      
      inline def ES2015DotSymbolDotWellKnown: typingsJapgolly.typeFest.typeFestStrings.ES2015DotSymbolDotWellKnown = "ES2015.Symbol.WellKnown".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2015DotSymbolDotWellKnown]
      
      inline def ES2016: typingsJapgolly.typeFest.typeFestStrings.ES2016 = "ES2016".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2016]
      
      inline def ES2016DotArrayDotInclude: typingsJapgolly.typeFest.typeFestStrings.ES2016DotArrayDotInclude = "ES2016.Array.Include".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2016DotArrayDotInclude]
      
      inline def ES2017: typingsJapgolly.typeFest.typeFestStrings.ES2017 = "ES2017".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2017]
      
      inline def ES2017DotIntl: typingsJapgolly.typeFest.typeFestStrings.ES2017DotIntl = "ES2017.Intl".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2017DotIntl]
      
      inline def ES2017DotObject: typingsJapgolly.typeFest.typeFestStrings.ES2017DotObject = "ES2017.Object".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2017DotObject]
      
      inline def ES2017DotSharedMemory: typingsJapgolly.typeFest.typeFestStrings.ES2017DotSharedMemory = "ES2017.SharedMemory".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2017DotSharedMemory]
      
      inline def ES2017DotString: typingsJapgolly.typeFest.typeFestStrings.ES2017DotString = "ES2017.String".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2017DotString]
      
      inline def ES2017DotTypedArrays: typingsJapgolly.typeFest.typeFestStrings.ES2017DotTypedArrays = "ES2017.TypedArrays".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2017DotTypedArrays]
      
      inline def ES2018: typingsJapgolly.typeFest.typeFestStrings.ES2018 = "ES2018".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2018]
      
      inline def ES2018DotAsyncGenerator: typingsJapgolly.typeFest.typeFestStrings.ES2018DotAsyncGenerator = "ES2018.AsyncGenerator".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2018DotAsyncGenerator]
      
      inline def ES2018DotAsyncIterable: typingsJapgolly.typeFest.typeFestStrings.ES2018DotAsyncIterable = "ES2018.AsyncIterable".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2018DotAsyncIterable]
      
      inline def ES2018DotIntl: typingsJapgolly.typeFest.typeFestStrings.ES2018DotIntl = "ES2018.Intl".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2018DotIntl]
      
      inline def ES2018DotPromise: typingsJapgolly.typeFest.typeFestStrings.ES2018DotPromise = "ES2018.Promise".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2018DotPromise]
      
      inline def ES2018DotRegexp: typingsJapgolly.typeFest.typeFestStrings.ES2018DotRegexp = "ES2018.Regexp".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2018DotRegexp]
      
      inline def ES2019: typingsJapgolly.typeFest.typeFestStrings.ES2019 = "ES2019".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2019]
      
      inline def ES2019DotArray: typingsJapgolly.typeFest.typeFestStrings.ES2019DotArray = "ES2019.Array".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2019DotArray]
      
      inline def ES2019DotObject: typingsJapgolly.typeFest.typeFestStrings.ES2019DotObject = "ES2019.Object".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2019DotObject]
      
      inline def ES2019DotString: typingsJapgolly.typeFest.typeFestStrings.ES2019DotString = "ES2019.String".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2019DotString]
      
      inline def ES2019DotSymbol: typingsJapgolly.typeFest.typeFestStrings.ES2019DotSymbol = "ES2019.Symbol".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2019DotSymbol]
      
      inline def ES2020: typingsJapgolly.typeFest.typeFestStrings.ES2020 = "ES2020".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2020]
      
      inline def ES2020DotBigInt: typingsJapgolly.typeFest.typeFestStrings.ES2020DotBigInt = "ES2020.BigInt".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2020DotBigInt]
      
      inline def ES2020DotIntl: typingsJapgolly.typeFest.typeFestStrings.ES2020DotIntl = "ES2020.Intl".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2020DotIntl]
      
      inline def ES2020DotPromise: typingsJapgolly.typeFest.typeFestStrings.ES2020DotPromise = "ES2020.Promise".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2020DotPromise]
      
      inline def ES2020DotSharedMemory: typingsJapgolly.typeFest.typeFestStrings.ES2020DotSharedMemory = "ES2020.SharedMemory".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2020DotSharedMemory]
      
      inline def ES2020DotString: typingsJapgolly.typeFest.typeFestStrings.ES2020DotString = "ES2020.String".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2020DotString]
      
      inline def ES2020DotSymbolDotWellKnown: typingsJapgolly.typeFest.typeFestStrings.ES2020DotSymbolDotWellKnown = "ES2020.Symbol.WellKnown".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2020DotSymbolDotWellKnown]
      
      inline def ES2021: typingsJapgolly.typeFest.typeFestStrings.ES2021 = "ES2021".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2021]
      
      inline def ES2021DotPromise: typingsJapgolly.typeFest.typeFestStrings.ES2021DotPromise = "ES2021.Promise".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2021DotPromise]
      
      inline def ES2021DotString: typingsJapgolly.typeFest.typeFestStrings.ES2021DotString = "ES2021.String".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2021DotString]
      
      inline def ES2021DotWeakRef: typingsJapgolly.typeFest.typeFestStrings.ES2021DotWeakRef = "ES2021.WeakRef".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2021DotWeakRef]
      
      inline def ES5: typingsJapgolly.typeFest.typeFestStrings.ES5 = "ES5".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES5]
      
      inline def ES6: typingsJapgolly.typeFest.typeFestStrings.ES6 = "ES6".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES6]
      
      inline def ES7: typingsJapgolly.typeFest.typeFestStrings.ES7 = "ES7".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES7]
      
      inline def ESNext: typingsJapgolly.typeFest.typeFestStrings.ESNext = "ESNext".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ESNext]
      
      inline def ESNextDotArray: typingsJapgolly.typeFest.typeFestStrings.ESNextDotArray = "ESNext.Array".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ESNextDotArray]
      
      inline def ESNextDotAsyncIterable: typingsJapgolly.typeFest.typeFestStrings.ESNextDotAsyncIterable = "ESNext.AsyncIterable".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ESNextDotAsyncIterable]
      
      inline def ESNextDotBigInt: typingsJapgolly.typeFest.typeFestStrings.ESNextDotBigInt = "ESNext.BigInt".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ESNextDotBigInt]
      
      inline def ESNextDotIntl: typingsJapgolly.typeFest.typeFestStrings.ESNextDotIntl = "ESNext.Intl".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ESNextDotIntl]
      
      inline def ESNextDotPromise: typingsJapgolly.typeFest.typeFestStrings.ESNextDotPromise = "ESNext.Promise".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ESNextDotPromise]
      
      inline def ESNextDotString: typingsJapgolly.typeFest.typeFestStrings.ESNextDotString = "ESNext.String".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ESNextDotString]
      
      inline def ESNextDotSymbol: typingsJapgolly.typeFest.typeFestStrings.ESNextDotSymbol = "ESNext.Symbol".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ESNextDotSymbol]
      
      inline def ESNextDotWeakRef: typingsJapgolly.typeFest.typeFestStrings.ESNextDotWeakRef = "ESNext.WeakRef".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ESNextDotWeakRef]
      
      inline def ScriptHost: typingsJapgolly.typeFest.typeFestStrings.ScriptHost = "ScriptHost".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ScriptHost]
      
      inline def WebWorker: typingsJapgolly.typeFest.typeFestStrings.WebWorker = "WebWorker".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.WebWorker]
      
      inline def WebWorkerDotImportScripts: typingsJapgolly.typeFest.typeFestStrings.WebWorkerDotImportScripts = "WebWorker.ImportScripts".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.WebWorkerDotImportScripts]
      
      inline def WebWorkerDotIterable: typingsJapgolly.typeFest.typeFestStrings.WebWorkerDotIterable = "WebWorker.Iterable".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.WebWorkerDotIterable]
      
      inline def dom: dom_ = "dom".asInstanceOf[dom_]
      
      inline def domDotiterable: typingsJapgolly.typeFest.typeFestStrings.domDotiterable = "dom.iterable".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.domDotiterable]
      
      inline def es2015: es2015_ = "es2015".asInstanceOf[es2015_]
      
      inline def es2015Dotcollection: typingsJapgolly.typeFest.typeFestStrings.es2015Dotcollection = "es2015.collection".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2015Dotcollection]
      
      inline def es2015Dotcore: typingsJapgolly.typeFest.typeFestStrings.es2015Dotcore = "es2015.core".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2015Dotcore]
      
      inline def es2015Dotgenerator: typingsJapgolly.typeFest.typeFestStrings.es2015Dotgenerator = "es2015.generator".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2015Dotgenerator]
      
      inline def es2015Dotiterable: typingsJapgolly.typeFest.typeFestStrings.es2015Dotiterable = "es2015.iterable".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2015Dotiterable]
      
      inline def es2015Dotpromise: typingsJapgolly.typeFest.typeFestStrings.es2015Dotpromise = "es2015.promise".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2015Dotpromise]
      
      inline def es2015Dotproxy: typingsJapgolly.typeFest.typeFestStrings.es2015Dotproxy = "es2015.proxy".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2015Dotproxy]
      
      inline def es2015Dotreflect: typingsJapgolly.typeFest.typeFestStrings.es2015Dotreflect = "es2015.reflect".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2015Dotreflect]
      
      inline def es2015Dotsymbol: typingsJapgolly.typeFest.typeFestStrings.es2015Dotsymbol = "es2015.symbol".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2015Dotsymbol]
      
      inline def es2015DotsymbolDotwellknown: typingsJapgolly.typeFest.typeFestStrings.es2015DotsymbolDotwellknown = "es2015.symbol.wellknown".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2015DotsymbolDotwellknown]
      
      inline def es2016: es2016_ = "es2016".asInstanceOf[es2016_]
      
      inline def es2016DotarrayDotinclude: typingsJapgolly.typeFest.typeFestStrings.es2016DotarrayDotinclude = "es2016.array.include".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2016DotarrayDotinclude]
      
      inline def es2017: es2017_ = "es2017".asInstanceOf[es2017_]
      
      inline def es2017Dotintl: typingsJapgolly.typeFest.typeFestStrings.es2017Dotintl = "es2017.intl".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2017Dotintl]
      
      inline def es2017Dotobject: typingsJapgolly.typeFest.typeFestStrings.es2017Dotobject = "es2017.object".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2017Dotobject]
      
      inline def es2017Dotsharedmemory: typingsJapgolly.typeFest.typeFestStrings.es2017Dotsharedmemory = "es2017.sharedmemory".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2017Dotsharedmemory]
      
      inline def es2017Dotstring: typingsJapgolly.typeFest.typeFestStrings.es2017Dotstring = "es2017.string".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2017Dotstring]
      
      inline def es2017Dottypedarrays: typingsJapgolly.typeFest.typeFestStrings.es2017Dottypedarrays = "es2017.typedarrays".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2017Dottypedarrays]
      
      inline def es2018: es2018_ = "es2018".asInstanceOf[es2018_]
      
      inline def es2018Dotasyncgenerator: typingsJapgolly.typeFest.typeFestStrings.es2018Dotasyncgenerator = "es2018.asyncgenerator".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2018Dotasyncgenerator]
      
      inline def es2018Dotasynciterable: typingsJapgolly.typeFest.typeFestStrings.es2018Dotasynciterable = "es2018.asynciterable".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2018Dotasynciterable]
      
      inline def es2018Dotintl: typingsJapgolly.typeFest.typeFestStrings.es2018Dotintl = "es2018.intl".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2018Dotintl]
      
      inline def es2018Dotpromise: typingsJapgolly.typeFest.typeFestStrings.es2018Dotpromise = "es2018.promise".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2018Dotpromise]
      
      inline def es2018Dotregexp: typingsJapgolly.typeFest.typeFestStrings.es2018Dotregexp = "es2018.regexp".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2018Dotregexp]
      
      inline def es2019: es2019_ = "es2019".asInstanceOf[es2019_]
      
      inline def es2019Dotarray: typingsJapgolly.typeFest.typeFestStrings.es2019Dotarray = "es2019.array".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2019Dotarray]
      
      inline def es2019Dotobject: typingsJapgolly.typeFest.typeFestStrings.es2019Dotobject = "es2019.object".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2019Dotobject]
      
      inline def es2019Dotstring: typingsJapgolly.typeFest.typeFestStrings.es2019Dotstring = "es2019.string".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2019Dotstring]
      
      inline def es2019Dotsymbol: typingsJapgolly.typeFest.typeFestStrings.es2019Dotsymbol = "es2019.symbol".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2019Dotsymbol]
      
      inline def es2020: es2020_ = "es2020".asInstanceOf[es2020_]
      
      inline def es2020Dotbigint: typingsJapgolly.typeFest.typeFestStrings.es2020Dotbigint = "es2020.bigint".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2020Dotbigint]
      
      inline def es2020Dotintl: typingsJapgolly.typeFest.typeFestStrings.es2020Dotintl = "es2020.intl".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2020Dotintl]
      
      inline def es2020Dotpromise: typingsJapgolly.typeFest.typeFestStrings.es2020Dotpromise = "es2020.promise".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2020Dotpromise]
      
      inline def es2020Dotsharedmemory: typingsJapgolly.typeFest.typeFestStrings.es2020Dotsharedmemory = "es2020.sharedmemory".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2020Dotsharedmemory]
      
      inline def es2020Dotstring: typingsJapgolly.typeFest.typeFestStrings.es2020Dotstring = "es2020.string".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2020Dotstring]
      
      inline def es2020DotsymbolDotwellknown: typingsJapgolly.typeFest.typeFestStrings.es2020DotsymbolDotwellknown = "es2020.symbol.wellknown".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2020DotsymbolDotwellknown]
      
      inline def es2021: es2021_ = "es2021".asInstanceOf[es2021_]
      
      inline def es2021Dotpromise: typingsJapgolly.typeFest.typeFestStrings.es2021Dotpromise = "es2021.promise".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2021Dotpromise]
      
      inline def es2021Dotstring: typingsJapgolly.typeFest.typeFestStrings.es2021Dotstring = "es2021.string".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2021Dotstring]
      
      inline def es2021Dotweakref: typingsJapgolly.typeFest.typeFestStrings.es2021Dotweakref = "es2021.weakref".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.es2021Dotweakref]
      
      inline def es5: es5_ = "es5".asInstanceOf[es5_]
      
      inline def es6: es6_ = "es6".asInstanceOf[es6_]
      
      inline def es7: es7_ = "es7".asInstanceOf[es7_]
      
      inline def esnext: esnext_ = "esnext".asInstanceOf[esnext_]
      
      inline def esnextDotarray: typingsJapgolly.typeFest.typeFestStrings.esnextDotarray = "esnext.array".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.esnextDotarray]
      
      inline def esnextDotasynciterable: typingsJapgolly.typeFest.typeFestStrings.esnextDotasynciterable = "esnext.asynciterable".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.esnextDotasynciterable]
      
      inline def esnextDotbigint: typingsJapgolly.typeFest.typeFestStrings.esnextDotbigint = "esnext.bigint".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.esnextDotbigint]
      
      inline def esnextDotintl: typingsJapgolly.typeFest.typeFestStrings.esnextDotintl = "esnext.intl".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.esnextDotintl]
      
      inline def esnextDotpromise: typingsJapgolly.typeFest.typeFestStrings.esnextDotpromise = "esnext.promise".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.esnextDotpromise]
      
      inline def esnextDotstring: typingsJapgolly.typeFest.typeFestStrings.esnextDotstring = "esnext.string".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.esnextDotstring]
      
      inline def esnextDotsymbol: typingsJapgolly.typeFest.typeFestStrings.esnextDotsymbol = "esnext.symbol".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.esnextDotsymbol]
      
      inline def esnextDotweakref: typingsJapgolly.typeFest.typeFestStrings.esnextDotweakref = "esnext.weakref".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.esnextDotweakref]
      
      inline def scripthost: scripthost_ = "scripthost".asInstanceOf[scripthost_]
      
      inline def webworker: webworker_ = "webworker".asInstanceOf[webworker_]
      
      inline def webworkerDotimportscripts: typingsJapgolly.typeFest.typeFestStrings.webworkerDotimportscripts = "webworker.importscripts".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.webworkerDotimportscripts]
      
      inline def webworkerDotiterable: typingsJapgolly.typeFest.typeFestStrings.webworkerDotiterable = "webworker.iterable".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.webworkerDotiterable]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.typeFest.typeFestStrings.CommonJS
      - typingsJapgolly.typeFest.typeFestStrings.AMD
      - typingsJapgolly.typeFest.typeFestStrings.System
      - typingsJapgolly.typeFest.typeFestStrings.UMD
      - typingsJapgolly.typeFest.typeFestStrings.ES6
      - typingsJapgolly.typeFest.typeFestStrings.ES2015
      - typingsJapgolly.typeFest.typeFestStrings.ES2020
      - typingsJapgolly.typeFest.typeFestStrings.ES2022
      - typingsJapgolly.typeFest.typeFestStrings.ESNext
      - typingsJapgolly.typeFest.typeFestStrings.Node16
      - typingsJapgolly.typeFest.typeFestStrings.NodeNext
      - typingsJapgolly.typeFest.typeFestStrings.None
      - typingsJapgolly.typeFest.typeFestStrings.commonjs_
      - typingsJapgolly.typeFest.typeFestStrings.amd_
      - typingsJapgolly.typeFest.typeFestStrings.system_
      - typingsJapgolly.typeFest.typeFestStrings.umd_
      - typingsJapgolly.typeFest.typeFestStrings.es6_
      - typingsJapgolly.typeFest.typeFestStrings.es2015_
      - typingsJapgolly.typeFest.typeFestStrings.es2020_
      - typingsJapgolly.typeFest.typeFestStrings.es2022_
      - typingsJapgolly.typeFest.typeFestStrings.esnext_
      - typingsJapgolly.typeFest.typeFestStrings.node16_
      - typingsJapgolly.typeFest.typeFestStrings.nodenext_
      - typingsJapgolly.typeFest.typeFestStrings.none_
    */
    trait Module extends StObject
    object Module {
      
      inline def AMD: typingsJapgolly.typeFest.typeFestStrings.AMD = "AMD".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.AMD]
      
      inline def CommonJS: typingsJapgolly.typeFest.typeFestStrings.CommonJS = "CommonJS".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.CommonJS]
      
      inline def ES2015: typingsJapgolly.typeFest.typeFestStrings.ES2015 = "ES2015".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2015]
      
      inline def ES2020: typingsJapgolly.typeFest.typeFestStrings.ES2020 = "ES2020".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2020]
      
      inline def ES2022: typingsJapgolly.typeFest.typeFestStrings.ES2022 = "ES2022".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2022]
      
      inline def ES6: typingsJapgolly.typeFest.typeFestStrings.ES6 = "ES6".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES6]
      
      inline def ESNext: typingsJapgolly.typeFest.typeFestStrings.ESNext = "ESNext".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ESNext]
      
      inline def Node16: typingsJapgolly.typeFest.typeFestStrings.Node16 = "Node16".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.Node16]
      
      inline def NodeNext: typingsJapgolly.typeFest.typeFestStrings.NodeNext = "NodeNext".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.NodeNext]
      
      inline def None: typingsJapgolly.typeFest.typeFestStrings.None = "None".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.None]
      
      inline def System: typingsJapgolly.typeFest.typeFestStrings.System = "System".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.System]
      
      inline def UMD: typingsJapgolly.typeFest.typeFestStrings.UMD = "UMD".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.UMD]
      
      inline def amd: amd_ = "amd".asInstanceOf[amd_]
      
      inline def commonjs: commonjs_ = "commonjs".asInstanceOf[commonjs_]
      
      inline def es2015: es2015_ = "es2015".asInstanceOf[es2015_]
      
      inline def es2020: es2020_ = "es2020".asInstanceOf[es2020_]
      
      inline def es2022: es2022_ = "es2022".asInstanceOf[es2022_]
      
      inline def es6: es6_ = "es6".asInstanceOf[es6_]
      
      inline def esnext: esnext_ = "esnext".asInstanceOf[esnext_]
      
      inline def node16: node16_ = "node16".asInstanceOf[node16_]
      
      inline def nodenext: nodenext_ = "nodenext".asInstanceOf[nodenext_]
      
      inline def none: none_ = "none".asInstanceOf[none_]
      
      inline def system: system_ = "system".asInstanceOf[system_]
      
      inline def umd: umd_ = "umd".asInstanceOf[umd_]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.typeFest.typeFestStrings.CRLF
      - typingsJapgolly.typeFest.typeFestStrings.LF
      - typingsJapgolly.typeFest.typeFestStrings.crlf_
      - typingsJapgolly.typeFest.typeFestStrings.lf_
    */
    trait NewLine extends StObject
    object NewLine {
      
      inline def CRLF: typingsJapgolly.typeFest.typeFestStrings.CRLF = "CRLF".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.CRLF]
      
      inline def LF: typingsJapgolly.typeFest.typeFestStrings.LF = "LF".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.LF]
      
      inline def crlf: crlf_ = "crlf".asInstanceOf[crlf_]
      
      inline def lf: lf_ = "lf".asInstanceOf[lf_]
    }
    
    trait Plugin
      extends StObject
         with /* key */ StringDictionary[Any] {
      
      /**
      			Plugin name.
      			*/
      var name: js.UndefOr[String] = js.undefined
    }
    object Plugin {
      
      inline def apply(): Plugin = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Plugin]
      }
      
      extension [Self <: Plugin](x: Self) {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.typeFest.typeFestStrings.ES3
      - typingsJapgolly.typeFest.typeFestStrings.ES5
      - typingsJapgolly.typeFest.typeFestStrings.ES6
      - typingsJapgolly.typeFest.typeFestStrings.ES2015
      - typingsJapgolly.typeFest.typeFestStrings.ES2016
      - typingsJapgolly.typeFest.typeFestStrings.ES2017
      - typingsJapgolly.typeFest.typeFestStrings.ES2018
      - typingsJapgolly.typeFest.typeFestStrings.ES2019
      - typingsJapgolly.typeFest.typeFestStrings.ES2020
      - typingsJapgolly.typeFest.typeFestStrings.ES2021
      - typingsJapgolly.typeFest.typeFestStrings.ESNext
      - typingsJapgolly.typeFest.typeFestStrings.es3_
      - typingsJapgolly.typeFest.typeFestStrings.es5_
      - typingsJapgolly.typeFest.typeFestStrings.es6_
      - typingsJapgolly.typeFest.typeFestStrings.es2015_
      - typingsJapgolly.typeFest.typeFestStrings.es2016_
      - typingsJapgolly.typeFest.typeFestStrings.es2017_
      - typingsJapgolly.typeFest.typeFestStrings.es2018_
      - typingsJapgolly.typeFest.typeFestStrings.es2019_
      - typingsJapgolly.typeFest.typeFestStrings.es2020_
      - typingsJapgolly.typeFest.typeFestStrings.es2021_
      - typingsJapgolly.typeFest.typeFestStrings.esnext_
    */
    trait Target extends StObject
    object Target {
      
      inline def ES2015: typingsJapgolly.typeFest.typeFestStrings.ES2015 = "ES2015".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2015]
      
      inline def ES2016: typingsJapgolly.typeFest.typeFestStrings.ES2016 = "ES2016".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2016]
      
      inline def ES2017: typingsJapgolly.typeFest.typeFestStrings.ES2017 = "ES2017".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2017]
      
      inline def ES2018: typingsJapgolly.typeFest.typeFestStrings.ES2018 = "ES2018".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2018]
      
      inline def ES2019: typingsJapgolly.typeFest.typeFestStrings.ES2019 = "ES2019".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2019]
      
      inline def ES2020: typingsJapgolly.typeFest.typeFestStrings.ES2020 = "ES2020".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2020]
      
      inline def ES2021: typingsJapgolly.typeFest.typeFestStrings.ES2021 = "ES2021".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES2021]
      
      inline def ES3: typingsJapgolly.typeFest.typeFestStrings.ES3 = "ES3".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES3]
      
      inline def ES5: typingsJapgolly.typeFest.typeFestStrings.ES5 = "ES5".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES5]
      
      inline def ES6: typingsJapgolly.typeFest.typeFestStrings.ES6 = "ES6".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ES6]
      
      inline def ESNext: typingsJapgolly.typeFest.typeFestStrings.ESNext = "ESNext".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.ESNext]
      
      inline def es2015: es2015_ = "es2015".asInstanceOf[es2015_]
      
      inline def es2016: es2016_ = "es2016".asInstanceOf[es2016_]
      
      inline def es2017: es2017_ = "es2017".asInstanceOf[es2017_]
      
      inline def es2018: es2018_ = "es2018".asInstanceOf[es2018_]
      
      inline def es2019: es2019_ = "es2019".asInstanceOf[es2019_]
      
      inline def es2020: es2020_ = "es2020".asInstanceOf[es2020_]
      
      inline def es2021: es2021_ = "es2021".asInstanceOf[es2021_]
      
      inline def es3: es3_ = "es3".asInstanceOf[es3_]
      
      inline def es5: es5_ = "es5".asInstanceOf[es5_]
      
      inline def es6: es6_ = "es6".asInstanceOf[es6_]
      
      inline def esnext: esnext_ = "esnext".asInstanceOf[esnext_]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.typeFest.typeFestStrings.useFsEvents_
      - typingsJapgolly.typeFest.typeFestStrings.fixedPollingInterval_
      - typingsJapgolly.typeFest.typeFestStrings.dynamicPriorityPolling_
      - typingsJapgolly.typeFest.typeFestStrings.fixedChunkSizePolling_
    */
    trait WatchDirectory extends StObject
    object WatchDirectory {
      
      inline def dynamicPriorityPolling: dynamicPriorityPolling_ = "dynamicPriorityPolling".asInstanceOf[dynamicPriorityPolling_]
      
      inline def fixedChunkSizePolling: fixedChunkSizePolling_ = "fixedChunkSizePolling".asInstanceOf[fixedChunkSizePolling_]
      
      inline def fixedPollingInterval: fixedPollingInterval_ = "fixedPollingInterval".asInstanceOf[fixedPollingInterval_]
      
      inline def useFsEvents: useFsEvents_ = "useFsEvents".asInstanceOf[useFsEvents_]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.typeFest.typeFestStrings.fixedPollingInterval_
      - typingsJapgolly.typeFest.typeFestStrings.priorityPollingInterval_
      - typingsJapgolly.typeFest.typeFestStrings.dynamicPriorityPolling_
      - typingsJapgolly.typeFest.typeFestStrings.useFsEvents_
      - typingsJapgolly.typeFest.typeFestStrings.useFsEventsOnParentDirectory_
      - typingsJapgolly.typeFest.typeFestStrings.fixedChunkSizePolling_
    */
    trait WatchFile extends StObject
    object WatchFile {
      
      inline def dynamicPriorityPolling: dynamicPriorityPolling_ = "dynamicPriorityPolling".asInstanceOf[dynamicPriorityPolling_]
      
      inline def fixedChunkSizePolling: fixedChunkSizePolling_ = "fixedChunkSizePolling".asInstanceOf[fixedChunkSizePolling_]
      
      inline def fixedPollingInterval: fixedPollingInterval_ = "fixedPollingInterval".asInstanceOf[fixedPollingInterval_]
      
      inline def priorityPollingInterval: priorityPollingInterval_ = "priorityPollingInterval".asInstanceOf[priorityPollingInterval_]
      
      inline def useFsEvents: useFsEvents_ = "useFsEvents".asInstanceOf[useFsEvents_]
      
      inline def useFsEventsOnParentDirectory: useFsEventsOnParentDirectory_ = "useFsEventsOnParentDirectory".asInstanceOf[useFsEventsOnParentDirectory_]
    }
  }
  
  trait References extends StObject {
    
    /**
    		True if it is intended that this reference form a circularity.
    		*/
    var circular: js.UndefOr[Boolean] = js.undefined
    
    /**
    		The path as the user originally wrote it.
    		*/
    var originalPath: js.UndefOr[String] = js.undefined
    
    /**
    		A normalized path on disk.
    		*/
    var path: String
    
    /**
    		True if the output of this reference should be prepended to the output of this project.
    		Only valid for `--outFile` compilations.
    		*/
    var prepend: js.UndefOr[Boolean] = js.undefined
  }
  object References {
    
    inline def apply(path: String): References = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[References]
    }
    
    extension [Self <: References](x: Self) {
      
      inline def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      inline def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
      inline def setOriginalPath(value: String): Self = StObject.set(x, "originalPath", value.asInstanceOf[js.Any])
      
      inline def setOriginalPathUndefined: Self = StObject.set(x, "originalPath", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPrepend(value: Boolean): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
    }
  }
  
  extension [Self <: TsConfigJson](x: Self) {
    
    inline def setCompileOnSave(value: Boolean): Self = StObject.set(x, "compileOnSave", value.asInstanceOf[js.Any])
    
    inline def setCompileOnSaveUndefined: Self = StObject.set(x, "compileOnSave", js.undefined)
    
    inline def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setReferences(value: js.Array[References]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
    
    inline def setReferencesVarargs(value: References*): Self = StObject.set(x, "references", js.Array(value*))
    
    inline def setTypeAcquisition(value: TypeAcquisition): Self = StObject.set(x, "typeAcquisition", value.asInstanceOf[js.Any])
    
    inline def setTypeAcquisitionUndefined: Self = StObject.set(x, "typeAcquisition", js.undefined)
    
    inline def setWatchOptions(value: WatchOptions): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
    
    inline def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
  }
  
  trait TypeAcquisition extends StObject {
    
    /**
    		Enable auto type acquisition.
    		*/
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specifies a list of type declarations to be excluded from auto type acquisition. For example, `['jquery', 'lodash']`.
    		*/
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    		Specifies a list of type declarations to be included in auto type acquisition. For example, `['jquery', 'lodash']`.
    		*/
    var include: js.UndefOr[js.Array[String]] = js.undefined
  }
  object TypeAcquisition {
    
    inline def apply(): TypeAcquisition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeAcquisition]
    }
    
    extension [Self <: TypeAcquisition](x: Self) {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
    }
  }
  
  trait WatchOptions extends StObject {
    
    /**
    		Specifies a list of directories to exclude from watch
    		*/
    var excludeDirectories: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    		Specifies a list of files to exclude from watch
    		*/
    var excludeFiles: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    		Specify the polling strategy to use when the system runs out of or doesn't support native file watchers.
    		Requires TypeScript version 3.8 or later.
    		*/
    var fallbackPolling: js.UndefOr[PollingWatchKind | Lowercase[PollingWatchKind]] = js.undefined
    
    /**
    		Enable synchronous updates on directory watchers for platforms that don't support recursive watching natively.
    		*/
    var synchronousWatchDirectory: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Specify the strategy for watching directories under systems that lack recursive file-watching functionality.
    		Requires TypeScript version 3.8 or later.
    		@default 'UseFsEvents'
    		*/
    var watchDirectory: js.UndefOr[WatchDirectoryKind | Lowercase[WatchDirectoryKind]] = js.undefined
    
    /**
    		Specify the strategy for watching individual files.
    		Requires TypeScript version 3.8 or later.
    		@default 'UseFsEvents'
    		*/
    var watchFile: js.UndefOr[WatchFileKind | Lowercase[WatchFileKind]] = js.undefined
  }
  object WatchOptions {
    
    inline def apply(): WatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatchOptions]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.typeFest.typeFestStrings.FixedInterval
      - typingsJapgolly.typeFest.typeFestStrings.PriorityInterval
      - typingsJapgolly.typeFest.typeFestStrings.DynamicPriority
      - typingsJapgolly.typeFest.typeFestStrings.FixedChunkSize
    */
    trait PollingWatchKind extends StObject
    object PollingWatchKind {
      
      inline def DynamicPriority: typingsJapgolly.typeFest.typeFestStrings.DynamicPriority = "DynamicPriority".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.DynamicPriority]
      
      inline def FixedChunkSize: typingsJapgolly.typeFest.typeFestStrings.FixedChunkSize = "FixedChunkSize".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.FixedChunkSize]
      
      inline def FixedInterval: typingsJapgolly.typeFest.typeFestStrings.FixedInterval = "FixedInterval".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.FixedInterval]
      
      inline def PriorityInterval: typingsJapgolly.typeFest.typeFestStrings.PriorityInterval = "PriorityInterval".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.PriorityInterval]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.typeFest.typeFestStrings.UseFsEvents
      - typingsJapgolly.typeFest.typeFestStrings.FixedPollingInterval
      - typingsJapgolly.typeFest.typeFestStrings.DynamicPriorityPolling
      - typingsJapgolly.typeFest.typeFestStrings.FixedChunkSizePolling
    */
    trait WatchDirectoryKind extends StObject
    object WatchDirectoryKind {
      
      inline def DynamicPriorityPolling: typingsJapgolly.typeFest.typeFestStrings.DynamicPriorityPolling = "DynamicPriorityPolling".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.DynamicPriorityPolling]
      
      inline def FixedChunkSizePolling: typingsJapgolly.typeFest.typeFestStrings.FixedChunkSizePolling = "FixedChunkSizePolling".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.FixedChunkSizePolling]
      
      inline def FixedPollingInterval: typingsJapgolly.typeFest.typeFestStrings.FixedPollingInterval = "FixedPollingInterval".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.FixedPollingInterval]
      
      inline def UseFsEvents: typingsJapgolly.typeFest.typeFestStrings.UseFsEvents = "UseFsEvents".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.UseFsEvents]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.typeFest.typeFestStrings.FixedPollingInterval
      - typingsJapgolly.typeFest.typeFestStrings.PriorityPollingInterval
      - typingsJapgolly.typeFest.typeFestStrings.DynamicPriorityPolling
      - typingsJapgolly.typeFest.typeFestStrings.FixedChunkSizePolling
      - typingsJapgolly.typeFest.typeFestStrings.UseFsEvents
      - typingsJapgolly.typeFest.typeFestStrings.UseFsEventsOnParentDirectory
    */
    trait WatchFileKind extends StObject
    object WatchFileKind {
      
      inline def DynamicPriorityPolling: typingsJapgolly.typeFest.typeFestStrings.DynamicPriorityPolling = "DynamicPriorityPolling".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.DynamicPriorityPolling]
      
      inline def FixedChunkSizePolling: typingsJapgolly.typeFest.typeFestStrings.FixedChunkSizePolling = "FixedChunkSizePolling".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.FixedChunkSizePolling]
      
      inline def FixedPollingInterval: typingsJapgolly.typeFest.typeFestStrings.FixedPollingInterval = "FixedPollingInterval".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.FixedPollingInterval]
      
      inline def PriorityPollingInterval: typingsJapgolly.typeFest.typeFestStrings.PriorityPollingInterval = "PriorityPollingInterval".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.PriorityPollingInterval]
      
      inline def UseFsEvents: typingsJapgolly.typeFest.typeFestStrings.UseFsEvents = "UseFsEvents".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.UseFsEvents]
      
      inline def UseFsEventsOnParentDirectory: typingsJapgolly.typeFest.typeFestStrings.UseFsEventsOnParentDirectory = "UseFsEventsOnParentDirectory".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.UseFsEventsOnParentDirectory]
    }
    
    extension [Self <: WatchOptions](x: Self) {
      
      inline def setExcludeDirectories(value: js.Array[String]): Self = StObject.set(x, "excludeDirectories", value.asInstanceOf[js.Any])
      
      inline def setExcludeDirectoriesUndefined: Self = StObject.set(x, "excludeDirectories", js.undefined)
      
      inline def setExcludeDirectoriesVarargs(value: String*): Self = StObject.set(x, "excludeDirectories", js.Array(value*))
      
      inline def setExcludeFiles(value: js.Array[String]): Self = StObject.set(x, "excludeFiles", value.asInstanceOf[js.Any])
      
      inline def setExcludeFilesUndefined: Self = StObject.set(x, "excludeFiles", js.undefined)
      
      inline def setExcludeFilesVarargs(value: String*): Self = StObject.set(x, "excludeFiles", js.Array(value*))
      
      inline def setFallbackPolling(value: PollingWatchKind | Lowercase[PollingWatchKind]): Self = StObject.set(x, "fallbackPolling", value.asInstanceOf[js.Any])
      
      inline def setFallbackPollingUndefined: Self = StObject.set(x, "fallbackPolling", js.undefined)
      
      inline def setSynchronousWatchDirectory(value: Boolean): Self = StObject.set(x, "synchronousWatchDirectory", value.asInstanceOf[js.Any])
      
      inline def setSynchronousWatchDirectoryUndefined: Self = StObject.set(x, "synchronousWatchDirectory", js.undefined)
      
      inline def setWatchDirectory(value: WatchDirectoryKind | Lowercase[WatchDirectoryKind]): Self = StObject.set(x, "watchDirectory", value.asInstanceOf[js.Any])
      
      inline def setWatchDirectoryUndefined: Self = StObject.set(x, "watchDirectory", js.undefined)
      
      inline def setWatchFile(value: WatchFileKind | Lowercase[WatchFileKind]): Self = StObject.set(x, "watchFile", value.asInstanceOf[js.Any])
      
      inline def setWatchFileUndefined: Self = StObject.set(x, "watchFile", js.undefined)
    }
  }
}
