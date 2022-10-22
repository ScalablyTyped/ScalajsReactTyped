package typingsJapgolly.expoConfig

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.expoConfig.anon.AppName
import typingsJapgolly.expoConfig.anon.Config
import typingsJapgolly.expoConfig.anon.ConfigName
import typingsJapgolly.expoConfig.anon.PartialExpoConfig
import typingsJapgolly.expoConfig.anon.PickExpoConfigowner
import typingsJapgolly.expoConfig.anon.PickExpoConfigsdkVersion
import typingsJapgolly.expoConfig.buildConfigDottypesMod.ConfigErrorCode
import typingsJapgolly.expoConfig.buildConfigDottypesMod.ConfigFilePaths
import typingsJapgolly.expoConfig.buildConfigDottypesMod.ExpRc
import typingsJapgolly.expoConfig.buildConfigDottypesMod.GetConfigOptions
import typingsJapgolly.expoConfig.buildConfigDottypesMod.PackageJSONConfig
import typingsJapgolly.expoConfig.buildConfigDottypesMod.ProjectConfig
import typingsJapgolly.expoConfig.buildConfigDottypesMod.ProjectTarget
import typingsJapgolly.expoConfig.buildConfigDottypesMod.WriteConfigOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("@expo/config/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@expo/config/build", "ConfigError")
  @js.native
  open class ConfigError protected ()
    extends typingsJapgolly.expoConfig.buildErrorsMod.ConfigError {
    def this(message: String, code: ConfigErrorCode) = this()
    def this(message: String, code: ConfigErrorCode, cause: js.Error) = this()
  }
  
  @JSImport("@expo/config/build", "ProjectPrivacy")
  @js.native
  object ProjectPrivacy extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.expoConfig.buildConfigDottypesMod.ProjectPrivacy & String] = js.native
    
    /* "public" */ val PUBLIC: typingsJapgolly.expoConfig.buildConfigDottypesMod.ProjectPrivacy.PUBLIC & String = js.native
    
    /* "unlisted" */ val UNLISTED: typingsJapgolly.expoConfig.buildConfigDottypesMod.ProjectPrivacy.UNLISTED & String = js.native
  }
  
  inline def configFilename(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("configFilename")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def findConfigFile(projectRoot: String): ConfigName = ^.asInstanceOf[js.Dynamic].applyDynamic("findConfigFile")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[ConfigName]
  
  inline def getAccountUsername(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountUsername")().asInstanceOf[String]
  inline def getAccountUsername(manifest: PickExpoConfigowner): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountUsername")(manifest.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getConfig(projectRoot: String): ProjectConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[ProjectConfig]
  inline def getConfig(projectRoot: String, options: GetConfigOptions): ProjectConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(projectRoot.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProjectConfig]
  
  inline def getConfigFilePaths(projectRoot: String): ConfigFilePaths = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfigFilePaths")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[ConfigFilePaths]
  
  inline def getDefaultTarget(projectRoot: String): ProjectTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultTarget")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[ProjectTarget]
  inline def getDefaultTarget(projectRoot: String, exp: PickExpoConfigsdkVersion): ProjectTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultTarget")(projectRoot.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[ProjectTarget]
  
  inline def getExpoSDKVersion(projectRoot: String, exp: PickExpoConfigsdkVersion): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getExpoSDKVersion")(projectRoot.asInstanceOf[js.Any], exp.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getNameFromConfig(): AppName = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameFromConfig")().asInstanceOf[AppName]
  inline def getNameFromConfig(exp: Record[String, Any]): AppName = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameFromConfig")(exp.asInstanceOf[js.Any]).asInstanceOf[AppName]
  
  inline def getPackageJson(projectRoot: String): PackageJSONConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageJson")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[PackageJSONConfig]
  
  inline def getProjectConfigDescription(projectRoot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProjectConfigDescription")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getProjectConfigDescriptionWithPaths(projectRoot: String, projectConfig: ConfigFilePaths): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getProjectConfigDescriptionWithPaths")(projectRoot.asInstanceOf[js.Any], projectConfig.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getWebOutputPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebOutputPath")().asInstanceOf[String]
  inline def getWebOutputPath(config: StringDictionary[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebOutputPath")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isLegacyImportsEnabled(exp: PickExpoConfigsdkVersion): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegacyImportsEnabled")(exp.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def modifyConfigAsync(projectRoot: String, modifications: PartialExpoConfig): js.Promise[Config] = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyConfigAsync")(projectRoot.asInstanceOf[js.Any], modifications.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config]]
  inline def modifyConfigAsync(
    projectRoot: String,
    modifications: PartialExpoConfig,
    readOptions: Unit,
    writeOptions: WriteConfigOptions
  ): js.Promise[Config] = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyConfigAsync")(projectRoot.asInstanceOf[js.Any], modifications.asInstanceOf[js.Any], readOptions.asInstanceOf[js.Any], writeOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config]]
  inline def modifyConfigAsync(projectRoot: String, modifications: PartialExpoConfig, readOptions: GetConfigOptions): js.Promise[Config] = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyConfigAsync")(projectRoot.asInstanceOf[js.Any], modifications.asInstanceOf[js.Any], readOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config]]
  inline def modifyConfigAsync(
    projectRoot: String,
    modifications: PartialExpoConfig,
    readOptions: GetConfigOptions,
    writeOptions: WriteConfigOptions
  ): js.Promise[Config] = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyConfigAsync")(projectRoot.asInstanceOf[js.Any], modifications.asInstanceOf[js.Any], readOptions.asInstanceOf[js.Any], writeOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config]]
  
  inline def readConfigJson(projectRoot: String): ProjectConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("readConfigJson")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[ProjectConfig]
  inline def readConfigJson(projectRoot: String, skipValidation: Boolean): ProjectConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfigJson")(projectRoot.asInstanceOf[js.Any], skipValidation.asInstanceOf[js.Any])).asInstanceOf[ProjectConfig]
  inline def readConfigJson(projectRoot: String, skipValidation: Boolean, skipSDKVersionRequirement: Boolean): ProjectConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfigJson")(projectRoot.asInstanceOf[js.Any], skipValidation.asInstanceOf[js.Any], skipSDKVersionRequirement.asInstanceOf[js.Any])).asInstanceOf[ProjectConfig]
  inline def readConfigJson(projectRoot: String, skipValidation: Unit, skipSDKVersionRequirement: Boolean): ProjectConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfigJson")(projectRoot.asInstanceOf[js.Any], skipValidation.asInstanceOf[js.Any], skipSDKVersionRequirement.asInstanceOf[js.Any])).asInstanceOf[ProjectConfig]
  
  inline def readExpRcAsync(projectRoot: String): js.Promise[ExpRc] = ^.asInstanceOf[js.Dynamic].applyDynamic("readExpRcAsync")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ExpRc]]
  
  inline def resetCustomConfigPaths(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetCustomConfigPaths")().asInstanceOf[Unit]
  
  inline def setCustomConfigPath(projectRoot: String, configPath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomConfigPath")(projectRoot.asInstanceOf[js.Any], configPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeConfigJsonAsync(projectRoot: String, options: js.Object): js.Promise[ProjectConfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeConfigJsonAsync")(projectRoot.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProjectConfig]]
}
