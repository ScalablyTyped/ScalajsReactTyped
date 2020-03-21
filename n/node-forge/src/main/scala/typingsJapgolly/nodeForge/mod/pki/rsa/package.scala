package typingsJapgolly.nodeForge.mod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rsa {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeForge.nodeForgeStrings.`RSAES-PKCS1-V1_5`
    - typingsJapgolly.nodeForge.nodeForgeStrings.`RSA-OAEP`
    - typingsJapgolly.nodeForge.nodeForgeStrings.RAW
    - typingsJapgolly.nodeForge.nodeForgeStrings.NONE
    - scala.Null
  */
  type EncryptionScheme = typingsJapgolly.nodeForge.mod.pki.rsa._EncryptionScheme | scala.Null
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeForge.nodeForgeStrings.`RSASSA-PKCS1-V1_5`
    - typingsJapgolly.nodeForge.mod.pss.PSS
    - typingsJapgolly.nodeForge.nodeForgeStrings.NONE
    - scala.Null
  */
  type SignatureScheme = typingsJapgolly.nodeForge.mod.pki.rsa._SignatureScheme | typingsJapgolly.nodeForge.mod.pss.PSS | scala.Null
}
