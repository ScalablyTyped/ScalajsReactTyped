package typingsJapgolly.storybookCoreCommon.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.storybookCoreCommon.distTs3Dot9TypesMod.PackageJson
import typingsJapgolly.storybookCoreCommon.distTs3Dot9TypesMod.ReleaseNotesData
import typingsJapgolly.storybookCoreCommon.distTs3Dot9TypesMod.VersionCheck
import typingsJapgolly.storybookCoreCommon.distTs3Dot9UtilsFileCacheMod.FileSystemCache
import typingsJapgolly.storybookCoreCommon.storybookCoreCommonStrings.DEVELOPMENT
import typingsJapgolly.storybookCoreCommon.storybookCoreCommonStrings.PRODUCTION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/core-common.@storybook/core-common/dist/ts3.9/types.CLIOptions & @storybook/core-common.@storybook/core-common/dist/ts3.9/types.LoadOptions & @storybook/core-common.@storybook/core-common/dist/ts3.9/types.BuilderOptions & {  corePresets :std.Array<string>,   overridePresets :std.Array<string>,   frameworkPresets :std.Array<string>} */
trait CLIOptionsLoadOptionsBuil extends StObject {
  
  var cache: FileSystemCache
  
  var ci: js.UndefOr[Boolean] = js.undefined
  
  var configDir: js.UndefOr[String] & String
  
  var configType: js.UndefOr[DEVELOPMENT | PRODUCTION] = js.undefined
  
  var corePresets: js.Array[String]
  
  var debugWebpack: js.UndefOr[Boolean] = js.undefined
  
  var disableTelemetry: js.UndefOr[Boolean] = js.undefined
  
  var disableWebpackDefaults: js.UndefOr[Boolean] = js.undefined
  
  var dll: js.UndefOr[Boolean] = js.undefined
  
  var docs: js.UndefOr[Boolean] = js.undefined
  
  var docsDll: js.UndefOr[Boolean] = js.undefined
  
  var docsMode: Boolean
  
  var enableCrashReports: js.UndefOr[Boolean] = js.undefined
  
  var extendServer: js.UndefOr[
    js.Function1[
      /* server */ Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ], 
      Unit
    ]
  ] = js.undefined
  
  var features: js.UndefOr[ArgTypeTargetsV7] = js.undefined
  
  var forceBuildPreview: js.UndefOr[Boolean] = js.undefined
  
  var framework: String
  
  var frameworkPresets: js.Array[String]
  
  var host: js.UndefOr[String] = js.undefined
  
  var https: js.UndefOr[Boolean] = js.undefined
  
  var ignorePreview: js.UndefOr[Boolean] & Boolean
  
  var loglevel: js.UndefOr[String] = js.undefined
  
  var managerCache: js.UndefOr[Boolean] = js.undefined
  
  var modern: js.UndefOr[Boolean] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
  
  var outputDir: js.UndefOr[String] = js.undefined
  
  var overridePresets: js.Array[String]
  
  var packageJson: PackageJson
  
  var port: js.UndefOr[Double] = js.undefined
  
  var previewUrl: js.UndefOr[String] = js.undefined
  
  var quiet: js.UndefOr[Boolean] = js.undefined
  
  var releaseNotes: js.UndefOr[Boolean] = js.undefined
  
  var releaseNotesData: js.UndefOr[ReleaseNotesData] = js.undefined
  
  var serverChannelUrl: js.UndefOr[String] = js.undefined
  
  var smokeTest: js.UndefOr[Boolean] = js.undefined
  
  var sslCa: js.UndefOr[js.Array[String]] = js.undefined
  
  var sslCert: js.UndefOr[String] = js.undefined
  
  var sslKey: js.UndefOr[String] = js.undefined
  
  /**
    * @deprecated Use 'staticDirs' Storybook Configuration option instead
    */
  var staticDir: js.UndefOr[js.Array[String]] = js.undefined
  
  var uiDll: js.UndefOr[Boolean] = js.undefined
  
  var versionCheck: js.UndefOr[VersionCheck] = js.undefined
  
  var versionUpdates: js.UndefOr[Boolean] = js.undefined
  
  var webpackStatsJson: js.UndefOr[String | Boolean] = js.undefined
}
object CLIOptionsLoadOptionsBuil {
  
  inline def apply(
    cache: FileSystemCache,
    configDir: js.UndefOr[String] & String,
    corePresets: js.Array[String],
    docsMode: Boolean,
    framework: String,
    frameworkPresets: js.Array[String],
    ignorePreview: js.UndefOr[Boolean] & Boolean,
    overridePresets: js.Array[String],
    packageJson: PackageJson
  ): CLIOptionsLoadOptionsBuil = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], configDir = configDir.asInstanceOf[js.Any], corePresets = corePresets.asInstanceOf[js.Any], docsMode = docsMode.asInstanceOf[js.Any], framework = framework.asInstanceOf[js.Any], frameworkPresets = frameworkPresets.asInstanceOf[js.Any], ignorePreview = ignorePreview.asInstanceOf[js.Any], overridePresets = overridePresets.asInstanceOf[js.Any], packageJson = packageJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[CLIOptionsLoadOptionsBuil]
  }
  
  extension [Self <: CLIOptionsLoadOptionsBuil](x: Self) {
    
    inline def setCache(value: FileSystemCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCi(value: Boolean): Self = StObject.set(x, "ci", value.asInstanceOf[js.Any])
    
    inline def setCiUndefined: Self = StObject.set(x, "ci", js.undefined)
    
    inline def setConfigDir(value: js.UndefOr[String] & String): Self = StObject.set(x, "configDir", value.asInstanceOf[js.Any])
    
    inline def setConfigType(value: DEVELOPMENT | PRODUCTION): Self = StObject.set(x, "configType", value.asInstanceOf[js.Any])
    
    inline def setConfigTypeUndefined: Self = StObject.set(x, "configType", js.undefined)
    
    inline def setCorePresets(value: js.Array[String]): Self = StObject.set(x, "corePresets", value.asInstanceOf[js.Any])
    
    inline def setCorePresetsVarargs(value: String*): Self = StObject.set(x, "corePresets", js.Array(value*))
    
    inline def setDebugWebpack(value: Boolean): Self = StObject.set(x, "debugWebpack", value.asInstanceOf[js.Any])
    
    inline def setDebugWebpackUndefined: Self = StObject.set(x, "debugWebpack", js.undefined)
    
    inline def setDisableTelemetry(value: Boolean): Self = StObject.set(x, "disableTelemetry", value.asInstanceOf[js.Any])
    
    inline def setDisableTelemetryUndefined: Self = StObject.set(x, "disableTelemetry", js.undefined)
    
    inline def setDisableWebpackDefaults(value: Boolean): Self = StObject.set(x, "disableWebpackDefaults", value.asInstanceOf[js.Any])
    
    inline def setDisableWebpackDefaultsUndefined: Self = StObject.set(x, "disableWebpackDefaults", js.undefined)
    
    inline def setDll(value: Boolean): Self = StObject.set(x, "dll", value.asInstanceOf[js.Any])
    
    inline def setDllUndefined: Self = StObject.set(x, "dll", js.undefined)
    
    inline def setDocs(value: Boolean): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsDll(value: Boolean): Self = StObject.set(x, "docsDll", value.asInstanceOf[js.Any])
    
    inline def setDocsDllUndefined: Self = StObject.set(x, "docsDll", js.undefined)
    
    inline def setDocsMode(value: Boolean): Self = StObject.set(x, "docsMode", value.asInstanceOf[js.Any])
    
    inline def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
    
    inline def setEnableCrashReports(value: Boolean): Self = StObject.set(x, "enableCrashReports", value.asInstanceOf[js.Any])
    
    inline def setEnableCrashReportsUndefined: Self = StObject.set(x, "enableCrashReports", js.undefined)
    
    inline def setExtendServer(
      value: /* server */ Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ] => Callback
    ): Self = StObject.set(x, "extendServer", js.Any.fromFunction1((t0: /* server */ Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]) => value(t0).runNow()))
    
    inline def setExtendServerUndefined: Self = StObject.set(x, "extendServer", js.undefined)
    
    inline def setFeatures(value: ArgTypeTargetsV7): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setForceBuildPreview(value: Boolean): Self = StObject.set(x, "forceBuildPreview", value.asInstanceOf[js.Any])
    
    inline def setForceBuildPreviewUndefined: Self = StObject.set(x, "forceBuildPreview", js.undefined)
    
    inline def setFramework(value: String): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    inline def setFrameworkPresets(value: js.Array[String]): Self = StObject.set(x, "frameworkPresets", value.asInstanceOf[js.Any])
    
    inline def setFrameworkPresetsVarargs(value: String*): Self = StObject.set(x, "frameworkPresets", js.Array(value*))
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    inline def setIgnorePreview(value: js.UndefOr[Boolean] & Boolean): Self = StObject.set(x, "ignorePreview", value.asInstanceOf[js.Any])
    
    inline def setLoglevel(value: String): Self = StObject.set(x, "loglevel", value.asInstanceOf[js.Any])
    
    inline def setLoglevelUndefined: Self = StObject.set(x, "loglevel", js.undefined)
    
    inline def setManagerCache(value: Boolean): Self = StObject.set(x, "managerCache", value.asInstanceOf[js.Any])
    
    inline def setManagerCacheUndefined: Self = StObject.set(x, "managerCache", js.undefined)
    
    inline def setModern(value: Boolean): Self = StObject.set(x, "modern", value.asInstanceOf[js.Any])
    
    inline def setModernUndefined: Self = StObject.set(x, "modern", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setOutputDir(value: String): Self = StObject.set(x, "outputDir", value.asInstanceOf[js.Any])
    
    inline def setOutputDirUndefined: Self = StObject.set(x, "outputDir", js.undefined)
    
    inline def setOverridePresets(value: js.Array[String]): Self = StObject.set(x, "overridePresets", value.asInstanceOf[js.Any])
    
    inline def setOverridePresetsVarargs(value: String*): Self = StObject.set(x, "overridePresets", js.Array(value*))
    
    inline def setPackageJson(value: PackageJson): Self = StObject.set(x, "packageJson", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setPreviewUrl(value: String): Self = StObject.set(x, "previewUrl", value.asInstanceOf[js.Any])
    
    inline def setPreviewUrlUndefined: Self = StObject.set(x, "previewUrl", js.undefined)
    
    inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    
    inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    
    inline def setReleaseNotes(value: Boolean): Self = StObject.set(x, "releaseNotes", value.asInstanceOf[js.Any])
    
    inline def setReleaseNotesData(value: ReleaseNotesData): Self = StObject.set(x, "releaseNotesData", value.asInstanceOf[js.Any])
    
    inline def setReleaseNotesDataUndefined: Self = StObject.set(x, "releaseNotesData", js.undefined)
    
    inline def setReleaseNotesUndefined: Self = StObject.set(x, "releaseNotes", js.undefined)
    
    inline def setServerChannelUrl(value: String): Self = StObject.set(x, "serverChannelUrl", value.asInstanceOf[js.Any])
    
    inline def setServerChannelUrlUndefined: Self = StObject.set(x, "serverChannelUrl", js.undefined)
    
    inline def setSmokeTest(value: Boolean): Self = StObject.set(x, "smokeTest", value.asInstanceOf[js.Any])
    
    inline def setSmokeTestUndefined: Self = StObject.set(x, "smokeTest", js.undefined)
    
    inline def setSslCa(value: js.Array[String]): Self = StObject.set(x, "sslCa", value.asInstanceOf[js.Any])
    
    inline def setSslCaUndefined: Self = StObject.set(x, "sslCa", js.undefined)
    
    inline def setSslCaVarargs(value: String*): Self = StObject.set(x, "sslCa", js.Array(value*))
    
    inline def setSslCert(value: String): Self = StObject.set(x, "sslCert", value.asInstanceOf[js.Any])
    
    inline def setSslCertUndefined: Self = StObject.set(x, "sslCert", js.undefined)
    
    inline def setSslKey(value: String): Self = StObject.set(x, "sslKey", value.asInstanceOf[js.Any])
    
    inline def setSslKeyUndefined: Self = StObject.set(x, "sslKey", js.undefined)
    
    inline def setStaticDir(value: js.Array[String]): Self = StObject.set(x, "staticDir", value.asInstanceOf[js.Any])
    
    inline def setStaticDirUndefined: Self = StObject.set(x, "staticDir", js.undefined)
    
    inline def setStaticDirVarargs(value: String*): Self = StObject.set(x, "staticDir", js.Array(value*))
    
    inline def setUiDll(value: Boolean): Self = StObject.set(x, "uiDll", value.asInstanceOf[js.Any])
    
    inline def setUiDllUndefined: Self = StObject.set(x, "uiDll", js.undefined)
    
    inline def setVersionCheck(value: VersionCheck): Self = StObject.set(x, "versionCheck", value.asInstanceOf[js.Any])
    
    inline def setVersionCheckUndefined: Self = StObject.set(x, "versionCheck", js.undefined)
    
    inline def setVersionUpdates(value: Boolean): Self = StObject.set(x, "versionUpdates", value.asInstanceOf[js.Any])
    
    inline def setVersionUpdatesUndefined: Self = StObject.set(x, "versionUpdates", js.undefined)
    
    inline def setWebpackStatsJson(value: String | Boolean): Self = StObject.set(x, "webpackStatsJson", value.asInstanceOf[js.Any])
    
    inline def setWebpackStatsJsonUndefined: Self = StObject.set(x, "webpackStatsJson", js.undefined)
  }
}
