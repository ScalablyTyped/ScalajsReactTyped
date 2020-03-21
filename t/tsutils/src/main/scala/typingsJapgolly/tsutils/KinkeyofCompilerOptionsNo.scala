package typingsJapgolly.tsutils

import typingsJapgolly.tsutils.tsutilsStrings.allowJs
import typingsJapgolly.tsutils.tsutilsStrings.allowSyntheticDefaultImports
import typingsJapgolly.tsutils.tsutilsStrings.allowUmdGlobalAccess
import typingsJapgolly.tsutils.tsutilsStrings.allowUnreachableCode
import typingsJapgolly.tsutils.tsutilsStrings.allowUnusedLabels
import typingsJapgolly.tsutils.tsutilsStrings.alwaysStrict
import typingsJapgolly.tsutils.tsutilsStrings.assumeChangesOnlyAffectDirectDependencies
import typingsJapgolly.tsutils.tsutilsStrings.baseUrl
import typingsJapgolly.tsutils.tsutilsStrings.charset
import typingsJapgolly.tsutils.tsutilsStrings.checkJs
import typingsJapgolly.tsutils.tsutilsStrings.composite
import typingsJapgolly.tsutils.tsutilsStrings.declaration
import typingsJapgolly.tsutils.tsutilsStrings.declarationDir
import typingsJapgolly.tsutils.tsutilsStrings.declarationMap
import typingsJapgolly.tsutils.tsutilsStrings.disableSizeLimit
import typingsJapgolly.tsutils.tsutilsStrings.disableSolutionSearching
import typingsJapgolly.tsutils.tsutilsStrings.disableSourceOfProjectReferenceRedirect
import typingsJapgolly.tsutils.tsutilsStrings.downlevelIteration
import typingsJapgolly.tsutils.tsutilsStrings.emitBOM
import typingsJapgolly.tsutils.tsutilsStrings.emitDeclarationOnly
import typingsJapgolly.tsutils.tsutilsStrings.emitDecoratorMetadata
import typingsJapgolly.tsutils.tsutilsStrings.esModuleInterop
import typingsJapgolly.tsutils.tsutilsStrings.experimentalDecorators
import typingsJapgolly.tsutils.tsutilsStrings.forceConsistentCasingInFileNames
import typingsJapgolly.tsutils.tsutilsStrings.importHelpers
import typingsJapgolly.tsutils.tsutilsStrings.importsNotUsedAsValues
import typingsJapgolly.tsutils.tsutilsStrings.incremental
import typingsJapgolly.tsutils.tsutilsStrings.inlineSourceMap
import typingsJapgolly.tsutils.tsutilsStrings.inlineSources
import typingsJapgolly.tsutils.tsutilsStrings.isolatedModules
import typingsJapgolly.tsutils.tsutilsStrings.jsx
import typingsJapgolly.tsutils.tsutilsStrings.jsxFactory
import typingsJapgolly.tsutils.tsutilsStrings.keyofStringsOnly
import typingsJapgolly.tsutils.tsutilsStrings.lib
import typingsJapgolly.tsutils.tsutilsStrings.locale
import typingsJapgolly.tsutils.tsutilsStrings.mapRoot
import typingsJapgolly.tsutils.tsutilsStrings.maxNodeModuleJsDepth
import typingsJapgolly.tsutils.tsutilsStrings.module
import typingsJapgolly.tsutils.tsutilsStrings.moduleResolution
import typingsJapgolly.tsutils.tsutilsStrings.newLine
import typingsJapgolly.tsutils.tsutilsStrings.noEmit
import typingsJapgolly.tsutils.tsutilsStrings.noEmitHelpers
import typingsJapgolly.tsutils.tsutilsStrings.noEmitOnError
import typingsJapgolly.tsutils.tsutilsStrings.noErrorTruncation
import typingsJapgolly.tsutils.tsutilsStrings.noFallthroughCasesInSwitch
import typingsJapgolly.tsutils.tsutilsStrings.noImplicitAny
import typingsJapgolly.tsutils.tsutilsStrings.noImplicitReturns
import typingsJapgolly.tsutils.tsutilsStrings.noImplicitThis
import typingsJapgolly.tsutils.tsutilsStrings.noImplicitUseStrict
import typingsJapgolly.tsutils.tsutilsStrings.noLib
import typingsJapgolly.tsutils.tsutilsStrings.noResolve
import typingsJapgolly.tsutils.tsutilsStrings.noStrictGenericChecks
import typingsJapgolly.tsutils.tsutilsStrings.noUnusedLocals
import typingsJapgolly.tsutils.tsutilsStrings.noUnusedParameters
import typingsJapgolly.tsutils.tsutilsStrings.out
import typingsJapgolly.tsutils.tsutilsStrings.outDir
import typingsJapgolly.tsutils.tsutilsStrings.outFile
import typingsJapgolly.tsutils.tsutilsStrings.paths
import typingsJapgolly.tsutils.tsutilsStrings.preserveConstEnums
import typingsJapgolly.tsutils.tsutilsStrings.preserveSymlinks
import typingsJapgolly.tsutils.tsutilsStrings.project
import typingsJapgolly.tsutils.tsutilsStrings.reactNamespace
import typingsJapgolly.tsutils.tsutilsStrings.removeComments
import typingsJapgolly.tsutils.tsutilsStrings.resolveJsonModule
import typingsJapgolly.tsutils.tsutilsStrings.rootDir
import typingsJapgolly.tsutils.tsutilsStrings.rootDirs
import typingsJapgolly.tsutils.tsutilsStrings.skipDefaultLibCheck
import typingsJapgolly.tsutils.tsutilsStrings.skipLibCheck
import typingsJapgolly.tsutils.tsutilsStrings.sourceMap
import typingsJapgolly.tsutils.tsutilsStrings.sourceRoot
import typingsJapgolly.tsutils.tsutilsStrings.strict
import typingsJapgolly.tsutils.tsutilsStrings.strictBindCallApply
import typingsJapgolly.tsutils.tsutilsStrings.strictFunctionTypes
import typingsJapgolly.tsutils.tsutilsStrings.strictNullChecks
import typingsJapgolly.tsutils.tsutilsStrings.strictPropertyInitialization
import typingsJapgolly.tsutils.tsutilsStrings.stripInternal
import typingsJapgolly.tsutils.tsutilsStrings.suppressExcessPropertyErrors
import typingsJapgolly.tsutils.tsutilsStrings.suppressImplicitAnyIndexErrors
import typingsJapgolly.tsutils.tsutilsStrings.target
import typingsJapgolly.tsutils.tsutilsStrings.traceResolution
import typingsJapgolly.tsutils.tsutilsStrings.tsBuildInfoFile
import typingsJapgolly.tsutils.tsutilsStrings.typeRoots
import typingsJapgolly.tsutils.tsutilsStrings.types
import typingsJapgolly.tsutils.tsutilsStrings.useDefineForClassFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof typescript.typescript.CompilerOptions ]: std.NonNullable<typescript.typescript.CompilerOptions[K]> extends boolean? K : never} */
trait KinkeyofCompilerOptionsNo extends js.Object {
  var allowJs: typingsJapgolly.tsutils.tsutilsStrings.allowJs
  var allowSyntheticDefaultImports: typingsJapgolly.tsutils.tsutilsStrings.allowSyntheticDefaultImports
  var allowUmdGlobalAccess: typingsJapgolly.tsutils.tsutilsStrings.allowUmdGlobalAccess
  var allowUnreachableCode: typingsJapgolly.tsutils.tsutilsStrings.allowUnreachableCode
  var allowUnusedLabels: typingsJapgolly.tsutils.tsutilsStrings.allowUnusedLabels
  var alwaysStrict: typingsJapgolly.tsutils.tsutilsStrings.alwaysStrict
  var assumeChangesOnlyAffectDirectDependencies: typingsJapgolly.tsutils.tsutilsStrings.assumeChangesOnlyAffectDirectDependencies
  var baseUrl: typingsJapgolly.tsutils.tsutilsStrings.baseUrl
  var charset: typingsJapgolly.tsutils.tsutilsStrings.charset
  var checkJs: typingsJapgolly.tsutils.tsutilsStrings.checkJs
  var composite: typingsJapgolly.tsutils.tsutilsStrings.composite
  var declaration: typingsJapgolly.tsutils.tsutilsStrings.declaration
  var declarationDir: typingsJapgolly.tsutils.tsutilsStrings.declarationDir
  var declarationMap: typingsJapgolly.tsutils.tsutilsStrings.declarationMap
  var disableSizeLimit: typingsJapgolly.tsutils.tsutilsStrings.disableSizeLimit
  var disableSolutionSearching: typingsJapgolly.tsutils.tsutilsStrings.disableSolutionSearching
  var disableSourceOfProjectReferenceRedirect: typingsJapgolly.tsutils.tsutilsStrings.disableSourceOfProjectReferenceRedirect
  var downlevelIteration: typingsJapgolly.tsutils.tsutilsStrings.downlevelIteration
  var emitBOM: typingsJapgolly.tsutils.tsutilsStrings.emitBOM
  var emitDeclarationOnly: typingsJapgolly.tsutils.tsutilsStrings.emitDeclarationOnly
  var emitDecoratorMetadata: typingsJapgolly.tsutils.tsutilsStrings.emitDecoratorMetadata
  var esModuleInterop: typingsJapgolly.tsutils.tsutilsStrings.esModuleInterop
  var experimentalDecorators: typingsJapgolly.tsutils.tsutilsStrings.experimentalDecorators
  var forceConsistentCasingInFileNames: typingsJapgolly.tsutils.tsutilsStrings.forceConsistentCasingInFileNames
  var importHelpers: typingsJapgolly.tsutils.tsutilsStrings.importHelpers
  var importsNotUsedAsValues: typingsJapgolly.tsutils.tsutilsStrings.importsNotUsedAsValues
  var incremental: typingsJapgolly.tsutils.tsutilsStrings.incremental
  var inlineSourceMap: typingsJapgolly.tsutils.tsutilsStrings.inlineSourceMap
  var inlineSources: typingsJapgolly.tsutils.tsutilsStrings.inlineSources
  var isolatedModules: typingsJapgolly.tsutils.tsutilsStrings.isolatedModules
  var jsx: typingsJapgolly.tsutils.tsutilsStrings.jsx
  var jsxFactory: typingsJapgolly.tsutils.tsutilsStrings.jsxFactory
  var keyofStringsOnly: typingsJapgolly.tsutils.tsutilsStrings.keyofStringsOnly
  var lib: typingsJapgolly.tsutils.tsutilsStrings.lib
  var locale: typingsJapgolly.tsutils.tsutilsStrings.locale
  var mapRoot: typingsJapgolly.tsutils.tsutilsStrings.mapRoot
  var maxNodeModuleJsDepth: typingsJapgolly.tsutils.tsutilsStrings.maxNodeModuleJsDepth
  var module: typingsJapgolly.tsutils.tsutilsStrings.module
  var moduleResolution: typingsJapgolly.tsutils.tsutilsStrings.moduleResolution
  var newLine: typingsJapgolly.tsutils.tsutilsStrings.newLine
  var noEmit: typingsJapgolly.tsutils.tsutilsStrings.noEmit
  var noEmitHelpers: typingsJapgolly.tsutils.tsutilsStrings.noEmitHelpers
  var noEmitOnError: typingsJapgolly.tsutils.tsutilsStrings.noEmitOnError
  var noErrorTruncation: typingsJapgolly.tsutils.tsutilsStrings.noErrorTruncation
  var noFallthroughCasesInSwitch: typingsJapgolly.tsutils.tsutilsStrings.noFallthroughCasesInSwitch
  var noImplicitAny: typingsJapgolly.tsutils.tsutilsStrings.noImplicitAny
  var noImplicitReturns: typingsJapgolly.tsutils.tsutilsStrings.noImplicitReturns
  var noImplicitThis: typingsJapgolly.tsutils.tsutilsStrings.noImplicitThis
  var noImplicitUseStrict: typingsJapgolly.tsutils.tsutilsStrings.noImplicitUseStrict
  var noLib: typingsJapgolly.tsutils.tsutilsStrings.noLib
  var noResolve: typingsJapgolly.tsutils.tsutilsStrings.noResolve
  var noStrictGenericChecks: typingsJapgolly.tsutils.tsutilsStrings.noStrictGenericChecks
  var noUnusedLocals: typingsJapgolly.tsutils.tsutilsStrings.noUnusedLocals
  var noUnusedParameters: typingsJapgolly.tsutils.tsutilsStrings.noUnusedParameters
  var out: typingsJapgolly.tsutils.tsutilsStrings.out
  var outDir: typingsJapgolly.tsutils.tsutilsStrings.outDir
  var outFile: typingsJapgolly.tsutils.tsutilsStrings.outFile
  var paths: typingsJapgolly.tsutils.tsutilsStrings.paths
  var preserveConstEnums: typingsJapgolly.tsutils.tsutilsStrings.preserveConstEnums
  var preserveSymlinks: typingsJapgolly.tsutils.tsutilsStrings.preserveSymlinks
  var project: typingsJapgolly.tsutils.tsutilsStrings.project
  var reactNamespace: typingsJapgolly.tsutils.tsutilsStrings.reactNamespace
  var removeComments: typingsJapgolly.tsutils.tsutilsStrings.removeComments
  var resolveJsonModule: typingsJapgolly.tsutils.tsutilsStrings.resolveJsonModule
  var rootDir: typingsJapgolly.tsutils.tsutilsStrings.rootDir
  var rootDirs: typingsJapgolly.tsutils.tsutilsStrings.rootDirs
  var skipDefaultLibCheck: typingsJapgolly.tsutils.tsutilsStrings.skipDefaultLibCheck
  var skipLibCheck: typingsJapgolly.tsutils.tsutilsStrings.skipLibCheck
  var sourceMap: typingsJapgolly.tsutils.tsutilsStrings.sourceMap
  var sourceRoot: typingsJapgolly.tsutils.tsutilsStrings.sourceRoot
  var strict: typingsJapgolly.tsutils.tsutilsStrings.strict
  var strictBindCallApply: typingsJapgolly.tsutils.tsutilsStrings.strictBindCallApply
  var strictFunctionTypes: typingsJapgolly.tsutils.tsutilsStrings.strictFunctionTypes
  var strictNullChecks: typingsJapgolly.tsutils.tsutilsStrings.strictNullChecks
  var strictPropertyInitialization: typingsJapgolly.tsutils.tsutilsStrings.strictPropertyInitialization
  var stripInternal: typingsJapgolly.tsutils.tsutilsStrings.stripInternal
  var suppressExcessPropertyErrors: typingsJapgolly.tsutils.tsutilsStrings.suppressExcessPropertyErrors
  var suppressImplicitAnyIndexErrors: typingsJapgolly.tsutils.tsutilsStrings.suppressImplicitAnyIndexErrors
  var target: typingsJapgolly.tsutils.tsutilsStrings.target
  var traceResolution: typingsJapgolly.tsutils.tsutilsStrings.traceResolution
  var tsBuildInfoFile: typingsJapgolly.tsutils.tsutilsStrings.tsBuildInfoFile
  var typeRoots: typingsJapgolly.tsutils.tsutilsStrings.typeRoots
  var types: typingsJapgolly.tsutils.tsutilsStrings.types
  var useDefineForClassFields: typingsJapgolly.tsutils.tsutilsStrings.useDefineForClassFields
}

object KinkeyofCompilerOptionsNo {
  @scala.inline
  def apply(
    allowJs: allowJs,
    allowSyntheticDefaultImports: allowSyntheticDefaultImports,
    allowUmdGlobalAccess: allowUmdGlobalAccess,
    allowUnreachableCode: allowUnreachableCode,
    allowUnusedLabels: allowUnusedLabels,
    alwaysStrict: alwaysStrict,
    assumeChangesOnlyAffectDirectDependencies: assumeChangesOnlyAffectDirectDependencies,
    baseUrl: baseUrl,
    charset: charset,
    checkJs: checkJs,
    composite: composite,
    declaration: declaration,
    declarationDir: declarationDir,
    declarationMap: declarationMap,
    disableSizeLimit: disableSizeLimit,
    disableSolutionSearching: disableSolutionSearching,
    disableSourceOfProjectReferenceRedirect: disableSourceOfProjectReferenceRedirect,
    downlevelIteration: downlevelIteration,
    emitBOM: emitBOM,
    emitDeclarationOnly: emitDeclarationOnly,
    emitDecoratorMetadata: emitDecoratorMetadata,
    esModuleInterop: esModuleInterop,
    experimentalDecorators: experimentalDecorators,
    forceConsistentCasingInFileNames: forceConsistentCasingInFileNames,
    importHelpers: importHelpers,
    importsNotUsedAsValues: importsNotUsedAsValues,
    incremental: incremental,
    inlineSourceMap: inlineSourceMap,
    inlineSources: inlineSources,
    isolatedModules: isolatedModules,
    jsx: jsx,
    jsxFactory: jsxFactory,
    keyofStringsOnly: keyofStringsOnly,
    lib: lib,
    locale: locale,
    mapRoot: mapRoot,
    maxNodeModuleJsDepth: maxNodeModuleJsDepth,
    module: module,
    moduleResolution: moduleResolution,
    newLine: newLine,
    noEmit: noEmit,
    noEmitHelpers: noEmitHelpers,
    noEmitOnError: noEmitOnError,
    noErrorTruncation: noErrorTruncation,
    noFallthroughCasesInSwitch: noFallthroughCasesInSwitch,
    noImplicitAny: noImplicitAny,
    noImplicitReturns: noImplicitReturns,
    noImplicitThis: noImplicitThis,
    noImplicitUseStrict: noImplicitUseStrict,
    noLib: noLib,
    noResolve: noResolve,
    noStrictGenericChecks: noStrictGenericChecks,
    noUnusedLocals: noUnusedLocals,
    noUnusedParameters: noUnusedParameters,
    out: out,
    outDir: outDir,
    outFile: outFile,
    paths: paths,
    preserveConstEnums: preserveConstEnums,
    preserveSymlinks: preserveSymlinks,
    project: project,
    reactNamespace: reactNamespace,
    removeComments: removeComments,
    resolveJsonModule: resolveJsonModule,
    rootDir: rootDir,
    rootDirs: rootDirs,
    skipDefaultLibCheck: skipDefaultLibCheck,
    skipLibCheck: skipLibCheck,
    sourceMap: sourceMap,
    sourceRoot: sourceRoot,
    strict: strict,
    strictBindCallApply: strictBindCallApply,
    strictFunctionTypes: strictFunctionTypes,
    strictNullChecks: strictNullChecks,
    strictPropertyInitialization: strictPropertyInitialization,
    stripInternal: stripInternal,
    suppressExcessPropertyErrors: suppressExcessPropertyErrors,
    suppressImplicitAnyIndexErrors: suppressImplicitAnyIndexErrors,
    target: target,
    traceResolution: traceResolution,
    tsBuildInfoFile: tsBuildInfoFile,
    typeRoots: typeRoots,
    types: types,
    useDefineForClassFields: useDefineForClassFields
  ): KinkeyofCompilerOptionsNo = {
    val __obj = js.Dynamic.literal(allowJs = allowJs.asInstanceOf[js.Any], allowSyntheticDefaultImports = allowSyntheticDefaultImports.asInstanceOf[js.Any], allowUmdGlobalAccess = allowUmdGlobalAccess.asInstanceOf[js.Any], allowUnreachableCode = allowUnreachableCode.asInstanceOf[js.Any], allowUnusedLabels = allowUnusedLabels.asInstanceOf[js.Any], alwaysStrict = alwaysStrict.asInstanceOf[js.Any], assumeChangesOnlyAffectDirectDependencies = assumeChangesOnlyAffectDirectDependencies.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], charset = charset.asInstanceOf[js.Any], checkJs = checkJs.asInstanceOf[js.Any], composite = composite.asInstanceOf[js.Any], declaration = declaration.asInstanceOf[js.Any], declarationDir = declarationDir.asInstanceOf[js.Any], declarationMap = declarationMap.asInstanceOf[js.Any], disableSizeLimit = disableSizeLimit.asInstanceOf[js.Any], disableSolutionSearching = disableSolutionSearching.asInstanceOf[js.Any], disableSourceOfProjectReferenceRedirect = disableSourceOfProjectReferenceRedirect.asInstanceOf[js.Any], downlevelIteration = downlevelIteration.asInstanceOf[js.Any], emitBOM = emitBOM.asInstanceOf[js.Any], emitDeclarationOnly = emitDeclarationOnly.asInstanceOf[js.Any], emitDecoratorMetadata = emitDecoratorMetadata.asInstanceOf[js.Any], esModuleInterop = esModuleInterop.asInstanceOf[js.Any], experimentalDecorators = experimentalDecorators.asInstanceOf[js.Any], forceConsistentCasingInFileNames = forceConsistentCasingInFileNames.asInstanceOf[js.Any], importHelpers = importHelpers.asInstanceOf[js.Any], importsNotUsedAsValues = importsNotUsedAsValues.asInstanceOf[js.Any], incremental = incremental.asInstanceOf[js.Any], inlineSourceMap = inlineSourceMap.asInstanceOf[js.Any], inlineSources = inlineSources.asInstanceOf[js.Any], isolatedModules = isolatedModules.asInstanceOf[js.Any], jsx = jsx.asInstanceOf[js.Any], jsxFactory = jsxFactory.asInstanceOf[js.Any], keyofStringsOnly = keyofStringsOnly.asInstanceOf[js.Any], lib = lib.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mapRoot = mapRoot.asInstanceOf[js.Any], maxNodeModuleJsDepth = maxNodeModuleJsDepth.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], moduleResolution = moduleResolution.asInstanceOf[js.Any], newLine = newLine.asInstanceOf[js.Any], noEmit = noEmit.asInstanceOf[js.Any], noEmitHelpers = noEmitHelpers.asInstanceOf[js.Any], noEmitOnError = noEmitOnError.asInstanceOf[js.Any], noErrorTruncation = noErrorTruncation.asInstanceOf[js.Any], noFallthroughCasesInSwitch = noFallthroughCasesInSwitch.asInstanceOf[js.Any], noImplicitAny = noImplicitAny.asInstanceOf[js.Any], noImplicitReturns = noImplicitReturns.asInstanceOf[js.Any], noImplicitThis = noImplicitThis.asInstanceOf[js.Any], noImplicitUseStrict = noImplicitUseStrict.asInstanceOf[js.Any], noLib = noLib.asInstanceOf[js.Any], noResolve = noResolve.asInstanceOf[js.Any], noStrictGenericChecks = noStrictGenericChecks.asInstanceOf[js.Any], noUnusedLocals = noUnusedLocals.asInstanceOf[js.Any], noUnusedParameters = noUnusedParameters.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any], outDir = outDir.asInstanceOf[js.Any], outFile = outFile.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], preserveConstEnums = preserveConstEnums.asInstanceOf[js.Any], preserveSymlinks = preserveSymlinks.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], reactNamespace = reactNamespace.asInstanceOf[js.Any], removeComments = removeComments.asInstanceOf[js.Any], resolveJsonModule = resolveJsonModule.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], rootDirs = rootDirs.asInstanceOf[js.Any], skipDefaultLibCheck = skipDefaultLibCheck.asInstanceOf[js.Any], skipLibCheck = skipLibCheck.asInstanceOf[js.Any], sourceMap = sourceMap.asInstanceOf[js.Any], sourceRoot = sourceRoot.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], strictBindCallApply = strictBindCallApply.asInstanceOf[js.Any], strictFunctionTypes = strictFunctionTypes.asInstanceOf[js.Any], strictNullChecks = strictNullChecks.asInstanceOf[js.Any], strictPropertyInitialization = strictPropertyInitialization.asInstanceOf[js.Any], stripInternal = stripInternal.asInstanceOf[js.Any], suppressExcessPropertyErrors = suppressExcessPropertyErrors.asInstanceOf[js.Any], suppressImplicitAnyIndexErrors = suppressImplicitAnyIndexErrors.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], traceResolution = traceResolution.asInstanceOf[js.Any], tsBuildInfoFile = tsBuildInfoFile.asInstanceOf[js.Any], typeRoots = typeRoots.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], useDefineForClassFields = useDefineForClassFields.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KinkeyofCompilerOptionsNo]
  }
}

