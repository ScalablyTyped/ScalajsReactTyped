package typingsJapgolly.xmldsigjs

import typingsJapgolly.xmldsigjs.algorithmMod.SignatureAlgorithm
import typingsJapgolly.xmldsigjs.xmldsigjsStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2000Slash09SlashxmldsigNumbersignhmac-sha1`
import typingsJapgolly.xmldsigjs.xmldsigjsStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersignhmac-sha256`
import typingsJapgolly.xmldsigjs.xmldsigjsStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersignhmac-sha384`
import typingsJapgolly.xmldsigjs.xmldsigjsStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersignhmac-sha512`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/algorithms/hmac_sign", JSImport.Namespace)
@js.native
object hmacSignMod extends js.Object {
  @js.native
  class HmacSha1 () extends SignatureAlgorithm
  
  @js.native
  class HmacSha256 () extends SignatureAlgorithm
  
  @js.native
  class HmacSha384 () extends SignatureAlgorithm
  
  @js.native
  class HmacSha512 () extends SignatureAlgorithm
  
  val HMAC: typingsJapgolly.xmldsigjs.xmldsigjsStrings.HMAC = js.native
  val HMAC_SHA1_NAMESPACE: `httpColonSlashSlashwwwDotw3DotorgSlash2000Slash09SlashxmldsigNumbersignhmac-sha1` = js.native
  val HMAC_SHA256_NAMESPACE: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersignhmac-sha256` = js.native
  val HMAC_SHA384_NAMESPACE: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersignhmac-sha384` = js.native
  val HMAC_SHA512_NAMESPACE: `httpColonSlashSlashwwwDotw3DotorgSlash2001Slash04Slashxmldsig-moreNumbersignhmac-sha512` = js.native
}

