package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.outAppInfoMod.AppInfo
import typingsJapgolly.appBuilderLib.outConfigurationMod.AfterPackContext
import typingsJapgolly.appBuilderLib.outConfigurationMod.Configuration
import typingsJapgolly.appBuilderLib.outCoreMod.Platform
import typingsJapgolly.appBuilderLib.outCoreMod.SourceRepositoryInfo
import typingsJapgolly.appBuilderLib.outCoreMod.Target
import typingsJapgolly.appBuilderLib.outFrameworkMod.Framework
import typingsJapgolly.appBuilderLib.outOptionsMetadataMod.Metadata
import typingsJapgolly.appBuilderLib.outPackagerApiMod.ArtifactBuildStarted
import typingsJapgolly.appBuilderLib.outPackagerApiMod.ArtifactCreated
import typingsJapgolly.appBuilderLib.outPackagerApiMod.PackagerOptions
import typingsJapgolly.appBuilderLib.outPlatformPackagerMod.PlatformPackager
import typingsJapgolly.appBuilderLib.outUtilPackageDependenciesMod.NodeModuleDirInfo
import typingsJapgolly.builderUtil.mod.DebugLogger
import typingsJapgolly.builderUtil.mod.TmpDir
import typingsJapgolly.builderUtil.outArchMod.Arch
import typingsJapgolly.builderUtilRuntime.mod.CancellationToken
import typingsJapgolly.lazyVal.mod.Lazy
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outPackagerMod {
  
  @JSImport("app-builder-lib/out/packager", "Packager")
  @js.native
  open class Packager protected () extends StObject {
    def this(options: PackagerOptions) = this()
    def this(options: PackagerOptions, cancellationToken: CancellationToken) = this()
    
    /* private */ var _appDir: Any = js.native
    
    var _appInfo: AppInfo | Null = js.native
    
    def _build(configuration: Configuration, metadata: Metadata): js.Promise[BuildResult] = js.native
    def _build(
      configuration: Configuration,
      metadata: Metadata,
      devMetadata: Null,
      repositoryInfo: SourceRepositoryInfo
    ): js.Promise[BuildResult] = js.native
    def _build(configuration: Configuration, metadata: Metadata, devMetadata: Metadata): js.Promise[BuildResult] = js.native
    def _build(
      configuration: Configuration,
      metadata: Metadata,
      devMetadata: Metadata,
      repositoryInfo: SourceRepositoryInfo
    ): js.Promise[BuildResult] = js.native
    
    /* private */ var _buildResourcesDir: Any = js.native
    
    /* private */ var _configuration: Any = js.native
    
    /* private */ var _devMetadata: Any = js.native
    
    /* private */ var _framework: Any = js.native
    
    /* private */ var _isPrepackedAppAsar: Any = js.native
    
    /* private */ var _metadata: Any = js.native
    
    /* private */ var _nodeModulesHandledExternally: Any = js.native
    
    /* private */ var _repositoryInfo: Any = js.native
    
    def addAfterPackHandler(handler: js.Function1[/* context */ AfterPackContext, js.Promise[Any] | Null]): Unit = js.native
    
    def afterPack(context: AfterPackContext): js.Promise[Any] = js.native
    
    /* private */ val afterPackHandlers: Any = js.native
    
    def appDir: String = js.native
    
    def appInfo: AppInfo = js.native
    
    def areNodeModulesHandledExternally: Boolean = js.native
    
    def artifactCreated(handler: js.Function1[/* event */ ArtifactCreated, Unit]): Packager = js.native
    
    def build(): js.Promise[BuildResult] = js.native
    
    def buildResourcesDir: String = js.native
    
    def callAppxManifestCreated(path: String): js.Promise[Unit] = js.native
    
    def callArtifactBuildCompleted(event: ArtifactCreated): js.Promise[Unit] = js.native
    
    def callArtifactBuildStarted(event: ArtifactBuildStarted): js.Promise[Unit] = js.native
    def callArtifactBuildStarted(event: ArtifactBuildStarted, logFields: Any): js.Promise[Unit] = js.native
    
    def callMsiProjectCreated(path: String): js.Promise[Unit] = js.native
    
    val cancellationToken: CancellationToken = js.native
    
    def config: Configuration = js.native
    
    /* private */ var createHelper: Any = js.native
    
    val debugLogger: DebugLogger = js.native
    
    def devMetadata: Metadata | Null = js.native
    
    /**
      * Only for sub artifacts (update info), for main artifacts use `callArtifactBuildCompleted`.
      */
    def dispatchArtifactCreated(event: ArtifactCreated): Unit = js.native
    
    def disposeOnBuildFinish(disposer: js.Function0[js.Promise[Unit]]): Unit = js.native
    
    /* private */ var doBuild: Any = js.native
    
    val eventEmitter: EventEmitter = js.native
    
    def framework: Framework = js.native
    
    def getNodeDependencyInfo(): Lazy[js.Array[NodeModuleDirInfo]] = js.native
    def getNodeDependencyInfo(platform: Platform): Lazy[js.Array[NodeModuleDirInfo]] = js.native
    
    def installAppDependencies(platform: Platform, arch: Arch): js.Promise[Any] = js.native
    
    def isPrepackedAppAsar: Boolean = js.native
    
    var isTwoPackageJsonProjectLayoutUsed: Boolean = js.native
    
    def metadata: Metadata = js.native
    
    /* private */ var nodeDependencyInfo: Any = js.native
    
    val options: PackagerOptions = js.native
    
    val projectDir: String = js.native
    
    /* private */ var readProjectMetadataIfTwoPackageStructureOrPrepacked: Any = js.native
    
    def relativeBuildResourcesDirname: String = js.native
    
    def repositoryInfo: js.Promise[SourceRepositoryInfo | Null] = js.native
    
    def stageDirPathCustomizer(target: Target, packager: PlatformPackager[Any], arch: Arch): String = js.native
    
    val tempDirManager: TmpDir = js.native
    
    /* private */ val toDispose: Any = js.native
  }
  
  trait BuildResult extends StObject {
    
    val artifactPaths: js.Array[String]
    
    val configuration: Configuration
    
    val outDir: String
    
    val platformToTargets: Map[Platform, Map[String, Target]]
  }
  object BuildResult {
    
    inline def apply(
      artifactPaths: js.Array[String],
      configuration: Configuration,
      outDir: String,
      platformToTargets: Map[Platform, Map[String, Target]]
    ): BuildResult = {
      val __obj = js.Dynamic.literal(artifactPaths = artifactPaths.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], outDir = outDir.asInstanceOf[js.Any], platformToTargets = platformToTargets.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildResult]
    }
    
    extension [Self <: BuildResult](x: Self) {
      
      inline def setArtifactPaths(value: js.Array[String]): Self = StObject.set(x, "artifactPaths", value.asInstanceOf[js.Any])
      
      inline def setArtifactPathsVarargs(value: String*): Self = StObject.set(x, "artifactPaths", js.Array(value*))
      
      inline def setConfiguration(value: Configuration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setOutDir(value: String): Self = StObject.set(x, "outDir", value.asInstanceOf[js.Any])
      
      inline def setPlatformToTargets(value: Map[Platform, Map[String, Target]]): Self = StObject.set(x, "platformToTargets", value.asInstanceOf[js.Any])
    }
  }
}
