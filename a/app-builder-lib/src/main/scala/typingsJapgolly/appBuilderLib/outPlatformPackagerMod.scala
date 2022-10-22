package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.anon.IsUserForced
import typingsJapgolly.appBuilderLib.mod.Packager
import typingsJapgolly.appBuilderLib.mod.Platform
import typingsJapgolly.appBuilderLib.mod.Target
import typingsJapgolly.appBuilderLib.outAppInfoMod.AppInfo
import typingsJapgolly.appBuilderLib.outConfigurationMod.AfterPackContext
import typingsJapgolly.appBuilderLib.outConfigurationMod.Configuration
import typingsJapgolly.appBuilderLib.outCoreMod.CompressionLevel
import typingsJapgolly.appBuilderLib.outCoreMod.TargetSpecificOptions
import typingsJapgolly.appBuilderLib.outElectronElectronFrameworkMod.ElectronPlatformName
import typingsJapgolly.appBuilderLib.outFileMatcherMod.GetFileMatchersOptions
import typingsJapgolly.appBuilderLib.outOptionsFileAssociationMod.FileAssociation
import typingsJapgolly.appBuilderLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typingsJapgolly.appBuilderLib.outPackagerApiMod.PackagerOptions
import typingsJapgolly.builderUtil.mod.AsyncTaskManager
import typingsJapgolly.builderUtil.mod.DebugLogger
import typingsJapgolly.builderUtil.outArchMod.Arch
import typingsJapgolly.builderUtil.outFsMod.FileTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outPlatformPackagerMod {
  
  @JSImport("app-builder-lib/out/platformPackager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("app-builder-lib/out/platformPackager", "PlatformPackager")
  @js.native
  open class PlatformPackager[DC /* <: PlatformSpecificBuildOptions */] protected () extends StObject {
    /* protected */ def this(info: Packager, platform: Platform) = this()
    
    /* private */ val _resourceList: Any = js.native
    
    val appInfo: AppInfo = js.native
    
    def artifactPatternConfig(): IsUserForced = js.native
    def artifactPatternConfig(targetSpecificOptions: Null, defaultPattern: String): IsUserForced = js.native
    def artifactPatternConfig(targetSpecificOptions: Unit, defaultPattern: String): IsUserForced = js.native
    def artifactPatternConfig(targetSpecificOptions: TargetSpecificOptions): IsUserForced = js.native
    def artifactPatternConfig(targetSpecificOptions: TargetSpecificOptions, defaultPattern: String): IsUserForced = js.native
    
    def buildResourcesDir: String = js.native
    
    /* private */ var checkFileInPackage: Any = js.native
    
    def compression: CompressionLevel = js.native
    
    /* protected */ def computeAppOutDir(outDir: String, arch: Arch): String = js.native
    
    /* private */ var computeArtifactName: Any = js.native
    
    /* private */ var computeAsarOptions: Any = js.native
    
    def computeSafeArtifactName(suggestedName: String, ext: String): String | Null = js.native
    def computeSafeArtifactName(suggestedName: String, ext: String, arch: Null, skipDefaultArch: Boolean): String | Null = js.native
    def computeSafeArtifactName(suggestedName: String, ext: String, arch: Null, skipDefaultArch: Boolean, defaultArch: String): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: String,
      ext: String,
      arch: Null,
      skipDefaultArch: Boolean,
      defaultArch: String,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: String,
      ext: String,
      arch: Null,
      skipDefaultArch: Boolean,
      defaultArch: Unit,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(suggestedName: String, ext: String, arch: Null, skipDefaultArch: Unit, defaultArch: String): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: String,
      ext: String,
      arch: Null,
      skipDefaultArch: Unit,
      defaultArch: String,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: String,
      ext: String,
      arch: Null,
      skipDefaultArch: Unit,
      defaultArch: Unit,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(suggestedName: String, ext: String, arch: Unit, skipDefaultArch: Boolean): String | Null = js.native
    def computeSafeArtifactName(suggestedName: String, ext: String, arch: Unit, skipDefaultArch: Boolean, defaultArch: String): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: String,
      ext: String,
      arch: Unit,
      skipDefaultArch: Boolean,
      defaultArch: String,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: String,
      ext: String,
      arch: Unit,
      skipDefaultArch: Boolean,
      defaultArch: Unit,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(suggestedName: String, ext: String, arch: Unit, skipDefaultArch: Unit, defaultArch: String): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: String,
      ext: String,
      arch: Unit,
      skipDefaultArch: Unit,
      defaultArch: String,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: String,
      ext: String,
      arch: Unit,
      skipDefaultArch: Unit,
      defaultArch: Unit,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(suggestedName: String, ext: String, arch: Arch): String | Null = js.native
    def computeSafeArtifactName(suggestedName: String, ext: String, arch: Arch, skipDefaultArch: Boolean): String | Null = js.native
    def computeSafeArtifactName(suggestedName: String, ext: String, arch: Arch, skipDefaultArch: Boolean, defaultArch: String): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: String,
      ext: String,
      arch: Arch,
      skipDefaultArch: Boolean,
      defaultArch: String,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: String,
      ext: String,
      arch: Arch,
      skipDefaultArch: Boolean,
      defaultArch: Unit,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(suggestedName: String, ext: String, arch: Arch, skipDefaultArch: Unit, defaultArch: String): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: String,
      ext: String,
      arch: Arch,
      skipDefaultArch: Unit,
      defaultArch: String,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: String,
      ext: String,
      arch: Arch,
      skipDefaultArch: Unit,
      defaultArch: Unit,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(suggestedName: Null, ext: String): String | Null = js.native
    def computeSafeArtifactName(suggestedName: Null, ext: String, arch: Null, skipDefaultArch: Boolean): String | Null = js.native
    def computeSafeArtifactName(suggestedName: Null, ext: String, arch: Null, skipDefaultArch: Boolean, defaultArch: String): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: Null,
      ext: String,
      arch: Null,
      skipDefaultArch: Boolean,
      defaultArch: String,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: Null,
      ext: String,
      arch: Null,
      skipDefaultArch: Boolean,
      defaultArch: Unit,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(suggestedName: Null, ext: String, arch: Null, skipDefaultArch: Unit, defaultArch: String): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: Null,
      ext: String,
      arch: Null,
      skipDefaultArch: Unit,
      defaultArch: String,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: Null,
      ext: String,
      arch: Null,
      skipDefaultArch: Unit,
      defaultArch: Unit,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(suggestedName: Null, ext: String, arch: Unit, skipDefaultArch: Boolean): String | Null = js.native
    def computeSafeArtifactName(suggestedName: Null, ext: String, arch: Unit, skipDefaultArch: Boolean, defaultArch: String): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: Null,
      ext: String,
      arch: Unit,
      skipDefaultArch: Boolean,
      defaultArch: String,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: Null,
      ext: String,
      arch: Unit,
      skipDefaultArch: Boolean,
      defaultArch: Unit,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(suggestedName: Null, ext: String, arch: Unit, skipDefaultArch: Unit, defaultArch: String): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: Null,
      ext: String,
      arch: Unit,
      skipDefaultArch: Unit,
      defaultArch: String,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: Null,
      ext: String,
      arch: Unit,
      skipDefaultArch: Unit,
      defaultArch: Unit,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(suggestedName: Null, ext: String, arch: Arch): String | Null = js.native
    def computeSafeArtifactName(suggestedName: Null, ext: String, arch: Arch, skipDefaultArch: Boolean): String | Null = js.native
    def computeSafeArtifactName(suggestedName: Null, ext: String, arch: Arch, skipDefaultArch: Boolean, defaultArch: String): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: Null,
      ext: String,
      arch: Arch,
      skipDefaultArch: Boolean,
      defaultArch: String,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: Null,
      ext: String,
      arch: Arch,
      skipDefaultArch: Boolean,
      defaultArch: Unit,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(suggestedName: Null, ext: String, arch: Arch, skipDefaultArch: Unit, defaultArch: String): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: Null,
      ext: String,
      arch: Arch,
      skipDefaultArch: Unit,
      defaultArch: String,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: Null,
      ext: String,
      arch: Arch,
      skipDefaultArch: Unit,
      defaultArch: Unit,
      safePattern: String
    ): String | Null = js.native
    
    def config: Configuration = js.native
    
    /* private */ var copyAppFiles: Any = js.native
    
    def createGetFileMatchersOptions(outDir: String, arch: Arch, customBuildOptions: PlatformSpecificBuildOptions): GetFileMatchersOptions = js.native
    
    def createTargets(
      targets: js.Array[String],
      mapper: js.Function2[/* name */ String, /* factory */ js.Function1[/* outDir */ String, Target], Unit]
    ): Unit = js.native
    
    /* protected */ def createTransformerForExtraFiles(packContext: AfterPackContext): FileTransformer | Null = js.native
    
    def debugLogger: DebugLogger = js.native
    
    def defaultTarget: js.Array[String] = js.native
    
    def dispatchArtifactCreated(file: String): js.Promise[Unit] = js.native
    def dispatchArtifactCreated(file: String, target: Null, arch: Null, safeArtifactName: String): js.Promise[Unit] = js.native
    def dispatchArtifactCreated(file: String, target: Null, arch: Arch): js.Promise[Unit] = js.native
    def dispatchArtifactCreated(file: String, target: Null, arch: Arch, safeArtifactName: String): js.Promise[Unit] = js.native
    def dispatchArtifactCreated(file: String, target: Target): js.Promise[Unit] = js.native
    def dispatchArtifactCreated(file: String, target: Target, arch: Null, safeArtifactName: String): js.Promise[Unit] = js.native
    def dispatchArtifactCreated(file: String, target: Target, arch: Arch): js.Promise[Unit] = js.native
    def dispatchArtifactCreated(file: String, target: Target, arch: Arch, safeArtifactName: String): js.Promise[Unit] = js.native
    
    /* protected */ def doGetCscPassword(): js.UndefOr[String | Null] = js.native
    
    /* protected */ def doPack(
      outDir: String,
      appOutDir: String,
      platformName: ElectronPlatformName,
      arch: Arch,
      platformSpecificBuildOptions: DC,
      targets: js.Array[Target]
    ): js.Promise[Unit] = js.native
    /* protected */ def doPack(
      outDir: String,
      appOutDir: String,
      platformName: ElectronPlatformName,
      arch: Arch,
      platformSpecificBuildOptions: DC,
      targets: js.Array[Target],
      sign: Boolean
    ): js.Promise[Unit] = js.native
    /* protected */ def doPack(
      outDir: String,
      appOutDir: String,
      platformName: ElectronPlatformName,
      arch: Arch,
      platformSpecificBuildOptions: DC,
      targets: js.Array[Target],
      sign: Boolean,
      disableAsarIntegrity: Boolean
    ): js.Promise[Unit] = js.native
    /* protected */ def doPack(
      outDir: String,
      appOutDir: String,
      platformName: ElectronPlatformName,
      arch: Arch,
      platformSpecificBuildOptions: DC,
      targets: js.Array[Target],
      sign: Unit,
      disableAsarIntegrity: Boolean
    ): js.Promise[Unit] = js.native
    
    /* protected */ def doSignAfterPack(
      outDir: String,
      appOutDir: String,
      platformName: ElectronPlatformName,
      arch: Arch,
      platformSpecificBuildOptions: DC,
      targets: js.Array[Target]
    ): js.Promise[Unit] = js.native
    
    def expandArtifactBeautyNamePattern(targetSpecificOptions: Null, ext: String): String = js.native
    def expandArtifactBeautyNamePattern(targetSpecificOptions: Null, ext: String, arch: Arch): String = js.native
    def expandArtifactBeautyNamePattern(targetSpecificOptions: Unit, ext: String): String = js.native
    def expandArtifactBeautyNamePattern(targetSpecificOptions: Unit, ext: String, arch: Arch): String = js.native
    def expandArtifactBeautyNamePattern(targetSpecificOptions: TargetSpecificOptions, ext: String): String = js.native
    def expandArtifactBeautyNamePattern(targetSpecificOptions: TargetSpecificOptions, ext: String, arch: Arch): String = js.native
    
    def expandArtifactNamePattern(
      targetSpecificOptions: js.UndefOr[TargetSpecificOptions | Null],
      ext: String,
      arch: js.UndefOr[Arch | Null],
      defaultPattern: js.UndefOr[String],
      skipDefaultArch: js.UndefOr[Boolean],
      defaultArch: js.UndefOr[String]
    ): String = js.native
    
    def expandMacro(pattern: String): String = js.native
    def expandMacro(pattern: String, arch: String): String = js.native
    def expandMacro(pattern: String, arch: String, extra: Any): String = js.native
    def expandMacro(pattern: String, arch: String, extra: Any, isProductNameSanitized: Boolean): String = js.native
    def expandMacro(pattern: String, arch: String, extra: Unit, isProductNameSanitized: Boolean): String = js.native
    def expandMacro(pattern: String, arch: Null, extra: Any): String = js.native
    def expandMacro(pattern: String, arch: Null, extra: Any, isProductNameSanitized: Boolean): String = js.native
    def expandMacro(pattern: String, arch: Null, extra: Unit, isProductNameSanitized: Boolean): String = js.native
    def expandMacro(pattern: String, arch: Unit, extra: Any): String = js.native
    def expandMacro(pattern: String, arch: Unit, extra: Any, isProductNameSanitized: Boolean): String = js.native
    def expandMacro(pattern: String, arch: Unit, extra: Unit, isProductNameSanitized: Boolean): String = js.native
    
    def fileAssociations: js.Array[FileAssociation] = js.native
    
    def forceCodeSigning: Boolean = js.native
    
    def generateName2(ext: String, classifier: String, deployment: Boolean): String = js.native
    def generateName2(ext: String, classifier: Null, deployment: Boolean): String = js.native
    def generateName2(ext: String, classifier: Unit, deployment: Boolean): String = js.native
    def generateName2(ext: Null, classifier: String, deployment: Boolean): String = js.native
    def generateName2(ext: Null, classifier: Null, deployment: Boolean): String = js.native
    def generateName2(ext: Null, classifier: Unit, deployment: Boolean): String = js.native
    
    /* protected */ def getCscLink(): js.UndefOr[String | Null] = js.native
    /* protected */ def getCscLink(extraEnvName: String): js.UndefOr[String | Null] = js.native
    
    /* protected */ def getCscPassword(): String = js.native
    
    def getDefaultFrameworkIcon(): String | Null = js.native
    
    def getElectronDestinationDir(appOutDir: String): String = js.native
    
    def getElectronSrcDir(dist: String): String = js.native
    
    /* private */ var getExtraFileMatchers: Any = js.native
    
    def getIconPath(): js.Promise[String | Null] = js.native
    
    def getMacOsResourcesDir(appOutDir: String): String = js.native
    
    /* protected */ def getOrConvertIcon(format: IconFormat): js.Promise[String | Null] = js.native
    
    def getResource(custom: String, names: String*): js.Promise[String | Null] = js.native
    def getResource(custom: Null, names: String*): js.Promise[String | Null] = js.native
    def getResource(custom: Unit, names: String*): js.Promise[String | Null] = js.native
    
    def getResourcesDir(appOutDir: String): String = js.native
    
    def getTempFile(suffix: String): js.Promise[String] = js.native
    
    val info: Packager = js.native
    
    def pack(outDir: String, arch: Arch, targets: js.Array[Target], taskManager: AsyncTaskManager): js.Promise[Any] = js.native
    
    /* protected */ def packageInDistributableFormat(appOutDir: String, arch: Arch, targets: js.Array[Target], taskManager: AsyncTaskManager): Unit = js.native
    
    def packagerOptions: PackagerOptions = js.native
    
    val platform: Platform = js.native
    
    val platformSpecificBuildOptions: DC = js.native
    
    /* protected */ def prepareAppInfo(appInfo: AppInfo): AppInfo = js.native
    
    def projectDir: String = js.native
    
    def resolveIcon(sources: js.Array[String], fallbackSources: js.Array[String], outputFormat: IconFormat): js.Promise[js.Array[IconInfo]] = js.native
    
    def resourceList: js.Promise[js.Array[String]] = js.native
    
    /* private */ var sanityCheckPackage: Any = js.native
    
    /* protected */ def signApp(packContext: AfterPackContext, isAsar: Boolean): js.Promise[Any] = js.native
  }
  /* static members */
  object PlatformPackager {
    
    @JSImport("app-builder-lib/out/platformPackager", "PlatformPackager")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("app-builder-lib/out/platformPackager", "PlatformPackager.buildAsyncTargets")
    @js.native
    def buildAsyncTargets: Any = js.native
    inline def buildAsyncTargets_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildAsyncTargets")(x.asInstanceOf[js.Any])
    
    @JSImport("app-builder-lib/out/platformPackager", "PlatformPackager.normalizePlatformSpecificBuildOptions")
    @js.native
    def normalizePlatformSpecificBuildOptions: Any = js.native
    inline def normalizePlatformSpecificBuildOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normalizePlatformSpecificBuildOptions")(x.asInstanceOf[js.Any])
  }
  
  inline def chooseNotNull(): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseNotNull")().asInstanceOf[js.UndefOr[String | Null]]
  inline def chooseNotNull(v1: String): js.UndefOr[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseNotNull")(v1.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Null]]
  inline def chooseNotNull(v1: String, v2: String): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("chooseNotNull")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
  inline def chooseNotNull(v1: Null, v2: String): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("chooseNotNull")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
  inline def chooseNotNull(v1: Unit, v2: String): js.UndefOr[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("chooseNotNull")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Null]]
  
  inline def computeSafeArtifactNameIfNeeded(suggestedName: String, safeNameProducer: js.Function0[String]): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSafeArtifactNameIfNeeded")(suggestedName.asInstanceOf[js.Any], safeNameProducer.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def computeSafeArtifactNameIfNeeded(suggestedName: Null, safeNameProducer: js.Function0[String]): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSafeArtifactNameIfNeeded")(suggestedName.asInstanceOf[js.Any], safeNameProducer.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def isSafeGithubName(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSafeGithubName")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSafeToUnpackElectronOnRemoteBuildServer(packager: PlatformPackager[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSafeToUnpackElectronOnRemoteBuildServer")(packager.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalizeExt(ext: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeExt")(ext.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def resolveFunction[T](executor: T, name: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(executor.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def resolveFunction[T](executor: String, name: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFunction")(executor.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.appBuilderLib.appBuilderLibStrings.icns
    - typingsJapgolly.appBuilderLib.appBuilderLibStrings.ico
    - typingsJapgolly.appBuilderLib.appBuilderLibStrings.set
  */
  trait IconFormat extends StObject
  object IconFormat {
    
    inline def icns: typingsJapgolly.appBuilderLib.appBuilderLibStrings.icns = "icns".asInstanceOf[typingsJapgolly.appBuilderLib.appBuilderLibStrings.icns]
    
    inline def ico: typingsJapgolly.appBuilderLib.appBuilderLibStrings.ico = "ico".asInstanceOf[typingsJapgolly.appBuilderLib.appBuilderLibStrings.ico]
    
    inline def set: typingsJapgolly.appBuilderLib.appBuilderLibStrings.set = "set".asInstanceOf[typingsJapgolly.appBuilderLib.appBuilderLibStrings.set]
  }
  
  trait IconInfo extends StObject {
    
    var file: String
    
    var size: Double
  }
  object IconInfo {
    
    inline def apply(file: String, size: Double): IconInfo = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconInfo]
    }
    
    extension [Self <: IconInfo](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
