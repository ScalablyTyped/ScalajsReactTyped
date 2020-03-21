package typingsJapgolly.nodeRsa.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import typingsJapgolly.nodeRsa.nodeRsaStrings.pkcs1_oaep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvancedEncryptionSchemePKCS1OAEP extends AdvancedEncryptionScheme {
  var hash: HashingAlgorithm
  /**
    * Mask generation function.
    */
  var mgf: js.UndefOr[
    js.Function3[/* data */ Buffer, /* length */ Double, /* hash */ HashingAlgorithm, Buffer]
  ] = js.undefined
  var scheme: pkcs1_oaep
}

object AdvancedEncryptionSchemePKCS1OAEP {
  @scala.inline
  def apply(
    hash: HashingAlgorithm,
    scheme: pkcs1_oaep,
    mgf: (/* data */ Buffer, /* length */ Double, /* hash */ HashingAlgorithm) => CallbackTo[Buffer] = null
  ): AdvancedEncryptionSchemePKCS1OAEP = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    if (mgf != null) __obj.updateDynamic("mgf")(js.Any.fromFunction3((t0: /* data */ typingsJapgolly.node.Buffer, t1: /* length */ scala.Double, t2: /* hash */ typingsJapgolly.nodeRsa.mod.HashingAlgorithm) => mgf(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AdvancedEncryptionSchemePKCS1OAEP]
  }
}

