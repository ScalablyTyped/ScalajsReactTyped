package typingsJapgolly.awsSdkCredentialProviderWebIdentity

import typingsJapgolly.awsSdkCredentialProviderWebIdentity.distTypesFromTokenFileMod.FromTokenFileInit
import typingsJapgolly.awsSdkCredentialProviderWebIdentity.distTypesFromWebTokenMod.FromWebTokenInit
import typingsJapgolly.awsSdkTypes.distTypesCredentialsMod.CredentialProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/credential-provider-web-identity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromTokenFile(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTokenFile")().asInstanceOf[CredentialProvider]
  inline def fromTokenFile(init: FromTokenFileInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTokenFile")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  inline def fromWebToken(init: FromWebTokenInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWebToken")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
}
