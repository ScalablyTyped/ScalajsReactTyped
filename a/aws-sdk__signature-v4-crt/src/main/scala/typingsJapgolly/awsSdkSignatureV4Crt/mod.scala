package typingsJapgolly.awsSdkSignatureV4Crt

import typingsJapgolly.awsSdkSignatureV4.distTypesSignatureV4Mod.SignatureV4CryptoInit
import typingsJapgolly.awsSdkSignatureV4Crt.distTypesCrtSignerV4Mod.CrtSignerV4Init
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/signature-v4-crt", "CrtSignerV4")
  @js.native
  open class CrtSignerV4 protected ()
    extends typingsJapgolly.awsSdkSignatureV4Crt.distTypesCrtSignerV4Mod.CrtSignerV4 {
    def this(hasCredentialsRegionServiceSha256ApplyChecksumUriEscapePathSigningAlgorithm: CrtSignerV4Init & SignatureV4CryptoInit) = this()
  }
}
