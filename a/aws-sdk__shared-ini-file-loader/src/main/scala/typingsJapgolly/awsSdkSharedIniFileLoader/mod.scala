package typingsJapgolly.awsSdkSharedIniFileLoader

import typingsJapgolly.awsSdkSharedIniFileLoader.anon.Profile
import typingsJapgolly.awsSdkSharedIniFileLoader.distTypesGetSSOTokenFromFileMod.SSOToken
import typingsJapgolly.awsSdkSharedIniFileLoader.distTypesLoadSharedConfigFilesMod.SharedConfigInit
import typingsJapgolly.awsSdkSharedIniFileLoader.distTypesLoadSsoSessionDataMod.SsoSessionInit
import typingsJapgolly.awsSdkSharedIniFileLoader.distTypesParseKnownFilesMod.SourceProfileInit
import typingsJapgolly.awsSdkTypes.distTypesProfileMod.ParsedIniData
import typingsJapgolly.awsSdkTypes.distTypesProfileMod.SharedConfigFiles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/shared-ini-file-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/shared-ini-file-loader", "DEFAULT_PROFILE")
  @js.native
  val DEFAULT_PROFILE: /* "default" */ String = js.native
  
  @JSImport("@aws-sdk/shared-ini-file-loader", "ENV_PROFILE")
  @js.native
  val ENV_PROFILE: /* "AWS_PROFILE" */ String = js.native
  
  inline def getHomeDir(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getHomeDir")().asInstanceOf[String]
  
  inline def getProfileName(init: Profile): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProfileName")(init.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getSSOTokenFilepath(ssoStartUrl: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSSOTokenFilepath")(ssoStartUrl.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getSSOTokenFromFile(ssoStartUrl: String): js.Promise[SSOToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSSOTokenFromFile")(ssoStartUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SSOToken]]
  
  inline def loadSharedConfigFiles(): js.Promise[SharedConfigFiles] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSharedConfigFiles")().asInstanceOf[js.Promise[SharedConfigFiles]]
  inline def loadSharedConfigFiles(init: SharedConfigInit): js.Promise[SharedConfigFiles] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSharedConfigFiles")(init.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SharedConfigFiles]]
  
  inline def loadSsoSessionData(): js.Promise[ParsedIniData] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSsoSessionData")().asInstanceOf[js.Promise[ParsedIniData]]
  inline def loadSsoSessionData(init: SsoSessionInit): js.Promise[ParsedIniData] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSsoSessionData")(init.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ParsedIniData]]
  
  inline def parseKnownFiles(init: SourceProfileInit): js.Promise[ParsedIniData] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKnownFiles")(init.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ParsedIniData]]
}
