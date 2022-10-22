package typingsJapgolly.awsSdkSignatureV4

import typingsJapgolly.awsSdkTypes.distTypesCredentialsMod.Credentials
import typingsJapgolly.awsSdkTypes.distTypesCryptoMod.HashConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCredentialDerivationMod {
  
  @JSImport("@aws-sdk/signature-v4/dist-types/credentialDerivation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearCredentialCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCredentialCache")().asInstanceOf[Unit]
  
  inline def createScope(shortDate: String, region: String, service: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createScope")(shortDate.asInstanceOf[js.Any], region.asInstanceOf[js.Any], service.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getSigningKey(
    sha256Constructor: HashConstructor,
    credentials: Credentials,
    shortDate: String,
    region: String,
    service: String
  ): js.Promise[js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSigningKey")(sha256Constructor.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], shortDate.asInstanceOf[js.Any], region.asInstanceOf[js.Any], service.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
}
