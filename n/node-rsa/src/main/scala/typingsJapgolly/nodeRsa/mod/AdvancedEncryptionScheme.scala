package typingsJapgolly.nodeRsa.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import typingsJapgolly.nodeRsa.nodeRsaStrings.pkcs1
import typingsJapgolly.nodeRsa.nodeRsaStrings.pkcs1_oaep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeRsa.mod.AdvancedEncryptionSchemePKCS1
  - typingsJapgolly.nodeRsa.mod.AdvancedEncryptionSchemePKCS1OAEP
*/
trait AdvancedEncryptionScheme extends js.Object

object AdvancedEncryptionScheme {
  @scala.inline
  def AdvancedEncryptionSchemePKCS1(padding: Double, scheme: pkcs1): AdvancedEncryptionScheme = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdvancedEncryptionScheme]
  }
  @scala.inline
  def AdvancedEncryptionSchemePKCS1OAEP(
    hash: HashingAlgorithm,
    scheme: pkcs1_oaep,
    mgf: (/* data */ Buffer, /* length */ Double, /* hash */ HashingAlgorithm) => CallbackTo[Buffer] = null
  ): AdvancedEncryptionScheme = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    if (mgf != null) __obj.updateDynamic("mgf")(js.Any.fromFunction3((t0: /* data */ typingsJapgolly.node.Buffer, t1: /* length */ scala.Double, t2: /* hash */ typingsJapgolly.nodeRsa.mod.HashingAlgorithm) => mgf(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AdvancedEncryptionScheme]
  }
}

