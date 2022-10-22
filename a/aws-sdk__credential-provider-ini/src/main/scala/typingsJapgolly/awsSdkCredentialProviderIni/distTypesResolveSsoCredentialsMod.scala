package typingsJapgolly.awsSdkCredentialProviderIni

import typingsJapgolly.awsSdkCredentialProviderIni.anon.PartialSsoProfile
import typingsJapgolly.awsSdkTypes.distTypesCredentialsMod.Credentials
import typingsJapgolly.awsSdkTypes.distTypesProfileMod.Profile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResolveSsoCredentialsMod {
  
  @JSImport("@aws-sdk/credential-provider-ini/dist-types/resolveSsoCredentials", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isSsoProfile(arg: Profile): /* is @aws-sdk/credential-provider-ini.anon.PartialSsoProfile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSsoProfile")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is @aws-sdk/credential-provider-ini.anon.PartialSsoProfile */ Boolean]
  
  inline def resolveSsoCredentials(data: PartialSsoProfile): js.Promise[Credentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveSsoCredentials")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Credentials]]
}
