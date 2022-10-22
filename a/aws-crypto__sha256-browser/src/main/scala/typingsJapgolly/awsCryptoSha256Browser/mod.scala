package typingsJapgolly.awsCryptoSha256Browser

import typingsJapgolly.awsSdkTypes.distTypesCryptoMod.SourceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-crypto/sha256-browser", "Ie11Sha256")
  @js.native
  open class Ie11Sha256 ()
    extends typingsJapgolly.awsCryptoSha256Browser.buildIe11Sha256Mod.Sha256 {
    def this(secret: SourceData) = this()
  }
  
  @JSImport("@aws-crypto/sha256-browser", "Sha256")
  @js.native
  open class Sha256 ()
    extends typingsJapgolly.awsCryptoSha256Browser.buildCrossPlatformSha256Mod.Sha256 {
    def this(secret: SourceData) = this()
  }
  
  @JSImport("@aws-crypto/sha256-browser", "WebCryptoSha256")
  @js.native
  open class WebCryptoSha256 ()
    extends typingsJapgolly.awsCryptoSha256Browser.buildWebCryptoSha256Mod.Sha256 {
    def this(secret: SourceData) = this()
  }
}
