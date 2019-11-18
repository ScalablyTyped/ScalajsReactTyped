package typingsJapgolly.typescript.typescriptMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageServiceHost extends ModuleSpecifierResolutionHost {
  var error: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.undefined
  var getCancellationToken: js.UndefOr[js.Function0[HostCancellationToken]] = js.undefined
  /**
    * Gets a set of custom transformers to use during emit.
    */
  var getCustomTransformers: js.UndefOr[js.Function0[js.UndefOr[CustomTransformers]]] = js.undefined
  var getDirectories: js.UndefOr[js.Function1[/* directoryName */ String, js.Array[String]]] = js.undefined
  var getLocalizedDiagnosticMessages: js.UndefOr[js.Function0[_]] = js.undefined
  var getNewLine: js.UndefOr[js.Function0[String]] = js.undefined
  var getProjectReferences: js.UndefOr[js.Function0[js.UndefOr[js.Array[ProjectReference]]]] = js.undefined
  var getProjectVersion: js.UndefOr[js.Function0[String]] = js.undefined
  var getResolvedModuleWithFailedLookupLocationsFromCache: js.UndefOr[
    js.Function2[
      /* modulename */ String, 
      /* containingFile */ String, 
      js.UndefOr[ResolvedModuleWithFailedLookupLocations]
    ]
  ] = js.undefined
  var getScriptKind: js.UndefOr[js.Function1[/* fileName */ String, ScriptKind]] = js.undefined
  var getTypeRootsVersion: js.UndefOr[js.Function0[Double]] = js.undefined
  var installPackage: js.UndefOr[
    js.Function1[/* options */ InstallPackageOptions, js.Promise[ApplyCodeActionCommandResult]]
  ] = js.undefined
  var isKnownTypesPackageName: js.UndefOr[js.Function1[/* name */ String, Boolean]] = js.undefined
  var log: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.undefined
  var readDirectory: js.UndefOr[
    js.Function5[
      /* path */ String, 
      /* extensions */ js.UndefOr[js.Array[String]], 
      /* exclude */ js.UndefOr[js.Array[String]], 
      /* include */ js.UndefOr[js.Array[String]], 
      /* depth */ js.UndefOr[Double], 
      js.Array[String]
    ]
  ] = js.undefined
  @JSName("readFile")
  var readFile_LanguageServiceHost: js.UndefOr[
    js.Function2[/* path */ String, /* encoding */ js.UndefOr[String], js.UndefOr[String]]
  ] = js.undefined
  var realpath: js.UndefOr[js.Function1[/* path */ String, String]] = js.undefined
  var resolveModuleNames: js.UndefOr[
    js.Function5[
      /* moduleNames */ js.Array[String], 
      /* containingFile */ String, 
      /* reusedNames */ js.UndefOr[js.Array[String]], 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      js.Array[js.UndefOr[ResolvedModule]]
    ]
  ] = js.undefined
  var resolveTypeReferenceDirectives: js.UndefOr[
    js.Function4[
      /* typeDirectiveNames */ js.Array[String], 
      /* containingFile */ String, 
      /* redirectedReference */ js.UndefOr[ResolvedProjectReference], 
      /* options */ CompilerOptions, 
      js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]
    ]
  ] = js.undefined
  var trace: js.UndefOr[js.Function1[/* s */ String, Unit]] = js.undefined
  var writeFile: js.UndefOr[js.Function2[/* fileName */ String, /* content */ String, Unit]] = js.undefined
  def getCompilationSettings(): CompilerOptions
  @JSName("getCurrentDirectory")
  def getCurrentDirectory_MLanguageServiceHost(): String
  def getDefaultLibFileName(options: CompilerOptions): String
  def getScriptFileNames(): js.Array[String]
  def getScriptSnapshot(fileName: String): js.UndefOr[IScriptSnapshot]
  def getScriptVersion(fileName: String): String
}

object LanguageServiceHost {
  @scala.inline
  def apply(
    getCompilationSettings: CallbackTo[CompilerOptions],
    getCurrentDirectory: CallbackTo[String],
    getDefaultLibFileName: CompilerOptions => CallbackTo[String],
    getScriptFileNames: CallbackTo[js.Array[String]],
    getScriptSnapshot: String => CallbackTo[js.UndefOr[IScriptSnapshot]],
    getScriptVersion: String => CallbackTo[String],
    directoryExists: /* directoryName */ String => CallbackTo[Boolean] = null,
    error: /* s */ String => Callback = null,
    fileExists: /* path */ String => CallbackTo[Boolean] = null,
    getCancellationToken: js.UndefOr[CallbackTo[HostCancellationToken]] = js.undefined,
    getCustomTransformers: js.UndefOr[CallbackTo[js.UndefOr[CustomTransformers]]] = js.undefined,
    getDirectories: /* directoryName */ String => CallbackTo[js.Array[String]] = null,
    getLocalizedDiagnosticMessages: js.UndefOr[CallbackTo[_]] = js.undefined,
    getNewLine: js.UndefOr[CallbackTo[String]] = js.undefined,
    getProjectReferences: js.UndefOr[CallbackTo[js.UndefOr[js.Array[ProjectReference]]]] = js.undefined,
    getProjectVersion: js.UndefOr[CallbackTo[String]] = js.undefined,
    getResolvedModuleWithFailedLookupLocationsFromCache: (/* modulename */ String, /* containingFile */ String) => CallbackTo[js.UndefOr[ResolvedModuleWithFailedLookupLocations]] = null,
    getScriptKind: /* fileName */ String => CallbackTo[ScriptKind] = null,
    getTypeRootsVersion: js.UndefOr[CallbackTo[Double]] = js.undefined,
    installPackage: /* options */ InstallPackageOptions => CallbackTo[js.Promise[ApplyCodeActionCommandResult]] = null,
    isKnownTypesPackageName: /* name */ String => CallbackTo[Boolean] = null,
    log: /* s */ String => Callback = null,
    readDirectory: (/* path */ String, /* extensions */ js.UndefOr[js.Array[String]], /* exclude */ js.UndefOr[js.Array[String]], /* include */ js.UndefOr[js.Array[String]], /* depth */ js.UndefOr[Double]) => CallbackTo[js.Array[String]] = null,
    readFile: (/* path */ String, /* encoding */ js.UndefOr[String]) => CallbackTo[js.UndefOr[String]] = null,
    realpath: /* path */ String => CallbackTo[String] = null,
    resolveModuleNames: (/* moduleNames */ js.Array[String], /* containingFile */ String, /* reusedNames */ js.UndefOr[js.Array[String]], /* redirectedReference */ js.UndefOr[ResolvedProjectReference], /* options */ CompilerOptions) => CallbackTo[js.Array[js.UndefOr[ResolvedModule]]] = null,
    resolveTypeReferenceDirectives: (/* typeDirectiveNames */ js.Array[String], /* containingFile */ String, /* redirectedReference */ js.UndefOr[ResolvedProjectReference], /* options */ CompilerOptions) => CallbackTo[js.Array[js.UndefOr[ResolvedTypeReferenceDirective]]] = null,
    trace: /* s */ String => Callback = null,
    useCaseSensitiveFileNames: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    writeFile: (/* fileName */ String, /* content */ String) => Callback = null
  ): LanguageServiceHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCompilationSettings")(getCompilationSettings.toJsFn)
    __obj.updateDynamic("getCurrentDirectory")(getCurrentDirectory.toJsFn)
    __obj.updateDynamic("getDefaultLibFileName")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.typescriptMod.CompilerOptions) => getDefaultLibFileName(t0).runNow()))
    __obj.updateDynamic("getScriptFileNames")(getScriptFileNames.toJsFn)
    __obj.updateDynamic("getScriptSnapshot")(js.Any.fromFunction1((t0: java.lang.String) => getScriptSnapshot(t0).runNow()))
    __obj.updateDynamic("getScriptVersion")(js.Any.fromFunction1((t0: java.lang.String) => getScriptVersion(t0).runNow()))
    if (directoryExists != null) __obj.updateDynamic("directoryExists")(js.Any.fromFunction1((t0: /* directoryName */ java.lang.String) => directoryExists(t0).runNow()))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* s */ java.lang.String) => error(t0).runNow()))
    if (fileExists != null) __obj.updateDynamic("fileExists")(js.Any.fromFunction1((t0: /* path */ java.lang.String) => fileExists(t0).runNow()))
    getCancellationToken.foreach(p => __obj.updateDynamic("getCancellationToken")(p.toJsFn))
    getCustomTransformers.foreach(p => __obj.updateDynamic("getCustomTransformers")(p.toJsFn))
    if (getDirectories != null) __obj.updateDynamic("getDirectories")(js.Any.fromFunction1((t0: /* directoryName */ java.lang.String) => getDirectories(t0).runNow()))
    getLocalizedDiagnosticMessages.foreach(p => __obj.updateDynamic("getLocalizedDiagnosticMessages")(p.toJsFn))
    getNewLine.foreach(p => __obj.updateDynamic("getNewLine")(p.toJsFn))
    getProjectReferences.foreach(p => __obj.updateDynamic("getProjectReferences")(p.toJsFn))
    getProjectVersion.foreach(p => __obj.updateDynamic("getProjectVersion")(p.toJsFn))
    if (getResolvedModuleWithFailedLookupLocationsFromCache != null) __obj.updateDynamic("getResolvedModuleWithFailedLookupLocationsFromCache")(js.Any.fromFunction2((t0: /* modulename */ java.lang.String, t1: /* containingFile */ java.lang.String) => getResolvedModuleWithFailedLookupLocationsFromCache(t0, t1).runNow()))
    if (getScriptKind != null) __obj.updateDynamic("getScriptKind")(js.Any.fromFunction1((t0: /* fileName */ java.lang.String) => getScriptKind(t0).runNow()))
    getTypeRootsVersion.foreach(p => __obj.updateDynamic("getTypeRootsVersion")(p.toJsFn))
    if (installPackage != null) __obj.updateDynamic("installPackage")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.typescript.typescriptMod.InstallPackageOptions) => installPackage(t0).runNow()))
    if (isKnownTypesPackageName != null) __obj.updateDynamic("isKnownTypesPackageName")(js.Any.fromFunction1((t0: /* name */ java.lang.String) => isKnownTypesPackageName(t0).runNow()))
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1((t0: /* s */ java.lang.String) => log(t0).runNow()))
    if (readDirectory != null) __obj.updateDynamic("readDirectory")(js.Any.fromFunction5((t0: /* path */ java.lang.String, t1: /* extensions */ js.UndefOr[js.Array[java.lang.String]], t2: /* exclude */ js.UndefOr[js.Array[java.lang.String]], t3: /* include */ js.UndefOr[js.Array[java.lang.String]], t4: /* depth */ js.UndefOr[scala.Double]) => readDirectory(t0, t1, t2, t3, t4).runNow()))
    if (readFile != null) __obj.updateDynamic("readFile")(js.Any.fromFunction2((t0: /* path */ java.lang.String, t1: /* encoding */ js.UndefOr[java.lang.String]) => readFile(t0, t1).runNow()))
    if (realpath != null) __obj.updateDynamic("realpath")(js.Any.fromFunction1((t0: /* path */ java.lang.String) => realpath(t0).runNow()))
    if (resolveModuleNames != null) __obj.updateDynamic("resolveModuleNames")(js.Any.fromFunction5((t0: /* moduleNames */ js.Array[java.lang.String], t1: /* containingFile */ java.lang.String, t2: /* reusedNames */ js.UndefOr[js.Array[java.lang.String]], t3: /* redirectedReference */ js.UndefOr[typingsJapgolly.typescript.typescriptMod.ResolvedProjectReference], t4: /* options */ typingsJapgolly.typescript.typescriptMod.CompilerOptions) => resolveModuleNames(t0, t1, t2, t3, t4).runNow()))
    if (resolveTypeReferenceDirectives != null) __obj.updateDynamic("resolveTypeReferenceDirectives")(js.Any.fromFunction4((t0: /* typeDirectiveNames */ js.Array[java.lang.String], t1: /* containingFile */ java.lang.String, t2: /* redirectedReference */ js.UndefOr[typingsJapgolly.typescript.typescriptMod.ResolvedProjectReference], t3: /* options */ typingsJapgolly.typescript.typescriptMod.CompilerOptions) => resolveTypeReferenceDirectives(t0, t1, t2, t3).runNow()))
    if (trace != null) __obj.updateDynamic("trace")(js.Any.fromFunction1((t0: /* s */ java.lang.String) => trace(t0).runNow()))
    useCaseSensitiveFileNames.foreach(p => __obj.updateDynamic("useCaseSensitiveFileNames")(p.toJsFn))
    if (writeFile != null) __obj.updateDynamic("writeFile")(js.Any.fromFunction2((t0: /* fileName */ java.lang.String, t1: /* content */ java.lang.String) => writeFile(t0, t1).runNow()))
    __obj.asInstanceOf[LanguageServiceHost]
  }
}

