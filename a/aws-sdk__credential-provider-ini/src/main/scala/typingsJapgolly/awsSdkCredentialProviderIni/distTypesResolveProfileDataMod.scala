package typingsJapgolly.awsSdkCredentialProviderIni

import typingsJapgolly.awsSdkCredentialProviderIni.awsSdkCredentialProviderIniBooleans.`true`
import typingsJapgolly.awsSdkCredentialProviderIni.distTypesFromIniMod.FromIniInit
import typingsJapgolly.awsSdkTypes.distTypesCredentialsMod.Credentials
import typingsJapgolly.awsSdkTypes.distTypesProfileMod.ParsedIniData
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResolveProfileDataMod {
  
  @JSImport("@aws-sdk/credential-provider-ini/dist-types/resolveProfileData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveProfileData(profileName: String, profiles: ParsedIniData, options: FromIniInit): js.Promise[Credentials] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProfileData")(profileName.asInstanceOf[js.Any], profiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Credentials]]
  
  inline def resolveProfileData_true(
    profileName: String,
    profiles: ParsedIniData,
    options: FromIniInit,
    visitedProfiles: Record[String, `true`]
  ): js.Promise[Credentials] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProfileData")(profileName.asInstanceOf[js.Any], profiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], visitedProfiles.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Credentials]]
}
