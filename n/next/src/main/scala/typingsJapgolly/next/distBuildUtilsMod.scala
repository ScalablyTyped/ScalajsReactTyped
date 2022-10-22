package typingsJapgolly.next

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.next.anon.App
import typingsJapgolly.next.anon.Build
import typingsJapgolly.next.anon.Config
import typingsJapgolly.next.anon.ConfigFileName
import typingsJapgolly.next.anon.DefaultLocale
import typingsJapgolly.next.anon.DistDir
import typingsJapgolly.next.anon.EncodedPaths
import typingsJapgolly.next.anon.OmitGetStaticPathsResulta
import typingsJapgolly.next.anon.Pages
import typingsJapgolly.next.anon.Paths
import typingsJapgolly.next.anon.Total
import typingsJapgolly.next.distBuildWebpackPluginsAppBuildManifestPluginMod.AppBuildManifest
import typingsJapgolly.next.distBuildWebpackPluginsMiddlewarePluginMod.MiddlewareManifest
import typingsJapgolly.next.distLibCoalescedFunctionMod.UnwrapPromise
import typingsJapgolly.next.distLibLoadCustomRoutesMod.CustomRoutes
import typingsJapgolly.next.distServerGetPageFilesMod.BuildManifest
import typingsJapgolly.next.nextBooleans.`false`
import typingsJapgolly.next.nextBooleans.`true`
import typingsJapgolly.next.nextStrings.`force-cache`
import typingsJapgolly.next.nextStrings.`force-static`
import typingsJapgolly.next.nextStrings.`only-cache`
import typingsJapgolly.next.nextStrings.auto
import typingsJapgolly.next.nextStrings.error
import typingsJapgolly.next.nextStrings.paths
import typingsJapgolly.next.typesMod.GetStaticPaths
import typingsJapgolly.next.typesMod.ServerRuntime
import typingsJapgolly.std.Error
import typingsJapgolly.std.Map
import typingsJapgolly.std.Omit
import typingsJapgolly.std.ReadonlySet
import typingsJapgolly.std.ReturnType
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildUtilsMod {
  
  @JSImport("next/dist/build/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/build/utils", "MiddlewareInServerlessTargetError")
  @js.native
  open class MiddlewareInServerlessTargetError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("next/dist/build/utils", "NestedMiddlewareError")
  @js.native
  open class NestedMiddlewareError protected ()
    extends StObject
       with Error {
    def this(nestedFileNames: js.Array[String], mainDir: String, pagesDir: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
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
  ): js.Promise[typingsJapgolly.next.anon.AppConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("isPageStatic")(hasPageDistDirServerlessConfigFileNameRuntimeEnvConfigHttpAgentOptionsLocalesDefaultLocaleParentIdPageRuntimeEdgeInfoPageTypeHasServerComponentsOriginalAppPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.next.anon.AppConfig]]
  
  inline def isReservedPage(page: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReservedPage")(page.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def printCustomRoutes(hasRedirectsRewritesHeaders: CustomRoutes): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printCustomRoutes")(hasRedirectsRewritesHeaders.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def printTreeView(
    lists: Pages,
    pageInfos: Map[String, PageInfo],
    serverless: Boolean,
    hasDistPathBuildIdPagesDirPageExtensionsBuildManifestAppBuildManifestMiddlewareManifestUseStatic404GzipSize: typingsJapgolly.next.anon.AppBuildManifest
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("printTreeView")(lists.asInstanceOf[js.Any], pageInfos.asInstanceOf[js.Any], serverless.asInstanceOf[js.Any], hasDistPathBuildIdPagesDirPageExtensionsBuildManifestAppBuildManifestMiddlewareManifestUseStatic404GzipSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def unique[T](main: js.Array[T], sub: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unique")(main.asInstanceOf[js.Any], sub.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  trait AppConfig extends StObject {
    
    var dynamic: js.UndefOr[auto | error | `force-static`] = js.undefined
    
    var dynamicParams: js.UndefOr[`true` | `false`] = js.undefined
    
    var fetchCache: js.UndefOr[`force-cache` | `only-cache`] = js.undefined
    
    var preferredRegion: js.UndefOr[String] = js.undefined
    
    var revalidate: js.UndefOr[Double | `false`] = js.undefined
  }
  object AppConfig {
    
    inline def apply(): AppConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppConfig]
    }
    
    extension [Self <: AppConfig](x: Self) {
      
      inline def setDynamic(value: auto | error | `force-static`): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
      
      inline def setDynamicParams(value: `true` | `false`): Self = StObject.set(x, "dynamicParams", value.asInstanceOf[js.Any])
      
      inline def setDynamicParamsUndefined: Self = StObject.set(x, "dynamicParams", js.undefined)
      
      inline def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
      
      inline def setFetchCache(value: `force-cache` | `only-cache`): Self = StObject.set(x, "fetchCache", value.asInstanceOf[js.Any])
      
      inline def setFetchCacheUndefined: Self = StObject.set(x, "fetchCache", js.undefined)
      
      inline def setPreferredRegion(value: String): Self = StObject.set(x, "preferredRegion", value.asInstanceOf[js.Any])
      
      inline def setPreferredRegionUndefined: Self = StObject.set(x, "preferredRegion", js.undefined)
      
      inline def setRevalidate(value: Double | `false`): Self = StObject.set(x, "revalidate", value.asInstanceOf[js.Any])
      
      inline def setRevalidateUndefined: Self = StObject.set(x, "revalidate", js.undefined)
    }
  }
  
  trait ComputeFilesGroup extends StObject {
    
    var files: js.Array[String]
    
    var size: Total
  }
  object ComputeFilesGroup {
    
    inline def apply(files: js.Array[String], size: Total): ComputeFilesGroup = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputeFilesGroup]
    }
    
    extension [Self <: ComputeFilesGroup](x: Self) {
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setSize(value: Total): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComputeFilesManifest extends StObject {
    
    var common: ComputeFilesGroup
    
    var unique: ComputeFilesGroup
  }
  object ComputeFilesManifest {
    
    inline def apply(common: ComputeFilesGroup, unique: ComputeFilesGroup): ComputeFilesManifest = {
      val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputeFilesManifest]
    }
    
    extension [Self <: ComputeFilesManifest](x: Self) {
      
      inline def setCommon(value: ComputeFilesGroup): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      inline def setUnique(value: ComputeFilesGroup): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComputeFilesManifestResult extends StObject {
    
    var router: App
    
    var sizes: Map[String, Double]
  }
  object ComputeFilesManifestResult {
    
    inline def apply(router: App, sizes: Map[String, Double]): ComputeFilesManifestResult = {
      val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputeFilesManifestResult]
    }
    
    extension [Self <: ComputeFilesManifestResult](x: Self) {
      
      inline def setRouter(value: App): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      inline def setSizes(value: Map[String, Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    }
  }
  
  type GenerateParams = js.Array[Config]
  
  trait PageInfo extends StObject {
    
    var initialRevalidateSeconds: Double | `false`
    
    var isHybridAmp: js.UndefOr[Boolean] = js.undefined
    
    var isSsg: Boolean
    
    var pageDuration: js.UndefOr[Double] = js.undefined
    
    var runtime: ServerRuntime
    
    var size: Double
    
    var ssgPageDurations: js.UndefOr[js.Array[Double]] = js.undefined
    
    var ssgPageRoutes: js.Array[String] | Null
    
    var static: Boolean
    
    var totalSize: Double
  }
  object PageInfo {
    
    inline def apply(
      initialRevalidateSeconds: Double | `false`,
      isSsg: Boolean,
      size: Double,
      static: Boolean,
      totalSize: Double
    ): PageInfo = {
      val __obj = js.Dynamic.literal(initialRevalidateSeconds = initialRevalidateSeconds.asInstanceOf[js.Any], isSsg = isSsg.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any], ssgPageRoutes = null)
      __obj.asInstanceOf[PageInfo]
    }
    
    extension [Self <: PageInfo](x: Self) {
      
      inline def setInitialRevalidateSeconds(value: Double | `false`): Self = StObject.set(x, "initialRevalidateSeconds", value.asInstanceOf[js.Any])
      
      inline def setIsHybridAmp(value: Boolean): Self = StObject.set(x, "isHybridAmp", value.asInstanceOf[js.Any])
      
      inline def setIsHybridAmpUndefined: Self = StObject.set(x, "isHybridAmp", js.undefined)
      
      inline def setIsSsg(value: Boolean): Self = StObject.set(x, "isSsg", value.asInstanceOf[js.Any])
      
      inline def setPageDuration(value: Double): Self = StObject.set(x, "pageDuration", value.asInstanceOf[js.Any])
      
      inline def setPageDurationUndefined: Self = StObject.set(x, "pageDuration", js.undefined)
      
      inline def setRuntime(value: ServerRuntime): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSsgPageDurations(value: js.Array[Double]): Self = StObject.set(x, "ssgPageDurations", value.asInstanceOf[js.Any])
      
      inline def setSsgPageDurationsUndefined: Self = StObject.set(x, "ssgPageDurations", js.undefined)
      
      inline def setSsgPageDurationsVarargs(value: Double*): Self = StObject.set(x, "ssgPageDurations", js.Array(value*))
      
      inline def setSsgPageRoutes(value: js.Array[String]): Self = StObject.set(x, "ssgPageRoutes", value.asInstanceOf[js.Any])
      
      inline def setSsgPageRoutesNull: Self = StObject.set(x, "ssgPageRoutes", null)
      
      inline def setSsgPageRoutesVarargs(value: String*): Self = StObject.set(x, "ssgPageRoutes", js.Array(value*))
      
      inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.next.nextStrings.pages
    - typingsJapgolly.next.nextStrings.app
  */
  trait ROUTER_TYPE extends StObject
  object ROUTER_TYPE {
    
    inline def app: typingsJapgolly.next.nextStrings.app = "app".asInstanceOf[typingsJapgolly.next.nextStrings.app]
    
    inline def pages: typingsJapgolly.next.nextStrings.pages = "pages".asInstanceOf[typingsJapgolly.next.nextStrings.pages]
  }
}
