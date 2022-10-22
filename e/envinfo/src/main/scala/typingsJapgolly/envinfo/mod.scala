package typingsJapgolly.envinfo

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("envinfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cli(options: CliOptions): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("cli")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @JSImport("envinfo", "helpers")
  @js.native
  val helpers: Helpers_ = js.native
  
  inline def main(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("main")().asInstanceOf[js.Promise[String]]
  inline def main(config: Unit, options: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("main")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def main(config: Config): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("main")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def main(config: Config, options: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("main")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def run(config: RunConfig): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def run(config: RunConfig, options: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(config.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait CliOptions
    extends StObject
       with Options
       with Config {
    
    var all: js.UndefOr[Boolean] = js.undefined
    
    var helper: js.UndefOr[String] = js.undefined
    
    var preset: js.UndefOr[String] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
  }
  object CliOptions {
    
    inline def apply(): CliOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CliOptions]
    }
    
    extension [Self <: CliOptions](x: Self) {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setHelper(value: String): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
      
      inline def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
      
      inline def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  trait Config extends StObject {
    
    var Binaries: js.UndefOr[js.Array[String]] = js.undefined
    
    var Browsers: js.UndefOr[js.Array[String]] = js.undefined
    
    var Databases: js.UndefOr[js.Array[String]] = js.undefined
    
    var IDEs: js.UndefOr[js.Array[String]] = js.undefined
    
    var Languages: js.UndefOr[js.Array[String]] = js.undefined
    
    var Managers: js.UndefOr[js.Array[String]] = js.undefined
    
    var SDKs: js.UndefOr[js.Array[String]] = js.undefined
    
    var Servers: js.UndefOr[js.Array[String]] = js.undefined
    
    var System: js.UndefOr[js.Array[String]] = js.undefined
    
    var Utilities: js.UndefOr[js.Array[String]] = js.undefined
    
    var Virtualization: js.UndefOr[js.Array[String]] = js.undefined
    
    var npmGlobalPackages: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var npmPackages: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setBinaries(value: js.Array[String]): Self = StObject.set(x, "Binaries", value.asInstanceOf[js.Any])
      
      inline def setBinariesUndefined: Self = StObject.set(x, "Binaries", js.undefined)
      
      inline def setBinariesVarargs(value: String*): Self = StObject.set(x, "Binaries", js.Array(value*))
      
      inline def setBrowsers(value: js.Array[String]): Self = StObject.set(x, "Browsers", value.asInstanceOf[js.Any])
      
      inline def setBrowsersUndefined: Self = StObject.set(x, "Browsers", js.undefined)
      
      inline def setBrowsersVarargs(value: String*): Self = StObject.set(x, "Browsers", js.Array(value*))
      
      inline def setDatabases(value: js.Array[String]): Self = StObject.set(x, "Databases", value.asInstanceOf[js.Any])
      
      inline def setDatabasesUndefined: Self = StObject.set(x, "Databases", js.undefined)
      
      inline def setDatabasesVarargs(value: String*): Self = StObject.set(x, "Databases", js.Array(value*))
      
      inline def setIDEs(value: js.Array[String]): Self = StObject.set(x, "IDEs", value.asInstanceOf[js.Any])
      
      inline def setIDEsUndefined: Self = StObject.set(x, "IDEs", js.undefined)
      
      inline def setIDEsVarargs(value: String*): Self = StObject.set(x, "IDEs", js.Array(value*))
      
      inline def setLanguages(value: js.Array[String]): Self = StObject.set(x, "Languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesUndefined: Self = StObject.set(x, "Languages", js.undefined)
      
      inline def setLanguagesVarargs(value: String*): Self = StObject.set(x, "Languages", js.Array(value*))
      
      inline def setManagers(value: js.Array[String]): Self = StObject.set(x, "Managers", value.asInstanceOf[js.Any])
      
      inline def setManagersUndefined: Self = StObject.set(x, "Managers", js.undefined)
      
      inline def setManagersVarargs(value: String*): Self = StObject.set(x, "Managers", js.Array(value*))
      
      inline def setNpmGlobalPackages(value: String | js.Array[String]): Self = StObject.set(x, "npmGlobalPackages", value.asInstanceOf[js.Any])
      
      inline def setNpmGlobalPackagesUndefined: Self = StObject.set(x, "npmGlobalPackages", js.undefined)
      
      inline def setNpmGlobalPackagesVarargs(value: String*): Self = StObject.set(x, "npmGlobalPackages", js.Array(value*))
      
      inline def setNpmPackages(value: String | js.Array[String]): Self = StObject.set(x, "npmPackages", value.asInstanceOf[js.Any])
      
      inline def setNpmPackagesUndefined: Self = StObject.set(x, "npmPackages", js.undefined)
      
      inline def setNpmPackagesVarargs(value: String*): Self = StObject.set(x, "npmPackages", js.Array(value*))
      
      inline def setSDKs(value: js.Array[String]): Self = StObject.set(x, "SDKs", value.asInstanceOf[js.Any])
      
      inline def setSDKsUndefined: Self = StObject.set(x, "SDKs", js.undefined)
      
      inline def setSDKsVarargs(value: String*): Self = StObject.set(x, "SDKs", js.Array(value*))
      
      inline def setServers(value: js.Array[String]): Self = StObject.set(x, "Servers", value.asInstanceOf[js.Any])
      
      inline def setServersUndefined: Self = StObject.set(x, "Servers", js.undefined)
      
      inline def setServersVarargs(value: String*): Self = StObject.set(x, "Servers", js.Array(value*))
      
      inline def setSystem(value: js.Array[String]): Self = StObject.set(x, "System", value.asInstanceOf[js.Any])
      
      inline def setSystemUndefined: Self = StObject.set(x, "System", js.undefined)
      
      inline def setSystemVarargs(value: String*): Self = StObject.set(x, "System", js.Array(value*))
      
      inline def setUtilities(value: js.Array[String]): Self = StObject.set(x, "Utilities", value.asInstanceOf[js.Any])
      
      inline def setUtilitiesUndefined: Self = StObject.set(x, "Utilities", js.undefined)
      
      inline def setUtilitiesVarargs(value: String*): Self = StObject.set(x, "Utilities", js.Array(value*))
      
      inline def setVirtualization(value: js.Array[String]): Self = StObject.set(x, "Virtualization", value.asInstanceOf[js.Any])
      
      inline def setVirtualizationUndefined: Self = StObject.set(x, "Virtualization", js.undefined)
      
      inline def setVirtualizationVarargs(value: String*): Self = StObject.set(x, "Virtualization", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.envinfo.envinfoStrings.getNodeInfo
    - typingsJapgolly.envinfo.envinfoStrings.getnpmInfo
    - typingsJapgolly.envinfo.envinfoStrings.getWatchmanInfo
    - typingsJapgolly.envinfo.envinfoStrings.getYarnInfo
    - typingsJapgolly.envinfo.envinfoStrings.getBraveBrowserInfo
    - typingsJapgolly.envinfo.envinfoStrings.getChromeInfo
    - typingsJapgolly.envinfo.envinfoStrings.getChromeCanaryInfo
    - typingsJapgolly.envinfo.envinfoStrings.getEdgeInfo
    - typingsJapgolly.envinfo.envinfoStrings.getFirefoxInfo
    - typingsJapgolly.envinfo.envinfoStrings.getFirefoxDeveloperEditionInfo
    - typingsJapgolly.envinfo.envinfoStrings.getFirefoxNightlyInfo
    - typingsJapgolly.envinfo.envinfoStrings.getInternetExplorerInfo
    - typingsJapgolly.envinfo.envinfoStrings.getSafariTechnologyPreviewInfo
    - typingsJapgolly.envinfo.envinfoStrings.getSafariInfo
    - typingsJapgolly.envinfo.envinfoStrings.getMongoDBInfo
    - typingsJapgolly.envinfo.envinfoStrings.getMySQLInfo
    - typingsJapgolly.envinfo.envinfoStrings.getPostgreSQLInfo
    - typingsJapgolly.envinfo.envinfoStrings.getSQLiteInfo
    - typingsJapgolly.envinfo.envinfoStrings.getAndroidStudioInfo
    - typingsJapgolly.envinfo.envinfoStrings.getAtomInfo
    - typingsJapgolly.envinfo.envinfoStrings.getEmacsInfo
    - typingsJapgolly.envinfo.envinfoStrings.getIntelliJInfo
    - typingsJapgolly.envinfo.envinfoStrings.getNanoInfo
    - typingsJapgolly.envinfo.envinfoStrings.getNvimInfo
    - typingsJapgolly.envinfo.envinfoStrings.getPhpStormInfo
    - typingsJapgolly.envinfo.envinfoStrings.getSublimeTextInfo
    - typingsJapgolly.envinfo.envinfoStrings.getVimInfo
    - typingsJapgolly.envinfo.envinfoStrings.getVSCodeInfo
    - typingsJapgolly.envinfo.envinfoStrings.getVisualStudioInfo
    - typingsJapgolly.envinfo.envinfoStrings.getWebStormInfo
    - typingsJapgolly.envinfo.envinfoStrings.getXcodeInfo
    - typingsJapgolly.envinfo.envinfoStrings.getBashInfo
    - typingsJapgolly.envinfo.envinfoStrings.getElixirInfo
    - typingsJapgolly.envinfo.envinfoStrings.getErlangInfo
    - typingsJapgolly.envinfo.envinfoStrings.getGoInfo
    - typingsJapgolly.envinfo.envinfoStrings.getJavaInfo
    - typingsJapgolly.envinfo.envinfoStrings.getPerlInfo
    - typingsJapgolly.envinfo.envinfoStrings.getPHPInfo
    - typingsJapgolly.envinfo.envinfoStrings.getProtocInfo
    - typingsJapgolly.envinfo.envinfoStrings.getPythonInfo
    - typingsJapgolly.envinfo.envinfoStrings.getPython3Info
    - typingsJapgolly.envinfo.envinfoStrings.getRInfo
    - typingsJapgolly.envinfo.envinfoStrings.getRubyInfo
    - typingsJapgolly.envinfo.envinfoStrings.getRustInfo
    - typingsJapgolly.envinfo.envinfoStrings.getScalaInfo
    - typingsJapgolly.envinfo.envinfoStrings.getAptInfo
    - typingsJapgolly.envinfo.envinfoStrings.getCargoInfo
    - typingsJapgolly.envinfo.envinfoStrings.getCocoaPodsInfo
    - typingsJapgolly.envinfo.envinfoStrings.getComposerInfo
    - typingsJapgolly.envinfo.envinfoStrings.getGradleInfo
    - typingsJapgolly.envinfo.envinfoStrings.getHomebrewInfo
    - typingsJapgolly.envinfo.envinfoStrings.getMavenInfo
    - typingsJapgolly.envinfo.envinfoStrings.getpip2Info
    - typingsJapgolly.envinfo.envinfoStrings.getpip3Info
    - typingsJapgolly.envinfo.envinfoStrings.getRubyGemsInfo
    - typingsJapgolly.envinfo.envinfoStrings.getYumInfo
    - typingsJapgolly.envinfo.envinfoStrings.getYarnWorkspacesInfo
    - typingsJapgolly.envinfo.envinfoStrings.getLernaInfo
    - typingsJapgolly.envinfo.envinfoStrings.getAndroidSDKInfo
    - typingsJapgolly.envinfo.envinfoStrings.getiOSSDKInfo
    - typingsJapgolly.envinfo.envinfoStrings.getWindowsSDKInfo
    - typingsJapgolly.envinfo.envinfoStrings.getApacheInfo
    - typingsJapgolly.envinfo.envinfoStrings.getNginxInfo
    - typingsJapgolly.envinfo.envinfoStrings.getContainerInfo
    - typingsJapgolly.envinfo.envinfoStrings.getCPUInfo
    - typingsJapgolly.envinfo.envinfoStrings.getMemoryInfo
    - typingsJapgolly.envinfo.envinfoStrings.getOSInfo
    - typingsJapgolly.envinfo.envinfoStrings.getShellInfo
    - typingsJapgolly.envinfo.envinfoStrings.getGLibcInfo
    - typingsJapgolly.envinfo.envinfoStrings.getBazelInfo
    - typingsJapgolly.envinfo.envinfoStrings.getCMakeInfo
    - typingsJapgolly.envinfo.envinfoStrings.getGCCInfo
    - typingsJapgolly.envinfo.envinfoStrings.getClangInfo
    - typingsJapgolly.envinfo.envinfoStrings.getGitInfo
    - typingsJapgolly.envinfo.envinfoStrings.getMakeInfo
    - typingsJapgolly.envinfo.envinfoStrings.getMercurialInfo
    - typingsJapgolly.envinfo.envinfoStrings.getSubversionInfo
    - typingsJapgolly.envinfo.envinfoStrings.getFFmpegInfo
    - typingsJapgolly.envinfo.envinfoStrings.getDockerInfo
    - typingsJapgolly.envinfo.envinfoStrings.getParallelsInfo
    - typingsJapgolly.envinfo.envinfoStrings.getVirtualBoxInfo
    - typingsJapgolly.envinfo.envinfoStrings.getVMwareFusionInfo
  */
  trait HelperNames extends StObject
  object HelperNames {
    
    inline def getAndroidSDKInfo: typingsJapgolly.envinfo.envinfoStrings.getAndroidSDKInfo = "getAndroidSDKInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getAndroidSDKInfo]
    
    inline def getAndroidStudioInfo: typingsJapgolly.envinfo.envinfoStrings.getAndroidStudioInfo = "getAndroidStudioInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getAndroidStudioInfo]
    
    inline def getApacheInfo: typingsJapgolly.envinfo.envinfoStrings.getApacheInfo = "getApacheInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getApacheInfo]
    
    inline def getAptInfo: typingsJapgolly.envinfo.envinfoStrings.getAptInfo = "getAptInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getAptInfo]
    
    inline def getAtomInfo: typingsJapgolly.envinfo.envinfoStrings.getAtomInfo = "getAtomInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getAtomInfo]
    
    inline def getBashInfo: typingsJapgolly.envinfo.envinfoStrings.getBashInfo = "getBashInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getBashInfo]
    
    inline def getBazelInfo: typingsJapgolly.envinfo.envinfoStrings.getBazelInfo = "getBazelInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getBazelInfo]
    
    inline def getBraveBrowserInfo: typingsJapgolly.envinfo.envinfoStrings.getBraveBrowserInfo = "getBraveBrowserInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getBraveBrowserInfo]
    
    inline def getCMakeInfo: typingsJapgolly.envinfo.envinfoStrings.getCMakeInfo = "getCMakeInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getCMakeInfo]
    
    inline def getCPUInfo: typingsJapgolly.envinfo.envinfoStrings.getCPUInfo = "getCPUInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getCPUInfo]
    
    inline def getCargoInfo: typingsJapgolly.envinfo.envinfoStrings.getCargoInfo = "getCargoInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getCargoInfo]
    
    inline def getChromeCanaryInfo: typingsJapgolly.envinfo.envinfoStrings.getChromeCanaryInfo = "getChromeCanaryInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getChromeCanaryInfo]
    
    inline def getChromeInfo: typingsJapgolly.envinfo.envinfoStrings.getChromeInfo = "getChromeInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getChromeInfo]
    
    inline def getClangInfo: typingsJapgolly.envinfo.envinfoStrings.getClangInfo = "getClangInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getClangInfo]
    
    inline def getCocoaPodsInfo: typingsJapgolly.envinfo.envinfoStrings.getCocoaPodsInfo = "getCocoaPodsInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getCocoaPodsInfo]
    
    inline def getComposerInfo: typingsJapgolly.envinfo.envinfoStrings.getComposerInfo = "getComposerInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getComposerInfo]
    
    inline def getContainerInfo: typingsJapgolly.envinfo.envinfoStrings.getContainerInfo = "getContainerInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getContainerInfo]
    
    inline def getDockerInfo: typingsJapgolly.envinfo.envinfoStrings.getDockerInfo = "getDockerInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getDockerInfo]
    
    inline def getEdgeInfo: typingsJapgolly.envinfo.envinfoStrings.getEdgeInfo = "getEdgeInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getEdgeInfo]
    
    inline def getElixirInfo: typingsJapgolly.envinfo.envinfoStrings.getElixirInfo = "getElixirInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getElixirInfo]
    
    inline def getEmacsInfo: typingsJapgolly.envinfo.envinfoStrings.getEmacsInfo = "getEmacsInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getEmacsInfo]
    
    inline def getErlangInfo: typingsJapgolly.envinfo.envinfoStrings.getErlangInfo = "getErlangInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getErlangInfo]
    
    inline def getFFmpegInfo: typingsJapgolly.envinfo.envinfoStrings.getFFmpegInfo = "getFFmpegInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getFFmpegInfo]
    
    inline def getFirefoxDeveloperEditionInfo: typingsJapgolly.envinfo.envinfoStrings.getFirefoxDeveloperEditionInfo = "getFirefoxDeveloperEditionInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getFirefoxDeveloperEditionInfo]
    
    inline def getFirefoxInfo: typingsJapgolly.envinfo.envinfoStrings.getFirefoxInfo = "getFirefoxInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getFirefoxInfo]
    
    inline def getFirefoxNightlyInfo: typingsJapgolly.envinfo.envinfoStrings.getFirefoxNightlyInfo = "getFirefoxNightlyInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getFirefoxNightlyInfo]
    
    inline def getGCCInfo: typingsJapgolly.envinfo.envinfoStrings.getGCCInfo = "getGCCInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getGCCInfo]
    
    inline def getGLibcInfo: typingsJapgolly.envinfo.envinfoStrings.getGLibcInfo = "getGLibcInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getGLibcInfo]
    
    inline def getGitInfo: typingsJapgolly.envinfo.envinfoStrings.getGitInfo = "getGitInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getGitInfo]
    
    inline def getGoInfo: typingsJapgolly.envinfo.envinfoStrings.getGoInfo = "getGoInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getGoInfo]
    
    inline def getGradleInfo: typingsJapgolly.envinfo.envinfoStrings.getGradleInfo = "getGradleInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getGradleInfo]
    
    inline def getHomebrewInfo: typingsJapgolly.envinfo.envinfoStrings.getHomebrewInfo = "getHomebrewInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getHomebrewInfo]
    
    inline def getIntelliJInfo: typingsJapgolly.envinfo.envinfoStrings.getIntelliJInfo = "getIntelliJInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getIntelliJInfo]
    
    inline def getInternetExplorerInfo: typingsJapgolly.envinfo.envinfoStrings.getInternetExplorerInfo = "getInternetExplorerInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getInternetExplorerInfo]
    
    inline def getJavaInfo: typingsJapgolly.envinfo.envinfoStrings.getJavaInfo = "getJavaInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getJavaInfo]
    
    inline def getLernaInfo: typingsJapgolly.envinfo.envinfoStrings.getLernaInfo = "getLernaInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getLernaInfo]
    
    inline def getMakeInfo: typingsJapgolly.envinfo.envinfoStrings.getMakeInfo = "getMakeInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getMakeInfo]
    
    inline def getMavenInfo: typingsJapgolly.envinfo.envinfoStrings.getMavenInfo = "getMavenInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getMavenInfo]
    
    inline def getMemoryInfo: typingsJapgolly.envinfo.envinfoStrings.getMemoryInfo = "getMemoryInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getMemoryInfo]
    
    inline def getMercurialInfo: typingsJapgolly.envinfo.envinfoStrings.getMercurialInfo = "getMercurialInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getMercurialInfo]
    
    inline def getMongoDBInfo: typingsJapgolly.envinfo.envinfoStrings.getMongoDBInfo = "getMongoDBInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getMongoDBInfo]
    
    inline def getMySQLInfo: typingsJapgolly.envinfo.envinfoStrings.getMySQLInfo = "getMySQLInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getMySQLInfo]
    
    inline def getNanoInfo: typingsJapgolly.envinfo.envinfoStrings.getNanoInfo = "getNanoInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getNanoInfo]
    
    inline def getNginxInfo: typingsJapgolly.envinfo.envinfoStrings.getNginxInfo = "getNginxInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getNginxInfo]
    
    inline def getNodeInfo: typingsJapgolly.envinfo.envinfoStrings.getNodeInfo = "getNodeInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getNodeInfo]
    
    inline def getNvimInfo: typingsJapgolly.envinfo.envinfoStrings.getNvimInfo = "getNvimInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getNvimInfo]
    
    inline def getOSInfo: typingsJapgolly.envinfo.envinfoStrings.getOSInfo = "getOSInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getOSInfo]
    
    inline def getPHPInfo: typingsJapgolly.envinfo.envinfoStrings.getPHPInfo = "getPHPInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getPHPInfo]
    
    inline def getParallelsInfo: typingsJapgolly.envinfo.envinfoStrings.getParallelsInfo = "getParallelsInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getParallelsInfo]
    
    inline def getPerlInfo: typingsJapgolly.envinfo.envinfoStrings.getPerlInfo = "getPerlInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getPerlInfo]
    
    inline def getPhpStormInfo: typingsJapgolly.envinfo.envinfoStrings.getPhpStormInfo = "getPhpStormInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getPhpStormInfo]
    
    inline def getPostgreSQLInfo: typingsJapgolly.envinfo.envinfoStrings.getPostgreSQLInfo = "getPostgreSQLInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getPostgreSQLInfo]
    
    inline def getProtocInfo: typingsJapgolly.envinfo.envinfoStrings.getProtocInfo = "getProtocInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getProtocInfo]
    
    inline def getPython3Info: typingsJapgolly.envinfo.envinfoStrings.getPython3Info = "getPython3Info".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getPython3Info]
    
    inline def getPythonInfo: typingsJapgolly.envinfo.envinfoStrings.getPythonInfo = "getPythonInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getPythonInfo]
    
    inline def getRInfo: typingsJapgolly.envinfo.envinfoStrings.getRInfo = "getRInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getRInfo]
    
    inline def getRubyGemsInfo: typingsJapgolly.envinfo.envinfoStrings.getRubyGemsInfo = "getRubyGemsInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getRubyGemsInfo]
    
    inline def getRubyInfo: typingsJapgolly.envinfo.envinfoStrings.getRubyInfo = "getRubyInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getRubyInfo]
    
    inline def getRustInfo: typingsJapgolly.envinfo.envinfoStrings.getRustInfo = "getRustInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getRustInfo]
    
    inline def getSQLiteInfo: typingsJapgolly.envinfo.envinfoStrings.getSQLiteInfo = "getSQLiteInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getSQLiteInfo]
    
    inline def getSafariInfo: typingsJapgolly.envinfo.envinfoStrings.getSafariInfo = "getSafariInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getSafariInfo]
    
    inline def getSafariTechnologyPreviewInfo: typingsJapgolly.envinfo.envinfoStrings.getSafariTechnologyPreviewInfo = "getSafariTechnologyPreviewInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getSafariTechnologyPreviewInfo]
    
    inline def getScalaInfo: typingsJapgolly.envinfo.envinfoStrings.getScalaInfo = "getScalaInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getScalaInfo]
    
    inline def getShellInfo: typingsJapgolly.envinfo.envinfoStrings.getShellInfo = "getShellInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getShellInfo]
    
    inline def getSublimeTextInfo: typingsJapgolly.envinfo.envinfoStrings.getSublimeTextInfo = "getSublimeTextInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getSublimeTextInfo]
    
    inline def getSubversionInfo: typingsJapgolly.envinfo.envinfoStrings.getSubversionInfo = "getSubversionInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getSubversionInfo]
    
    inline def getVMwareFusionInfo: typingsJapgolly.envinfo.envinfoStrings.getVMwareFusionInfo = "getVMwareFusionInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getVMwareFusionInfo]
    
    inline def getVSCodeInfo: typingsJapgolly.envinfo.envinfoStrings.getVSCodeInfo = "getVSCodeInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getVSCodeInfo]
    
    inline def getVimInfo: typingsJapgolly.envinfo.envinfoStrings.getVimInfo = "getVimInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getVimInfo]
    
    inline def getVirtualBoxInfo: typingsJapgolly.envinfo.envinfoStrings.getVirtualBoxInfo = "getVirtualBoxInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getVirtualBoxInfo]
    
    inline def getVisualStudioInfo: typingsJapgolly.envinfo.envinfoStrings.getVisualStudioInfo = "getVisualStudioInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getVisualStudioInfo]
    
    inline def getWatchmanInfo: typingsJapgolly.envinfo.envinfoStrings.getWatchmanInfo = "getWatchmanInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getWatchmanInfo]
    
    inline def getWebStormInfo: typingsJapgolly.envinfo.envinfoStrings.getWebStormInfo = "getWebStormInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getWebStormInfo]
    
    inline def getWindowsSDKInfo: typingsJapgolly.envinfo.envinfoStrings.getWindowsSDKInfo = "getWindowsSDKInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getWindowsSDKInfo]
    
    inline def getXcodeInfo: typingsJapgolly.envinfo.envinfoStrings.getXcodeInfo = "getXcodeInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getXcodeInfo]
    
    inline def getYarnInfo: typingsJapgolly.envinfo.envinfoStrings.getYarnInfo = "getYarnInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getYarnInfo]
    
    inline def getYarnWorkspacesInfo: typingsJapgolly.envinfo.envinfoStrings.getYarnWorkspacesInfo = "getYarnWorkspacesInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getYarnWorkspacesInfo]
    
    inline def getYumInfo: typingsJapgolly.envinfo.envinfoStrings.getYumInfo = "getYumInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getYumInfo]
    
    inline def getiOSSDKInfo: typingsJapgolly.envinfo.envinfoStrings.getiOSSDKInfo = "getiOSSDKInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getiOSSDKInfo]
    
    inline def getnpmInfo: typingsJapgolly.envinfo.envinfoStrings.getnpmInfo = "getnpmInfo".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getnpmInfo]
    
    inline def getpip2Info: typingsJapgolly.envinfo.envinfoStrings.getpip2Info = "getpip2Info".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getpip2Info]
    
    inline def getpip3Info: typingsJapgolly.envinfo.envinfoStrings.getpip3Info = "getpip3Info".asInstanceOf[typingsJapgolly.envinfo.envinfoStrings.getpip3Info]
  }
  
  /* Inlined std.Record<envinfo.envinfo.HelperNames, (): std.Promise<string>> */
  trait Helpers_ extends StObject {
    
    def getAndroidSDKInfo(): js.Promise[String]
    @JSName("getAndroidSDKInfo")
    var getAndroidSDKInfo_Original: js.Function0[js.Promise[String]]
    
    def getAndroidStudioInfo(): js.Promise[String]
    @JSName("getAndroidStudioInfo")
    var getAndroidStudioInfo_Original: js.Function0[js.Promise[String]]
    
    def getApacheInfo(): js.Promise[String]
    @JSName("getApacheInfo")
    var getApacheInfo_Original: js.Function0[js.Promise[String]]
    
    def getAptInfo(): js.Promise[String]
    @JSName("getAptInfo")
    var getAptInfo_Original: js.Function0[js.Promise[String]]
    
    def getAtomInfo(): js.Promise[String]
    @JSName("getAtomInfo")
    var getAtomInfo_Original: js.Function0[js.Promise[String]]
    
    def getBashInfo(): js.Promise[String]
    @JSName("getBashInfo")
    var getBashInfo_Original: js.Function0[js.Promise[String]]
    
    def getBazelInfo(): js.Promise[String]
    @JSName("getBazelInfo")
    var getBazelInfo_Original: js.Function0[js.Promise[String]]
    
    def getBraveBrowserInfo(): js.Promise[String]
    @JSName("getBraveBrowserInfo")
    var getBraveBrowserInfo_Original: js.Function0[js.Promise[String]]
    
    def getCMakeInfo(): js.Promise[String]
    @JSName("getCMakeInfo")
    var getCMakeInfo_Original: js.Function0[js.Promise[String]]
    
    def getCPUInfo(): js.Promise[String]
    @JSName("getCPUInfo")
    var getCPUInfo_Original: js.Function0[js.Promise[String]]
    
    def getCargoInfo(): js.Promise[String]
    @JSName("getCargoInfo")
    var getCargoInfo_Original: js.Function0[js.Promise[String]]
    
    def getChromeCanaryInfo(): js.Promise[String]
    @JSName("getChromeCanaryInfo")
    var getChromeCanaryInfo_Original: js.Function0[js.Promise[String]]
    
    def getChromeInfo(): js.Promise[String]
    @JSName("getChromeInfo")
    var getChromeInfo_Original: js.Function0[js.Promise[String]]
    
    def getClangInfo(): js.Promise[String]
    @JSName("getClangInfo")
    var getClangInfo_Original: js.Function0[js.Promise[String]]
    
    def getCocoaPodsInfo(): js.Promise[String]
    @JSName("getCocoaPodsInfo")
    var getCocoaPodsInfo_Original: js.Function0[js.Promise[String]]
    
    def getComposerInfo(): js.Promise[String]
    @JSName("getComposerInfo")
    var getComposerInfo_Original: js.Function0[js.Promise[String]]
    
    def getContainerInfo(): js.Promise[String]
    @JSName("getContainerInfo")
    var getContainerInfo_Original: js.Function0[js.Promise[String]]
    
    def getDockerInfo(): js.Promise[String]
    @JSName("getDockerInfo")
    var getDockerInfo_Original: js.Function0[js.Promise[String]]
    
    def getEdgeInfo(): js.Promise[String]
    @JSName("getEdgeInfo")
    var getEdgeInfo_Original: js.Function0[js.Promise[String]]
    
    def getElixirInfo(): js.Promise[String]
    @JSName("getElixirInfo")
    var getElixirInfo_Original: js.Function0[js.Promise[String]]
    
    def getEmacsInfo(): js.Promise[String]
    @JSName("getEmacsInfo")
    var getEmacsInfo_Original: js.Function0[js.Promise[String]]
    
    def getErlangInfo(): js.Promise[String]
    @JSName("getErlangInfo")
    var getErlangInfo_Original: js.Function0[js.Promise[String]]
    
    def getFFmpegInfo(): js.Promise[String]
    @JSName("getFFmpegInfo")
    var getFFmpegInfo_Original: js.Function0[js.Promise[String]]
    
    def getFirefoxDeveloperEditionInfo(): js.Promise[String]
    @JSName("getFirefoxDeveloperEditionInfo")
    var getFirefoxDeveloperEditionInfo_Original: js.Function0[js.Promise[String]]
    
    def getFirefoxInfo(): js.Promise[String]
    @JSName("getFirefoxInfo")
    var getFirefoxInfo_Original: js.Function0[js.Promise[String]]
    
    def getFirefoxNightlyInfo(): js.Promise[String]
    @JSName("getFirefoxNightlyInfo")
    var getFirefoxNightlyInfo_Original: js.Function0[js.Promise[String]]
    
    def getGCCInfo(): js.Promise[String]
    @JSName("getGCCInfo")
    var getGCCInfo_Original: js.Function0[js.Promise[String]]
    
    def getGLibcInfo(): js.Promise[String]
    @JSName("getGLibcInfo")
    var getGLibcInfo_Original: js.Function0[js.Promise[String]]
    
    def getGitInfo(): js.Promise[String]
    @JSName("getGitInfo")
    var getGitInfo_Original: js.Function0[js.Promise[String]]
    
    def getGoInfo(): js.Promise[String]
    @JSName("getGoInfo")
    var getGoInfo_Original: js.Function0[js.Promise[String]]
    
    def getGradleInfo(): js.Promise[String]
    @JSName("getGradleInfo")
    var getGradleInfo_Original: js.Function0[js.Promise[String]]
    
    def getHomebrewInfo(): js.Promise[String]
    @JSName("getHomebrewInfo")
    var getHomebrewInfo_Original: js.Function0[js.Promise[String]]
    
    def getIntelliJInfo(): js.Promise[String]
    @JSName("getIntelliJInfo")
    var getIntelliJInfo_Original: js.Function0[js.Promise[String]]
    
    def getInternetExplorerInfo(): js.Promise[String]
    @JSName("getInternetExplorerInfo")
    var getInternetExplorerInfo_Original: js.Function0[js.Promise[String]]
    
    def getJavaInfo(): js.Promise[String]
    @JSName("getJavaInfo")
    var getJavaInfo_Original: js.Function0[js.Promise[String]]
    
    def getLernaInfo(): js.Promise[String]
    @JSName("getLernaInfo")
    var getLernaInfo_Original: js.Function0[js.Promise[String]]
    
    def getMakeInfo(): js.Promise[String]
    @JSName("getMakeInfo")
    var getMakeInfo_Original: js.Function0[js.Promise[String]]
    
    def getMavenInfo(): js.Promise[String]
    @JSName("getMavenInfo")
    var getMavenInfo_Original: js.Function0[js.Promise[String]]
    
    def getMemoryInfo(): js.Promise[String]
    @JSName("getMemoryInfo")
    var getMemoryInfo_Original: js.Function0[js.Promise[String]]
    
    def getMercurialInfo(): js.Promise[String]
    @JSName("getMercurialInfo")
    var getMercurialInfo_Original: js.Function0[js.Promise[String]]
    
    def getMongoDBInfo(): js.Promise[String]
    @JSName("getMongoDBInfo")
    var getMongoDBInfo_Original: js.Function0[js.Promise[String]]
    
    def getMySQLInfo(): js.Promise[String]
    @JSName("getMySQLInfo")
    var getMySQLInfo_Original: js.Function0[js.Promise[String]]
    
    def getNanoInfo(): js.Promise[String]
    @JSName("getNanoInfo")
    var getNanoInfo_Original: js.Function0[js.Promise[String]]
    
    def getNginxInfo(): js.Promise[String]
    @JSName("getNginxInfo")
    var getNginxInfo_Original: js.Function0[js.Promise[String]]
    
    def getNodeInfo(): js.Promise[String]
    @JSName("getNodeInfo")
    var getNodeInfo_Original: js.Function0[js.Promise[String]]
    
    def getNvimInfo(): js.Promise[String]
    @JSName("getNvimInfo")
    var getNvimInfo_Original: js.Function0[js.Promise[String]]
    
    def getOSInfo(): js.Promise[String]
    @JSName("getOSInfo")
    var getOSInfo_Original: js.Function0[js.Promise[String]]
    
    def getPHPInfo(): js.Promise[String]
    @JSName("getPHPInfo")
    var getPHPInfo_Original: js.Function0[js.Promise[String]]
    
    def getParallelsInfo(): js.Promise[String]
    @JSName("getParallelsInfo")
    var getParallelsInfo_Original: js.Function0[js.Promise[String]]
    
    def getPerlInfo(): js.Promise[String]
    @JSName("getPerlInfo")
    var getPerlInfo_Original: js.Function0[js.Promise[String]]
    
    def getPhpStormInfo(): js.Promise[String]
    @JSName("getPhpStormInfo")
    var getPhpStormInfo_Original: js.Function0[js.Promise[String]]
    
    def getPostgreSQLInfo(): js.Promise[String]
    @JSName("getPostgreSQLInfo")
    var getPostgreSQLInfo_Original: js.Function0[js.Promise[String]]
    
    def getProtocInfo(): js.Promise[String]
    @JSName("getProtocInfo")
    var getProtocInfo_Original: js.Function0[js.Promise[String]]
    
    def getPython3Info(): js.Promise[String]
    @JSName("getPython3Info")
    var getPython3Info_Original: js.Function0[js.Promise[String]]
    
    def getPythonInfo(): js.Promise[String]
    @JSName("getPythonInfo")
    var getPythonInfo_Original: js.Function0[js.Promise[String]]
    
    def getRInfo(): js.Promise[String]
    @JSName("getRInfo")
    var getRInfo_Original: js.Function0[js.Promise[String]]
    
    def getRubyGemsInfo(): js.Promise[String]
    @JSName("getRubyGemsInfo")
    var getRubyGemsInfo_Original: js.Function0[js.Promise[String]]
    
    def getRubyInfo(): js.Promise[String]
    @JSName("getRubyInfo")
    var getRubyInfo_Original: js.Function0[js.Promise[String]]
    
    def getRustInfo(): js.Promise[String]
    @JSName("getRustInfo")
    var getRustInfo_Original: js.Function0[js.Promise[String]]
    
    def getSQLiteInfo(): js.Promise[String]
    @JSName("getSQLiteInfo")
    var getSQLiteInfo_Original: js.Function0[js.Promise[String]]
    
    def getSafariInfo(): js.Promise[String]
    @JSName("getSafariInfo")
    var getSafariInfo_Original: js.Function0[js.Promise[String]]
    
    def getSafariTechnologyPreviewInfo(): js.Promise[String]
    @JSName("getSafariTechnologyPreviewInfo")
    var getSafariTechnologyPreviewInfo_Original: js.Function0[js.Promise[String]]
    
    def getScalaInfo(): js.Promise[String]
    @JSName("getScalaInfo")
    var getScalaInfo_Original: js.Function0[js.Promise[String]]
    
    def getShellInfo(): js.Promise[String]
    @JSName("getShellInfo")
    var getShellInfo_Original: js.Function0[js.Promise[String]]
    
    def getSublimeTextInfo(): js.Promise[String]
    @JSName("getSublimeTextInfo")
    var getSublimeTextInfo_Original: js.Function0[js.Promise[String]]
    
    def getSubversionInfo(): js.Promise[String]
    @JSName("getSubversionInfo")
    var getSubversionInfo_Original: js.Function0[js.Promise[String]]
    
    def getVMwareFusionInfo(): js.Promise[String]
    @JSName("getVMwareFusionInfo")
    var getVMwareFusionInfo_Original: js.Function0[js.Promise[String]]
    
    def getVSCodeInfo(): js.Promise[String]
    @JSName("getVSCodeInfo")
    var getVSCodeInfo_Original: js.Function0[js.Promise[String]]
    
    def getVimInfo(): js.Promise[String]
    @JSName("getVimInfo")
    var getVimInfo_Original: js.Function0[js.Promise[String]]
    
    def getVirtualBoxInfo(): js.Promise[String]
    @JSName("getVirtualBoxInfo")
    var getVirtualBoxInfo_Original: js.Function0[js.Promise[String]]
    
    def getVisualStudioInfo(): js.Promise[String]
    @JSName("getVisualStudioInfo")
    var getVisualStudioInfo_Original: js.Function0[js.Promise[String]]
    
    def getWatchmanInfo(): js.Promise[String]
    @JSName("getWatchmanInfo")
    var getWatchmanInfo_Original: js.Function0[js.Promise[String]]
    
    def getWebStormInfo(): js.Promise[String]
    @JSName("getWebStormInfo")
    var getWebStormInfo_Original: js.Function0[js.Promise[String]]
    
    def getWindowsSDKInfo(): js.Promise[String]
    @JSName("getWindowsSDKInfo")
    var getWindowsSDKInfo_Original: js.Function0[js.Promise[String]]
    
    def getXcodeInfo(): js.Promise[String]
    @JSName("getXcodeInfo")
    var getXcodeInfo_Original: js.Function0[js.Promise[String]]
    
    def getYarnInfo(): js.Promise[String]
    @JSName("getYarnInfo")
    var getYarnInfo_Original: js.Function0[js.Promise[String]]
    
    def getYarnWorkspacesInfo(): js.Promise[String]
    @JSName("getYarnWorkspacesInfo")
    var getYarnWorkspacesInfo_Original: js.Function0[js.Promise[String]]
    
    def getYumInfo(): js.Promise[String]
    @JSName("getYumInfo")
    var getYumInfo_Original: js.Function0[js.Promise[String]]
    
    def getiOSSDKInfo(): js.Promise[String]
    @JSName("getiOSSDKInfo")
    var getiOSSDKInfo_Original: js.Function0[js.Promise[String]]
    
    def getnpmInfo(): js.Promise[String]
    @JSName("getnpmInfo")
    var getnpmInfo_Original: js.Function0[js.Promise[String]]
    
    def getpip2Info(): js.Promise[String]
    @JSName("getpip2Info")
    var getpip2Info_Original: js.Function0[js.Promise[String]]
    
    def getpip3Info(): js.Promise[String]
    @JSName("getpip3Info")
    var getpip3Info_Original: js.Function0[js.Promise[String]]
  }
  object Helpers_ {
    
    inline def apply(
      getAndroidSDKInfo: CallbackTo[js.Promise[String]],
      getAndroidStudioInfo: CallbackTo[js.Promise[String]],
      getApacheInfo: CallbackTo[js.Promise[String]],
      getAptInfo: CallbackTo[js.Promise[String]],
      getAtomInfo: CallbackTo[js.Promise[String]],
      getBashInfo: CallbackTo[js.Promise[String]],
      getBazelInfo: CallbackTo[js.Promise[String]],
      getBraveBrowserInfo: CallbackTo[js.Promise[String]],
      getCMakeInfo: CallbackTo[js.Promise[String]],
      getCPUInfo: CallbackTo[js.Promise[String]],
      getCargoInfo: CallbackTo[js.Promise[String]],
      getChromeCanaryInfo: CallbackTo[js.Promise[String]],
      getChromeInfo: CallbackTo[js.Promise[String]],
      getClangInfo: CallbackTo[js.Promise[String]],
      getCocoaPodsInfo: CallbackTo[js.Promise[String]],
      getComposerInfo: CallbackTo[js.Promise[String]],
      getContainerInfo: CallbackTo[js.Promise[String]],
      getDockerInfo: CallbackTo[js.Promise[String]],
      getEdgeInfo: CallbackTo[js.Promise[String]],
      getElixirInfo: CallbackTo[js.Promise[String]],
      getEmacsInfo: CallbackTo[js.Promise[String]],
      getErlangInfo: CallbackTo[js.Promise[String]],
      getFFmpegInfo: CallbackTo[js.Promise[String]],
      getFirefoxDeveloperEditionInfo: CallbackTo[js.Promise[String]],
      getFirefoxInfo: CallbackTo[js.Promise[String]],
      getFirefoxNightlyInfo: CallbackTo[js.Promise[String]],
      getGCCInfo: CallbackTo[js.Promise[String]],
      getGLibcInfo: CallbackTo[js.Promise[String]],
      getGitInfo: CallbackTo[js.Promise[String]],
      getGoInfo: CallbackTo[js.Promise[String]],
      getGradleInfo: CallbackTo[js.Promise[String]],
      getHomebrewInfo: CallbackTo[js.Promise[String]],
      getIntelliJInfo: CallbackTo[js.Promise[String]],
      getInternetExplorerInfo: CallbackTo[js.Promise[String]],
      getJavaInfo: CallbackTo[js.Promise[String]],
      getLernaInfo: CallbackTo[js.Promise[String]],
      getMakeInfo: CallbackTo[js.Promise[String]],
      getMavenInfo: CallbackTo[js.Promise[String]],
      getMemoryInfo: CallbackTo[js.Promise[String]],
      getMercurialInfo: CallbackTo[js.Promise[String]],
      getMongoDBInfo: CallbackTo[js.Promise[String]],
      getMySQLInfo: CallbackTo[js.Promise[String]],
      getNanoInfo: CallbackTo[js.Promise[String]],
      getNginxInfo: CallbackTo[js.Promise[String]],
      getNodeInfo: CallbackTo[js.Promise[String]],
      getNvimInfo: CallbackTo[js.Promise[String]],
      getOSInfo: CallbackTo[js.Promise[String]],
      getPHPInfo: CallbackTo[js.Promise[String]],
      getParallelsInfo: CallbackTo[js.Promise[String]],
      getPerlInfo: CallbackTo[js.Promise[String]],
      getPhpStormInfo: CallbackTo[js.Promise[String]],
      getPostgreSQLInfo: CallbackTo[js.Promise[String]],
      getProtocInfo: CallbackTo[js.Promise[String]],
      getPython3Info: CallbackTo[js.Promise[String]],
      getPythonInfo: CallbackTo[js.Promise[String]],
      getRInfo: CallbackTo[js.Promise[String]],
      getRubyGemsInfo: CallbackTo[js.Promise[String]],
      getRubyInfo: CallbackTo[js.Promise[String]],
      getRustInfo: CallbackTo[js.Promise[String]],
      getSQLiteInfo: CallbackTo[js.Promise[String]],
      getSafariInfo: CallbackTo[js.Promise[String]],
      getSafariTechnologyPreviewInfo: CallbackTo[js.Promise[String]],
      getScalaInfo: CallbackTo[js.Promise[String]],
      getShellInfo: CallbackTo[js.Promise[String]],
      getSublimeTextInfo: CallbackTo[js.Promise[String]],
      getSubversionInfo: CallbackTo[js.Promise[String]],
      getVMwareFusionInfo: CallbackTo[js.Promise[String]],
      getVSCodeInfo: CallbackTo[js.Promise[String]],
      getVimInfo: CallbackTo[js.Promise[String]],
      getVirtualBoxInfo: CallbackTo[js.Promise[String]],
      getVisualStudioInfo: CallbackTo[js.Promise[String]],
      getWatchmanInfo: CallbackTo[js.Promise[String]],
      getWebStormInfo: CallbackTo[js.Promise[String]],
      getWindowsSDKInfo: CallbackTo[js.Promise[String]],
      getXcodeInfo: CallbackTo[js.Promise[String]],
      getYarnInfo: CallbackTo[js.Promise[String]],
      getYarnWorkspacesInfo: CallbackTo[js.Promise[String]],
      getYumInfo: CallbackTo[js.Promise[String]],
      getiOSSDKInfo: CallbackTo[js.Promise[String]],
      getnpmInfo: CallbackTo[js.Promise[String]],
      getpip2Info: CallbackTo[js.Promise[String]],
      getpip3Info: CallbackTo[js.Promise[String]]
    ): Helpers_ = {
      val __obj = js.Dynamic.literal(getAndroidSDKInfo = getAndroidSDKInfo.toJsFn, getAndroidStudioInfo = getAndroidStudioInfo.toJsFn, getApacheInfo = getApacheInfo.toJsFn, getAptInfo = getAptInfo.toJsFn, getAtomInfo = getAtomInfo.toJsFn, getBashInfo = getBashInfo.toJsFn, getBazelInfo = getBazelInfo.toJsFn, getBraveBrowserInfo = getBraveBrowserInfo.toJsFn, getCMakeInfo = getCMakeInfo.toJsFn, getCPUInfo = getCPUInfo.toJsFn, getCargoInfo = getCargoInfo.toJsFn, getChromeCanaryInfo = getChromeCanaryInfo.toJsFn, getChromeInfo = getChromeInfo.toJsFn, getClangInfo = getClangInfo.toJsFn, getCocoaPodsInfo = getCocoaPodsInfo.toJsFn, getComposerInfo = getComposerInfo.toJsFn, getContainerInfo = getContainerInfo.toJsFn, getDockerInfo = getDockerInfo.toJsFn, getEdgeInfo = getEdgeInfo.toJsFn, getElixirInfo = getElixirInfo.toJsFn, getEmacsInfo = getEmacsInfo.toJsFn, getErlangInfo = getErlangInfo.toJsFn, getFFmpegInfo = getFFmpegInfo.toJsFn, getFirefoxDeveloperEditionInfo = getFirefoxDeveloperEditionInfo.toJsFn, getFirefoxInfo = getFirefoxInfo.toJsFn, getFirefoxNightlyInfo = getFirefoxNightlyInfo.toJsFn, getGCCInfo = getGCCInfo.toJsFn, getGLibcInfo = getGLibcInfo.toJsFn, getGitInfo = getGitInfo.toJsFn, getGoInfo = getGoInfo.toJsFn, getGradleInfo = getGradleInfo.toJsFn, getHomebrewInfo = getHomebrewInfo.toJsFn, getIntelliJInfo = getIntelliJInfo.toJsFn, getInternetExplorerInfo = getInternetExplorerInfo.toJsFn, getJavaInfo = getJavaInfo.toJsFn, getLernaInfo = getLernaInfo.toJsFn, getMakeInfo = getMakeInfo.toJsFn, getMavenInfo = getMavenInfo.toJsFn, getMemoryInfo = getMemoryInfo.toJsFn, getMercurialInfo = getMercurialInfo.toJsFn, getMongoDBInfo = getMongoDBInfo.toJsFn, getMySQLInfo = getMySQLInfo.toJsFn, getNanoInfo = getNanoInfo.toJsFn, getNginxInfo = getNginxInfo.toJsFn, getNodeInfo = getNodeInfo.toJsFn, getNvimInfo = getNvimInfo.toJsFn, getOSInfo = getOSInfo.toJsFn, getPHPInfo = getPHPInfo.toJsFn, getParallelsInfo = getParallelsInfo.toJsFn, getPerlInfo = getPerlInfo.toJsFn, getPhpStormInfo = getPhpStormInfo.toJsFn, getPostgreSQLInfo = getPostgreSQLInfo.toJsFn, getProtocInfo = getProtocInfo.toJsFn, getPython3Info = getPython3Info.toJsFn, getPythonInfo = getPythonInfo.toJsFn, getRInfo = getRInfo.toJsFn, getRubyGemsInfo = getRubyGemsInfo.toJsFn, getRubyInfo = getRubyInfo.toJsFn, getRustInfo = getRustInfo.toJsFn, getSQLiteInfo = getSQLiteInfo.toJsFn, getSafariInfo = getSafariInfo.toJsFn, getSafariTechnologyPreviewInfo = getSafariTechnologyPreviewInfo.toJsFn, getScalaInfo = getScalaInfo.toJsFn, getShellInfo = getShellInfo.toJsFn, getSublimeTextInfo = getSublimeTextInfo.toJsFn, getSubversionInfo = getSubversionInfo.toJsFn, getVMwareFusionInfo = getVMwareFusionInfo.toJsFn, getVSCodeInfo = getVSCodeInfo.toJsFn, getVimInfo = getVimInfo.toJsFn, getVirtualBoxInfo = getVirtualBoxInfo.toJsFn, getVisualStudioInfo = getVisualStudioInfo.toJsFn, getWatchmanInfo = getWatchmanInfo.toJsFn, getWebStormInfo = getWebStormInfo.toJsFn, getWindowsSDKInfo = getWindowsSDKInfo.toJsFn, getXcodeInfo = getXcodeInfo.toJsFn, getYarnInfo = getYarnInfo.toJsFn, getYarnWorkspacesInfo = getYarnWorkspacesInfo.toJsFn, getYumInfo = getYumInfo.toJsFn, getiOSSDKInfo = getiOSSDKInfo.toJsFn, getnpmInfo = getnpmInfo.toJsFn, getpip2Info = getpip2Info.toJsFn, getpip3Info = getpip3Info.toJsFn)
      __obj.asInstanceOf[Helpers_]
    }
    
    extension [Self <: Helpers_](x: Self) {
      
      inline def setGetAndroidSDKInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getAndroidSDKInfo", value.toJsFn)
      
      inline def setGetAndroidStudioInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getAndroidStudioInfo", value.toJsFn)
      
      inline def setGetApacheInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getApacheInfo", value.toJsFn)
      
      inline def setGetAptInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getAptInfo", value.toJsFn)
      
      inline def setGetAtomInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getAtomInfo", value.toJsFn)
      
      inline def setGetBashInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getBashInfo", value.toJsFn)
      
      inline def setGetBazelInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getBazelInfo", value.toJsFn)
      
      inline def setGetBraveBrowserInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getBraveBrowserInfo", value.toJsFn)
      
      inline def setGetCMakeInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getCMakeInfo", value.toJsFn)
      
      inline def setGetCPUInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getCPUInfo", value.toJsFn)
      
      inline def setGetCargoInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getCargoInfo", value.toJsFn)
      
      inline def setGetChromeCanaryInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getChromeCanaryInfo", value.toJsFn)
      
      inline def setGetChromeInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getChromeInfo", value.toJsFn)
      
      inline def setGetClangInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getClangInfo", value.toJsFn)
      
      inline def setGetCocoaPodsInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getCocoaPodsInfo", value.toJsFn)
      
      inline def setGetComposerInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getComposerInfo", value.toJsFn)
      
      inline def setGetContainerInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getContainerInfo", value.toJsFn)
      
      inline def setGetDockerInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getDockerInfo", value.toJsFn)
      
      inline def setGetEdgeInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getEdgeInfo", value.toJsFn)
      
      inline def setGetElixirInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getElixirInfo", value.toJsFn)
      
      inline def setGetEmacsInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getEmacsInfo", value.toJsFn)
      
      inline def setGetErlangInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getErlangInfo", value.toJsFn)
      
      inline def setGetFFmpegInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getFFmpegInfo", value.toJsFn)
      
      inline def setGetFirefoxDeveloperEditionInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getFirefoxDeveloperEditionInfo", value.toJsFn)
      
      inline def setGetFirefoxInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getFirefoxInfo", value.toJsFn)
      
      inline def setGetFirefoxNightlyInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getFirefoxNightlyInfo", value.toJsFn)
      
      inline def setGetGCCInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getGCCInfo", value.toJsFn)
      
      inline def setGetGLibcInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getGLibcInfo", value.toJsFn)
      
      inline def setGetGitInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getGitInfo", value.toJsFn)
      
      inline def setGetGoInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getGoInfo", value.toJsFn)
      
      inline def setGetGradleInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getGradleInfo", value.toJsFn)
      
      inline def setGetHomebrewInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getHomebrewInfo", value.toJsFn)
      
      inline def setGetIntelliJInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getIntelliJInfo", value.toJsFn)
      
      inline def setGetInternetExplorerInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getInternetExplorerInfo", value.toJsFn)
      
      inline def setGetJavaInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getJavaInfo", value.toJsFn)
      
      inline def setGetLernaInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getLernaInfo", value.toJsFn)
      
      inline def setGetMakeInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getMakeInfo", value.toJsFn)
      
      inline def setGetMavenInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getMavenInfo", value.toJsFn)
      
      inline def setGetMemoryInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getMemoryInfo", value.toJsFn)
      
      inline def setGetMercurialInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getMercurialInfo", value.toJsFn)
      
      inline def setGetMongoDBInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getMongoDBInfo", value.toJsFn)
      
      inline def setGetMySQLInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getMySQLInfo", value.toJsFn)
      
      inline def setGetNanoInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getNanoInfo", value.toJsFn)
      
      inline def setGetNginxInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getNginxInfo", value.toJsFn)
      
      inline def setGetNodeInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getNodeInfo", value.toJsFn)
      
      inline def setGetNvimInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getNvimInfo", value.toJsFn)
      
      inline def setGetOSInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getOSInfo", value.toJsFn)
      
      inline def setGetPHPInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getPHPInfo", value.toJsFn)
      
      inline def setGetParallelsInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getParallelsInfo", value.toJsFn)
      
      inline def setGetPerlInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getPerlInfo", value.toJsFn)
      
      inline def setGetPhpStormInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getPhpStormInfo", value.toJsFn)
      
      inline def setGetPostgreSQLInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getPostgreSQLInfo", value.toJsFn)
      
      inline def setGetProtocInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getProtocInfo", value.toJsFn)
      
      inline def setGetPython3Info(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getPython3Info", value.toJsFn)
      
      inline def setGetPythonInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getPythonInfo", value.toJsFn)
      
      inline def setGetRInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getRInfo", value.toJsFn)
      
      inline def setGetRubyGemsInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getRubyGemsInfo", value.toJsFn)
      
      inline def setGetRubyInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getRubyInfo", value.toJsFn)
      
      inline def setGetRustInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getRustInfo", value.toJsFn)
      
      inline def setGetSQLiteInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSQLiteInfo", value.toJsFn)
      
      inline def setGetSafariInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSafariInfo", value.toJsFn)
      
      inline def setGetSafariTechnologyPreviewInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSafariTechnologyPreviewInfo", value.toJsFn)
      
      inline def setGetScalaInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getScalaInfo", value.toJsFn)
      
      inline def setGetShellInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getShellInfo", value.toJsFn)
      
      inline def setGetSublimeTextInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSublimeTextInfo", value.toJsFn)
      
      inline def setGetSubversionInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSubversionInfo", value.toJsFn)
      
      inline def setGetVMwareFusionInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getVMwareFusionInfo", value.toJsFn)
      
      inline def setGetVSCodeInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getVSCodeInfo", value.toJsFn)
      
      inline def setGetVimInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getVimInfo", value.toJsFn)
      
      inline def setGetVirtualBoxInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getVirtualBoxInfo", value.toJsFn)
      
      inline def setGetVisualStudioInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getVisualStudioInfo", value.toJsFn)
      
      inline def setGetWatchmanInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getWatchmanInfo", value.toJsFn)
      
      inline def setGetWebStormInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getWebStormInfo", value.toJsFn)
      
      inline def setGetWindowsSDKInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getWindowsSDKInfo", value.toJsFn)
      
      inline def setGetXcodeInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getXcodeInfo", value.toJsFn)
      
      inline def setGetYarnInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getYarnInfo", value.toJsFn)
      
      inline def setGetYarnWorkspacesInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getYarnWorkspacesInfo", value.toJsFn)
      
      inline def setGetYumInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getYumInfo", value.toJsFn)
      
      inline def setGetiOSSDKInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getiOSSDKInfo", value.toJsFn)
      
      inline def setGetnpmInfo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getnpmInfo", value.toJsFn)
      
      inline def setGetpip2Info(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getpip2Info", value.toJsFn)
      
      inline def setGetpip3Info(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getpip3Info", value.toJsFn)
    }
  }
  
  trait Options extends StObject {
    
    var console: js.UndefOr[Boolean] = js.undefined
    
    var duplicates: js.UndefOr[Boolean] = js.undefined
    
    var fullTree: js.UndefOr[Boolean] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var markdown: js.UndefOr[Boolean] = js.undefined
    
    var showNotFound: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConsole(value: Boolean): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
      
      inline def setDuplicates(value: Boolean): Self = StObject.set(x, "duplicates", value.asInstanceOf[js.Any])
      
      inline def setDuplicatesUndefined: Self = StObject.set(x, "duplicates", js.undefined)
      
      inline def setFullTree(value: Boolean): Self = StObject.set(x, "fullTree", value.asInstanceOf[js.Any])
      
      inline def setFullTreeUndefined: Self = StObject.set(x, "fullTree", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setMarkdown(value: Boolean): Self = StObject.set(x, "markdown", value.asInstanceOf[js.Any])
      
      inline def setMarkdownUndefined: Self = StObject.set(x, "markdown", js.undefined)
      
      inline def setShowNotFound(value: Boolean): Self = StObject.set(x, "showNotFound", value.asInstanceOf[js.Any])
      
      inline def setShowNotFoundUndefined: Self = StObject.set(x, "showNotFound", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait RunConfig
    extends StObject
       with Config {
    
    var preset: js.UndefOr[String] = js.undefined
  }
  object RunConfig {
    
    inline def apply(): RunConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RunConfig]
    }
    
    extension [Self <: RunConfig](x: Self) {
      
      inline def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    }
  }
}
