package typingsJapgolly.next

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.next.anon.AppConfig
import typingsJapgolly.next.anon.Build
import typingsJapgolly.next.anon.ConfigFileName
import typingsJapgolly.next.anon.DefaultLocale
import typingsJapgolly.next.anon.DistDir
import typingsJapgolly.next.anon.EncodedPaths
import typingsJapgolly.next.anon.OmitGetStaticPathsResulta
import typingsJapgolly.next.anon.Pages
import typingsJapgolly.next.anon.Paths
import typingsJapgolly.next.distBuildUtilsMod.ComputeFilesManifestResult
import typingsJapgolly.next.distBuildUtilsMod.GenerateParams
import typingsJapgolly.next.distBuildUtilsMod.PageInfo
import typingsJapgolly.next.distBuildUtilsMod.ROUTER_TYPE
import typingsJapgolly.next.distBuildWebpackPluginsAppBuildManifestPluginMod.AppBuildManifest
import typingsJapgolly.next.distBuildWebpackPluginsMiddlewarePluginMod.MiddlewareManifest
import typingsJapgolly.next.distExportWorkerMod.ExportPageInput
import typingsJapgolly.next.distExportWorkerMod.ExportPageResults
import typingsJapgolly.next.distLibCoalescedFunctionMod.UnwrapPromise
import typingsJapgolly.next.distLibLoadCustomRoutesMod.CustomRoutes
import typingsJapgolly.next.distServerGetPageFilesMod.BuildManifest
import typingsJapgolly.next.nextStrings.paths
import typingsJapgolly.next.typesMod.GetStaticPaths
import typingsJapgolly.std.Map
import typingsJapgolly.std.Omit
import typingsJapgolly.std.ReadonlySet
import typingsJapgolly.std.ReturnType
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWorkerMod {
  
  @JSImport("next/dist/build/worker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/build/worker", "MiddlewareInServerlessTargetError")
  @js.native
  open class MiddlewareInServerlessTargetError ()
    extends typingsJapgolly.next.distBuildUtilsMod.MiddlewareInServerlessTargetError
  
  @JSImport("next/dist/build/worker", "NestedMiddlewareError")
  @js.native
  open class NestedMiddlewareError protected ()
    extends typingsJapgolly.next.distBuildUtilsMod.NestedMiddlewareError {
    def this(nestedFileNames: js.Array[String], mainDir: String, pagesDir: String) = this()
  }
  
  inline def buildAppStaticPaths(hasPageConfigFileNameGenerateParams: ConfigFileName): js.Promise[OmitGetStaticPathsResulta | EncodedPaths] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildAppStaticPaths")(hasPageConfigFileNameGenerateParams.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OmitGetStaticPathsResulta | EncodedPaths]]
  
  inline def buildStaticPaths(hasPageGetStaticPathsStaticPathsResultConfigFileNameLocalesDefaultLocale: DefaultLocale): js.Promise[
    (Omit[
      UnwrapPromise[
        ReturnType[
          GetStaticPaths[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
          ]
        ]
      ], 
      paths
    ]) & Paths
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildStaticPaths")(hasPageGetStaticPathsStaticPathsResultConfigFileNameLocalesDefaultLocale.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    (Omit[
      UnwrapPromise[
        ReturnType[
          GetStaticPaths[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
          ]
        ]
      ], 
      paths
    ]) & Paths
  ]]
  
  inline def collectGenerateParams(segment: Any): GenerateParams = ^.asInstanceOf[js.Dynamic].applyDynamic("collectGenerateParams")(segment.asInstanceOf[js.Any]).asInstanceOf[GenerateParams]
  inline def collectGenerateParams(segment: Any, parentSegments: js.Array[String]): GenerateParams = (^.asInstanceOf[js.Dynamic].applyDynamic("collectGenerateParams")(segment.asInstanceOf[js.Any], parentSegments.asInstanceOf[js.Any])).asInstanceOf[GenerateParams]
  inline def collectGenerateParams(segment: Any, parentSegments: js.Array[String], generateParams: GenerateParams): GenerateParams = (^.asInstanceOf[js.Dynamic].applyDynamic("collectGenerateParams")(segment.asInstanceOf[js.Any], parentSegments.asInstanceOf[js.Any], generateParams.asInstanceOf[js.Any])).asInstanceOf[GenerateParams]
  inline def collectGenerateParams(segment: Any, parentSegments: Unit, generateParams: GenerateParams): GenerateParams = (^.asInstanceOf[js.Dynamic].applyDynamic("collectGenerateParams")(segment.asInstanceOf[js.Any], parentSegments.asInstanceOf[js.Any], generateParams.asInstanceOf[js.Any])).asInstanceOf[GenerateParams]
  
  inline def computeFromManifest(manifests: Build, distPath: String): js.Promise[ComputeFilesManifestResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeFromManifest")(manifests.asInstanceOf[js.Any], distPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComputeFilesManifestResult]]
  inline def computeFromManifest(manifests: Build, distPath: String, gzipSize: Boolean): js.Promise[ComputeFilesManifestResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeFromManifest")(manifests.asInstanceOf[js.Any], distPath.asInstanceOf[js.Any], gzipSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComputeFilesManifestResult]]
  inline def computeFromManifest(manifests: Build, distPath: String, gzipSize: Boolean, pageInfos: Map[String, PageInfo]): js.Promise[ComputeFilesManifestResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeFromManifest")(manifests.asInstanceOf[js.Any], distPath.asInstanceOf[js.Any], gzipSize.asInstanceOf[js.Any], pageInfos.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComputeFilesManifestResult]]
  inline def computeFromManifest(manifests: Build, distPath: String, gzipSize: Unit, pageInfos: Map[String, PageInfo]): js.Promise[ComputeFilesManifestResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeFromManifest")(manifests.asInstanceOf[js.Any], distPath.asInstanceOf[js.Any], gzipSize.asInstanceOf[js.Any], pageInfos.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComputeFilesManifestResult]]
  
  inline def copyTracedFiles(
    dir: String,
    distDir: String,
    pageKeys: js.Array[String],
    tracingRoot: String,
    serverConfig: StringDictionary[Any],
    middlewareManifest: MiddlewareManifest
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyTracedFiles")(dir.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], pageKeys.asInstanceOf[js.Any], tracingRoot.asInstanceOf[js.Any], serverConfig.asInstanceOf[js.Any], middlewareManifest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def detectConflictingPaths(
    combinedPages: js.Array[String],
    ssgPages: Set[String],
    additionalSsgPaths: Map[String, js.Array[String]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detectConflictingPaths")(combinedPages.asInstanceOf[js.Any], ssgPages.asInstanceOf[js.Any], additionalSsgPaths.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def difference[T](main: js.Array[T], sub: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(main.asInstanceOf[js.Any], sub.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def difference[T](main: js.Array[T], sub: ReadonlySet[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(main.asInstanceOf[js.Any], sub.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def difference[T](main: ReadonlySet[T], sub: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(main.asInstanceOf[js.Any], sub.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def difference[T](main: ReadonlySet[T], sub: ReadonlySet[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(main.asInstanceOf[js.Any], sub.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def exportPage(
    hasParentSpanIdPathPathMapDistDirOutDirPagesDataDirRenderOptsBuildExportServerRuntimeConfigSubFoldersServerlessOptimizeFontsOptimizeCssDisableOptimizedLoadingHttpAgentOptionsServerComponents: ExportPageInput
  ): js.Promise[ExportPageResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportPage")(hasParentSpanIdPathPathMapDistDirOutDirPagesDataDirRenderOptsBuildExportServerRuntimeConfigSubFoldersServerlessOptimizeFontsOptimizeCssDisableOptimizedLoadingHttpAgentOptionsServerComponents.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ExportPageResults]]
  
  inline def getJsPageSizeInKb(routerType: ROUTER_TYPE, page: String, distPath: String, buildManifest: BuildManifest): js.Promise[js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getJsPageSizeInKb")(routerType.asInstanceOf[js.Any], page.asInstanceOf[js.Any], distPath.asInstanceOf[js.Any], buildManifest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Double, Double]]]
  inline def getJsPageSizeInKb(
    routerType: ROUTER_TYPE,
    page: String,
    distPath: String,
    buildManifest: BuildManifest,
    appBuildManifest: Unit,
    gzipSize: Boolean
  ): js.Promise[js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getJsPageSizeInKb")(routerType.asInstanceOf[js.Any], page.asInstanceOf[js.Any], distPath.asInstanceOf[js.Any], buildManifest.asInstanceOf[js.Any], appBuildManifest.asInstanceOf[js.Any], gzipSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Double, Double]]]
  inline def getJsPageSizeInKb(
    routerType: ROUTER_TYPE,
    page: String,
    distPath: String,
    buildManifest: BuildManifest,
    appBuildManifest: Unit,
    gzipSize: Boolean,
    cachedStats: ComputeFilesManifestResult
  ): js.Promise[js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getJsPageSizeInKb")(routerType.asInstanceOf[js.Any], page.asInstanceOf[js.Any], distPath.asInstanceOf[js.Any], buildManifest.asInstanceOf[js.Any], appBuildManifest.asInstanceOf[js.Any], gzipSize.asInstanceOf[js.Any], cachedStats.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Double, Double]]]
  inline def getJsPageSizeInKb(
    routerType: ROUTER_TYPE,
    page: String,
    distPath: String,
    buildManifest: BuildManifest,
    appBuildManifest: Unit,
    gzipSize: Unit,
    cachedStats: ComputeFilesManifestResult
  ): js.Promise[js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getJsPageSizeInKb")(routerType.asInstanceOf[js.Any], page.asInstanceOf[js.Any], distPath.asInstanceOf[js.Any], buildManifest.asInstanceOf[js.Any], appBuildManifest.asInstanceOf[js.Any], gzipSize.asInstanceOf[js.Any], cachedStats.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Double, Double]]]
  inline def getJsPageSizeInKb(
    routerType: ROUTER_TYPE,
    page: String,
    distPath: String,
    buildManifest: BuildManifest,
    appBuildManifest: AppBuildManifest
  ): js.Promise[js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getJsPageSizeInKb")(routerType.asInstanceOf[js.Any], page.asInstanceOf[js.Any], distPath.asInstanceOf[js.Any], buildManifest.asInstanceOf[js.Any], appBuildManifest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Double, Double]]]
  inline def getJsPageSizeInKb(
    routerType: ROUTER_TYPE,
    page: String,
    distPath: String,
    buildManifest: BuildManifest,
    appBuildManifest: AppBuildManifest,
    gzipSize: Boolean
  ): js.Promise[js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getJsPageSizeInKb")(routerType.asInstanceOf[js.Any], page.asInstanceOf[js.Any], distPath.asInstanceOf[js.Any], buildManifest.asInstanceOf[js.Any], appBuildManifest.asInstanceOf[js.Any], gzipSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Double, Double]]]
  inline def getJsPageSizeInKb(
    routerType: ROUTER_TYPE,
    page: String,
    distPath: String,
    buildManifest: BuildManifest,
    appBuildManifest: AppBuildManifest,
    gzipSize: Boolean,
    cachedStats: ComputeFilesManifestResult
  ): js.Promise[js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getJsPageSizeInKb")(routerType.asInstanceOf[js.Any], page.asInstanceOf[js.Any], distPath.asInstanceOf[js.Any], buildManifest.asInstanceOf[js.Any], appBuildManifest.asInstanceOf[js.Any], gzipSize.asInstanceOf[js.Any], cachedStats.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Double, Double]]]
  inline def getJsPageSizeInKb(
    routerType: ROUTER_TYPE,
    page: String,
    distPath: String,
    buildManifest: BuildManifest,
    appBuildManifest: AppBuildManifest,
    gzipSize: Unit,
    cachedStats: ComputeFilesManifestResult
  ): js.Promise[js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getJsPageSizeInKb")(routerType.asInstanceOf[js.Any], page.asInstanceOf[js.Any], distPath.asInstanceOf[js.Any], buildManifest.asInstanceOf[js.Any], appBuildManifest.asInstanceOf[js.Any], gzipSize.asInstanceOf[js.Any], cachedStats.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Double, Double]]]
  
  inline def getNamedExports(page: String, distDir: String, isLikeServerless: Boolean, runtimeEnvConfig: Any): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNamedExports")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], isLikeServerless.asInstanceOf[js.Any], runtimeEnvConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def getPossibleMiddlewareFilenames(folder: String, extensions: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPossibleMiddlewareFilenames")(folder.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def hasCustomGetInitialProps(
    page: String,
    distDir: String,
    isLikeServerless: Boolean,
    runtimeEnvConfig: Any,
    checkingApp: Boolean
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("hasCustomGetInitialProps")(page.asInstanceOf[js.Any], distDir.asInstanceOf[js.Any], isLikeServerless.asInstanceOf[js.Any], runtimeEnvConfig.asInstanceOf[js.Any], checkingApp.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def isCustomErrorPage(page: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCustomErrorPage")(page.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMiddlewareFile(file: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMiddlewareFile")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMiddlewareFilename(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMiddlewareFilename")().asInstanceOf[Boolean]
  inline def isMiddlewareFilename(file: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMiddlewareFilename")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPageStatic(
    hasPageDistDirServerlessConfigFileNameRuntimeEnvConfigHttpAgentOptionsLocalesDefaultLocaleParentIdPageRuntimeEdgeInfoPageTypeHasServerComponentsOriginalAppPath: DistDir
  ): js.Promise[AppConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("isPageStatic")(hasPageDistDirServerlessConfigFileNameRuntimeEnvConfigHttpAgentOptionsLocalesDefaultLocaleParentIdPageRuntimeEdgeInfoPageTypeHasServerComponentsOriginalAppPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AppConfig]]
  
  inline def isReservedPage(page: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReservedPage")(page.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def printCustomRoutes(hasRedirectsRewritesHeaders: CustomRoutes): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printCustomRoutes")(hasRedirectsRewritesHeaders.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def printTreeView(
    lists: Pages,
    pageInfos: Map[String, PageInfo],
    serverless: Boolean,
    hasDistPathBuildIdPagesDirPageExtensionsBuildManifestAppBuildManifestMiddlewareManifestUseStatic404GzipSize: typingsJapgolly.next.anon.AppBuildManifest
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("printTreeView")(lists.asInstanceOf[js.Any], pageInfos.asInstanceOf[js.Any], serverless.asInstanceOf[js.Any], hasDistPathBuildIdPagesDirPageExtensionsBuildManifestAppBuildManifestMiddlewareManifestUseStatic404GzipSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def unique[T](main: js.Array[T], sub: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unique")(main.asInstanceOf[js.Any], sub.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
